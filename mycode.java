import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class mycode {
  public static void main(String[] args) {
  System.out.println("");
  System.out.println("---------Missing element----------");
  
  //import java.util.Arrays;
  Integer [] A2 = {6,8,8,10,9,11,13,12};
  //Integer [] B2 = new Integer[A2.length];
  Arrays.sort(A2);
  int value = 0;
  int result = 0;
  for(int data = 0; data < A2.length-1; data++){
    value = A2[data+1] - A2[data];
    if(value>1){
      result = A2[data]+1;
      System.out.println("value missing: "+result);
    }    
  }
 
   if(result==0){
    System.out.println("Array is a permutation");
    }
    //print 
    System.out.printf("Modified: %s", 
                          Arrays.toString(A2)); 


  //------------------------------------------------------------------------------

  System.out.println("");
  System.out.println("---------Array Rotation----------");

  Integer [] A = {3,8,9,7,6};
  int K = 3;

  for(int i = 0; i < K; i++ ){
    int j = 0;
    int last = 0;
    last = A[A.length-1];
    for(j=A.length-1; j > 0; j--){
      //shift elements
      A[j]=A[j-1];
    }
    A[0]=last;
  }

  //print 
  System.out.printf("New Array: %s", 
                          Arrays.toString(A));  


  //------------------------------------------------------------------------------
  System.out.println("");
  System.out.println("------Find duplicates-------------");


  String [] data = {"ab","ac", "ab","z1","w4"}; 
  
  Map <String, Integer> myhashmap = new HashMap<>();
  //build hash table
  for(String name : data){
     Integer count = myhashmap.get(name);
     if(count == null){
       myhashmap.put(name,1);
     }else{
       myhashmap.put(name,++count);
     } 
  }

  //print
  Set<Entry < String, Integer > > mySet = myhashmap.entrySet();
  for(Entry <String,Integer> entry : mySet){
    if(entry.getValue() == 1){
      System.out.println("Not-Duplicates "+entry.getKey());
    }
  } 

  //------------------------------------------------------------------------------

  System.out.println("-------------------");

  Integer [] numbers = {1,6,5,3,9,7,3,1,11};
  Map <Integer, Integer> myhashmap_numbers = new HashMap<>();
  for(Integer values : numbers){
     Integer count = myhashmap_numbers.get(values);
     if(count == null){
       myhashmap_numbers.put(values,1);
     }else{
       myhashmap_numbers.put(values,++count);
     } 
  }

  //print
  Set<Entry < Integer, Integer > > mySet_numbers = myhashmap_numbers.entrySet();
  for(Entry <Integer, Integer> entryNumbers : mySet_numbers){
    if(entryNumbers.getValue() > 1){
      System.out.println("Numbers-Duplicates "+entryNumbers.getKey());
    }
  } 

  //------------------------------------------------------------------------------

  }
 
}
