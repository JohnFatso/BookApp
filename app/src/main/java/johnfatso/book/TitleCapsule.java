package johnfatso.book;

/**
 * Created by user on 08-03-2018.
 */

class TitleCapsule{
    private final String  title;
    private final String descriptionAboutTheTitle;
    private final String masterTitle;
    private final Boolean isSubFoldersExist;

    public TitleCapsule(String title, String descriptionAboutTheTitle, String masterTitle, Boolean isSubFoldersExist){
        this.title=title;
        this.descriptionAboutTheTitle=descriptionAboutTheTitle;
        this.masterTitle=masterTitle;
        this.isSubFoldersExist=isSubFoldersExist;
    }

    public String getTitle(){
        return title;
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

}