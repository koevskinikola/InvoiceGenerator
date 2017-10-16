import java.util.ArrayList;
import java.util.List;

public class CustomerBean {

    private String name;
    private String address;
    private List<String> phones;

    public CustomerBean() {
    }

    public CustomerBean(String name, String address, List<String> phones) {
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    public CustomerBean(String name, String address, String phone) {
        this.name = name;
        this.address = address;

        this.phones = new ArrayList<String>();
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + phones +
                '}';
    }
}
