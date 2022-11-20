public class BMW extends Car{
    private String color;

    public BMW( String color, int year, String condition) {
        super(year, condition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(info() + " X5 Color " + color);

    }
}
