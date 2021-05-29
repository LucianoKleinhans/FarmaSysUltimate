package Entidades;

import Entidades.Produto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-28T20:19:16", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Receita.class)
public class Receita_ { 

    public static volatile ListAttribute<Receita, Produto> produtos;
    public static volatile SingularAttribute<Receita, Boolean> liberacaoReceita;
    public static volatile SingularAttribute<Receita, Integer> id;
    public static volatile SingularAttribute<Receita, Integer> numeroReceita;

}