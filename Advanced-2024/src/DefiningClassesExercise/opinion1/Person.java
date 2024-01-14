package DefiningClassesExercise.opinion1;

public class Person {

    public String name;
    public int years;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setYears(int years) {
//        this.years = years;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getYears() {
//        return years;
//    }


    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    static class PersonComparator implements java.util.Comparator<Person> {
        @Override
        public int compare(Person a, Person b) {
            return a.name.compareTo(b.name);
        }
    }
}
