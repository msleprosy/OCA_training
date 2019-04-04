package OCAtasks.assesment1.java_8.defaultMethodsInInterfaces;

interface Mammal { public default String getName() { return null; } }
//abstract class Otter implements Mammal, Animal {}

/*Uncomment to see the problem - class tries to implement two
* interfaces, which contains default methods with the same signature.
* So here you can:
* 1. Remove the default methods modifier.
* 2. Override the getName() method with an abstract method in the Otter class.
  3. Override the getName() method with a concrete method in the Otter class.*/
