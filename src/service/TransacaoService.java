package service;

import enums.TipoTransacao;
import model.Transacao;
import repository.TransacaoRepository;

import java.math.BigDecimal;
import java.util.List;

public class TransacaoService {

    private TransacaoRepository repository = new TransacaoRepository();

    public void addTransacao(Transacao transacao) {
        repository.salvar(transacao);
    }

    public List<Transacao> listarTransacoes() {
        return repository.listar();
    }

    public BigDecimal calcularSaldo() {
        BigDecimal saldo = BigDecimal.ZERO;

        for (Transacao t : repository.listar()) {

            if (t.getTipo() == TipoTransacao.RECEITA) {
                saldo = saldo.add(t.getValor());

            } else if (t.getTipo() == TipoTransacao.DESPESA) {
                saldo = saldo.subtract(t.getValor());
            }
        }
        return saldo;
    }
}