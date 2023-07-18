package be;

import be.Repuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-07-18T15:58:05")
@StaticMetamodel(TipoRepuesto.class)
public class TipoRepuesto_ { 

    public static volatile SingularAttribute<TipoRepuesto, String> descripcion;
    public static volatile SingularAttribute<TipoRepuesto, Integer> pkId;
    public static volatile SingularAttribute<TipoRepuesto, Date> fechaRegistro;
    public static volatile SingularAttribute<TipoRepuesto, String> nombre;
    public static volatile CollectionAttribute<TipoRepuesto, Repuesto> repuestoCollection;

}