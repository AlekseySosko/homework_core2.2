package ru.netology.core4;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFamily().toUpperCase().compareTo(o2.getFamily().toUpperCase());
    }
}
