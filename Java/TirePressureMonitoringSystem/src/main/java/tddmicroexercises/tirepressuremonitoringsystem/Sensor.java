package tddmicroexercises.tirepressuremonitoringsystem;

import java.util.Random;

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class Sensor {
    public static final double OFFSET = 16;

    public double popNextPressurePsiValue() {
        double pressureTelemetryValue = randomSamplePressure();

        return OFFSET + pressureTelemetryValue;
    }

    private static double randomSamplePressure() {
        // placeholder implementation that simulate a real sensor in a real tire
        Random basicRandomNumbersGenerator = new Random();
        return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
    }
}
