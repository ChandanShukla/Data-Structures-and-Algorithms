package circularlinkedlist.AbstractFactory;


import circularlinkedlist.Interfaces.IDeleteNode;
import circularlinkedlist.Interfaces.IDisplayCircular;
import circularlinkedlist.Interfaces.IInsertNode;

public abstract class AbstractCircularFactory {
    public static AbstractCircularFactory singleInstance = null;

    public static AbstractCircularFactory instance() {
        if(singleInstance == null){
            return new CircularFactory();
        }else{
            return singleInstance;
        }
    }

    public abstract IInsertNode createInsertNode();
    public abstract IDisplayCircular createDisplayCircular();
    public abstract IDeleteNode createDeleteNode();
}



