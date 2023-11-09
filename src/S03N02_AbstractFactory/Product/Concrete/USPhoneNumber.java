package S03N02_AbstractFactory.Product.Concrete;

import S03N02_AbstractFactory.Product.PhoneNumber;

// Producto Concreto para Números de Teléfono
public class USPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public USPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumberInfo() {
        return "Número de teléfono en EE. UU.: " + phoneNumber;
    }
}
