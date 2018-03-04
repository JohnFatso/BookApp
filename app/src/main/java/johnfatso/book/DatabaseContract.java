package johnfatso.book;

        import android.provider.BaseColumns;

/**
 * @author  Janakiraman J
 * @version 1.0.0
 * createdDate 04-03-2018
 * updatedDate 04-03-2018
 */


class DatabaseContract {

    public static final String DATABASE_NAME = "BookDatabase";

    private DatabaseContract(){
    };

    public static class TagRecords implements BaseColumns{
        public static final String TABLE_NAME="tag_record";
        public static final String COLUMN_SETTINGS="settings";
        public static final String COLUMN_VALUE="value";

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TagRecords.TABLE_NAME + " (" +
                        TagRecords._ID + " INTEGER PRIMARY KEY," +
                        TagRecords.COLUMN_SETTINGS + " TEXT," +
                        TagRecords.COLUMN_VALUE + " TEXT)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TagRecords.TABLE_NAME;
    }
}
