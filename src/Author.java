public class Author {
    private String firstName;
    private String lastName;
    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    public String toString(){
        return firstName+" "+lastName;
    }
    public int hashCode() {
        return 1;
    }






}
