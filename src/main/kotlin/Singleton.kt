//class Singleton {
//
//    private static Singleton instance = null;
//
//    private Singleton() {
//    }
//
//    private synchronized static void createInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) createInstance();
//        return instance;
//    }
//}

class Singleton private constructor() {

    private object HOLDER {
        val INSTANCE = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { HOLDER.INSTANCE }
    }
}

fun main() {
    val obj2 = Singleton.instance
    println(obj2)
    val obj1 = Singleton.instance
    println(obj1)
}