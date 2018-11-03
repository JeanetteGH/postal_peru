package arqui.pojos;

import arqui.pojos.Paquete;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-21T04:43:06")
@StaticMetamodel(Distrito.class)
public class Distrito_ { 

    public static volatile SingularAttribute<Distrito, Integer> codigoDistrito;
    public static volatile ListAttribute<Distrito, Paquete> paqueteList;
    public static volatile SingularAttribute<Distrito, String> nombreDistrito;
    public static volatile SingularAttribute<Distrito, Float> preciobaseDistrito;

}