package Entidades;

import Entidades.Pessoa;
import Entidades.Produto;
import Entidades.TipoPagamento;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-28T20:19:16", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Pessoa> pessoa;
    public static volatile SingularAttribute<Venda, Produto> produto;
    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, TipoPagamento> tipoPagamento;

}