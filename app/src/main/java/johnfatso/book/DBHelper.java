package johnfatso.book;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * @author  Janakiraman J
 * @version 1.0.0
 * createdDate 04-03-2018
 * updatedDate 05-03-2018
 */

class DBOpertion{

    private DatabaseOperationHelper DBHelper;
    private SQLiteDatabase DB;

    DBOpertion(Context context){
        DBHelper=new DatabaseOperationHelper(context);
        DB=DBHelper.getWritableDatabase();
    }

    void update(String tableName,String columnSettings, String columnValues, String setting, String newValue){
        String WhereArgs[]={setting};
        ContentValues contentValues=new ContentValues();
        contentValues.put(columnValues,newValue);
        DB.update(tableName, contentValues, columnSettings, WhereArgs);
    }

    void closeDatabaseConnection(){
        DB.close();
    }
}
