package com.modelo.lamejorcocina;

import com.modelo.lamejorcocina.Cocinero;
import com.modelo.lamejorcocina.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-26T23:31:27")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, String> totalfacturado;
    public static volatile SingularAttribute<Detallefactura, String> plato;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, String> importe;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}