package testing;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add test 1")
    void add1(){
        //Given
        Calculator calculator1 = new Calculator();
        //When
        int result = calculator1.add(10, 6);
        //Then
        assertEquals(16,result);
    }

    @Test
    @DisplayName("Add test 2")
    void add2(){
        //Given
        Calculator calculator1 = new Calculator();
        //When
        int result = calculator1.add(-5, 6);
        //Then
        assertEquals(1,result);
    }

    @Test
    @DisplayName("Sub test 1")
    void sub1(){
        //Given
        Calculator calculator1 = new Calculator();
        //When
        int result = calculator1.sub(20, 7);
        //Then
        assertEquals(13,result);
    }

    @Test
    @DisplayName("Sub test 2")
    void sub2(){
        //Given
        Calculator calculator1 = new Calculator();
        //When
        int result = calculator1.sub(10, 5);
        //Then
        assertThat(result).isNotEqualTo(4).isBetween(1,5);

    }

}