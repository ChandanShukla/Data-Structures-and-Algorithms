package linklist.AbstractFactory;

import linklist.InsertNode;
import linklist.interfaces.IDeleteAtPosition;
import linklist.interfaces.IDeleteByLinkList;
import linklist.interfaces.IDisplayLinkList;

public abstract class AbstractLinkListFactory {
    private static AbstractLinkListFactory singleInstance = null;

    public static AbstractLinkListFactory instance() {
        if(singleInstance == null){
            singleInstance = new LinkListFactory();
        }
        return singleInstance;
    }

    public abstract InsertNode createInsertNode();
    public abstract IDisplayLinkList creatDisplayedLinkList();
    public abstract IDeleteByLinkList createDeleteByLinkList();
    public abstract IDeleteAtPosition createDeleteAtPosition();
}
