package repository;

import model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {

    private List<Transacao> lista = new ArrayList<> ();

    public void salvar(Transacao transacao) {
            lista.add(transacao);
    }
    public List<Transacao> listar(){
        return lista;
    }
}
