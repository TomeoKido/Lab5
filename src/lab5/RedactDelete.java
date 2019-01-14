
package lab5;
import java.io.FileWriter;
import java.util.Scanner;

public class RedactDelete {
    void RedDel() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int size = sc.nextInt();
        String array[] = new String[size + 1];
        System.out.println("Введите фразы через Enter");
        for (int i = 0; i < size + 1; i++) {
            array[i] = sc.nextLine();
        }

        FileWriter nFile1 = new FileWriter("file1.txt");
        System.out.println("Укажите номер строки, которую вы хотите отредактировать или удалить");
        int number = sc.nextInt();
        if (number < size + 1) {
        System.out.println("Нажмите 1, чтобы отредактировать, 2- чтобы удалить");
        int enter = sc.nextInt();
            if (enter < 3) {
                Scanner sc1 = new Scanner(System.in);
                if (enter == 1) {
                    System.out.println("Введите корректировку");
                    String correct = sc1.nextLine();
                    String MyCorrect = array[number].replace(array[number], correct);
                    array[number]=MyCorrect;
                    for (int j = 0; j < size+1; j++) {
                        nFile1.write(array[j] + "\n");
                    }
                    System.out.println("Мы раписали результат в файл1");
                } else if (enter == 2) {
                    array[number] = "";
                    System.out.println("Мы раписали результат в файл1");
                    for (int k = 0; k < size + 1; k++) {
                        nFile1.write(array[k] + "\n");
                    }
                }
            } else System.out.println("Некорректный ввод1");
        } else System.out.println("Некорректный ввод2");
        nFile1.close();
    }
}