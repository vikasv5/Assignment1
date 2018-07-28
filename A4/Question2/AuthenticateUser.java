class AuthenticateUser {
    public boolean authenticate(Person p) {
        return p.getName().equals("joe") && p.getPassword().equals("joepass");
    }
}

