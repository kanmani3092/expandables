package org.runner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestResultClass{ 
	
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(TestRunnerClass.class);
		
		if (runClasses.wasSuccessful()) {
			System.out.println("All Classes Executed Successfully"); 
			
			int runCount = runClasses.getRunCount();
			System.out.println("RunCount :" + runCount);
			
			long runTime = runClasses.getRunTime();
			System.out.println("RunTime :" + runTime);
			
			int ignoreCount = runClasses.getIgnoreCount();
			System.out.println("IgnoreCount :" + ignoreCount);
			
		}
		else {
			int failureCount = runClasses.getFailureCount();
			System.out.println("FailureCount :" + failureCount);
			
			List <Failure> failures = runClasses.getFailures();
			
			for (int i = 0 ; i < failures.size(); i++) {
				Failure failure = failures.get(i);
				Throwable exception = failure.getException();
				System.out.println("Failure Exception :" + exception);
				
				
	 
			
		}
		}
	}
}


