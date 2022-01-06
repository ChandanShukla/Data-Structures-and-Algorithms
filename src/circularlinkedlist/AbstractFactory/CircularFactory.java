package circularlinkedlist.AbstractFactory;

import circularlinkedlist.DisplayCircular;
import circularlinkedlist.InsertNode;
import circularlinkedlist.Interfaces.IDisplayCircular;
import circularlinkedlist.Interfaces.IInsertNode;

public class CircularFactory extends AbstractCircularFactory{
    @Override
    public IInsertNode createInsertNode() {
        return new InsertNode();
    }

    @Override
    public IDisplayCircular createDisplayCircular() {
        return new DisplayCircular();
    }
}
