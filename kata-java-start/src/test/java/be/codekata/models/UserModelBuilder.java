package be.codekata.models;

public final class UserModelBuilder {
    private String firstName;
    private String lastName;
    private String street;
    private String streetNumber;

    private UserModelBuilder() {
    }

    public static UserModelBuilder aUserModel() {
        return new UserModelBuilder();
    }

    public UserModelBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserModelBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserModelBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public UserModelBuilder withStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public UserModel build() {
        UserModel userModel = new UserModel();
        userModel.setFirstName(firstName);
        userModel.setLastName(lastName);
        userModel.setStreet(street);
        userModel.setStreetNumber(streetNumber);
        return userModel;
    }

    public UserModelBuilder withDefaultUser() {
        this.withFirstName("Martijn").withLastName("Degrève");
        return this;
    }
}
