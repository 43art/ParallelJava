public class Thread1 implements Runnable {
    Thread t;
    int [] arr;
    int max;
    int num;

    Thread1(int [] arr, int num) {
        this.arr = arr;
        this.num = num;
        t = new Thread(this, "Thread " + num);
        t.start();
        System.out.println(t.getName() + " started");
    }

    public void run() {
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
    }

    public int getMax() {
        return max;
    }

    public Thread getThread() {
        return t;
    }
}