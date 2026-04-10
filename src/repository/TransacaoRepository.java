package repository;

import model.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    List<Transacao> LIST = new ArrayList<> ();

    public void save(Transacao transaction) {
            LIST.add(transaction);
    }
    public List<Transacao> list(){
        return LIST;
    }
}
