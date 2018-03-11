package johnfatso.book;

import android.content.ContentValues;
import android.support.v4.view.PagerAdapter;

/**
 * Created by user on 11-03-2018.
 */

class ContentCapsule {

    private String content;
    private int index;
    private Boolean isPoetry;
    private int paraIndex;

    public ContentCapsule(String content, int index){
        this.content=content;
        this.index=index;
        this.isPoetry=true;
    }

    public ContentCapsule(String content, int index, int paraIndex){
        this.content=content;
        this.index=index;
        this.isPoetry=false;
        this.paraIndex=paraIndex;
    }

    public String getContent(){
        return content;
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
