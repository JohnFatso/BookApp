package johnfatso.book;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author  Janakiraman J
 * @version 1.0.0
 * createdDate 04-03-2018
 * updatedDate 04-03-2018
 *
 */


class DatabaseOperationHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION=1;

    public DatabaseOperationHelper(Context context){
        super(context, DatabaseContract.DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(DatabaseContract.TagRecords.SQL_CREATE_ENTRIES);
        ContentValues attribute_1=new ContentValues();
        ContentValues attribute_2=new ContentValues();
        ContentValues attribute_3=new ContentValues();
        attribute_1.put(DatabaseContract.TagRecords.COLUMN_SETTINGS,"TestSetting1");
        attribute_1.put(DatabaseContract.TagRecords.COLUMN_VALUE,"TestValue1");
        attribute_2.put(DatabaseContract.TagRecords.COLUMN_SETTINGS,"TestSetting1");
        attribute_2.put(DatabaseContract.TagRecords.COLUMN_VALUE,"TestValue1");
        attribute_3.put(DatabaseContract.TagRecords.COLUMN_SETTINGS,"TestSetting1");
        attribute_3.put(DatabaseContract.TagRecords.COLUMN_VALUE,"TestValue1");

        db.insert(DatabaseContract.TagRecords.TABLE_NAME,null,attribute_1);
        db.insert(DatabaseContract.TagRecords.TABLE_NAME,null,attribute_2);
        db.insert(DatabaseContract.TagRecords.TABLE_NAME,null,attribute_3);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(DatabaseContract.TagRecords.SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
