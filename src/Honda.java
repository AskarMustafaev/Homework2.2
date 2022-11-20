public class Honda extends Car{
    private String color;



    public Honda(String color, int year, String condition) {
        super(year, condition);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(info() + " Stepwgn Color " + color);

    }
}
