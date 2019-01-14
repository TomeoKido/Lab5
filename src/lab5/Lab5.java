package lab5;

import java.util.Scanner;
import sun.applet.Main;


public class Lab5 {

        public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        RedactDelete reddel = new RedactDelete();
        RedDelWords reddelwors = new RedDelWords();
        System.out.println("Введите 1, чтобы поработать со строкой. Введите 2, чтобы поработать со словом");
        int num = scan.nextInt();
        if(num==1) { reddel.RedDel(); }
        if(num==2) { reddelwors.RedDel2(); }
        if(num!=1 && num!=2) { System.out.println("Некорректный ввод0"); }
    }
    
}
