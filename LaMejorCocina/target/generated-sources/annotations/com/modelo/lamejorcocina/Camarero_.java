package com.modelo.lamejorcocina;

import com.modelo.lamejorcocina.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-26T23:31:27")
@StaticMetamodel(Camarero.class)
public class Camarero_ { 

    public static volatile SingularAttribute<Camarero, String> apellido2;
    public static volatile SingularAttribute<Camarero, Integer> idcamarero;
    public static volatile SingularAttribute<Camarero, String> apellido1;
    public static volatile SetAttribute<Camarero, Factura> facturaSet;
    public static volatile SingularAttribute<Camarero, String> nombre;

}