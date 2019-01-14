
package lab5;

import java.io.FileWriter;
import java.util.Scanner;

public class RedDelWords {
    void RedDel2() throws Exception {

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int size = sc2.nextInt();
        String arrayNew[] = new String[size + 1];
        System.out.println("Введите фразы через Enter");
        for (int i = 0; i < size + 1; i++) {
            arrayNew[i] = sc2.nextLine();
        }

        FileWriter nFile1 = new FileWriter("file1.txt");
        System.out.println("Укажите номер строки, которую вы хотите отредактировать или удалить");
        int number1 = sc2.nextInt();
        if (number1 < size + 1) {
            Scanner sc0 = new Scanner(System.in);
            System.out.println("Напишите слово, которое вы хотите отредактировать или удалить");
            String Word = sc0.nextLine();
            System.out.println("Нажмите 1, чтобы отредактировать, 2- чтобы удалить");
            int enter = sc2.nextInt();
            if (enter < 3) {
                Scanner sc3 = new Scanner(System.in);
                if (enter == 1) {
                    System.out.println("Введите корректировку");
                    String correct = sc3.nextLine();
                    String MyCorrect1 = arrayNew[number1].replace(Word, correct);
                    arrayNew[number1]=MyCorrect1;
                    for (int j = 0; j < size+1; j++) {
                        nFile1.write(arrayNew[j] + "\n");
                    }
                    System.out.println("Мы раписали результат в файл1");
                } else if (enter == 2) {
                    String MyCorrect2 = arrayNew[number1].replace(Word,"");
                    arrayNew[number1]=MyCorrect2;
                    System.out.println("Мы раписали результат в файл1");
                    for (int k = 0; k < size + 1; k++) {
                        nFile1.write(arrayNew[k] + "\n");
                    }
                }
            } else System.out.println("Некорректный ввод3");
        } else System.out.println("Некорректный ввод4");
        nFile1.close();
    }
}
