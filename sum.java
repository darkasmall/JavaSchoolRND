/**
 * Created by Daria on 14.07.2016.
 */

/*
Задано n целых чисел. Выведите их сумму.
Входные данные
В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит n целых чисел, каждое от 1 до 10000, включительно.
Выходные данные
Выведите искомую сумму.
 */
import java.io.*;
import java.util.Scanner;

public class sum
{
    public static void main(String args[]){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream("output.txt");
            Scanner sc = new Scanner(fin);

            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += sc.nextInt();
            }
            sc.close();
            byte[] res = Integer.toString(sum).getBytes();
            fout.write(res);

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
