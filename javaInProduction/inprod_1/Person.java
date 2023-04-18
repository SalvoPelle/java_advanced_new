package javaadvanced.javaInProduction.inprod_1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "His name is " +
                 name + '\'' +
                ", is age is " + age +
                " and he lives in " + address;
    }
}
