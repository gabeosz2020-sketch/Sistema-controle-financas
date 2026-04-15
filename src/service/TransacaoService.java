package service;

import enums.TipoTransacao;
import model.Transacao;
import repository.TransacaoRepository;

import java.util.List;

public class TransacaoService {

    private TransacaoRepository repository = new TransacaoRepository();

    public void addTransacao(Transacao transacao) {
        repository.salvar(transacao);
    }

    public List<Transacao> listarTransacoes() {
        return repository.listar();
    }

    public double calcularSaldo() {
        double saldo = 0;

        for (Transacao t : repository.listar()) {

            if (t.getTipo() == TipoTransacao.RECEITA) {
                saldo += t.getValor().doubleValue();

            } else if (t.getTipo() == TipoTransacao.DESPESA) {
                saldo -= t.getValor().doubleValue();
            }
        }
        return saldo;
    }
}