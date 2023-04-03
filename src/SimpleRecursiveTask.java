import java.util.concurrent.RecursiveTask;

public class SimpleRecursiveTask extends RecursiveTask<Integer> {
    private int num;

    public SimpleRecursiveTask(int num){
        this.num = num;
    }
    @Override
    protected Integer compute() {
        if(num>100){
            System.out.println("Parallel execution splitting task " + num);
            SimpleRecursiveTask task1 = new SimpleRecursiveTask(num/2);
            SimpleRecursiveTask task2 = new SimpleRecursiveTask(num/2);
            task1.fork();
            task2.fork();
            int subTotal = 0;
            subTotal +=task1.join();
           subTotal+=task2.join();
           return subTotal;
        }else{
            System.out.println("task is small executing in sequential "+ num);
            return 2*num;
        }
    }
}
