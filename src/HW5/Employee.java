package HW5;

public class Employee {
    public static void main(String[] args) {
        HW5.Employee vjobivatel = new HW5.Employee("Пилин Александр Иванович", "Директор", "alexd@mail.ru",
                "89998744512", 100000, 43);

        vjobivatel.info();

        HW5.Employee[] persArray = new HW5.Employee[5];
        persArray[0] = new HW5.Employee("Иванов Иван Иванович", "Инженер", "best4best@gmail.com",
                "87745145347", 50000, 50);
        persArray[1] = new HW5.Employee("Дронов Артем Алексеевич", "Программист", "dron131@list.ru",
                "89013816010", 100000, 25);
        persArray[2] = new HW5.Employee("Васильков Кирилл Викторович", "Юрист", "vasilek@mail.ru",
                "89451236441", 85000, 30);
        persArray[3] = new HW5.Employee("Рожков Виктор Денисович", "Тракторист", "traktor4all@mailbox.com",
                "87485124598", 25000, 57);
        persArray[4] = new HW5.Employee("Капетян Арман Арманович", "Кальянщик", "kaliktop@gmail.com",
                "87548968561", 35000, 24);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].info();
            }
        }
    }

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Работник: %s Должность: %s email: %s Телефон: %s Зарплата: %d " +
                "Возраст: %d \n", name, position, email, phone, salary, age);
    }
}


