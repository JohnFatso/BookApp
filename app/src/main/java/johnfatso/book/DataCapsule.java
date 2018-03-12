package johnfatso.book;

/**
 * Created by user on 11-03-2018.
 */

abstract class DataCapsule {
    protected String content;
    protected String masterTitle;
    protected Boolean isTitle;
    protected int index;
    protected Boolean canSetToFavourite;

    public DataCapsule(String content, String masterTitle, Boolean isTitle, int index, Boolean canSetToFavourite){
        this.content=content;
        this.masterTitle=masterTitle;
        this.isTitle=isTitle;
        this.index=index;
        this.canSetToFavourite=canSetToFavourite;
    }

    public Boolean isTitle(){
        return isTitle;
    }
    public Boolean canSetToFavourite(){
        return canSetToFavourite;
    }

    public abstract String getContent();
    public abstract String getMasterTitle();
    public abstract int getIndex();
}
