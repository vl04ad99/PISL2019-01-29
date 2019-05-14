
import hibernate.ServiceDAO;
import logic.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonService {


    public ServiceDAO serviceDAO;

    public Person setPerson()  {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Имя: ");
                p.setFirstName(scanner.nextLine());
                System.out.println("Фамилия: ");
                p.setLastName(scanner.nextLine());
                System.out.println("Отчество: ");
                p.setThirdName(scanner.nextLine());
                System.out.println("Дата рождения: ");
                String date = scanner.nextLine();
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                p.setBirthDate(ft.parse(date));
                System.out.println("Пол: ");
                p.setGender(setGender());
                System.out.println("Национальность: ");
                p.setNation(setNationality());
                System.out.println("Мобильный телефон: ");
                p.setPhone(scanner.nextLine());
                System.out.println("Домашний телефон: ");
                p.setHomePhone(scanner.nextLine());
                Address address = new Address();
                System.out.println("Актуальный адресс: ");
                address.setActualAddress(scanner.nextLine());
                System.out.println("Город: ");
                address.setActualCity(setCity());
                System.out.println("Адресс прописки: ");
                address.setReleaseAddress(scanner.nextLine());
                System.out.println("Город прописки: ");
                address.setReleaseCity(setCity());
                p.setAddress(address);
                Passport passport = new Passport();
                System.out.println("Идентификационный номер паспорта: ");
                passport.setIdNumber(scanner.nextLine());
                System.out.println("Номер паспорта");
                passport.setNumber(scanner.nextLine());
                System.out.println("Серия: ");
                passport.setSeria(scanner.nextLine());
                p.setPassport(passport);
            } catch (ParseException ex) {
                System.out.println("Failed input date");
                continue;
            }
            return p;
        }
    }

    private Gender setGender(){
        System.out.println("1. Мужской\n2. Женский\n");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "1": return Gender.MAN;
            case "2": return Gender.WOMAN;
        }
        return Gender.MAN;
    }

    private Nationality setNationality(){
        System.out.println("1. Беларус\n2. Россиянин\n3. Украинец\n4. Казах\n");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "1": return Nationality.BELARUS;
            case "2": return Nationality.RUSSIAN;
            case "3": return Nationality.UKRAIN;
            case "4": return Nationality.KAZAHSTAN;
        }
        return Nationality.BELARUS;
    }

    private City setCity(){
        System.out.println("1. Минск\n2. Гродно\n3. Гомель\n4. Витебск\n5. Брест\n");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case "1": return City.MINSK;
            case "2": return City.GRODNO;
            case "3": return City.GOMEL;
            case "4": return City.VITEBSK;
            case "5": return City.BREST;
        }
        return City.MINSK;
    }


}
