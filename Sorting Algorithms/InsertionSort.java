import java.util.*;

class InsertionSort {
  void insertionSort(int array[]) {
    final long startTime = System.currentTimeMillis();
    int size = array.length;
    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      /** Vergleicht key mit jedem Element links von ihm, bis ein kleineres Element gefunden wird.
          key<array[j] = aufsteigend
          key>array[j] = absteigend
       */
       
     // vergleicht array Elem. miteinander.
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Setzt 'key' nach dem nächst Element<key ein.
      array[j + 1] = key;
    }
    final long Zeit = System.currentTimeMillis() - startTime;
    System.out.println("Die Ausführungszeit lautet (in nanoTime):" + Zeit/1000000);
  }

  //test mit kleinem Array und großem Array
  public static void main(String args[]) {
    int[] data = {56,22,79,27,9,30,61,4,69,38,52,89,23,17,68,30};
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sortiertes Array in aufsteigender Reihenfolge:");
    System.out.println(Arrays.toString(data));

    int[] test = new int [100000];
    Random zufallszahl = new Random();
    int oberGrenze= 1000;
    for(int i=0; i<test.length;i++){
      test[i]=((int)zufallszahl.nextInt(oberGrenze));
    }
    
    is.insertionSort(test);
    System.out.println(Arrays.toString(test));
  }
}