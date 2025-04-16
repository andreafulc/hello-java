package org.lessons.java.security;

import java.util.Scanner;



// Aggiungete una classe PasswordGenerator che contenga un metodo main
// Il programma deve fare quanto segue (chiedendo all'utente):
// salvare in opportune variabili il
// nome,
// cognome
// colore preferito
// data di nascita di un utente suddivisa in giorno, mese e anno
// in numero generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
// Esempio:
// ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta:
// La sua password sarà Pinco-Pallo-magenta-2011 Buon lavoro :faccia_leggermente_sorridente:




public class PasswordGenerator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il tuo nome: ");
        // variabile salva nome
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        // variabile salva cognome
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        // variabile salva colore
        String colorePreferito = scanner.nextLine();

        System.out.print("Inserisci il giorno di nascita: ");
        // variabile salva giorno
        String giorno = scanner.nextLine();
        

        System.out.print("Inserisci il mese di nascita: ");
        // variabile salva mese
        String mese = scanner.nextLine();
        

        System.out.print("Inserisci l'anno di nascita: ");
        // variabile salva anno
        String anno = scanner.nextLine();
    

        //avendo già fatto le conversioni posso direttamente dichiarare la variabile e sommare i tre numeri.
        int sommaData = Integer.parseInt(giorno) + Integer.parseInt(mese) + Integer.parseInt(anno);

        String passwordString = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;

        System.out.println("La passwordgenerata è ");
        System.out.println(passwordString);


        scanner.close();
    }

}
