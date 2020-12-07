# ARRAYS, CUSTOM TYPES, CODING
## ARRAYS
* Traverse an 1d array using while loop.
* Traverse a 2d array using column major or row major.
* Print a 2d array using toString().
* For a 2d array of dimesnion 3 * 4. arr.length will give 3 or 4?
* In a 2d array of size 3 * 3. convert a given index say 5 into i,j format. Access the element.
* use equals method for comparing 2 1d arrays having same or different content.
* use deepEquals method for comparing 2 2d(or multidimensional) arrays having same or different content.
* Traverse a 2d array using forEach loop along with for index loop.
* int[][] arr = new int[3][4]; Try to iterate this 2d array with below data.
```java
arr[0] = {1,2,3,4,5,6}; // is this valid? 
arr[1] = {1,2,3}; // is this valid? 
arr[2] = {1,2,3,4,5,6, 7}; // is this valid? 
```

## CUSTOM TYPES
* Design a Person class. Where his address is has-a relationship.
* Display Person & Adrress has-relationshop using toString(). It must display content of object.
* Assume you have Person (where each person has an address) array. Display Person[] using toString(). It must display content of object.
* Design a class called Person and Doctor. It must say Doctor is a Person.
* Does has-a relationship represents composition?
* How many types of compositions are available.


## CODING (Write with Junit)
* Given a character array. Reverse it using custom logic.
* Given a integer sorted array. Search an element in the array. If element not found return -1 and if found then return index of the element.
* Given below 2 sorted arrays. Transform them.
```java
input:
int[] arr1 = {2, 10, 12, 14, 16, 18}
int[] arr2 = {13, 17, 21}
output:
arr1 = {2, 10, 12, 13, 14, 16}
arr2 = {17, 18, 21}
```
* Given a sorted matrix of size 3 * 3. Print the position of an element. If not found return -1.
```java
{ 
  {1, 5, 7},
  {8, 13, 15},
  {17, 19, 21}
}
```
* Without using recursion print the first 10 numbers of fibonaci series.
* Implment selection sort.
* Given an integer unsorted array. sort it without using any sorting logic. But you are allowed to swap any element with first element of the array.
* Given an integer almost sorted array which can be sorted exactly with one swap (no bubble sort). 
```java
int[] arr1 = {2, 4, 5, 9, 13, 11, 12, 10, 14, 17}.
```
* Given a string below. Make the initial of each word upper case. custom logic.
```java
String s = "utkal university odisha"

/**
output: "Utkal University Odisha"
*/
```
* Given a string below. Reverse each word below. custom logic. (dont reverse the complete string).
```java
String s = "utkal university odisha"

/**
output: "reverse Utkal reverse University reverse odisha"
*/
```
* Given an employee class below. Create Array of employees. Apply sorting by name (comparator). Apply sort by name when age is same (comparator).
```java
public class Employee
{
   private Integer id;
   private String name;
   private Integer age;

   // getter & setter
}
```
* For above class and array. Apply sort by reverse order of name when age is same (comparable)
* In an excel spread sheet. A = 1, Z = 26, AA = 27, AB = 28. Implement below methods.
```java
public static int convertToInt(String shellAsStr) // input can be A, Z, AA, AB
{
  return 0;
}

public static String convertToString(Integer shellAsInt) // input can be any integer
{
  return null;
}
```
