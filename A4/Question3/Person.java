public class Person {
    public String name;

    public Person() {
        name = "Rob";
    }

    public boolean IsPersonRob() {
	/* Even though the Address object has multiple parameters It is easier to manage using setter methods.We can also builder pattern to build the paramater list is really long*/
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
