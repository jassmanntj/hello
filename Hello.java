public class Hello {
    public static void main(String[] args) {
	Hello objHello = new Hello();
	String s = objHello.greet();
	System.out.println(s);
    }

    private String name;
    private String greeting;
    public Hello() {
	greeting = "Hello";
	name = "World";
    }
    public String greet() {
	return greeting + " " + name;
    }
}