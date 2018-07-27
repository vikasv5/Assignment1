public class Address {

    String street;
    String city;
    String province;
    String postalCode;

    public Address() {
    }

    public Address(String street, String city, String province, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }


    public void setStreet() {
        this.street=street;
    }

    public void setCity() {
        this.city=city;
    }

    public void setProvince() {
        this.province=province;
    }

    public void setPostalCode() {
        this.postalCode=postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }


}

