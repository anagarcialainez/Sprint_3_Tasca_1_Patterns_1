package S03N02_AbstractFactory.Main;

import S03N02_AbstractFactory.Factory.ContactFactory;
import S03N02_AbstractFactory.Factory.Concrete.UKContactFactory;
import S03N02_AbstractFactory.Factory.Concrete.USContactFactory;
import S03N02_AbstractFactory.Product.Address;
import S03N02_AbstractFactory.Product.PhoneNumber;

public class AppAddressBook {
    public static void main(String[] args) {
        //Usando la fábrica para crear direcciones y números de teléfono
        ContactFactory usFactory  = new USContactFactory();
        Address usAddress =usFactory.createAddress("123 Main St, New York");
        PhoneNumber usPhoneNumber = usFactory.createPhoneNumber("+1 123-456-7890");

        ContactFactory ukFactory = new UKContactFactory();
        Address ukAddress = ukFactory.createAddress("456 High St, London");
        PhoneNumber ukPhoneNumber = ukFactory.createPhoneNumber("+44 20 1234 5678");

        //imprimimos por pantalla la información
        System.out.println(usAddress.getAddressInfo());
        System.out.println(usPhoneNumber.getPhoneNumberInfo());
        System.out.println(ukAddress.getAddressInfo());
        System.out.println(ukPhoneNumber.getPhoneNumberInfo());
    }
}
