package johnfatso.book;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.ViewDebug;

import java.util.ArrayList;
import java.util.Stack;


/**
 * Created by user on 08-03-2018.
 */

class TitleList {

    private BookContentStack bookKeeper;
    private DataCapsule currentSelection;

    public TitleList(){
        this.bookKeeper=BookContentStack.getBookContentStack();
        bookKeeper.addNewList(getMockTitle(),true);
        currentSelection=null;
    }

    //Todo: remove and install a proper function
    //stub for list provider

    public ArrayList<DataCapsule> getListContent(){
        if(bookKeeper.getLevel()==0){
            bookKeeper.addNewList(getMockTitle(),true);
            return bookKeeper.getCurrentList();
        }
        else{
            return bookKeeper.getCurrentList();
        }
    }

    public ArrayList<DataCapsule> itemSelected(int position){
        if(bookKeeper.getLevel()<=3){
            bookKeeper.addNewList(getMockTitle(),true);
            return bookKeeper.getCurrentList();
        }
        else {
            bookKeeper.addNewList(getMockContent(),false);
            return bookKeeper.getCurrentList();
        }
    }

    public Boolean backButtonPressed(){
        bookKeeper.removeCurrentList();
        if(bookKeeper.getLevel()>0) return true;
        else return false;
    }

    public Boolean isFavouritableList(){
        return this.currentSelection.canSetToFavourite();
    }


    //Todo:remove this part when the actual function has been implemented

    private ArrayList<DataCapsule> getMockTitle(){
        String levelSuffix= Integer.toString(bookKeeper.getLevel());
        Boolean subfolder=true;
        Boolean canSetToFavourite=false;

        ArrayList<DataCapsule> tempList = new ArrayList<>(5);
        if(bookKeeper.getLevel()>3) subfolder=false;
        if(bookKeeper.getLevel()>1) canSetToFavourite=true;

        for (int i=0; i<5;i++){
            TitleCapsule tempCapsule = new TitleCapsule("Title_level_"+levelSuffix,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.",this.currentSelection.getContent(),subfolder, i,canSetToFavourite);
            tempList.add(tempCapsule);
        }

        return tempList;
    }

    private ArrayList<DataCapsule> getMockContent(){
        ArrayList<DataCapsule> tempContent = new ArrayList<>(10);

        for(int i=0;i<10;i++){
            ContentCapsule contentCapsule=new ContentCapsule("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.", this.currentSelection.getContent(), i,false);
            tempContent.add(contentCapsule);
        }

        return tempContent;
    }

}
