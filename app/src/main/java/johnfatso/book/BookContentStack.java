package johnfatso.book;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by user on 11-03-2018.
 */

class BookContentStack{

    private static BookContentStack bookContentStack;

    class ListStackElement{
        private ArrayList<DataCapsule> list;
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

    /**
     * Singleton being defined here
     */

    private BookContentStack(){
        masterStack=new Stack<ListStackElement>();
        level=0;
    }

    public static BookContentStack getBookContentStack(){
        if(bookContentStack==null) {
            bookContentStack = new BookContentStack();
        }
            return bookContentStack;
    }

    /**
     *
     * @param newIncomingList
     * @param isTitleList
     * @return
     */

    public int addNewList(ArrayList<DataCapsule> newIncomingList, Boolean isTitleList){
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

    public ArrayList<DataCapsule> getCurrentList(){
        return this.masterStack.peek().getList();
    }

    public Boolean checkIfCurrentListIsTitleList(){
        return this.masterStack.peek().isTitleList();
    }

    public DataCapsule getCapsule(int position){
        DataCapsule dataCapsule= (DataCapsule) this.masterStack.peek().getList().get(position);
        return dataCapsule;
    }

    public DataCapsule getCapsule(String title){

        ListStackElement listStackElement = masterStack.pop();
        ArrayList<DataCapsule> tempList = masterStack.peek().getList();
        for(int i=0;i<tempList.size();i++){
            if(tempList.get(i).getContent().equals(title)){
                masterStack.add(listStackElement);
                return tempList.get(i);
            }
        }
        return null;
    }


}
