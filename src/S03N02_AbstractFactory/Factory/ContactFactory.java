package S03N02_AbstractFactory.Factory;

import S03N02_AbstractFactory.Product.Address;
import S03N02_AbstractFactory.Product.PhoneNumber;

//Abstract Factory
public interface ContactFactory {
    Address createAddress(String address);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
