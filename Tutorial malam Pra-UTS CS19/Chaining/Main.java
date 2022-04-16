package Chaining;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class chainConstructor
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    chainConstructor()
    {
        // First output 
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    chainConstructor(int x)
    {
        // calls constructor 1
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    chainConstructor(int x, int y)
    {
        // calls constructor 2
        this(x); 
        System.out.println(x * y);  // Last output
    }

}

class Reverse 
{ 
	// default constructor 1 
	// default constructor will call another constructor 
	// using this keyword from same class 
	Reverse() 
	{ 
		// calls constructor 2 
		this(5); 
		System.out.println("The Default constructor"); 
	} 

	// parameterized constructor 2 
	Reverse(int x) 
	{ 
		// calls constructor 3 
		this(5, 15); 
		System.out.println(x); 
	} 

	// parameterized constructor 3 
	Reverse(int x, int y) 
	{ 
		System.out.println(x * y); 
	} 

}

public class Main {
    public static void main(String[] args) {
    
        new chainConstructor(5, 15); // Calls constructor 3
        
        // reverse
        System.out.println("\n=== REVERSE ===\n");
        new Reverse();  // Calls constructor 1
    }
}













