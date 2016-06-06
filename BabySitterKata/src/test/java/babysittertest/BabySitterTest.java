/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysittertest;

import com.swcguild.babysitterkata.BabySitter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class BabySitterTest {

    private BabySitter sitter;
    int wages;
    int bedTime = 20;

    public BabySitterTest() {
    }

    @Before
    public void setUp() {
        sitter = new BabySitter();
    }

    @Test
    public void throwAnExceptionIfStartTimeIsBefore5pm() throws Exception {
        wages = sitter.calculateWages(17, 4, 20);
    }

    @Test
    public void throwAnExceptionIfEndTimeIsAfter4am() throws Exception {
        wages = sitter.calculateWages(18, 4, 20);
    }

    @Test
    public void testingThatRatesAre12PerHourBeforeBedtime() {
        assertEquals(12, sitter.rateEarnedAt12PerHour(18, 19, 20));
        assertEquals(24, sitter.rateEarnedAt12PerHour(17, 19, bedTime));
    }

    @Test
    public void testingThatRatesAre8PerHourAterBedtimeAndBeforeMidnight() {
        assertEquals(8, sitter.rateEarnedAt8PerHour(21, 22, 20));
        assertEquals(24, sitter.rateEarnedAt8PerHour(21, 24, 20));
    }

    @Test
    public void testingThatRatesAre16PerHourForWorkingAfterMidnight() {
        assertEquals(32, sitter.rateEarnedAt16PerHour(25, 27, 24));
        assertEquals(64, sitter.rateEarnedAt16PerHour(24, 28, 24));
    }
    
    @Test
    public void testingThatWagesFrom5pmTo2amWith8pmBedtimeEqual$100(){
        wages = sitter.calculateWages(17, 2, bedTime);
        assertEquals(100, wages);
    }
    
    @Test
    public void testingThatWagesFrom6pmToMidnightWith8pmBedtimeEqual$56(){
        wages = sitter.calculateWages(18, 24, bedTime);
        assertEquals(56, wages);
    }
    
    @Test
    public void testingThatWagesFrom5pmTo4amWith10pmBedtimeEqual$138() {
        wages = sitter.calculateWages(17, 4, 22);
        assertEquals(140, wages);
    }
}