package main;

import view.ConsoleView;
import model.Transacao;
import service.TransacaoService;

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

                    if (t != null) {
                        service.addTransacao(t);
                        System.out.println("\nTransação adicionada com sucesso!");
                    }
                    break;

                case 2:
                    consoleView.imprimeConsole(
                            service.listarTransacoes(),
                            service.calcularSaldo()
                    );
                    break;

                case 3:
                    consoleView.imprimeSaldo(
                           service.calcularSaldo()
                    );
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("!Opção invalida!");
            }
        } while (opcao != 0);

    }
}