package Entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoPagamento;
    @ManyToOne
    private Pessoa pessoa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVenda;
    private Double valorTotal;
    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itensVenda;
    
    public Venda(){
        itensVenda = new LinkedList<>();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public String getDataVendaFormatada() {
        return new SimpleDateFormat("dd/MM/YY").format(dataVenda);
    }
    
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    public void setItensVenda(ItemVenda itensVenda) {
        this.itensVenda.add(itensVenda);
    }
    
}