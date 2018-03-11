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

    public ArrayList getRootList(){
        return bookKeeper.getCurrentList();
    }

    public ArrayList getListAssociatedToTheTitleIndex(int position){
        currentSelection = bookKeeper.getCurrentList().get(position);
        return getMockTitle();
    }

    public ArrayList getContentAssociatedtoTheTitleIndex(int position){
        currentSelection = bookKeeper.getCurrentList().get(position);
        return getMockContent();
    }

    public ArrayList getMasterTitleList(){
        bookKeeper.removeCurrentList();
        this.currentSelection=bookKeeper.getCapsule(bookKeeper.getCurrentList().get(0).getContent());
        return bookKeeper.getCurrentList();
    }


    //Todo:remove this part when the actual function has been implemented

    private ArrayList<DataCapsule> getMockTitle(){
        String levelSuffix= Integer.toString(bookKeeper.getLevel());
        Boolean subfolder=true;

        ArrayList<DataCapsule> tempList = new ArrayList<>(5);
        if(bookKeeper.getLevel()>3) subfolder=false;

        for (int i=0; i<5;i++){
            TitleCapsule tempCapsule = new TitleCapsule("Title_level_"+levelSuffix,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.",this.currentSelection.getContent(),subfolder, i);
            tempList.add(tempCapsule);
        }

        return tempList;
    }

    private ArrayList<DataCapsule> getMockContent(){
        ArrayList<DataCapsule> tempContent = new ArrayList<>(10);

        for(int i=0;i<10;i++){
            ContentCapsule contentCapsule=new ContentCapsule("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.", this.currentSelection.getContent(), i);
            tempContent.add(contentCapsule);
        }

        return tempContent;
    }

}
