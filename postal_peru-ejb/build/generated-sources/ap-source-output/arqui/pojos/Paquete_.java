package arqui.pojos;

import arqui.pojos.Distrito;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-21T04:43:06")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile SingularAttribute<Paquete, Integer> codigoPaquete;
    public static volatile SingularAttribute<Paquete, Float> precioenvioPaquete;
    public static volatile SingularAttribute<Paquete, Distrito> distritodestinoPaquete;
    public static volatile SingularAttribute<Paquete, String> direccionPaquete;
    public static volatile SingularAttribute<Paquete, String> remitentePaquete;
    public static volatile SingularAttribute<Paquete, String> destinatarioPaquete;
    public static volatile SingularAttribute<Paquete, Float> pesoPaquete;

}