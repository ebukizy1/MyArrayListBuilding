package ArrayListBuilding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class ArrayListTest {
     MyArrayList myList = new MyArrayList() ;

    @Test
     public void testOurArrayListIsEmpty(){
         assertNotNull(myList);
     }
     @Test
     public void testICanAddToMyArraysAndCheckIfItAdded(){
       String [] expected = { "emmanuel", "null","null","null","null","null","null","null","null","null"};
         myList.add("emmanuel");
        String[] value = myList.getArrays();
         assertEquals(Arrays.toString(expected),Arrays.toString(value));
     }
    @Test public void testArraysCanBeExpendedTwiceTheSize(){
        String [] expected = { "ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","ama","null","null","null" };
      for(int i = 0; i < 17; i++)
          myList.add("ama");
      String [] value = myList.getArrays();
      assertEquals(Arrays.toString(expected), Arrays.toString(value));
     }
     @Test
     public void testYouCanRemoveFromElementFromTheArrayList(){
         String [] expected = { "emmanuel", "ama","mike","john","love","null","null","null","null", "null"};
         myList.add("emmanuel");
         myList.add("ama");
         myList.add("james");
         myList.add("mike");
         myList.add("john");
         myList.add("love");
        myList.remove(2);
        String[] value = myList.getArrays();
       assertEquals(Arrays.toString(expected), Arrays.toString(value));
     }
     @Test
     public void testArrayLengthIsTheSameWhenElementIsRemove(){
     myList.add("emmanuel");
     myList.add("chibuzo");
     myList.add("femi");
     myList.add("emeka");
     myList.add("james");
     myList.add("jerry");
     myList.remove(3);
     assertEquals(5, myList.getSize());
     }

     @Test
     public void testYouCanGetTheSizeOfAnArray(){
        myList.add("emma");
        myList.add("emma");
        myList.add("emma");
        myList.add("emma");
        myList.add("emma");
       int size = myList.getSize();
        assertEquals(5, size);
     }
     @Test
     public  void testICanGetTheValueInTheArrayByPuttingTheIndex(){
         myList.add("emmanuel");
         myList.add("segun");
         myList.add("dele");
         myList.add("mike");
         myList.add("obi");
      String value = myList.get(2);
     assertEquals("dele", value);
     }
     @Test
     public void testYouCanPassInStringElementToBeRemoveFromTheArray(){
         myList.add("emmanuel");
         myList.add("segun");
         myList.add("dele");
         myList.add("mike");
         myList.add("obi");
        myList.remove("emmanuel");
        int value = myList.getSize();
        assertEquals(4,value);

     }
     @Test
     public void testYouCouldRemoveAllTheElementInTheList(){
         myList.add("emmanuel");
         myList.add("segun");
         myList.add("dele");
         myList.add("mike");
         myList.add("obi");
        myList.clear();
         int value = myList.getSize();
        assertEquals(0,value);
     }
     @Test
     public void testYouCanUpdateElementInTheList(){
         String [] expected = { "emmanuel", "segun","godfrey","mike","obi","null","null","null","null", "null"};
         myList.add("emmanuel");
         myList.add("segun");
         myList.add("dele");
         myList.add("mike");
         myList.add("obi");
         myList.set(2,"godfrey");
         String [] value = myList.getArrays();
        assertEquals(Arrays.toString(expected), Arrays.toString(value));
     }
    @Test
    public void testYouCanCheckIfArrayIsEmpty(){
        myList.add("emmanuel");
        myList.add("segun");
        myList.add("dele");
        myList.add("mike");
        myList.add("obi");
        myList.clear();
        assertTrue(myList.isEmpty());
    }
   @Test
   public void testTheArrayIsNotEmpty(){
       myList.add("emmanuel");
       myList.add("segun");
       myList.add("dele");
       myList.add("mike");
       myList.add("obi");
       assertFalse(myList.isEmpty());
    }
    @Test
    public void testToGetTheFirstIndexOfTheOccurrenceOfTheFirstElement(){
        myList.add("emmanuel");
        myList.add("segun");
        myList.add("dele");
        myList.add("mike");
        myList.add("obi");
       int index = myList.indexOf("mike");
        assertEquals(3, index);
    }
    @Test
    public void testToGetTheLastIndexOfTheOccurrenceOfTheLastElement(){
        myList.add("emmanuel");
        myList.add("mike");
        myList.add("dele");
        myList.add("mike");
        myList.add("obi");
        myList.add("obi");
        myList.add("emmanuel");
        int index = myList.lastIndexOf("mike");
        assertEquals(3, index);
    }
    @Test
    public void testToCheckIfArrayElementContainValueOrNot(){
        myList.add("emmanuel");
        myList.add("segun");
        myList.add("dele");
        myList.add("mike");
        myList.add("obi");
       boolean isContain = myList.contains("dele");
       assertTrue(isContain);
    }
    @Test
    public void testToCheckIfArrayElementContainValueOrNotTest2(){
        myList.add("emmanuel");
        myList.add("segun");
        myList.add("dele");
        myList.add("mike");
        myList.add("obi");
        boolean isContain = myList.contains("ola");
        assertFalse(isContain);
    }

    }








