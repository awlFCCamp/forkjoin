import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {
    private int simulateWork;

    public SimpleRecursiveAction(int simulateWork){
        this.simulateWork = simulateWork;
    }

    @Override
    protected void compute() {
        if(simulateWork>100){
            System.out.println("parallel execution and spliting work");
            SimpleRecursiveAction action1 = new SimpleRecursiveAction(simulateWork/2);
            SimpleRecursiveAction action2 = new SimpleRecursiveAction(simulateWork/2);
            /*action1.fork();
            action2.fork();
            action1.join();
            action2.join();*/
            invokeAll(action1,action2);

        }else{
            System.out.println("sequntial execution");
        }
    }
}
