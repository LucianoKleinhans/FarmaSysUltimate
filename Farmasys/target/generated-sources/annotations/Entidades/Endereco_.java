package Entidades;

import Entidades.Pessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-29T18:14:31", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> uf;
    public static volatile SingularAttribute<Endereco, String> cidade;
    public static volatile SingularAttribute<Endereco, Pessoa> pessoa;
    public static volatile SingularAttribute<Endereco, String> complemento;
    public static volatile SingularAttribute<Endereco, Integer> numero;
    public static volatile SingularAttribute<Endereco, String> bairro;
    public static volatile SingularAttribute<Endereco, String> ruaAvenida;
    public static volatile SingularAttribute<Endereco, Integer> id;
    public static volatile SingularAttribute<Endereco, String> cep;

}