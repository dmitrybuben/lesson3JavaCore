package lesson3;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Human(String name) {
        this(name, 18); // вызов второго конструктора
    }

    private Human(String name, int age) throws RuntimeException{
        this.name = name;
        this.age = age;
        /*if(name == null || name.length() < 3) {
            this.name = "<human>";
        }
        else {
            this.name = name;
        }
        if (age < 18) {
            this.age = 18;
        }
        else {
            this.age = age;
        }*/
    }

    //Статические члены класса
    //Фабричный метод - для создания экземпляра класса минуя конструктор.
    //Отличие - сначала можно выполнить проверки, а потом создать объект, то есть если при создании объекта через
    //конструктор будет выброшено исключение - объект все равно создастся а тут - нет (экземпляр не создается)
    public static Human create(String name) {
        return create(name, 18);
    }

    public static Human create(String name, int age) {
        if(name == null || name.length() < 3) {
            throw new RuntimeException("Некорректное имя человека");
        }
        if (age < 18) {
            throw new RuntimeException("Некорректный возраст человека");
        }
        return new Human(name, age);
    }

    public void displayinfo() {
        System.out.printf("%s - %d", name, age);
    }

}
