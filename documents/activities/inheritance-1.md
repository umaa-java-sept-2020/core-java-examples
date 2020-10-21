* Code example of inheritance. Reuse static/non-static method(s) & static/non-static variable(s).
* Code example of instance of operator using classes as BaseParent->Parent->Child.
* Code example of super constructor.
* Does multiple object created in inheritance hierarchy.
* Does super constructor invocation creates one more object.
* Code example of method hiding.
* Code example of variable hiding.
* Does static methods overridden.
* Deos private methods overriden.
* By default any class extends which class.
* List down the public/protected (inherited) methods present in java.lag.Object class.
* Find the output:
```java
class A
{
  public int i = 10;
  public int j = 20;
}
class B extends A
{
   public int i = 100;
   public int sumValue(int x)
   {
      return x + this.i + this.j +  super.i + super.j;
   }
}

class Test
{
  public static void main(String[] args)
  {
    A a = new B();
    int result = a.sumValue(a.i);
    System.out.println(result);
  }

}
```
* Fix the code with all the approaches you know.
```java
class A
{
  private int i;
  public A(int i)
  {
     this.i = i;
  }
}

class B extends A
{
   public B()
   {
   
   }
}
```
