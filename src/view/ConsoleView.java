package view;
import model.Transacao;

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
        System.out.println("===== MENU =====");
        System.out.println("1 - Adicionar transação ");
        System.out.println("2 - Listar transações ");
        System.out.println("3 - Ver saldo ");
        System.out.print("0 - Sair ");

        int opcao = scanner.nextInt();

        return opcao;
    }
}


