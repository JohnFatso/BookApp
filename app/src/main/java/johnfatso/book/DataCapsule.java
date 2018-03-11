package johnfatso.book;

/**
 * Created by user on 11-03-2018.
 */

abstract class DataCapsule {
    protected String content;
    protected String masterTitle;
    protected Boolean isTitle;
    protected int index;

    public DataCapsule(String content, String masterTitle, Boolean isTitle, int index){
        this.content=content;
        this.masterTitle=masterTitle;
        this.isTitle=isTitle;
        this.index=index;
    }

    public Boolean isTitle(){
        return isTitle;
    }

    public abstract String getContent();
    public abstract String getMasterTitle();
    public abstract int getIndex();
}
