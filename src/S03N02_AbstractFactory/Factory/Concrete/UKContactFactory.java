package S03N02_AbstractFactory.Factory.Concrete;

import S03N02_AbstractFactory.Factory.ContactFactory;
import S03N02_AbstractFactory.Product.Address;
import S03N02_AbstractFactory.Product.PhoneNumber;
import S03N02_AbstractFactory.Product.Concrete.UKAddress;
import S03N02_AbstractFactory.Product.Concrete.UKPhoneNumber;

//Fábrica Concreta para UK
public class UKContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String address) {
        return new UKAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new UKPhoneNumber(phoneNumber);
    }
}
