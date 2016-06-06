/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysittertest;

import com.swcguild.babysitterkata.BabySitter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        assertEquals(12, sitter.calculateWages(18, 19, 20));
        assertEquals(24, sitter.calculateWages(17, 19, bedTime));
    }

    @Test
    public void testingThatRatesAre8PerHourAterBedtimeAndBeforeMidnight() {
        assertEquals(8, sitter.calculateWages(21, 22, 20));
        assertEquals(24, sitter.calculateWages(21, 24, 20));
    }

    @Test
    public void testingThatRatesAre16PerHourForWorkingAfterMidnight() {
        assertEquals(32, sitter.calculateWages(25, 27, 24));
        assertEquals(64, sitter.calculateWages(24, 28, 24));
    }
    
    @Test
    public void testingThatWagesFrom5pmTo2amWith8pmBedtimeEqual(){
        wages = sitter.calculateWages(17, 2, bedTime);
        assertEquals(100, wages);
        
    }
}