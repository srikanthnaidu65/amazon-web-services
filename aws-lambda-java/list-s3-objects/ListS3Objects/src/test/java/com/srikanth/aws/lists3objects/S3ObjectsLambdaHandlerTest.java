package com.srikanth.aws.lists3objects;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.srikanth.aws.lists3objects.S3ObjectsLambdaHandler;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class S3ObjectsLambdaHandlerTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testS3ObjectsLambdaHandler() {
        S3ObjectsLambdaHandler handler = new S3ObjectsLambdaHandler();
        Context ctx = createContext();

        String output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!", output);
    }
}
