package gr.aueb.cf.playground;

public class TestApp {

    public static void main(String[] args) {
        char ch = '!';
        switch (ch) {
            case 'H':
            case '*':
            case '!':
            case '&':
                System.out.println("Hello");
                break;
            default:
                System.out.println("Adios");
                break;
        }
    }
}
