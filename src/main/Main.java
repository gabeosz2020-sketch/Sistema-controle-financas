package main;

import view.ConsoleView;
import model.Transacao;
import service.TransacaoService;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConsoleView consoleView = new ConsoleView();
        TransacaoService service = new TransacaoService();

        Transacao t1 = new Transacao(
                1L,
                "salario",
                new BigDecimal("3000"),
                "RECEITA"
        );
        Transacao t2 = new Transacao(
                2L,
                "academia",
                new BigDecimal("150"),
                "DESPESA"
        );
        Transacao t3 = new Transacao(
                3L,
                "internet",
                new BigDecimal("100"),
                "DESPESA"
        );

        service.addTransacao(t1);
        service.addTransacao(t2);
        service.addTransacao(t3);

       List <Transacao> lista = service.listarTransacoes();
        double saldo = service.calcularSaldo();
        consoleView.imprimeConsole(lista, BigDecimal.valueOf(saldo));

    }
}