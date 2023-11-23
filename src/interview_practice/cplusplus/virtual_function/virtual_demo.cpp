#include<bits/stdc++.h>
using namespace std;

/**

A virtual function is a member function in the base class that we expect
to redefine in the Derived class

Basically a virtual function used in the base class in order to ensure that
the function is overridden. This specially applies where a pointer of base class points
to an object of a derived class. For Example:
*/

/**
class Base{
public:
    void print(){
        cout<<"Base class method"<<endl;
    }
};

class Derived : public Base{
public:
    void print(){
        cout<<"Derived class method"<<endl;
    }
};

*/

/**

Later if we create a pointer of Base type to point to an object of Derived class
and call the print() function, then it calls the print function of Base class.

In other words the member function of Base is not overridden.

*/


/**
 * In order to avoid this, we declare the print() function of the Base class as Virtual by using the Virtual 
 * keyword
 * 
*/

class Base{
    public:
    virtual void print(){
        cout<<"Base class print method"<<endl;
    }
};

class Derived : public Base{
    public: 
    virtual void print(){
        cout<<"Derived class print method"<<endl;
    }
};

class DerivedTwo : public Derived{
    public:
    virtual void print(){
        cout<<"DerivedTwo class print method"<<endl;
    }
};

/**
 *  Virtual function is an integral part of Polymorphism in C++ 
 * 
*/

int main()
{
    Derived derived1;

    Base* basePtr = &derived1;
    basePtr->print();
    // cout<<"try to learn virtual function"<<endl;


    DerivedTwo derivedTwo;

    Derived* derivedPtr = &derivedTwo;

    derivedPtr->print();


}
