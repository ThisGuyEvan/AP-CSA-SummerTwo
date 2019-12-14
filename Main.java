
// I decided to not remove lines 4 and 5 because it was my plan that led to the completetion of the code.

// 3 = 000, and 3 down
// double for loops --> one with a index that's increasing to 10 so 0-9 and one with a loop of 3 or whatever y is.



class Main {
// The main method is here for variable setting.
  public static void main(String[] args) {
  // These two arrays are here because I thought it organizes things. 
    // "new int[3]"" means that this array is capable of holding 3 variables."
    int a[] = new int[3];
    int b[] = new int[3];
    a[0] = 10;
    b[0] = 3;
    taskOne(a[0],b[0]);

    a[1] = 10;
    b[1] = 5;
    taskTwo(a[1],b[1]);

    a[2] = 10;
    b[2] = 4;
    taskThree(a[2], b[2]);
  }


// This method is just adding the same value of index i (range: 0-9 because x is set to 10.) to the length. 
  public static void taskOne(int x, int y) {
    System.out.println("\nTask One:\n");
    String length = "";
    for (int i = 0; i < x; i++){
      // This for loop is included for the purpose of repeating the numbers as many times as y's value(3).
      for (int l = 0; l < y; l++){
        length += String.format ("%d" , i);
      }
    }
    // Same idea as previous for loop.
    for (int z = 0; z < y; z++){
      System.out.println(length);
    }
    System.out.println("\n\n\n");

  }


// This method is a bit more complicated than the previous because I had to add new variables into the code in order to flip the numbers. 
  public static void taskTwo(int s, int t){
    System.out.println("Task Two:\n");
    String length = "";
    // Deduct is basically my failure and resolve to slicing. It is the same idea as [:-(index)] in Python.
    int deduct = s;
    for (int v = 0; v < s; v++){
      //Since deduct is the value of a[1] which is 10, 10-1 is 9, the first string value that is added to the variable length would be 9 --> timed by b[1] and so on.
      deduct -= 1;
      for (int p = 0; p < t; p++){
        //String format is just "str" in Python. (I think this is correct, I saw other ideas in StackOverflow as well)
        length += String.format("%d" , deduct);
      }
    }

    for (int h = 0; h < t; h++){
      System.out.println(length);
    }
    System.out.println("\n\n\n");
  }


//Because of the last method, this was a copy and paste and then modified a few position of variables. 
  public static void taskThree(int e, int v){
    System.out.println("Task Three:\n");
    String length = "";
    int deduct = e;
    for (int u = 0; u < e; u++){
      deduct -= 1;
      // Here instead of normally including the value of a[1], I put deduct since it subtracts by 1.
      for (int o = 0; o < deduct; o++){
        length += String.format("%d" , deduct);
      }
    }
    for (int k = 0; k < v; k++){
      System.out.println(length);
    }

  }
}

// Also if my memory is correct, you challenged us to complete this in Python once. I couldn't find the file, but it would have been very useful. 
