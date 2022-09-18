import java.util.List;

public class PackagingAction {

    Packaging wrapThePackage(String order, String address) {
        //Business logic for packaging

        String shippingType = getMeShippingType(address);
        String type = null;
        switch (shippingType) {
            case "SEA" -> type = "Package Wrapped in Plastic";
            case "Flight" -> type = "Package Wrapped in Wood";
            case "Car" -> type = "Package Wrapped in Paper";
        }
        Packaging packaging = new Packaging();
        packaging.setPackageType(type);
        packaging.setAddress(address);
        return packaging;
    }

    public String getMeShippingType(String address){
        //This method is going to take address and based on Address shipping type will be decided
        // i.e. Sea, Flight, Car
        return "SEA";
    }
}
