public class ConstructorClass {
    private int privateVariable;

    // Явний конструктор
    public ConstructorClass() {
        // Задаю змінні
        privateVariable = 1;
    }

    // Методи get и set для privateVariable
    public int getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(int value) {
        this.privateVariable = 2;
    }

    // Ще один метод
    public void doSomething() {
        System.out.println("Doing something in ConstructorClass");
    }
}

// Клас з параметрами
class ParameterizedClass {
    // Змінні з різнимим модификатароми доступу
    private String privateString;
    public int publicInt;

    // Конструктор з параметрами
    public ParameterizedClass(String privateString, int publicInt) {
        this.privateString = privateString;
        this.publicInt = publicInt;
    }

    // Методи get и set для privateString
    public String getPrivateString() {
        return privateString;
    }

    public void setPrivateString(String value) {
        this.privateString = value;
    }

    // Додатковий метод
    public void doSomethingElse() {
        System.out.println("Doing something else in ParameterizedClass");
    }
}

// Клас без конструктора
class NoConstructorClass {
    // Змінна з модифиікатором доступу по дефолту
    boolean defaultBoolean;

    // Методи get і set для defaultBoolean
    public boolean isDefaultBoolean() {
        return defaultBoolean;
    }

    public void setDefaultBoolean(boolean value) {
        this.defaultBoolean = value;
    }

    // Додатковий метод
    public void doNothing() {
        System.out.println("Doing nothing in NoConstructorClass");
    }
}
