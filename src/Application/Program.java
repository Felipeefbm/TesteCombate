package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion1, champion2; 
		
		
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("nome: ");
		String name1 = sc.nextLine();
		System.out.print("vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int atack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		champion1 = new Champion(name1, life1, atack1, armor1);  
		
		
		System.out.println("\n");
		
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: "); //s
		int atack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		champion2 = new Champion(name2, life2, atack2, armor2);  
		
		
		System.out.print("Quantos turnos voce precisa executar? ");
		int fim = 0, turn = sc.nextInt();
		
		while(fim != turn ){
			fim += 1;
			
			if (champion1.getLife() > 0 && champion2.getLife() > 0 ) {  
				champion1.takeDamage(champion2);    
				champion2.takeDamage(champion1);    
				System.out.println();
				
				System.out.println("Resultado do " + fim + "° turno: "  );	
				System.out.println(champion1.status());
			    System.out.println(champion2.status());
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
