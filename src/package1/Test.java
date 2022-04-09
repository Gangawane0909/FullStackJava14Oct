package package1;

public class Test {
    protected int i = 20;

    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.i);
    }
}

/**
//private => it is accessible  within a class only
//default => accessible in package, default is
//protected =>accessible in package and through inheritance outside the package
public => it is accessible in whole project
*/

