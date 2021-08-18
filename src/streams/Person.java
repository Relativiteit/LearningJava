package streams;
// don't use public classes, no access provider so no public or private, read about protected class
class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person{" + // find another way to concatonate  java.String.concat ~~
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
