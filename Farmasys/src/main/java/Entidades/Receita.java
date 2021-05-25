package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Receita implements Serializable{

    @OneToMany(mappedBy = "receita")
    private List<Produto> produtos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numeroReceita;
    private Boolean liberacaoReceita;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroReceita() {
        return numeroReceita;
    }

    public void setNumeroReceita(Integer numeroReceita) {
        this.numeroReceita = numeroReceita;
    }

    public Boolean getLiberacaoReceita() {
        return liberacaoReceita;
    }

    public void setLiberacaoReceita(Boolean liberacaoReceita) {
        this.liberacaoReceita = liberacaoReceita;
    }
}