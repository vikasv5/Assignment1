public class Person {
    public String name;

    public Person() {
        name = "Rob";
    }

    public boolean IsPersonRob() {

        Address addr = new Address("Rob street", "Rob city", "Rob province", "Rob postalcode");
        return name.equals("Rob") && IsRobsAddress(addr);
    }

    private boolean IsRobsAddress(Address addr) {
        return addr.getStreet().equals("Rob street") &&
                addr.getCity().equals("Rob city") &&
                addr.getProvince().equals("Rob province") &&
                addr.getPostalCode().equals("Rob postalcode");
    }
}
