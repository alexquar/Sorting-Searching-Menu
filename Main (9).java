//Alex Quarrie
//March 28th 2023
//Sorting/Searching Menu Program
//Menu that asks you to imput information for an array and then allows you to do decide what to do with it
import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to array sorter/searcher 1000! Enter the size of the array you would like to sort or search for a number in:");
        int size = sc.nextInt();
int [] nums = new int[size];
System.out.println("Enter the interval of numbers you want your numbers to be randomized in.");
System.out.println("Enter the minimum number:");
    int min=sc.nextInt();
System.out.println("Enter the maximum number:");
    int max=sc.nextInt();
for(int k=0;k<size;k++){
  nums [k]=(int)(Math.random()*(max-min)+min);
}
        String choice="hi";
    int num=0;
    int check=0;
                System.out.println("Please choose an option:");
            System.out.println("Bubble; To Bubble sort your array");
            System.out.println("Insertion; To Insertion sort your array");
            System.out.println("Quick; To Quick sort your array");
            System.out.println("Linear; To Linear search your array");
            System.out.println("Binary; To Binary search Your array");
            System.out.println("Done; To Exit");
        while (!choice.equalsIgnoreCase("Done")) {
          for(int k=0;k<size;k++){
  nums [k]=(int)(Math.random()*(max-min)+min);
}
            System.out.print("Enter what you would like to do:");
            choice = sc.next();
            if (choice.equalsIgnoreCase("Bubble") ) {
              long startTime = System.nanoTime();
              nums=bubbleSort(nums);
              double length=(System.nanoTime() - startTime) / 1000000.0000;
        System.out.println("Bubble sort took " + length + " milliseconds to sort the numbers.");
              System.out.println("Here is your specified array sorted with bubble sort:");
              for(int k=0;k<size;k++){
                System.out.print(nums [k]+" ");
              }
              System.out.println("");
            }
            else if (choice.equalsIgnoreCase("Insertion")) {
              long startTime = System.nanoTime();
              nums=insertionSort(nums);
double length=(System.nanoTime() - startTime) / 1000000.0000;
        System.out.println("Insertion sort took " + length + " milliseconds to sort the numbers.");
              System.out.println("Here is your specified array sorted with insertion sort:");
              for(int k=0;k<size;k++){
                  System.out.print(nums [k]+" ");
              }
              System.out.println("");
            }
            else if (choice.equalsIgnoreCase("Quick")) {
              long startTime = System.nanoTime();
                nums=builtinSort(nums);
              double length=(System.nanoTime() - startTime) / 1000000.00;
        System.out.println("Bubble sort took " + length + " milliseconds to sort the numbers.");
              System.out.println("Here is your specified array sorted with quick sort:");
              for(int k=0;k<size;k++){
                System.out.print(nums [k]+" ");
              }
              System.out.println("");
            }
            else if (choice.equalsIgnoreCase("Linear")) {
                System.out.print("Enter the value to search for: ");
                 num = sc.nextInt();
              long startTime = System.nanoTime();
                check= Linearsearch(num,nums,size);
  double length=(System.nanoTime() - startTime) / 1000000.0000;
        System.out.println("Linear search took " + length + " milliseconds to search for your number.");
              if(check==-1){
      System.out.println("The element "+num+" is not found in the array");
    }
    if(check!=-1){
    System.out.println("The element "+num+" is first found at index "+check+" of the array.");
    }
            }
            else if (choice.equalsIgnoreCase("Binary")) {
                System.out.print("Enter the value to search for: ");
                 num = sc.nextInt();
              Arrays.sort(nums);
          long startTime = System.nanoTime();
                 check=binarysearch(num,nums,size);
double length=(System.nanoTime() - startTime) / 1000000.0000;
        System.out.println("Binary search took " + length + " milliseconds to search for your number.");
    if(check==-1){
      System.out.println("The element "+num+" is not found in the array");
    }
    if(check!=-1){
    System.out.println("The element "+num+" is first found at index "+check+" of the array.");
    }
            }
            }
System.out.println("Thank you for using array sorter/searcher 1000!");
    }
  public static int Linearsearch(int num, int [] nums, int size){
    int check= -1;
  for (int k=0;k<size;k++){
    if(nums[k]==num){
      check=k;
      break;
    }
  }
    return check;
}
  public static int binarysearch(int num, int [] nums, int size){
    int check= -1;
  Arrays.sort(nums);
    int first=nums[0];
    int last=nums[size-1];
    int mid=(first+last)/2;
while( first <= last ){  
      if ( nums[mid] < num ){  
        first = mid + 1;     
      }else if ( nums[mid] == num ){  
        check=mid;
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
return check;
}
public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

        public static int[] builtinSort(int[] array) {
      Arrays.sort(array);
        return array;
  }
}