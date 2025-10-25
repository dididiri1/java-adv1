package thread.excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.excutor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class TestMain {

    public static void main(String[] args) {
        log("== 초기 상태 ==");
        RunnableTask taskA = new RunnableTask("taskA");
        RunnableTask taskB = new RunnableTask("taskB");
        RunnableTask taskC = new RunnableTask("taskC");
        RunnableTask taskD = new RunnableTask("taskD");

        Thread t1 = new Thread(taskA, "taskA");
        Thread t2 = new Thread(taskB, "taskB");
        Thread t3 = new Thread(taskC, "taskC");
        Thread t4 = new Thread(taskD, "taskD");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        log("== 작업 수행 중 ==");

        sleep(3000);
        log("== 작업 수행 완료 ==");

        log("== showdown 완료 ==");
    }
}
