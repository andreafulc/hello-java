package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        
// only the name in the list can enter the party
String[] guest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

Scanner scanner = new Scanner(System.in);

// ask the name of the guest
System.out.println("inserire nome e cognome: ");
String whoAreYou = scanner.nextLine();

scanner.close();




    
}
