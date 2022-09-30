
public class Week3_4_assignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //#1
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 13};
    
    int agesLength = ages.length;
    int difference = Math.abs(ages[0] - ages[ages.length - 1]);
    System.out.println(difference);
    
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
         sum += ages[i];
    } 
    double average = sum / ages.length;
    System.out.println(average);
   
    //#2
    String[] names = {"Sam", "Tommy", "Tia", "Sally", "Buck", "Bob"};
    sum = 0 ;
    for (int i = 0; i < names.length; i++) {
        sum += names[i].length();
    }
    
    average = sum / names.length;
    System.out.println(average); 
    
    String allNames = " ";
    for (int i = 0; i < names.length; i++) {
         allNames += names[i] + " ";
    }
    System.out.println(allNames);
    
  //#3 
  System.out.println("array[array.length]");
  
  //#4
  System.out.print("array[0]");
  
  //#5
  int[] nameLengths = new int[names.length];
  for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
    }
  

//#6
   sum = 0;
   for (int i = 0; i < nameLengths.length; i++) {
       sum += nameLengths[i];
   }
   System.out.println(sum);
   
  }
  
  //#7
   
   private static String repeatWord(String word, int x) {
     String repeatWord = "";
     for (int i = 0; i < x; i++) {
             repeatWord += word;
     }
     return repeatWord;
  
  System.out.println(repeatWord("Hello", 3));
  
  
  //8
  private static String fullName(String firstName, String lastName) {
  return firstName + " " + lastName;
  System.out.println(fullName("Karina" + " " + "Del Campo"));
  
  //9
  
  Object ages;
  System.out.println(sumGreaterThan(ages));
  
  
  
  }

  private static char[] sumGreaterThan(Object ages) {
    // TODO Auto-generated method stub
    return null;
  }
  
  //10
  private static double getAverageOfDoubleArr(double[] arr) {
    return arrays.stream(arr).average().orElse(Double.NaN);
  } 
  
  double[] doubleArr = {0.6, 5.3, 420.69, 9001, 777.6969};
  double[] emptyDoubleArr = {}; {
  System.out.println(getAverageOfDoubleArr(doubleArr));
  System.out.println(getAverageOfDoubleArr(emptyDoubleArr));
   
  
  
   }

   //11
  private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
    return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
 
  double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
  System.out.println(isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
  
  }

   public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
     if (isHotOutside && moneyInPocket > 10.50) { 
         return true;
     }else {
         return false;
         
         boolean isHotOutside = true;
         double moneyInPocket = 20.69;
         System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
     }
   }
   
   
  //12
   private static String pantsOrShorts (int temp){
     if (temp > 90) {
         return "shorts"; 
     }else {
         return "pants";
 
         int temp = 110;
         System.out.println(pantsOrShorts(temp));  
   
   }
     
  
  }
   
   
}