package be;

import be.TipoRepuesto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-07-19T09:05:25")
@StaticMetamodel(Repuesto.class)
public class Repuesto_ { 

    public static volatile SingularAttribute<Repuesto, String> descripcion;
    public static volatile SingularAttribute<Repuesto, Integer> pkId;
    public static volatile SingularAttribute<Repuesto, Date> fechaRegistro;
    public static volatile SingularAttribute<Repuesto, TipoRepuesto> tipoRepuesto;
    public static volatile SingularAttribute<Repuesto, String> nombre;

}