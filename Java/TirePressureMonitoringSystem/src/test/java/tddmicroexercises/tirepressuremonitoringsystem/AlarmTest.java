package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void alarmIsOnWhenSensorReturnsValueBelowThreshold() {
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue()).thenReturn(16.0);
        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void alarmIsOffWhenSensorReturnsValueWithinThreshold() {
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue()).thenReturn(18.0);
        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void alarmIsOnWhenSensorReturnsValueIsAboveThreshold() {
        Sensor sensor = mock(Sensor.class);
        when(sensor.popNextPressurePsiValue()).thenReturn(30.0);
        Alarm alarm = new Alarm(sensor);

        alarm.check();

        assertTrue(alarm.isAlarmOn());
    }
}
