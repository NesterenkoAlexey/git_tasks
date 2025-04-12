package main.java.ru.tasks;

public class Task1 {

    private final String myVariable1;
    private final String myVariable2;

    private String newFieldForTask11;

    public Task1(String myVariable1, String myVariable2) {
        this.myVariable1 = myVariable1;
        this.myVariable2 = myVariable2;
    }

    public void doSomething() {
        System.out.println(myVariable1 + myVariable2);
    }
}
