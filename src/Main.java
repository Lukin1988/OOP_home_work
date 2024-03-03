//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        ConstructorClass constructorObj = new ConstructorClass();
        constructorObj.setPrivateVariable(42);
        System.out.println("ConstructorClass Private Variable: " + constructorObj.getPrivateVariable());
        constructorObj.doSomething();

        ParameterizedClass parameterizedObj = new ParameterizedClass("Hello", 123);
        parameterizedObj.setPrivateString("New String");
        System.out.println("ParameterizedClass Private String: " + parameterizedObj.getPrivateString());
        System.out.println("ParameterizedClass Public Int: " + parameterizedObj.publicInt);
        parameterizedObj.doSomethingElse();

        NoConstructorClass noConstructorObj = new NoConstructorClass();
        noConstructorObj.setDefaultBoolean(true);
        System.out.println("NoConstructorClass Default Boolean: " + noConstructorObj.isDefaultBoolean());
        noConstructorObj.doNothing();

    }
}