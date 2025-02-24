package com.elx.azure.Components;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {
  static Logger logger = LoggerFactory.getLogger(Fibonacci.class);

  public static void fibonacci(int n) {
    int num1 = 0;
    int num2 = 1;

    for (int i = 0; i < n; i++) {
      int num3 = num2 + num1;
      num1 = num2;
      num2 = num3;

      int mod = num1 % 10;
      if (mod == 5) {
        try {
          logger.info("Calculated modulo of " + num1 + " % 10: " + mod + "\n");
          logger.info("Sleeping for 2 second..");
          // Calculate the percentage of completion
          double percentage = ((double) i / n) * 100;
          double roundedPercentage = Math.round(percentage);
          logger.info("Current percentage completed: " + roundedPercentage + "%");
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    logger.info("Current percentage completed: 100%");
  }

  public void run() {
    System.out.println("Starting calculations..");
    int n = 300;

    long startTime = System.nanoTime();
    fibonacci(n);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    long seconds = TimeUnit.NANOSECONDS.toSeconds(duration);

    logger.info("Time taken for fibonacci(): " + seconds + " seconds");
  }
}
