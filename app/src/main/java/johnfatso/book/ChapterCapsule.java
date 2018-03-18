package johnfatso.book;

import java.util.ArrayList;

/**
 * @author Janakiraman J
 * @version 1.0
 *
 * content capsule for ChapterTitle
 */

class ChapterCapsule extends DataCapsule {
    protected DataType type_subItem;
    protected int count_subItem;
    protected ArrayList subItemList;

    public ChapterCapsule(String content, String contentDescription){
        this.content=content;
        this.contentDescription=contentDescription;
    }

    public DataType getTypeSubItem(){
        return type_subItem;
    }

    public int getCount_subItem(){
        return count_subItem;
    }

    public ArrayList getSubItemList() {
        return subItemList;
    }

    public void setType_subItem(DataType type_subItem) {
        this.type_subItem = type_subItem;
    }

    public void setCount_subItem(int count_subItem) {
        this.count_subItem = count_subItem;
    }

    public void setSubItemList(ArrayList subItemList) {
        this.subItemList = subItemList;
    }
}
