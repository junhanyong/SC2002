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
        
        virtual ~Animal() { 
            cout << "destructing Animal object "<< _name << endl ;
        }

        // 3.3 virtual destructor 
        /*virtual ~Animal() { 
            cout << "destructing Animal object "<< _name << endl ;
        }*/

        // Getters
        COLOR getColor(){
            return _color;
        }

        string getName(){
            return _name;
        }

        // Removing virtual causes output to be "Animal Speaks"
        virtual void speak(){
            cout << "Animal speaks "<< endl ;
        }
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

        virtual void eat(){
            cout << "Mammal eats " << endl;
        }

        virtual void move(){
            cout << "Mammal moves " << endl;
        }
};

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

        void speak(){
            cout << "Dog woofs" << endl;
        }

        void move(){
            cout << "Dog moves" << endl;
        }

        void eat(){
            cout << "Dog eats" << endl;
        }

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

    void speak(){
        cout << "Cat meows" << endl;
    }

    void move(){
        cout << "Cat moves" << endl;
    }

    void eat(){
        cout << "Cat eats" << endl;
    }

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

    void speak(){
        cout << "Lion roars" << endl;
    }

    void move(){
        cout << "Lion moves" << endl;
    }

    void eat(){
        cout << "Lion eats" << endl;
    }

    private:
        string _owner;
};

int main() {
    // 3.1
    /*
    Animal a;
    Animal a1("Test", Green);
    a.speak();
    */

    // 3.2
    /*
    Mammal m("Test", Green);      
    m.speak(); 
    Dog d("Test", Green, "Owner"); 
    d.speak(); 
    d.move();
    */

    // 3.3
    /*
    Animal *animalPtr = new Dog("Lassie", White, "Andy"); 
    animalPtr->speak();                                     
    animalPtr->move();                                      
    delete animalPtr;  

    Dog dogi("Lassie", White, "Andy");             
    Mammal *aniPtr = &dogi;                        
    Mammal &aniRef = dogi;                          
    Mammal aniVal = dogi;                           
    aniPtr->speak();                                
    aniRef.speak();                                 
    aniVal.speak();
    */      

    // 3.4
    Mammal **mammal = new Mammal*[3];
    mammal[0] = new Dog();
    mammal[1] = new Cat();
    mammal[2] = new Lion();

    int choice = 0;
    do{
        cout << "Select the animal to send to Zoo :" << endl;
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
        cin >> choice;

        switch(choice)
        {
            case 1:
                mammal[0]->move();
                mammal[0]->speak();
                mammal[0]->eat();
                break;

            case 2:
                mammal[1]->move();
                mammal[1]->speak();
                mammal[1]->eat();
                break;

            case 3:
                mammal[2]->move();
                mammal[2]->speak();
                mammal[2]->eat();
                break;

            case 4:
                for(int i=0; i<3; i++){
                    mammal[i]->move();
                    mammal[i]->speak();
                    mammal[i]->eat();
                }
                break;
        }
    } while (choice != 5);

    for(int i=0; i<3; i++){
        delete mammal[i];
    }
    delete [] mammal;

    cout << "Program exiting …. "<< endl;
    return 0;
}