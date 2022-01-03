package linklist.AbstractFactory;

import linklist.DeleteAtPosition;
import linklist.DeleteByKey;
import linklist.DisplayLinkList;
import linklist.InsertNode;
import linklist.interfaces.IDeleteAtPosition;
import linklist.interfaces.IDeleteByLinkList;
import linklist.interfaces.IDisplayLinkList;

public class LinkListFactory extends AbstractLinkListFactory{


    @Override
    public InsertNode createInsertNode() {
        return new InsertNode();
    }

    @Override
    public IDisplayLinkList creatDisplayedLinkList() {
        return new DisplayLinkList();
    }

    @Override
    public IDeleteByLinkList createDeleteByLinkList() {
        return new DeleteByKey();
    }

    @Override
    public IDeleteAtPosition createDeleteAtPosition() {
        return new DeleteAtPosition();
    }

}
