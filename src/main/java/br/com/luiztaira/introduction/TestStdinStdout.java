package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestStdinStdout {

    public static void main(String[] args) {
        String endereco = "";
        String cep = "";
        int opc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione sua opção para manipulação da tabela: \n" +
                "1) Incluir dados\n" +
                "2) Alterar dados\n" +
                "3) Excluir dados\n" +
                "4) Buscar dados");
        opc = scan.nextInt();
        scan.nextLine(); //apenas o nextLine remove o caracter de nova linha (gerado pelo seu Enter) da stream de entrada
        System.out.println("Digite o endereço");
        endereco = scan.nextLine();
        System.out.println("\n");
        System.out.println("Digite o cep");
        cep = scan.nextLine();
        System.out.println("Endereço: " + endereco + " / CEP: " + cep);
    }
}