package circularlinkedlist.AbstractFactory;

import circularlinkedlist.DeleteNode;
import circularlinkedlist.DisplayCircular;
import circularlinkedlist.InsertNode;
import circularlinkedlist.Interfaces.IDeleteNode;
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

    @Override
    public IDeleteNode createDeleteNode() {
        return new DeleteNode();
    }
}
