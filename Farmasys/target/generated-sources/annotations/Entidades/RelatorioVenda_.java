package Entidades;

import Entidades.Produto;
import Entidades.TipoPagamento;
import Entidades.Venda;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-28T20:19:16", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(RelatorioVenda.class)
public class RelatorioVenda_ { 

    public static volatile SingularAttribute<RelatorioVenda, Venda> venda;
    public static volatile SingularAttribute<RelatorioVenda, Date> dataVenda;
    public static volatile SingularAttribute<RelatorioVenda, Produto> produto;
    public static volatile SingularAttribute<RelatorioVenda, Integer> id;
    public static volatile SingularAttribute<RelatorioVenda, TipoPagamento> tipoPagamento;

}