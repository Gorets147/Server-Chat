package homework4;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */


public class Program {
    public static void main(String[] args) {

        Directory directory = new Directory(new Employee("Вася", 11111, (byte) 3),
                new Employee("Андрей", 22222, (byte) 4),
                new Employee("Олег", 33333, (byte) 5));


        Employee employee = new Employee("Феофан", 44444, (byte) 6);


        directory.addEmployee(employee);


        System.out.println(directory);

        System.out.println("====================================");

        System.out.println(directory.getNumber("вася"));

        System.out.println("====================================");

        System.out.println(directory.getEmployee((byte) 4));

        System.out.println("====================================");

        System.out.println(directory.getEmployee(3));

        System.out.println("====================================");

    }
}
