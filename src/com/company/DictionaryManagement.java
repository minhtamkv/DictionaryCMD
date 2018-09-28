package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.company.Dictionary;

public class DictionaryManagement {
    public static void insertFromCommandline(ArrayList<Word> Words){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu moi: ");
        String input1 = scanner.nextLine();
        System.out.println("\n Giai nghia: ");
        String input2 = scanner.nextLine();
        if(input1.length() != 0 && input2.length() != 0){
            Word wor = new Word();
            wor.setWord_target(input1);
            wor.setWord_explain(input2);
            Words.add(wor);
            System.out.println("Them tu thanh cong!!!");

        }

    }

}