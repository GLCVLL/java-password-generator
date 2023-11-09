package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        // Chiedo all'utente di inserire le informazioni
		
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = scanner.nextLine();

        System.out.print("Inserisci la tua data di nascita (GG/MM/AAAA): ");
        String dataNascita = scanner.nextLine();
        String[] partiData = dataNascita.split("/");
        
        
        // Calcolo la somma di giorno, mese e anno
        int giorno = Integer.parseInt(partiData[0]);
        int mese = Integer.parseInt(partiData[1]);
        int anno = Integer.parseInt(partiData[2]);
        int sommaData = giorno + mese + anno;
        
        // Genero e stampo la password
        String password = nome + "-" + cognome + "-" + colore + "-" + sommaData;
        System.out.println("La tua password è: " + password);
	}

}
