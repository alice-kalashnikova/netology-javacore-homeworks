package ru.netology.javacore.homeworks.hw_1_2.task_1_2_2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Сгенерировать исходные данные переписи населедния
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        //1. Найти количество несовершеннолетних (т.е. людей младше 18 лет).
        Stream<Person> stream = persons.stream();
        long count = stream.filter(p -> p.getAge() > 18).count();

        //2. Получить список фамилий призывников (т.е. мужчин от 18 и до 27 лет).
        Stream<Person> stream2 = persons.stream();
        List<String> conscripts = stream2.filter(p -> p.getAge() > 18 && p.getAge() < 27)
                .map(p -> p.getFamily().toString())
                .collect(Collectors.toList());

        //3. Получить отсортированный по фамилии список потенциально работоспособных людей
        // с высшим образованием в выборке (т.е. людей с высшим образованием от 18 до 60 лет для женщин
        // и до 65 лет для мужчин).
        Stream<Person> streamW = persons.stream();
        List<Person> women = streamW.filter(p -> p.getAge() > 18 && p.getAge() < 60)
                .filter(p -> p.getSex().equals(Sex.WOMAN))
                .filter(p -> p.getEducation().equals(Education.HIGHER))
                .collect(Collectors.toList());

        Stream<Person> streamM = persons.stream();
        List<Person> men = streamM.filter(p -> p.getAge() > 18 && p.getAge() < 65)
                .filter(p -> p.getSex().equals(Sex.MAN))
                .filter(p -> p.getEducation().equals(Education.HIGHER))
                .collect(Collectors.toList());

        List<Person> all = new ArrayList<Person>();
        all.addAll(women);
        all.addAll(men);

        Stream<Person> streamAll = all.stream();
        List<Person> sortedList = streamAll.sorted(Comparator.comparing(Person::getFamily))
                .collect(Collectors.toList());

        //попыталась распечатать первые 3 но не вышло
//        sortedList.stream().limit(3).collect(Collectors.toList());
//        System.out.println(sortedList);
    }
}
