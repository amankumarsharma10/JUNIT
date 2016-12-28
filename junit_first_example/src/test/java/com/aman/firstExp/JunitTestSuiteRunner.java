package com.aman.firstExp;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aman on 28-12-2016.
 */
public class JunitTestSuiteRunner {

    public static void main(String[] args) {
    //  run test cases using JunitTestSuite Annotated with @RunWith(Suite.class) @Suite.SuiteClasses()
        runTestCasesUsingSuiteClass();

    //  run test cases without annotated class
        addTestCase();

    }

    public static void runTestCasesUsingSuiteClass(){
        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()){
            System.out.println("All test pass successfully with annotated Suite class(JunitTestSuite)");
        }
        System.out.println("\n//======================================//\n");
    }


    public static void addTestCase(){
        List testCases = new ArrayList();

        testCases.add(FirstDayAtSchoolTest1.class);
        testCases.add(FirstDayAtSchoolTest2.class);

        runTestCase(testCases);

    }
    public static void runTestCase(List testCases){
        for (Object testCase : testCases)
        {

            Result result = JUnitCore.runClasses(((Class)testCase));
            for (Failure failure : result.getFailures())
            {
                System.out.println(failure.toString());
            }
            if (result.wasSuccessful()){
                System.out.println("All test pass successfully without using Suite.class Annotation");
            }
        }

    }
}
