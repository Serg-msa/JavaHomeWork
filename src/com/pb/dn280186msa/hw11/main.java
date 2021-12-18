package com.pb.dn280186msa.hw11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class main {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner scan = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack1", LocalDate.of(2000, 5, 2), "1233456", "Dnepr"));
        persons.add(new Person("Jack2",  LocalDate.of(1990, 4, 12), "3234345", "Kiev"));

        String personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);

/*
        System.out.println("Добавление новой записи, введите ФИО");
        String FIO = scan.next();
        System.out.println("Введите дату рождение, год");
        Integer DateG = scan.nextInt();
        System.out.println("Введите дату рождение, месяц");
        Integer DateM = scan.nextInt();
        System.out.println("Введите дату рождение, дату");
        Integer DateD = scan.nextInt();
        System.out.println("Введите номер телефона");
        String phone = scan.next();
        System.out.println("Введите адрес");
        String local = scan.next();

        persons.add(new Person(FIO,  LocalDate.of(DateG, DateM, DateD), phone, local));
        personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);

        persons.remove(0);
        personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);
*/
        int x = persons.indexOf("3234345");
        System.out.println(x);

    }
}
