package model;

import enums.TipoTransacao;
import java.math.BigDecimal;
import java.util.Locale;
import java.text.NumberFormat;

public class Transacao {

    private Long id;
    private String descricao;
    private BigDecimal valor;
    private TipoTransacao tipo;

    // Construtor
    public Transacao(String descricao, BigDecimal valor, TipoTransacao tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    @Override
    public String toString() {
        return "[" + id + "]" + " - " +
                descricao + " - " +
                formato.format(valor) + " - " +
                tipo;
    }
}
