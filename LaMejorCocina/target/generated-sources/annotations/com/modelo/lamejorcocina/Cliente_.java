package com.modelo.lamejorcocina;

import com.modelo.lamejorcocina.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-26T23:31:27")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellido2;
    public static volatile SingularAttribute<Cliente, String> apellido1;
    public static volatile SingularAttribute<Cliente, String> observaciones;
    public static volatile SetAttribute<Cliente, Factura> facturaSet;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, String> nombre;

}