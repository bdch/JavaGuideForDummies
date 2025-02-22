package Solution.Exercises.School;

public class Address {

    public Address(String street, String city, String country, String state, String zipCode) {
        validateZipCode(zipCode);
    }

    private void validateZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            throw new IllegalArgumentException("Zip code must be 5 characters long");
        }
    }

}
