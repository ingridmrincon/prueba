package com.modelo.lamejorcocina;

import com.modelo.lamejorcocina.Camarero;
import com.modelo.lamejorcocina.Cliente;
import com.modelo.lamejorcocina.Detallefactura;
import com.modelo.lamejorcocina.Mesa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-26T23:31:27")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesa> idmesa;
    public static volatile SetAttribute<Factura, Detallefactura> detallefacturaSet;
    public static volatile SingularAttribute<Factura, Camarero> idcamarero;
    public static volatile SingularAttribute<Factura, Date> fechafactura;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}