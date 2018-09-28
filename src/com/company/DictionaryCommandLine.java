package com.company;
import com.company.DictionaryManagement;
import com.company.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandLine extends DictionaryManagement {
    public static void showAllWords(ArrayList<Word> Words) {
        int i = 0;
        System.out.println("No              | English            | Vietnamese         ");
        for (Dictionary w: Words) {
            Word wo = (Word) w;
            i++;
            System.out.println(i + "          | " + wo.getWord_target() + "            | " + wo.getWord_explain() + "" );
        }
    }

    public static void dictionaryBasic(int roll, ArrayList<Word> Words) {
        switch (roll) {
            case 1:
                insertFromCommandline(Words);
                Scanner sca = new Scanner(System.in);
                System.out.println("Chon 1 de them tu moi, chon 2 de hien thi cac tu da luu.");
                System.out.println("\nChoose your number: ");
                int input3 = sca.nextInt();
                dictionaryBasic(input3, Words);
            case 2:
                showAllWords(Words);
                Scanner sc = new Scanner(System.in);
                System.out.println("Chon 1 de them tu moi, chon 2 de hien thi cac tu da luu.");
                System.out.println("\nChoose your number: ");
                int input4 = sc.nextInt();
                dictionaryBasic(input4, Words);
                break;

        }
    }




}
