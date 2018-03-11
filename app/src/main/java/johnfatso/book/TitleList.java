package johnfatso.book;

import android.util.Log;
import android.view.ViewDebug;

import java.util.ArrayList;
import java.util.Stack;


/**
 * Created by user on 08-03-2018.
 */

class TitleList {

    private ArrayList<TitleCapsule> titleList;
    private String masterTitle;

    private Stack bookStack;
    private String currentTile;
    private int currentLevel;

    public TitleList(){
        this.bookStack=new Stack();
    }

    //Todo: remove and install a proper function
    //stub for list provider

    private TitleCapsule getTitleCapsule(String title){
        for(TitleCapsule titleCapsule : titleList){
            if(titleCapsule.getTitle()==title) {
                return titleCapsule;
            }
        }
        return null;
    }

    public ArrayList<TitleCapsule> titleSelected(String selectedTitle){
        this.bookStack.add(selectedTitle);
        if(getTitleCapsule(selectedTitle).isSubFoldersExist()){
            //Todo:implement real function
            titleList=getMockTitle();
            return
        }
    }

    public void flushBookStack(){
        for(int i=0;i<this.bookStack.size();i++){
            Log.v("JJT",bookStack.get(i).toString());
        }
    }

    //Todo:remove this part when the actual function has been implemented

    private ArrayList<TitleCapsule> getMockTitle(){
        String levelSuffix= Integer.toString(currentLevel);
        String titleFix = bookStack.peek().toString();

        ArrayList<TitleCapsule> tempList = new ArrayList<>(5);

        for (int i=0; i<5;i++){
            TitleCapsule tempCapsule = new TitleCapsule("Title_level_"+levelSuffix,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.",this.currentTile,true);
            tempList.add(tempCapsule);
        }

        return tempList;
    }

    private ArrayList<ContentCapsule> getMockContent(){
        ArrayList<ContentCapsule> tempContent = new ArrayList<>(10);

        for(int i=0;i<10;i++){
            ContentCapsule contentCapsule=new ContentCapsule("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ligula risus, consectetur ac tortor id.", i);
            tempContent.add(contentCapsule);
        }

        return tempContent;
    }

}
