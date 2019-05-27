package com.modelo.lamejorcocina;

import com.modelo.lamejorcocina.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-26T23:31:27")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> idmesa;
    public static volatile SingularAttribute<Mesa, Integer> nummaxcomensales;
    public static volatile SingularAttribute<Mesa, String> ubicacion;
    public static volatile SetAttribute<Mesa, Factura> facturaSet;

}