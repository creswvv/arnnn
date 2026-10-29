import java.util.ArrayList;
import java.util.List;

public class Main {

    // ==========================================
    // ЗАДАЧИ 1–10: БАЗОВЫЕ КЛАССЫ И ОБЪЕКТЫ
    // ==========================================

    // 1. Класс Student
    static class Student1 {
        String name;
        int age;
        String group;

        public Student1(String name, int age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        public void printInfo() {
            System.out.println("Студент: " + name + ", Возраст: " + age + ", Группа: " + group);
        }
    }

    // 2. Класс Car
    static class Car2 {
        String brand;
        String model;
        int year;

        public Car2(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void printInfo() {
            System.out.println("Автомобиль: " + brand + " " + model + ", Год выпуска: " + year);
        }
    }

    // 3. Класс Book
    static class Book3 {
        String title;
        String author;
        int pages;

        public Book3(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public void printInfo() {
            System.out.println("Книга: \"" + title + "\", Автор: " + author + ", Страниц: " + pages);
        }
    }

    // 4. Класс Phone
    static class Phone4 {
        String brand;
        String model;
        double price;

        public Phone4(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Телефон: " + brand + " " + model + ", Цена: $" + price);
        }
    }

    // 5. Класс Cat
    static class Cat5 {
        String name;
        int age;

        public Cat5(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void meow() {
            System.out.println(name + " говорит: Мяу!");
        }
    }

    // 6. Класс Dog
    static class Dog6 {
        String name;
        String breed;

        public Dog6(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public void bark() {
            System.out.println(name + " (" + breed + ") лает: Гав-гав!");
        }
    }

    // 7. Класс Rectangle
    static class Rectangle7 {
        double width;
        double height;

