
public class Main {
    public static void main(String[] args) {
        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);
//        swapFlight(val1, val2);
        swapNumbers(val1, val2);
        System.out.println("val1: " + val1.getFlightNumber() + ", val2: " + val2.getFlightNumber());
    }

    // CHANGES THAT ONLY APPLY INSIDE THE METHOD
    static void swapFlight(Flight i, Flight j) {
        Flight k = i;
        i = j;
        j = k;
    }

    // CHANGES THAT OUTSIDE THE METHOD
    static void swapNumbers(Flight i, Flight j){
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }

}

//
//   ------------------------------ THE SIMPLER EXAMPLE OF IT -----------------------------------
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("Alice");
//        modifyPerson(person);
//        System.out.println("Name after modification: " + person.getName());
//    }
//
//    // CHANGES THAT OUTSIDE THE METHOD
//    static void modifyPerson(Person p) {
//        p.setName("Bob");
//    }
//}
