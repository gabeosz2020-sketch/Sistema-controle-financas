package view;
import enums.TipoTransacao;
import model.Transacao;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleView {
    public void imprimeConsole(List<Transacao> lista, BigDecimal saldo) {

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        System.out.println("===== LISTA DE TRANSAÇÕES =====");

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

        int opcao = scanner.nextInt();

        return opcao;
    }

    public Transacao lerTransacao(){
        scanner.nextLine();

        System.out.print("\nDescrinção: ");
        String descrincao = scanner.nextLine();

        System.out.print("\nValor: ");
        BigDecimal valor = scanner.nextBigDecimal();

        scanner.nextLine();

        System.out.print("\nTipo (RECEITA/DESPESA): ");
        TipoTransacao tipo = TipoTransacao.valueOf(scanner.nextLine().toUpperCase());

        return new Transacao( descrincao, valor,tipo);


    }

}


