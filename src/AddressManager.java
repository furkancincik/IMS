import java.util.ArrayList;

public class AddressManager {
    private ArrayList<Address> homeAddresseses;
    private ArrayList<Address> businessAddresses;

    public AddressManager(){
        this.homeAddresseses=new ArrayList<>();
        this.businessAddresses=new ArrayList<>();
    }


    //ev adresi ekleme
    public void addHomeAddress(HomeAddress homeAddress){
        homeAddresseses.add(homeAddress);
    }
    //ev adresi silme
    public void removeHomeAddress(HomeAddress homeAddress){
        homeAddresseses.remove(homeAddress);
    }

    //is adresi ekleme
    public void addBusinessAddress(BusinessAddress businessAddress){
        businessAddresses.add(businessAddress);
    }
    //is adresi silme
    public void removeBusinessAddress(BusinessAddress businessAddress){
        businessAddresses.remove(businessAddress);
    }







}
