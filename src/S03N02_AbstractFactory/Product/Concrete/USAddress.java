package S03N02_AbstractFactory.Product.Concrete;

import S03N02_AbstractFactory.Product.Address;

//Producto Concreto para Direcciones
public class USAddress implements Address {
    private String address;

    public USAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressInfo() {
        return "Dirección en EE. UU.: " + address;
    }
}
