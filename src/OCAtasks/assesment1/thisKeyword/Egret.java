package OCAtasks.assesment1.thisKeyword;

/* Created by veronika on 24.03.2019.
* */


public class Egret {
    private String color;

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        //this.color = color;
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}


