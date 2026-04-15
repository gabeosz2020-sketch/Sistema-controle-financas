package view;
import model.Transacao;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ConsoleView {
    public void imprimeConsole(List<Transacao> lista, BigDecimal saldo) {

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        System.out.println("===== LISTA DE TRANSAÇÕES =====");

        for (Transacao t :lista ) {
            System.out.println(t);
        }

        System.out.println("------------------------------");
        System.out.println("Saldo: " + formato.format(saldo));



    }
}
