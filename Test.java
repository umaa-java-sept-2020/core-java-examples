public class Test
{
	// 0, 1, 2
   public static void main(String[] args){
    
//	String names[]  = {"asis","alok","deva"}
	System.out.println("welcome: ");
	
	System.out.println(args.length);
	if(args.length == 0){
	   System.out.println("no value found from args");
	   args = new String[2];
	   args[0] = "system1"; // java UUID  for random values
	   args[1] = "system2";
	}
	System.out.println("array 0th index value: "+args[0]);
	System.out.println("array 1st index value: "+args[1]);
	
   }
}

/**

Microsoft Windows [Version 10.0.18363.1082]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test 1
welcome:
1

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test alok
welcome:
array 0th index value: alok

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Test.main(Test.java:8)

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test alok asis
welcome:
array 0th index value: alok
array 1st index value: asis

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Test.main(Test.java:8)

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome:
0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Test.main(Test.java:10)

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>javac Test.java

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test
welcome:
0
no value found from args
array 0th index value: system1
array 1st index value: system2

C:\Users\rabindrapatra\Documents\root\uuv\sept-2020\code\core\core-java-examples>java Test alok deva
welcome:
2
array 0th index value: alok
array 1st index value: deva


*/