public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (name == null || name.isEmpty() || surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не заполнены обязательные поля");
        } else if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Возраст указан некорректно");
        } else {
            return new Person(this);
        }
    }
}
