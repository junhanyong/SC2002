#include <iostream>
#include <string>
using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;

class Animal {
    public :
        Animal() : _name("unknown") {
            cout << "constructing Animal object "<< _name << endl ;
        }

        Animal(string n, COLOR c) : _name(n), _color(c){ // 3.1
            cout << "constructing Animal object " << _name << " of colour ";
            switch(c)
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
        
        ~Animal() { 
            cout << "destructing Animal object "<< _name << endl ;
        }

        // 3.3 virtual destructor 
        /*virtual ~Animal() { 
            cout << "destructing Animal object "<< _name << endl ;
        }*/

        // Getters
        COLOR getColor();
        string getName();

        // Removing virtual causes output to be "Animal Speaks"
        virtual void speak();
        virtual void move() = 0;
        
    private :
        string _name;
        COLOR _color;
};

class Mammal : public Animal // 3.2
{
    public :
        Mammal() : Animal(){
            cout << "Constructing Mammal object " << Animal::getName() << endl;
        }

        Mammal(string n, COLOR c) : Animal(n, c){
            cout << "Constructing Mammal object " << Animal::getName() << " of colour ";

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

        ~Mammal(){
            cout << "destructing Mammal object " << Animal::getName() << endl;
        }

        virtual void eat();
        virtual void move();
};