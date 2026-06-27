class Demo {
    static void show(Object o) {
        System.out.println("Object");
    }

    static void show(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        show(null);
    }
}