import java.util.Scanner;

//A clase do nosso projeto
public class AnaliseCondicional {
	//Iremos criar os métodos
	public static void main(String[] args) {
		//Criar variável
		int tempo;
		
		//vamos implementar a variável
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Digite as horas");
		tempo=teclado.nextInt(); 
		
		
		//Criando um processo condicional
		//que é uma lógica em cima de uma variável
		
		if(tempo<=12) {
			System.out.println("Olá, bom diaaaaaa");
			
		}else if (tempo<=18) {
				System.out.println("Olá, boa tarde");
		}else {
		
			System.out.println("Olá, boa noite");
		}
		}
	}
	

	

