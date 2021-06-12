package testearray;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {

    private static Scanner s;

    public static void main(String[] args) {

        s = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();    

        for(int i=0; i < 5; i++){  
            Pessoa pessoa = new Pessoa(null, i);
            System.out.println("\nDigite o nome:");
            pessoa.nome = s.next();
            System.out.println("\nDigite a idade:");
            pessoa.idade = s.nextInt();
            listaPessoa.add(pessoa);

        }
        
        int i;

        // [ C ] mostrando os "n" contatos da agenda (usando o índice)
        // número de elementos da agenda: método size()
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = listaPessoa.size();
        for (i=0; i<n; i++) {
        	System.out.printf("Nome: %s Idade: %s \n", listaPessoa.get(i).getNome(),listaPessoa.get(i).getIdade());
        	       	
        	
        	
        }
    }

	
}