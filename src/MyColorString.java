public class MyColorString extends MyString{
    String color;

    public MyColorString() {
        super("Sejong");
        this.color = "BLACK";
    }

    public MyColorString(String str, String color) {
        super(str);
        this.color = color;
    }

    void colorPrint() {
        System.out.println("[MyCSTR] = " + str + " [COLOR] = " + color);
    }
}
