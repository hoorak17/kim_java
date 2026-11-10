package access;


public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {

        this.max = max;
        System.out.println("setting Max count is " + max);
    }

    public void increment() {
        if(this.count < this.max) {
            this.count++;
            System.out.println("Count is " + this.count);
        } else{
            System.out.println("Max count is " + this.max);
        }
    }

    public int getCount() {
        return count;
    }

}
