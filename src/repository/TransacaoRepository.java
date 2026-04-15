package repository;

import model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {

    private Long contadorID = 1L;

    private List<Transacao> lista = new ArrayList<> ();

    public void salvar(Transacao transacao) {
        transacao.setId(contadorID);
        contadorID++;
        lista.add(transacao);
    }
    public List<Transacao> listar(){
        return lista;
    }
}
