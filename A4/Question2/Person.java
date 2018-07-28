public class Person {
    private String name;
    private String userName;
    private String password;
    private AuthenticateUser user = new AuthenticateUser();
    private Phone phone=new Phone();

    public Person(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }


    public String getName() {
        return name;
    }


    public void SetAreaCode(String areaCode) {
	phone.setAreaCode(areaCode);
    }

    public String GetAreaCode() {
        return phone.getAreaCode();
    }

    public void SetPhoneNumber(String phoneNumber) {
        phone.setPhoneNumber(phoneNumber);
    }

    public String GetPhoneNumber() {
        return phone.getPhoneNumber();
    }

    public void SetLoginCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean AuthenticateUser() {

        return user.authenticate(this);
    }
}
