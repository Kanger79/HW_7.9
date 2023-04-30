package ru.netology.HW_7_9;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passSerial = 1234 ;
        post.passNumber  = 567890 ;
        post.phone = "+7(800)-200-800-2";
        post.subscription = true ;

       if (post.subscription == true) {
           System.out.println("Согласие получено");
       } else {
           System.out.println("Согласие не получено");
       }

        post.birthday = new FormDate() ;
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 2001;

        System.out.println("Имя      - " + post.name);
        System.out.println("Отчество - " + post.patronymic);
        System.out.println("Фамилия  - " + post.surname);
        System.out.println("Телефон  - " + post.phone);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year + "г");
        System.out.println("Паспорт:  серия " + post.passSerial + " номер " + post.passNumber);
        }
    }
