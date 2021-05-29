package Entidades;

import Entidades.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-29T18:14:31", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, Boolean> tipoPessoa;
    public static volatile SingularAttribute<Pessoa, Endereco> endereco;
    public static volatile SingularAttribute<Pessoa, String> loginFuncionario;
    public static volatile SingularAttribute<Pessoa, String> senhaLoginFuncionario;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Integer> id;
    public static volatile SingularAttribute<Pessoa, String> email;

}