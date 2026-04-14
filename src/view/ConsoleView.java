package view;
import model.Transacao;

import java.math.BigDecimal;
import java.util.List;

public class ConsoleView {
    public void imprimeConsole(List<Transacao> lista, BigDecimal saldo) {

        System.out.println("===== LISTA DE TRANSAÇÕES =====");

        for (Transacao t :lista ) {
            System.out.println("[" + t.getId() + "]" + " - " +
                    t.getDescricao() + " - " +
                    "R$" + t.getValor() + " - " +
                    t.getTipo());
        }
        System.out.println("------------------------------");
        System.out.println("Saldo: " + saldo);



    }
}
