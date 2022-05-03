public class SingeltonLesson {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonInstance();
        Singleton singleton2 = Singleton.getSingletonInstance();
        singleton.i= 7;
        System.out.println(singleton2.i);
    }
}

class Singleton{
    int i = 0;
    static Singleton singleton = new Singleton();
    private Singleton() {}

    public static Singleton getSingletonInstance(){
        return singleton;
    }
}
