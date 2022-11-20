
public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Racing"),
                createObject("Comfort"),
                createObject("Default")};

        for (Printable printable : printables) {
            printable.print();

        }

    }

    private static Printable createObject(String className) {
        switch (className) {
            case "Racing":
                BMW X5 = new BMW(" Black ",2004, " Good ");
                return X5;

            case "Comfort":
                Mercedes w210 = new Mercedes(" White ",2001, " Bad ");
                return w210;
            case "Default":
                Honda Stepwgn = new Honda(" Gray ",1996, " Normal ");
                return Stepwgn;
        }
        return null;
    }
}
