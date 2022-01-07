package doublylinkedlist.abstractfactory;

import doublylinkedlist.DisplayDoubly;
import doublylinkedlist.InsertNode;
import doublylinkedlist.ReverseDisplay;
import doublylinkedlist.interfaces.IDisplayDoubly;
import doublylinkedlist.interfaces.IInsertNode;
import doublylinkedlist.interfaces.IReverseDisplay;

public class DoubleFactory extends AbstractDoubleFactory{

    @Override
    public IInsertNode createInsertNode() {
        return new InsertNode();
    }

    @Override
    public IDisplayDoubly createDisplayDoubly() {
        return new DisplayDoubly();
    }

    @Override
    public IReverseDisplay createReverseDisplay() {
        return new ReverseDisplay();
    }
}
