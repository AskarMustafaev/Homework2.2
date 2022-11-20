public abstract class Car implements Printable {
private int year;
private String condition;

    public Car(int year, String condition) {
        this.year = year;
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String info(){
        return year + condition;
    }
}
