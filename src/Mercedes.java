public class Mercedes extends Car{
    private String color;



    public Mercedes(String color, int year, String condition) {
        super(year, condition);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(info() + " w210 Color " + color);

    }
}
