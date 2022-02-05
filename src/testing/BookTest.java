package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @AfterEach
    void init(){
        System.out.println("This message will be displayed after execution of each testing method");
    }


    @Test
    @Disabled
    void getPage(){

        //Given
        Book book1 = new Book(345, "Java Tutorials");

        //When
        int result = book1.getPage();

        //Then
        assertEquals(345, result);
        System.out.println("This is getPage test method running");

    }

    @Test
    @DisplayName("Get page method test")
    void getTitle(){

        //Given
        Book book1 = new Book(101, "Animal Farm");

        //When & Then
        assertEquals("Animal Farm", book1.getTitle());
        System.out.println("This is getTitle test method running");

    }

    @AfterAll
    static void init1(){
        System.out.println("This message will be displayed once after execution of all testing methods");
    }

}