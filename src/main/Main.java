package main;

import enums.TipoTransacao;
import view.ConsoleView;
import model.Transacao;
import service.TransacaoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConsoleView consoleView = new ConsoleView();
        TransacaoService service = new TransacaoService();

        int opcao;

        do {
            opcao = consoleView.lerOpcao();
            System.out.println("Você escolheu a opção " + opcao);

            switch (opcao){

                case 1:
                    Transacao t = consoleView.lerTransacao();
                    service.addTransacao(t);
                    System.out.println("\nTransação adicionada com sucesso!");
                    break;

                case 2:
                    consoleView.imprimeConsole(
                            service.listarTransacoes(),
                            BigDecimal.valueOf(service.calcularSaldo())
                    );
                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("!Opção invalida!");
            }
        } while (opcao != 0);





//        Transacao t1 = new Transacao(
//                "salario",
//                new BigDecimal("2000"),
//                TipoTransacao.RECEITA
//        );
//        Transacao t2 = new Transacao(
//                "academia",
//                new BigDecimal("150"),
//                TipoTransacao.DESPESA
//        );
//        Transacao t3 = new Transacao(
//                "internet",
//                new BigDecimal("100"),
//                TipoTransacao.DESPESA
//        );
//        Transacao t4 = new Transacao(
//                "Compras comida",
//                new BigDecimal("1000"),
//                TipoTransacao.DESPESA
//        );
//        Transacao t5 = new Transacao(
//                "Curso idiomas",
//                new BigDecimal("400"),
//                TipoTransacao.DESPESA
//        );
//
//        service.addTransacao(t1);
//        service.addTransacao(t2);
//        service.addTransacao(t3);
//        service.addTransacao(t4);
//        service.addTransacao(t5);
//
//       List <Transacao> lista = service.listarTransacoes();
//        double saldo = service.calcularSaldo();
//        consoleView.imprimeConsole(lista, BigDecimal.valueOf(saldo));

    }
}