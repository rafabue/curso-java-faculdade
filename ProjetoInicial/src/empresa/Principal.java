package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "Rafael";
		int idade = 24;
		idade = idade +2;
		double peso = 75.50;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digitr sua idade, seu peso e seu nome: ");
		
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d\n", idade);
		
		if(idade < 18) {
			System.out.println("Acesso bloqueado");
		} 
		else if (idade < 65){
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso");
		}
		for(int i=0; i<10; i++) {
			System.out.println("Valor: " + i);
		}
		
		// Array
		// Lista
		//ArrayList
		int megaSena[] = {11, 14, 21, 30, 37, 44, 56};
		int numeros[] = new int[200];
		
		megaSena[0] = 10;
		numeros[50] = 60;
		
	}

}

// Nas linhas 9, 10, 11 declaramos nossas variáveis.
// Na linha 13, criamos a classe "Scanner" a qual criamos um objeto chamado "teclado", que após o = intanciamos esse objeto, ou seja, construímos nosso objeto teclado.
// O "Scanner" de forma resumida, faz a leitura de dados que inserimos no teclado.
// O "Scanner" para funcionar precisa ser feito o import, como está sendo feito na linha 3.
// Nas linhas 16, 17, e 18 estamos pedindo para o "Scanner" fazer a leitura dos dados que vão ser inseridos pelo teclado/usuário.
// Para cada tipo, seja String, double, float, temos um tipo de next para usar na saida, já para tipo "String" só usamos .next
// Na linha 22 usamos o "%d" para dizermos que será substituído pela variável que vem em seguida, a qual colocamos "idade".
// Também na linhas 22, após o "%d" usamos "\n" para fazer uma quebra de linha, pois usamos o printf, e não println.
// Sempre que formos usar seja um "if", "else" "else if" devemos criarmos a regra dentro dos () e sempre dentro de um bloco usando {} e seus retornos.
// O "for" é dividio em três blocos, como vemos na linha 33, e sempre após o uso de cada usamos o ponto e vírgula; 
// O uso do "i++" na linha 34 é o mesmo que "i+=1" os quais, ambos fazem a soma de 1 em 1.
// O uso de "Array" ou listas como podemos chamar, definimos o tipo que usamos junto com um nome seguido de seus dados, como visto nas linhas 38 e 39;
// O padrao do "Array" é definido com [] e {} onde inserimos a "lista" de dados que irá possuir.
// Como vemos na linha 41 e 41, usamos o nome do "Array" e dentro do [] colocamos o valor da posição, ex do 11 que inicia na posição 0, e em seguida após o = inserimos o valor que irá substituir.
// Ou seja, ao escolhermos dentro do [] a posição e depois o valor que será inserido, dizemos que o 11 passará a valer 10.



