package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.exceptions.StatisticalException;
import ro.ase.acs.models.StatisticalValues;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticalValuesTest {

    @Test
    public void getMinim() {
        List<Long> values = new ArrayList<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);
        long result = stistics.getMinim();

        assertEquals("Incorrect Minimum",1L, result);
    }

    @Test
    public void getAverage() {
        List<Long> values = new ArrayList<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);

        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);

        double result = 0;
        try {
            result = stistics.getAverage();
        } catch (StatisticalException e) {
            fail(e.getMessage());
        }
        assertEquals("Average is not correct",2, result,0.01);
    }

    @Test(expected = StatisticalException.class)
    public void testGetAverageForEmptyList() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);

        double result = stistics.getAverage();
    }

    @Test(expected = StatisticalException.class)
    public void testGetAverageNullList() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        StatisticalValues stistics = new StatisticalValues();

        double result = stistics.getAverage();
    }

    @Test
    public void testGetAverageSingleValues() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        values.add(1L);

        StatisticalValues statistics = new StatisticalValues();
        statistics.setValues(values);
        double result = 0;
        result = statistics.getAverage();

        assertEquals("Incorrect Average", 1, result,0.01);
    }

    @Test(expected = StatisticalException.class)
    public void testGetAverageNullElement() throws StatisticalException {
        List<Long> values =  new ArrayList<>();
        values.add(null);

        StatisticalValues statisticalValues = new StatisticalValues();
        statisticalValues.setValues(values);
        statisticalValues.getAverage();
    }

    @Test
    public void testGetAverageFloatForValues() throws StatisticalException {
        List<Long> values = new ArrayList<>();
        values.add(2L);
        values.add(2L);
        values.add(3L);

        StatisticalValues stistics = new StatisticalValues();
        stistics.setValues(values);

        double result = stistics.getAverage();
        assertEquals("Average is not correct", 2.33, result, 0.01);
    }
}