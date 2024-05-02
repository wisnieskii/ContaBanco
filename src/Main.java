import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá!!! \n Qual o seu nome?");
        String nome = scan.nextLine();
        System.out.println("Olá " + nome + "Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();
        System.out.println("Por favor, digite o número da conta");
        int conta = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, qual o valor deseja depositar em sua conta?");
        double saldo = scan.nextDouble();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!!!");


    }
}