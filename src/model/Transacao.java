package model;

import java.math.BigDecimal;

public class Transacao {

    private Long id;
    private String descricao;
    private BigDecimal valor;
    private String tipo;

    public Transacao(Long id, String descricao, BigDecimal valor, String tipo){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
    public Long getId(){
        return id;
    }

    public String getDescricao(){
       return descricao;
      }

      public BigDecimal getValor() {
        return valor;
      }

      public String getTipo(){
        return tipo;
      }



}
