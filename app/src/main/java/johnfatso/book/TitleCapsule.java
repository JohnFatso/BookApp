package johnfatso.book;

/**
 * Created by user on 08-03-2018.
 */

class TitleCapsule extends DataCapsule{

    private final String descriptionAboutTheTitle;
    private final Boolean isSubFoldersExist;

    public TitleCapsule(String title, String descriptionAboutTheTitle, String masterTitle, Boolean isSubFoldersExist,int index){
        super(title,masterTitle,true,index);
        this.descriptionAboutTheTitle=descriptionAboutTheTitle;
        this.masterTitle=masterTitle;
        this.isSubFoldersExist=isSubFoldersExist;
    }

    public String getContent(){
        return content;
    }

    public String getDescriptionAboutTheTitle(){
        return descriptionAboutTheTitle;
    }

    public String getMasterTitle(){
        return masterTitle;
    }

    public Boolean isSubFoldersExist(){
        return isSubFoldersExist;
    }

    public int getIndex(){
        return index;
    }

}