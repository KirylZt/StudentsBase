package by.teachmeskills.students.application.utils;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getInt(){
        if (SCANNER.hasNextInt()){
            int result = SCANNER.nextInt();
            SCANNER.nextLine();
            return result;
        }
        System.out.print("Это не целое число!!! Повторите ввод: ");
        SCANNER.nextLine();
        return getInt();
    }

    public static int getInt(String message){
        System.out.println(message);
        return getInt();
    }

    public static String getString(){
        return SCANNER.nextLine();
    }

    public static String getString(String message){
        System.out.println(message);
        return getString();
    }

}
