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
        
	}

}
