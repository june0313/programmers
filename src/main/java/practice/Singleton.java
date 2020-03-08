package practice;

public class Singleton {
    private Singleton() {
    }

    private static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static String getString() {
        return "get string";
    }

    static {
        System.out.println("singleton class static init");
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE  = new Singleton();
        static {
            System.out.println("LazyHolder static init");
        }
    }

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(Singleton.getString());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
