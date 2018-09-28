package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends DictionaryCommandLine{
    public static void main(String[] args){
        System.out.println("Chon 1 de them tu moi, chon 2 de hien thi cac tu da luu.");
        ArrayList<Word> Words;
        Words = new ArrayList<>();
        System.out.println("Choose your number: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        dictionaryBasic(input, Words);

    }
}