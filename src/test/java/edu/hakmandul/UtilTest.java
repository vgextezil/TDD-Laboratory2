package edu.hakmandul;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
  @author   hakmandul
  @project   Laboratory2
  @class  UtilTest
  @version  1.0.0 
  @since 2/15/2024 - 22.21
*/

class UtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRomanStringIsEmptyThenThrowException(){
        Exception exception = Assertions.assertThrows(Exception.class, ()->{
            Util.convertRomanToArabic("");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("String is empty", exception.getMessage());
    }
    @Test
    void whenRomanStringIsNullThenThrowException(){
        Exception exception = Assertions.assertThrows(Exception.class, ()->{
            Util.convertRomanToArabic(null);
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("String isn't be null", exception.getMessage());
    }
    @Test
    void whenRomanStringIsTrashThenThrowException(){
        Exception exception = Assertions.assertThrows(Exception.class, ()->{
            Util.convertRomanToArabic("VVVIZ");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("Incorrect char in string", exception.getMessage());
    }

    //TDD

    //4
    @Test
    void whenRoman_I_Then_Arabic_1() {
        Assertions.assertEquals(1,Util.convertRomanToArabic("I"));
    }
    //5
    @Test
    void whenRoman_III_Then_Arabic_3() {
        Assertions.assertEquals(3,Util.convertRomanToArabic("III"));
    }
    //6
    @Test
    void whenRoman_IV_Then_Arabic_4() {
        Assertions.assertEquals(4,Util.convertRomanToArabic("IV"));
    }
    //7
    @Test
    void whenRoman_V_Then_Arabic_5() {
        Assertions.assertEquals(5,Util.convertRomanToArabic("V"));
    }
    //8
    @Test
    void whenRoman_V_Then_Arabic_6() {
        Assertions.assertEquals(6,Util.convertRomanToArabic("VI"));
    }
    //9
    @Test
    void whenRoman_VIII_Then_Arabic_8() {
        Assertions.assertEquals(8,Util.convertRomanToArabic("VIII"));
    }
    @Test
    void whenRoman_IX_Then_Arabic_9() {
        Assertions.assertEquals(9,Util.convertRomanToArabic("IX"));
    }
    @Test
    void whenRoman_X_Then_Arabic_10() {
        Assertions.assertEquals(10,Util.convertRomanToArabic("X"));
    }
    @Test
    void whenRoman_XI_Then_Arabic_11() {
        Assertions.assertEquals(11,Util.convertRomanToArabic("XI"));
    }
    @Test
    void whenRoman_XIV_Then_Arabic_14() {
        Assertions.assertEquals(14,Util.convertRomanToArabic("XIV"));
    }
    @Test
    void whenRoman_XVIII_Then_Arabic_18() {
        Assertions.assertEquals(18,Util.convertRomanToArabic("XVIII"));
    }
    @Test
    void whenRoman_XIX_Then_Arabic_19() {
        Assertions.assertEquals(19,Util.convertRomanToArabic("XIX"));
    }
    @Test
    void whenRoman_XX_Then_Arabic_20() {
        Assertions.assertEquals(20,Util.convertRomanToArabic("XX"));
    }
    @Test
    void whenRoman_XL_Then_Arabic_40() {
        Assertions.assertEquals(40,Util.convertRomanToArabic("XL"));
    }
    @Test
    void whenRoman_L_Then_Arabic_50() {
        Assertions.assertEquals(50,Util.convertRomanToArabic("L"));
    }
    @Test
    void whenRoman_XCV_Then_Arabic_95() {
        Assertions.assertEquals(95,Util.convertRomanToArabic("XCV"));
    }
    @Test
    void whenRoman_C_Then_Arabic_100() {
        Assertions.assertEquals(100,Util.convertRomanToArabic("C"));
    }
    @Test
    void whenRoman_CXCV_Then_Arabic_195() {
        Assertions.assertEquals(195,Util.convertRomanToArabic("CXCV"));
    }

    @Test
    void whenRoman_CDIV_Then_Arabic_404() {
        Assertions.assertEquals(404,Util.convertRomanToArabic("CDIV"));
    }
    @Test
    void whenRoman_DLV_Then_Arabic_555() {
        Assertions.assertEquals(555,Util.convertRomanToArabic("DLV"));
    }
    @Test
    void whenRoman_CMLXXV_Then_Arabic_975() {
        Assertions.assertEquals(975,Util.convertRomanToArabic("CMLXXV"));
    }
    @Test
    void whenRoman_CMXCIX_Then_Arabic_999() {
        Assertions.assertEquals(999,Util.convertRomanToArabic("CMXCIX"));
    }
    @Test
    void whenRoman_M_Then_Arabic_1000() {
        Assertions.assertEquals(1000,Util.convertRomanToArabic("M"));
    }
    @Test
    void whenRoman_MCDXLV_Then_Arabic_1445() {
        Assertions.assertEquals(1445,Util.convertRomanToArabic("MCDXLV"));
    }
    @Test
    void whenRoman_MDCLXXXIV_Then_Arabic_1684() {
        Assertions.assertEquals(1684,Util.convertRomanToArabic("MDCLXXXIV"));
    }
    @Test
    void whenRoman_MCMXCIX_Then_Arabic_1999() {
        Assertions.assertEquals(1999,Util.convertRomanToArabic("MCMXCIX"));
    }
    @Test
    void whenRoman_MM_Then_Arabic_2000() {
        Assertions.assertEquals(2000,Util.convertRomanToArabic("MM"));
    }
    @Test
    void whenRoman_MMCXC_Then_Arabic_2190() {
        Assertions.assertEquals(2190,Util.convertRomanToArabic("MMCXC"));
    }
    @Test
    void whenRoman_MMCCCXXXIII_Then_Arabic_2333() {
        Assertions.assertEquals(2333,Util.convertRomanToArabic("MMCCCXXXIII"));
    }
    @Test
    void whenRoman_MMCDXL_Then_Arabic_2440() {
        Assertions.assertEquals(2440,Util.convertRomanToArabic("MMCDXL"));
    }
    @Test
    void whenRoman_MMDLXXX_Then_Arabic_2580() {
        Assertions.assertEquals(2580,Util.convertRomanToArabic("MMDLXXX"));
    }
    @Test
    void whenRoman_MMDCCCXLV_Then_Arabic_2845() {
        Assertions.assertEquals(2845,Util.convertRomanToArabic("MMDCCCXLV"));
    }
    @Test
    void whenRoman_MMCMXCIX_Then_Arabic_2999() {
        Assertions.assertEquals(2999,Util.convertRomanToArabic("MMCMXCIX"));
    }
    @Test
    void whenRoman_MMMC_Then_Arabic_3100() {
        Assertions.assertEquals(3100,Util.convertRomanToArabic("MMMC"));
    }
    @Test
    void whenRoman_MMMCCCLXXVIII_Then_Arabic_3378() {
        Assertions.assertEquals(3378,Util.convertRomanToArabic("MMMCCCLXXVIII"));
    }
    @Test
    void whenRoman_MMMCDLX_Then_Arabic_3460() {
        Assertions.assertEquals(3460,Util.convertRomanToArabic("MMMCDLX"));
    }
    @Test
    void whenRoman_MMMDCCCLXXV_Then_Arabic_3875() {
        Assertions.assertEquals(3875,Util.convertRomanToArabic("MMMDCCCLXXV"));
    }
    @Test
    void whenRoman_MMMCMXCIX_Then_Arabic_3999() {
        Assertions.assertEquals(3999,Util.convertRomanToArabic("MMMCMXCIX"));
    }


}