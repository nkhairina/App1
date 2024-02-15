package quiz.quiz2;

//38.Choose the options that meets the following specification: 

//Create a well encapsulated class Clock with one instance variable model. 
//The value of model should be accessible and modifiable outside Clock.

// option 2 correct = Instance variables are private, with public accessors/mutators.
// concept of encapsulation data (attributes) and code (methods) bundle together
// as single unit within the class.
// data hidden from direct outside access and can only be access through method
// provided by class
// value of model can be accessed from outside clock class

//Encapsulation is all about having private instance variable and providing public getter and setter methods.

public class Clock {
    private String model; // Private instance variable, hidden from direct access

    public Clock(String model) {
        this.model = model; // Set initial model value in the constructor
    }

    public String getModel() { // Public accessor method (getter)
        return model; // Returns the value of model
    }

    public void setModel(String val) { // Public mutator method (setter) to allows controlled modification
        model = val; // Updates the value of model
    }
}

// option 1 incorrect = All instance variables are public
// Exposes model directly, compromising encapsulation and data protection.
public class Clock {
    public String model;

    public String getModel()

    public void setModel

}

// option 3 incorrect = instance variables are are private, no
// accessors/mutators
// Makes model unable to reach (inaccessible)
public class Clock {
    public String model;

    private String getModel()

    public void setModel

}

/// option 4 incorrect = public instance variables are are private

public class Clock {
    public String model;

}
