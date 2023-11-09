package S03N02_AbstractFactory.Factory.Concrete;

import S03N02_AbstractFactory.Factory.ContactFactory;
import S03N02_AbstractFactory.Product.Address;
import S03N02_AbstractFactory.Product.PhoneNumber;
import S03N02_AbstractFactory.Product.Concrete.USAddress;
import S03N02_AbstractFactory.Product.Concrete.USPhoneNumber;

//Fábrica Concreta para USA
public class USContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String address) {
        return new USAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new USPhoneNumber(phoneNumber);
    }
}
