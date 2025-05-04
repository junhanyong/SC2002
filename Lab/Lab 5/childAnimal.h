#include <iostream>
#include <string>
#include "animal.h"

using namespace std ;

class Dog : public Mammal
{
    public:
        Dog() : Mammal(){
            _owner = "Default";
            cout << "Constructing Dog object " << Animal::getName() << endl;
        }

        Dog(string n, COLOR c, string owner) : Mammal(n, c)
        {
            _owner = owner;
            cout << "Constructing Dog object " << Animal::getName() << " of colour ";

            switch(Animal::getColor())
            {
                case Green:
                    cout << "Green" << endl;
                    break;

                case Blue:
                    cout << "Blue" << endl;
                    break;

                case White:
                    cout << "White" << endl;
                    break;

                case Black:
                    cout << "Black" << endl;
                    break;

                case Brown:
                    cout <<"Brown" << endl;
                    break;
            }
        }

        ~Dog(){
            cout << "destructing Dog object " << Animal::getName() << endl;
        }

        void speak();

        void move();

        void eat();

    private:
        string _owner;

};

class Cat : public Mammal
{
    public:
        Cat() : Mammal()
        {
            _owner = "Default";
            cout << "Constructing Cat object " << Animal::getName() << endl;
        }

        Cat(string n, COLOR c, string owner) : Mammal(n, c)
        {
            _owner = owner;
            cout << "Constructing Cat object " << Animal::getName() << " of colour ";

            switch(Animal::getColor())
            {
                case Green:
                    cout << "Green" << endl;
                    break;

                case Blue:
                    cout << "Blue" << endl;
                    break;

                case White:
                    cout << "White" << endl;
                    break;

                case Black:
                    cout << "Black" << endl;
                    break;

                case Brown:
                    cout <<"Brown" << endl;
                    break;
            }
        }

    ~Cat(){
        cout << "destructing Cat object " << Animal::getName() << endl;
    }

    void speak();

    void move();

    void eat();

    private:
        string _owner;
};

class Lion : public Mammal
{
    public:
        Lion() : Mammal()
        {
            _owner = "Default";
            cout << "Constructing Lion object " << Animal::getName() << endl;
        }

        Lion(string n, COLOR c, string owner) : Mammal(n, c)
        {
            _owner = owner;
            cout << "Constructing Lion object " << Animal::getName() << " of colour ";

            switch(Animal::getColor())
            {
                case Green:
                    cout << "Green" << endl;
                    break;

                case Blue:
                    cout << "Blue" << endl;
                    break;

                case White:
                    cout << "White" << endl;
                    break;

                case Black:
                    cout << "Black" << endl;
                    break;

                case Brown:
                    cout <<"Brown" << endl;
                    break;
            }
        }

    ~Lion(){
        cout << "destructing Cat object " << Animal::getName() << endl;
    }

    void speak();

    void move();

    void eat();

    private:
        string _owner;
};