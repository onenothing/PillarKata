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

    int wages;

    public BabySitterTest() {
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void throwAnExceptionIfStartTimeIsBefore5pm() {
        BabySitter sitter = new BabySitter();
        wages = sitter.calculateWages(18, 4, 20);
    }
    
    @Test
    public void throwAnExceptionIfEndTimeIsAfter4am() throws Exception{
        BabySitter sitter = new BabySitter();
        wages = sitter.calculateWages(18, 5, 20);
    }

}
