class Main {
    public static void main(String[] args) {
       float balance = 100;
       float refill = 1000;
       int bonus = 100;
        float totalbalance = (float) (refill / bonus + balance + refill);
        System.out.println(totalbalance);
    }
}