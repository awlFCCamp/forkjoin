import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(Runtime.getRuntime().availableProcessors());
        ForkJoinPool pool = new ForkJoinPool();
        SimpleRecursiveAction action  = new SimpleRecursiveAction(400);
        action.invoke();*/
        /*ForkJoinPool pool = new ForkJoinPool();
        SimpleRecursiveTask task = new SimpleRecursiveTask(150);
        System.out.println(pool.invoke(task));*/
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(new FibonacciTask(25)));


    }
}