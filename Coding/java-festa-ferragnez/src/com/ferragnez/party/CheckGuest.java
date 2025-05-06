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


// check IF the name is in the list

//  if (whoAreYou.equals(guest[0]) || whoAreYou.equals(guest[1]) || whoAreYou.equals(guest[2]) || whoAreYou.equals(guest[3]) || whoAreYou.equals(guest[4]) || whoAreYou.equals(guest[5]) || whoAreYou.equals(guest[6]) || whoAreYou.equals(guest[7]) || whoAreYou.equals(guest[8]) || whoAreYou.equals(guest[9])) {
//      System.out.println("Benvenuto alla festa!");
//  } else {
//      System.out.println("Mi dispiace, non sei nella lista degli invitati.");
    
//  }

// check if the name is in the list using a for LOOP

// for (int i = 0; i < guest.length; i++) {
//    if (whoAreYou.equals(guest[i])) {
//          System.out.println("Benvenuto alla festa!");
//          break;
//     } else if (i == guest.length - 1) {
//             System.out.println("Mi dispiace, non sei nella lista degli invitati.");
//         }
//     }



// check if the name is in the list using a while LOOP

int i = 0;

while (i < guest.length) {
    if (whoAreYou.equals (guest[i]) ) {
        System.out.println("Benvenuto alla festa!");
        break;
    } else {
        System.out.println("Mi dispiace, non sei nella lista degli invitati.");
        i++;
    } 

    
}


    }}
    

