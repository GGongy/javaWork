package day1101;

public class Farm {
    public static void main(String[] args) {
        System.out.println("apple 调用 harvest 方法");
        Apple apple = new Apple();
        apple.harvest();
        System.out.println("---------");
        System.out.println("orange 调用 harvest 方法");
        Orange orange = new Orange();
        orange.harvest();
    }
}
