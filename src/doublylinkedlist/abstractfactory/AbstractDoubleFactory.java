package doublylinkedlist.abstractfactory;

import doublylinkedlist.interfaces.IDisplayDoubly;
import doublylinkedlist.interfaces.IInsertNode;
import doublylinkedlist.interfaces.IReverseDisplay;

public abstract class AbstractDoubleFactory {
    private static AbstractDoubleFactory singleInstance = null;

    public static AbstractDoubleFactory instance() {
        if(singleInstance == null){
            return new DoubleFactory();
        }else{
            return singleInstance;
        }
    }

    public abstract IInsertNode createInsertNode();
    public abstract IDisplayDoubly createDisplayDoubly();
    public abstract IReverseDisplay createReverseDisplay();

}
