import java.util.ArrayList;

public class AddressManager {
    private ArrayList<HomeAddress> homeAddresses;
    private ArrayList<BusinessAddress> businessAddresses;

    public AddressManager() {
        this.homeAddresses = new ArrayList<>();
        this.businessAddresses = new ArrayList<>();
    }

    // Ev adresi ekleme
    public void addHomeAddress(HomeAddress homeAddress) {
        homeAddresses.add(homeAddress);
    }

    // Ev adresi silme
    public void removeHomeAddress(HomeAddress homeAddress) {
        homeAddresses.remove(homeAddress);
    }

    // İş adresi ekleme
    public void addBusinessAddress(BusinessAddress businessAddress) {
        businessAddresses.add(businessAddress);
    }

    // İş adresi silme
    public void removeBusinessAddress(BusinessAddress businessAddress) {
        businessAddresses.remove(businessAddress);
    }
}
