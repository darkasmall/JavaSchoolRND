import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Daria on 14.07.2016.
 */

/*

Определим слово как последовательность латинских букв алфавита. Все остальные символы являются разделителями.
Дан текст, состоящий из символов с номерами от 32 до 127 (см. таблицу символов ASCII).
Ваша задача — найти количество букв в наидлинейшем слове из этого текста.
Входные данные
Входные данные состоят из единственной строки, длиной не более 10000 символов — исходный текст.
Выходные данные
Выведите единственное число — количество букв в наидлинейшем слове в данном тексте.
 */

public class ID2038 {
    public static void main(String args[]){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream("output.txt");
            Scanner sc = new Scanner(fin);

            int curCount = 0;
            int maxCount = 0;
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)))
                    curCount++;
                if (!Character.isLetter(str.charAt(i))) {
                    if (curCount>maxCount)
                        maxCount = curCount;
                    curCount = 0;
                }
            }

            byte[] answer = Integer.toString(maxCount).getBytes();
            fout.write(answer);

        } catch(IOException e) {
            System.out.println("I/O error: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Input file closing error: " + e2);
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Output file closing error: " + e2);
            }
        }
    }
}
