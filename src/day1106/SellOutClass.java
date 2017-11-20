package day1106;

public class SellOutClass {
    private String name;
    public SellOutClass(){
        name = "apple";
    }
    public void sell(int price){
        class Apple{
            int innerPrice = 0;
            public Apple(int price){
                innerPrice = price;
            }
            public void price(){
                System.out.println("开始销售：" + name);
                System.out.println("单价：" + innerPrice + "元");
            }
        }
        Apple apple = new Apple(price);
        apple.price();
    }

    public static void main(String[] args) {
        SellOutClass soc = new SellOutClass();
        soc.sell(100);
    }
}
