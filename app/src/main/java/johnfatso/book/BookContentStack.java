package johnfatso.book;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by user on 11-03-2018.
 */

class BookContentStack{

    private static BookContentStack bookContentStack;

    class ListStackElement{
        private ArrayList list;
        private Boolean isTitleList;

        public ListStackElement(ArrayList list, Boolean isTitleList){
            this.list=list;
            this.isTitleList=isTitleList;
        }

        public ArrayList getList() {
            return list;
        }

        public Boolean isTitleList() {
            return isTitleList;
        }
    }

    private Stack<ListStackElement> masterStack;
    private int level;

    private BookContentStack(){
        masterStack=new Stack<ListStackElement>();
        level=0;
    }

    public BookContentStack getBookContentStack(){
        if(bookContentStack==null) {
            bookContentStack = new BookContentStack();
        }
            return bookContentStack;
    }

    public int addNewList(ArrayList newIncomingList, Boolean isTitleList){
        ListStackElement tempListStackElement=new ListStackElement(newIncomingList, isTitleList);
        this.masterStack.add(tempListStackElement);
        this.level=this.masterStack.size();
        return this.level;
    }

    public int removeCurrentList(){
        this.masterStack.pop();
        this.level=this.masterStack.size();
        return this.level;
    }

    public int getLevel(){
        return this.level;
    }

    public ArrayList getCurrentList(){
        return this.masterStack.peek().getList();
    }

    public Boolean checkIfCurrentListIsTitleList(){
        return this.masterStack.peek().isTitleList();
    }

}
