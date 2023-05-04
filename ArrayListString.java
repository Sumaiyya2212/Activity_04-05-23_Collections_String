package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		ArrayList<String> a1= new ArrayList<String>();
		System.out.println("How Many Elements you want to enter :");
		int ele = sc.nextInt();
		
		System.out.println("Enter string elements :");
		for(int i=0;i<ele;i++)
		{
		   str = sc.next();
		   a1.add(str);
		}
		System.out.println("String are :");
		System.out.println(a1);
		 for(int i=0;i<ele;i++)
		  {
		      System.out.println(a1.get(i)+"");
		  }
		 System.out.println("====================");
		 //sort in ascending order 
		 Collections.sort(a1);
		 System.out.println("Sorting in ascending order :");
		 System.out.println(a1);
		 System.out.println("====================");
		 //sort in descending order
		 Collections.sort(a1,Collections.reverseOrder());
		 System.out.println("Sorting in descending order :");
		 System.out.println(a1);
		 System.out.println("====================");
		 //to add a value in a given index
		 System.out.println("Enter the index: ");
		 int index = sc.nextInt();
		 System.out.println("Enter new String : ");
		 String s = sc.next();
		 a1.add(index,s);
		 System.out.println(a1);
		 System.out.println("====================");
		 //to remove an element
		 System.out.println("Enter the index to remove : ");
		 int r = sc.nextInt();
		 a1.remove(r);
		 System.out.println(a1);
		 System.out.println("====================");
		 //convert arraylist into array 
		 System.out.println("Converting arraylist into array ");
		 String arr[] = new String[a1.size()];
		 for(int i=0;i<a1.size();i++)
		 {
			 arr[i] = a1.get(i);
		 }
		 //print the element in array
		 for(int i=0;i<a1.size();i++)
		 {
			 System.out.println(arr[i]);
		 }
		 System.out.println("====================");
		 //convert array into arraylist
		 String arr1[]= {"dog","cat","horse"};
		 ArrayList<String> alist = new ArrayList<String>(Arrays.asList(arr1));
		 alist.add("Monkey");
		 alist.add("elephant");
		 System.out.println("After Converting");
		 System.out.println(alist);
		 System.out.println("====================");
		 //replace the String at a given index
		 System.out.println("Replace the String at a given Index");
		 alist.set(1, "tiger");
		 System.out.println(alist);
		 }
	}
