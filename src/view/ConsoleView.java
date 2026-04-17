package view;
import enums.TipoTransacao;
import model.Transacao;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleView {
    public void imprimeConsole(List<Transacao> lista, BigDecimal saldo) {

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        System.out.println("\n===== LISTA DE TRANSAÇÕES =====");

        for (Transacao t : lista) {
            System.out.println(t);
        }

        System.out.println("------------------------------");
        System.out.println("Saldo: " + formato.format(saldo));
    }

    private Scanner scanner = new Scanner(System.in);

    public int lerOpcao() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Adicionar transação ");
        System.out.println("2 - Listar transações ");
        System.out.println("3 - Ver saldo ");
        System.out.println("0 - Sair ");
        System.out.print("Escolha uma opção: ");

        try {
            return scanner.nextInt();
        } catch (Exception e){
            System.out.println("Entrada inválida! Digite um número");
            scanner.nextLine();
        }

        int opcao = scanner.nextInt();
        return opcao;

    }

    public Transacao lerTransacao() {
        scanner.nextLine();

        System.out.print("\nDescrição: ");
        String descrincao = scanner.nextLine();

        System.out.print("\nValor: ");
        BigDecimal valor;
        try {
            valor = scanner.nextBigDecimal();
            scanner.nextLine();
        }catch (Exception e) {
            System.out.println("Valor invãlido!");
            scanner.nextLine();
            return null;
        }

        System.out.print("\nTipo (RECEITA/DESPESA): ");
        TipoTransacao tipo;

        try {
         tipo = TipoTransacao.valueOf(scanner.nextLine().toUpperCase());
        }catch (Exception e){
            System.out.println("Tipo inválido! Use RECEITA ou DESPESA.");
            return null;
        }

        return new Transacao( descrincao, valor,tipo);
    }
    public void imprimeSaldo(BigDecimal saldo){

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\nSaldo atual: " + formato.format(saldo));
    }

}


