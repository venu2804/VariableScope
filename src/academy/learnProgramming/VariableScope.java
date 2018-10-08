package academy.learnProgramming;

public class VariableScope {
     static int myGlobalInt = 10;
    public static void main(String[] args) {

        int myLoacalInt = 10;
        {
            int myLocalBlockInt = 20;
            System.out.println("MY lOCAL INT = " + myLoacalInt);
        }

        System.out.println("My Block Local Int = " + myLoacalInt);
    }

    public static void myMethod() {

        System.out.println("MY LOCAL INT = " + myGlobalInt);

    }
}
