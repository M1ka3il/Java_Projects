import java.util.*;

class SelectionSort {
  void SelectionSort(int array[]) {
    final long startTime = System.currentTimeMillis();
    int size = array.length;
    for (int step = 0; step < size - 1; step++) {
      int min = step;
      for (int i = step + 1; i < size; i++) {

        // Um absteigend zu sortieren, > in < ändern
        if (array[i] < array[min]) {
          min = i;
        }
      }
      int temp = array[step];
      array[step] = array[min];
      array[min] = temp;
    }
    final long Zeit = System.currentTimeMillis()-startTime;
    System.out.println("Die Ausführungszeit lautet:" + Zeit/1000);
  }

  public static void main(String args[]) {
    int[] data = {56,22,79,27,9,30,61,4,69,38,52,89,23,17,68,30};
    SelectionSort ss = new SelectionSort();
    ss.SelectionSort(data);
    System.out.println("Sortiertes Array in aufsteigender Reihenfolge:");
    System.out.println(Arrays.toString(data));
    
    int[] test = new int [100000];
    Random zufallszahl = new Random();
    int oberGrenze= 1000;
    for(int i=0; i<test.length;i++){
      test[i]=((int)zufallszahl.nextInt(oberGrenze));
    }
    ss.SelectionSort(test);
    System.out.println(Arrays.toString(test));
  }
}