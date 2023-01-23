package helper;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	
	private final int SIZE = 10;
	public ScheduledThreadPoolExecutor executor;
	
	private static ThreadPool instance;
	
	private ThreadPool() {
		this.executor = new ScheduledThreadPoolExecutor(SIZE);
        executor.schedule(() -> System.out.println("Task executed"), 5, TimeUnit.SECONDS);
	}
	
	public static ThreadPool getInstance() {
		if(instance == null) instance = new ThreadPool();
		return instance;
	}
}
