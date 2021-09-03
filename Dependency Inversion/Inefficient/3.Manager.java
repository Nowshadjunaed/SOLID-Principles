/*
Here Manager is high level class which is dependent on the low level class Developer and GraphicsDesigner.
So it is violating Dependecy Inversion Principle.Now imagine we want to create a new class for QA (quality assurance).
Now we have to change the code of this class(Manager class) again to recruit a person for the QA post.This should not be happened.

*/
public class Manager {

    void recruitDeveloper(Developer developer) {

    }
    void recruitGraphicsDesigner(GraphicsDesigner graphicsDesigner) {

    }


}
