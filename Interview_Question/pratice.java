class Test {

    Test t;
    int val;

    Test(int val) {
        this.val = val;
    }

    public static void main(String[] args) {

        Test t1 = new Test(5);
        Test t2 = new Test(10);

        t1.t = t2;

        t2 = new Test(20);

        System.out.println(t1.t.val);
    }
}