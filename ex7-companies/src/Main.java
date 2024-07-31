//
//  Main.java
//  ex7-companies
//
//  Created by Fernando Pastor on 31/7/24
//

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Company, TreeSet<Person>> companies = new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(Company c1, Company c2) {
                return Double.compare(c1.money, c2.money);
            }
        });

        Comparator<Person> personComparator = new Comparator<>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.age, person2.age);
            }
        };

        TreeSet<Person> company1persons = new TreeSet<>(personComparator);
        TreeSet<Person> company2persons = new TreeSet<>(personComparator);
        TreeSet<Person> company3persons = new TreeSet<>(personComparator);

        company1persons.add(new Person("Pepe", 53));
        company1persons.add(new Person("Juan", 26));
        company1persons.add(new Person("Sara", 61));
        company2persons.add(new Person("Fran", 32));
        company2persons.add(new Person("Luis", 26));
        company2persons.add(new Person("Rita", 48));
        company3persons.add(new Person("Hugo", 24));
        company3persons.add(new Person("Iris", 20));
        company3persons.add(new Person("Paco", 42));

        companies.put(new Company("CocaCola", 800), company1persons);
        companies.put(new Company("Pepsi", 400), company2persons);
        companies.put(new Company("Monster", 600), company3persons);

        for (Map.Entry<Company, TreeSet<Person>> company : companies.entrySet()) {
            System.out.println(company.getKey().name + " : " + company.getKey().money + " €.");
            for (Person person : company.getValue()) {
                System.out.println("- " + person.name + " (" + person.age + " years)");
            }
        }

    }
}