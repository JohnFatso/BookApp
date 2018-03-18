package johnfatso.book;


import java.util.ArrayList;

/**
 * @author Janakiraman J
 * @version 1.0
 *
 * base class for data/title/content organisation.
 */


class DataCapsule {

    protected String content;
    protected String contentDescription;
    protected String masterTitle;
    protected int index;
    protected DataType capsuleType;
    protected int level;
    protected FavouriteStatus favouriteStatus;


    /*
    get functions block
     */

    public String getContent(){
        return this.content;
    }

    public String getContentDescription(){
        return this.contentDescription;
    }

    public String getMasterTitle(){
        return this.masterTitle;
    }

    public int getIndex(){
        return this.index;
    }

    public DataType getCapsuleType(){
        return this.capsuleType;
    }

    public int getLevel(){
        return this.level;
    }

    public FavouriteStatus getFavouriteStatus() {
        return this.favouriteStatus;
    }

    /*
    set functions block
     */

    public void setContent(String content){
        this.content=content;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public void setMasterTitle(String masterTitle) {
        this.masterTitle = masterTitle;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCapsuleType(DataType capsuleType) {
        this.capsuleType = capsuleType;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setFavouriteStatus(FavouriteStatus favouriteStatus) {
        this.favouriteStatus = favouriteStatus;
    }
}
