package johnfatso.book;

import android.content.ContentValues;
import android.support.v4.view.PagerAdapter;

/**
 * Created by user on 11-03-2018.
 */

class ContentCapsule extends DataCapsule{

    private Boolean isPoetry;
    private int paraIndex;

    public ContentCapsule(String content, String masterTitle, int index){
        super(content, masterTitle, false, index);
        this.isPoetry=true;
    }

    public ContentCapsule(String content, String masterTitle, int index, int paraIndex){
        super(content, masterTitle, false, index);
        this.isPoetry=false;
        this.paraIndex=paraIndex;
    }

    public String getContent(){
        return content;
    }

    public String getMasterTitle(){
        return masterTitle;
    }

    public int getIndex(){
        return index;
    }

    public int getParaIndex(){
        if(isPoetry){
            return -1;
        }
        else {
            return paraIndex;
        }
    }

}
