package S03N02_AbstractFactory.Product.Concrete;

import S03N02_AbstractFactory.Product.Address;

//Producto Concreto para Direcciones
public class UKAddress implements Address {
    private String address;

    public UKAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressInfo() {
        return "Dirección en el Reino Unido: " + address;
    }
}