        public Rectangle7(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    // 8. Класс Circle
    static class Circle8 {
        double radius;

        public Circle8(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // 9. Класс Employee
    static class Employee9 {
        String name;
        String position;
        double salary;

        public Employee9(String name, String position, double salary) {
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        public void printInfo() {
            System.out.println("Сотрудник: " + name + ", Должность: " + position + ", Зарплата: $" + salary);
        }
    }

    // 10. Класс Laptop
    static class Laptop10 {
        String brand;
        int ram;
        double price;

        public Laptop10(String brand, int ram, double price) {
            this.brand = brand;
            this.ram = ram;
            this.price = price;
        }

        public void comparePrice(Laptop10 other) {
            if (this.price > other.price) {
                System.out.println(this.brand + " дороже, чем " + other.brand);
            } else if (this.price < other.price) {
                System.out.println(this.brand + " дешевле, чем " + other.brand);
            } else {
                System.out.println(this.brand + " и " + other.brand + " стоят одинаково");
            }
        }
    }


    // ==========================================
    // ЗАДАЧИ 11–20: ЛОГИКА И МЕТОДЫ
    // ==========================================

    // 11. Класс BankAccount
    static class BankAccount11 {
        String owner;
        double balance;

        public BankAccount11(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(owner + " пополнил счет на $" + amount + ". Баланс: $" + balance);
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(owner + " снял $" + amount + ". Баланс: $" + balance);
            } else {
                System.out.println("Недостаточно средств на счету у " + owner + "!");
            }
        }
    }

    // 12. Класс Product
    static class Product12 {
        String name;
        double price;
        int quantity;

        public Product12(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalStockValue() {
            return price * quantity;
        }
    }

    // 13. Класс Student с оценками
    static class Student13 {
        String name;
        int grade;

        public Student13(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public boolean hasPassed() {
            return grade >= 50;
        }
    }

    // 14. Класс Counter
    static class Counter14 {
        int count;

        public Counter14(int startCount) {
            this.count = startCount;
        }

        public void increment() { count++; }
        public void decrement() { count--; }
        public void reset() { count = 0; }
    }

    // 15. Класс Movie
    static class Movie15 {
        String title;
        String genre;
        int duration; // мин

        public Movie15(String title, String genre, int duration) {
            this.title = title;
            this.genre = genre;
            this.duration = duration;
        }

        public void printInfo() {
            System.out.println("Фильм: \"" + title + "\", Жанр: " + genre + ", Длительность: " + duration + " мин.");
        }
    }

    // 16. Класс Temperature
    static class Temperature16 {
        double celsius;

        public Temperature16(double celsius) {
            this.celsius = celsius;
        }

        public double toFahrenheit() {
            return celsius * 9.0 / 5.0 + 32;
        }

        public double toKelvin() {
            return celsius + 273.15;
        }
    }

    // 17. Класс Point
    static class Point17 {
        double x, y;

        public Point17(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceFromOrigin() {
            return Math.sqrt(x * x + y * y);
        }
    }

    // 18. Класс ShoppingCart
    static class ShoppingCart18 {
        String productName;
        double price;
        int quantity;

        public ShoppingCart18(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return price * quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    // 19. Класс Clock
    static class Clock19 {
        int hours, minutes, seconds;

        public Clock19(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public void displayTime() {
            System.out.printf("Текущее время: %02d:%02d:%02d\n", hours, minutes, seconds);
        }
    }

    // 20. Класс Flight
    static class Flight20 {
        String flightNumber;
        String destination;
        int availableSeats;

        public Flight20(String flightNumber, String destination, int availableSeats) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.availableSeats = availableSeats;
        }

        public void bookSeat() {
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println("Место на рейс " + flightNumber + " забронировано. Осталось: " + availableSeats);
            } else {
                System.out.println("На рейс " + flightNumber + " мест нет!");
            }
        }
    }


    // ==========================================
    // ЗАДАЧИ 21–30: ВЗАИМОДЕЙСТВИЕ И МИНИ-ПРОЕКТ
    // ==========================================

    // 21. Класс Computer
    static class Computer21 {
        String brand;
        String processor;
        int ram;
        double price;

        public Computer21(String brand, String processor, int ram, double price) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
            this.price = price;
        }

        public void printSpecs() {
            System.out.println("Компьютер " + brand + " | ЦП: " + processor + " | ОЗУ: " + ram + " ГБ | Цена: $" + price);
        }
    }

    // 23. Класс LibraryBook
    static class LibraryBook23 {
        String title;
        String author;
        boolean isAvailable = true;

        public LibraryBook23(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Книга \"" + title + "\" успешно выдана.");
            } else {
                System.out.println("Ошибка: Книга \"" + title + "\" уже выдана!");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println("Книга \"" + title + "\" успешно возвращена.");
        }
    }

    // 24. Класс Student для поиска лучшего
    static class Student24 {
        String name;
        double averageGrade;

        public Student24(String name, double averageGrade) {
            this.name = name;
            this.averageGrade = averageGrade;
        }
    }

    // 25. Класс MobilePhone
    static class MobilePhone25 {
        String brand;
        int batteryLevel;
        boolean isOn = false;

        public MobilePhone25(String brand, int batteryLevel) {
            this.brand = brand;
            this.batteryLevel = batteryLevel;
        }

        public void turnOn() {
            if (batteryLevel > 0) {
                isOn = true;
                System.out.println(brand + " включился.");
            } else {
                System.out.println(brand + ": Заряд батареи 0%, включение невозможно.");
            }
        }

        public void turnOff() {
            isOn = false;
            System.out.println(brand + " выключился.");
        }

        public void usePhone(int hours) {
            if (isOn) {
                batteryLevel -= hours * 15;
                if (batteryLevel < 0) batteryLevel = 0;
                System.out.println("Использовали " + brand + " в течение " + hours + " ч. Ост. заряд: " + batteryLevel + "%");
                if (batteryLevel == 0) {
                    isOn = false;
                    System.out.println(brand + " разрядился и выключился.");
                }
            } else {
                System.out.println("Нельзя использовать выключенный телефон!");
            }
        }
    }

    // 26. Класс Car с пробегом
    static class Car26 {
        String brand;
        double mileage;
        double fuel;

        public Car26(String brand, double mileage, double fuel) {
            this.brand = brand;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public void drive(double kilometers) {
            double requiredFuel = kilometers * 0.1; // 10 л на 100 км
            if (fuel >= requiredFuel) {
                mileage += kilometers;
                fuel -= requiredFuel;
                System.out.println("Проехали " + kilometers + " км. Новое авто-состояние -> Пробег: " + mileage + " км, Топливо: " + fuel + " л.");
            } else {
                System.out.println("Недостаточно топлива для поездки на " + kilometers + " км!");
            }
        }
    }

    // 27. Класс Order
    static class Order27 {
        int orderNumber;
        String productName;
        double price;
        int quantity;

        public Order27(int orderNumber, String productName, double price, int quantity) {
            this.orderNumber = orderNumber;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return price * quantity;
        }

        public void updateQuantity(int newQuantity) {
            this.quantity = newQuantity;
            System.out.println("Количество в заказе #" + orderNumber + " изменено на " + newQuantity);
        }
    }

    // 28. Класс Player
    static class Player28 {
        String name;
        int health;
        int damage;

        public Player28(String name, int health, int damage) {
            this.name = name;
            this.health = health;
            this.damage = damage;
        }

        public void takeDamage(int amount) {
            health -= amount;
            if (health < 0) health = 0;
        }

        public void attack(Player28 target) {
            System.out.println(this.name + " атакует " + target.name + " с уроном " + this.damage + "!");
            target.takeDamage(this.damage);
            System.out.println("У " + target.name + " осталось здоровья: " + target.health);
        }
    }

    // 29. Класс Warehouse
    static class Warehouse29 {
        String productName;
        int quantity;
        int capacity;

        public Warehouse29(String productName, int quantity, int capacity) {
            this.productName = productName;
            this.quantity = quantity;
            this.capacity = capacity;
        }

        public void addProducts(int amount) {
            if (quantity + amount <= capacity) {
                quantity += amount;
                System.out.println("Добавлено " + amount + " шт. Всего " + productName + " на складе: " + quantity);
            } else {
                System.out.println("Ошибка добавления! Превышение вместимости склада (" + capacity + " шт.).");
            }
        }

        public void removeProducts(int amount) {
            if (amount <= quantity) {
                quantity -= amount;
                System.out.println("Забрали " + amount + " шт. Остаток " + productName + ": " + quantity);
            } else {
                System.out.println("Ошибка! Нельзя списать больше, чем есть на складе!");
            }
        }
    }

    // 30. Мини-проект «Система управления университетом»
    static class UniStudent {
        String name;
        String group;

        public UniStudent(String name, String group) {
            this.name = name;
            this.group = group;
        }

        public void printInfo() {
            System.out.println("Студент: " + name + " | Группа: " + group);
        }
    }

    static class UniTeacher {
        String name;
        String subject;

        public UniTeacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        public void printInfo() {
            System.out.println("Преподаватель: " + name + " | Предмет: " + subject);
        }
    }

    static class UniCourse {
        String courseName;
        UniTeacher teacher;
        List<UniStudent> students = new ArrayList<>();

        public UniCourse(String courseName, UniTeacher teacher) {
            this.courseName = courseName;
            this.teacher = teacher;
        }

        public void addStudent(UniStudent student) {
            students.add(student);
        }

        public void printCourseDetails() {
            System.out.println("\n--- Информация о курсе: " + courseName + " ---");
            teacher.printInfo();
            System.out.println("Записанные студенты:");
            for (UniStudent st : students) {
                st.printInfo();
            }
        }
    }


    // ==========================================
    // МЕТОД MAIN ДЛЯ ДЕМОНСТРАЦИИ РАБОТЫ
    // ==========================================
    public static void main(String[] args) {

        System.out.println("=== 1. Student ===");
        Student1 st1 = new Student1("Алексей", 19, "CS-101");
        st1.printInfo();

        System.out.println("\n=== 2. Car ===");
        Car2 carA = new Car2("Toyota", "Camry", 2021);
        Car2 carB = new Car2("Tesla", "Model 3", 2023);
        carA.printInfo();
        carB.printInfo();

        System.out.println("\n=== 3. Book ===");
        Book3 book = new Book3("Преступление и наказание", "Ф. Достоевский", 672);
        book.printInfo();

        System.out.println("\n=== 4. Phone ===");
        Phone4 p1 = new Phone4("Apple", "iPhone 15", 999.99);
        Phone4 p2 = new Phone4("Samsung", "Galaxy S24", 899.99);
        Phone4 p3 = new Phone4("Xiaomi", "13T", 499.99);
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println("\n=== 5. Cat ===");
        Cat5 cat = new Cat5("Барсик", 3);
        cat.meow();

        System.out.println("\n=== 6. Dog ===");
        Dog6 dog = new Dog6("Рекс", "Овчарка");
        dog.bark();

        System.out.println("\n=== 7. Rectangle ===");
        Rectangle7 rect = new Rectangle7(10.0, 5.0);
        System.out.println("Площадь: " + rect.getArea() + ", Периметр: " + rect.getPerimeter());

        System.out.println("\n=== 8. Circle ===");
        Circle8 circle = new Circle8(7.0);
        System.out.println("Площадь круга: " + circle.getArea());

        System.out.println("\n=== 9. Employee ===");
        Employee9 emp = new Employee9("Иван Петров", "Разработчик", 3500.0);
        emp.printInfo();

        System.out.println("\n=== 10. Laptop ===");
        Laptop10 lap1 = new Laptop10("MacBook Pro", 16, 2000.0);
        Laptop10 lap2 = new Laptop10("ASUS TUF", 16, 1200.0);
        lap1.comparePrice(lap2);

        System.out.println("\n=== 11. BankAccount ===");
        BankAccount11 bankAcc = new BankAccount11("Максим", 1000.0);
        bankAcc.deposit(500.0);
        bankAcc.withdraw(300.0);

        System.out.println("\n=== 12. Product ===");
        Product12 product = new Product12("Монитор", 250.0, 10);
        System.out.println("Общая стоимость " + product.name + " на складе: $" + product.getTotalStockValue());

        System.out.println("\n=== 13. Student (Оценки) ===");
        Student13 sExam1 = new Student13("Ольга", 75);
        Student13 sExam2 = new Student13("Игорь", 42);
        System.out.println(sExam1.name + " сдал экзамен? " + (sExam1.hasPassed() ? "Да" : "Нет"));
        System.out.println(sExam2.name + " сдал экзамен? " + (sExam2.hasPassed() ? "Да" : "Нет"));

        System.out.println("\n=== 14. Counter ===");
        Counter14 counter = new Counter14(5);
        counter.increment();
        System.out.println("Значение после увеличение: " + counter.count);
        counter.reset();
        System.out.println("Значение после сброса: " + counter.count);

        System.out.println("\n=== 15. Movie ===");
        Movie15 movie = new Movie15("Интерстеллар", "Фантастика", 169);
        movie.printInfo();

        System.out.println("\n=== 16. Temperature ===");
        Temperature16 temp = new Temperature16(25.0);
        System.out.println("25°C = " + temp.toFahrenheit() + "°F | " + temp.toKelvin() + "K");

        System.out.println("\n=== 17. Point ===");
        Point17 point = new Point17(3.0, 4.0);
        System.out.println("Расстояние точки (3,4) от (0,0): " + point.distanceFromOrigin());

        System.out.println("\n=== 18. ShoppingCart ===");
        ShoppingCart18 cart = new ShoppingCart18("Клавиатура", 50.0, 2);
        System.out.println("Сумма покупки: $" + cart.calculateTotal());
        cart.setQuantity(4);
        System.out.println("Сумма после изменения количества: $" + cart.calculateTotal());

        System.out.println("\n=== 19. Clock ===");
        Clock19 clock = new Clock19(14, 5, 9);
        clock.displayTime();

        System.out.println("\n=== 20. Flight ===");
        Flight20 flight = new Flight20("KC-875", "Алматы", 2);
        flight.bookSeat();
        flight.bookSeat();
        flight.bookSeat(); // Третья попытка выдаст ошибку

        System.out.println("\n=== 21. Computer ===");
        Computer21 pc1 = new Computer21("Dell", "Intel i7", 16, 1100.0);
        Computer21 pc2 = new Computer21("HP", "Ryzen 5", 8, 750.0);
        Computer21 pc3 = new Computer21("Lenovo", "Intel i5", 16, 850.0);
        pc1.printSpecs();
        pc2.printSpecs();
        pc3.printSpecs();

        System.out.println("\n=== 22. BankAccount (Разные объекты) ===");
        BankAccount11 acc1 = new BankAccount11("Анна", 500.0);
        BankAccount11 acc2 = new BankAccount11("Борис", 1000.0);
        acc1.deposit(200.0);
        System.out.println("Баланс Анны: $" + acc1.balance + " | Баланс Бориса: $" + acc2.balance);

        System.out.println("\n=== 23. Library ===");
        LibraryBook23 lBook = new LibraryBook23("Война и мир", "Л. Толстой");
        lBook.borrowBook();
        lBook.borrowBook(); // Повторная попытка
        lBook.returnBook();

        System.out.println("\n=== 24. StudentGroup ===");
        Student24[] group = {
            new Student24("Елена", 4.2),
            new Student24("Тимур", 4.9),
            new Student24("Кирилл", 3.8),
            new Student24("Диана", 4.7),
            new Student24("Амир", 4.0)
        };
        Student24 bestStudent = group[0];
        for (Student24 s : group) {
            if (s.averageGrade > bestStudent.averageGrade) {
                bestStudent = s;
            }
        }
        System.out.println("Лучший студент: " + bestStudent.name + " со средним баллом " + bestStudent.averageGrade);

        System.out.println("\n=== 25. MobilePhone ===");
        MobilePhone25 phone = new MobilePhone25("Pixel", 30);
        phone.turnOn();
        phone.usePhone(2);

        System.out.println("\n=== 26. Car (С пробегом) ===");
        Car26 myCar = new Car26("Audi", 50000.0, 40.0);
        myCar.drive(150.0);

        System.out.println("\n=== 27. Order ===");
        Order27 order = new Order27(101, "Наушники", 80.0, 1);
        System.out.println("Итоговая цена: $" + order.calculateTotal());
        order.updateQuantity(3);
        System.out.println("Новая итоговая цена: $" + order.calculateTotal());

        System.out.println("\n=== 28. Player ===");
        Player28 warrior = new Player28("Рыцарь", 100, 30);
        Player28 monster = new Player28("Орк", 80, 15);
        warrior.attack(monster);
        monster.attack(warrior);

        System.out.println("\n=== 29. Warehouse ===");
        Warehouse29 warehouse = new Warehouse29("Ноутбук", 10, 15);
        warehouse.addProducts(3);
        warehouse.addProducts(5); // Превысит вместимость (13 + 5 > 15)
        warehouse.removeProducts(4);

        System.out.println("\n=== 30. Управление университетом ===");
        UniTeacher prof = new UniTeacher("Профессор Смирнов", "Объектно-Ориентированное Программирование");
        UniCourse javaCourse = new UniCourse("Курс Java", prof);

        javaCourse.addStudent(new UniStudent("Артем", "группа А-1"));
        javaCourse.addStudent(new UniStudent("София", "группа Б-2"));

        javaCourse.printCourseDetails();
    }
}