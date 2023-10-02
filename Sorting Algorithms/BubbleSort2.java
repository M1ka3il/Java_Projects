import java.util.*;

public class BubbleSort2 {


  static void sortiertBesser(int array[]) {
    final long startTime = System.currentTimeMillis();
    int size = array.length;
    
    //schleife um jedes Array Elem. zu erreichen
    for (int i = 0; i < (size-1); i++) {
      //Schleife um array Elem. zu vergleichen
      boolean swapped = false;
      // loop to compare adjacent elements
      for (int j = 0; j < (size-i-1); j++) {
        // vergleicht benachbarte array Elem.
        // Ändere > zu < um absteigend zu sortieren
        if (array[j] > array[j + 1]) {
         // Elem. werden vertauscht, wenn sie nicht in der vorgesehenen Reihenfolge sind
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      // kein swapping bedeutet, dass das array bereits sortiert ist und folglich keine weiteren vergleiche gemacht werden müssen
      if (!swapped)
        break;

    }
    final long Zeit = System.currentTimeMillis() - startTime;
    System.out.println("Die Ausführungszeit lautet:" + Zeit);
  }
  public static void main(String args[]) {
      
    int[] data = {56,22,79,27,9,30,61,4,69,38,52,89,23,17,68,30};
    
    // call method using the class name
    BubbleSort2.sortiertBesser(data);
    
    System.out.println("Sortiertes Array in aufsteigender Reihenfolge:");
    System.out.println(Arrays.toString(data));

    
    int[] test = new int [100000];
    Random zufallszahl = new Random();
    int oberGrenze= 1000;
    for(int i=0; i<test.length;i++){
      test[i]=((int)zufallszahl.nextInt(oberGrenze));
    }
    BubbleSort2.sortiertBesser(test);
    System.out.println(Arrays.toString(test));
  }
}

