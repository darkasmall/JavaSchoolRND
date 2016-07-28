package ru.sbertech.test.lesson6;

import java.lang.reflect.Field;

/**
 * Created by Student on 28.07.2016.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Field f = C.class.getDeclaredField("str");
            f.setAccessible(true);

            if (f.isAnnotationPresent(ValidLength.class)) {
                System.out.println("Есть аннотация " + ValidLength.class.getTypeName());
                ValidLength vLen = f.getAnnotation(ValidLength.class);

                if (vLen.value() != ((String) f.get(C.class.newInstance())).length()) {
                    System.out.println("Внимание! Длина некорректна");
                }
                else {
                    System.out.println("Все ок!");
                }
            }

        } catch(NoSuchFieldException e) {
            System.out.println("Нет поля!");
        } catch (InstantiationException e) {
            System.out.println("Не можем создать экземпляр класса!");
        } catch (IllegalAccessException e) {
            System.out.println("Доступ запрещен!");
        }
    }
}
