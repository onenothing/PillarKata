
package com.swcguild.romannumeralkata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class RomanNumeralConverterTest {
    
  @Test 
  public void convertArabicOneToRomanI() {
      assertEquals("I", RomanNumeralConverter.convertToRomanNumeral(1));
  }
  

}
