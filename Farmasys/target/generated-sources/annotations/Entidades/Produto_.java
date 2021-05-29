package Entidades;

import Entidades.Receita;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-28T20:19:16", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, String> informacaoProduto;
    public static volatile SingularAttribute<Produto, Receita> receita;
    public static volatile SingularAttribute<Produto, Date> dataVencimento;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, String> classificacao;
    public static volatile SingularAttribute<Produto, Integer> quantidadeEstoque;
    public static volatile SingularAttribute<Produto, Integer> id;

}