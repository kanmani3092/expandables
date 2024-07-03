package org.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.validate.TestScript;
import org.validate.TestScript2;

@RunWith(Suite.class)
@SuiteClasses({TestScript.class , TestScript2.class})
public class TestRunnerClass {
	

}
