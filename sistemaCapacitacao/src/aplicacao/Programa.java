package aplicacao;

import javax.swing.JOptionPane;

import java.util.Scanner;

import entidades.Produto;
import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        ServidorPublico marcos = new ServidorPublico(2024,"marcos");
//        ServidorPublico joao = new ServidorPublico(2024,"Joao","Policia");
//        isabela.setNome("Isabela");
//        isabela.setSalario(7000);
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//
//        isabela.calcularSalarioTotal();
//
//
//        isabela.setHorasExtras(45.00);
//
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());
//        System.out.printf("salario total R$ %.2f: ",isabela.calcularSalarioTotal());

        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os Dados do Produto");
        System.out.println("Nome :");
        produto.setNome(sc.nextLine());
        System.out.println("Preço :");
        produto.setPreco(sc.nextDouble());
        System.out.println("Quantidade no estoque :");
        produto.setQuantidadeEstoque(sc.nextInt());

        System.out.println("Dados do Produto : "+produto.getNome()+",$ " +produto.getPreco()+", "+produto.getQuantidadeEstoque()+"unidades, "+produto.);
    }
}
