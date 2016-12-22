package me.jrubio.ZeroStress.model.Connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import me.jrubio.ZeroStress.model.ContentProvider.TodoContract;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "todo.db";
    private static final int DATABASE_VERSION = 1;

    private Context context;

    public Database(Context context) {
        super(context, context.getFilesDir().getPath() + "/" + DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //createInitialDB(db);
    }

    public void createInitialDB(SQLiteDatabase db)
    {
        System.out.println("Database Created : " + TodoContract.TABLE);
        //Create Tables
        db.execSQL(TodoContract.CREATE_TABLE);
        //db.execSQL(CompanyContract.CREATE_TABLE);

        // First Element in Company Table
        //db.execSQL(CompanyContract.INIT_TABLE);

        //Create A Section Questions
        db.execSQL(TodoContract.COMMITA1);
        db.execSQL(TodoContract.COMMITA2);
        db.execSQL(TodoContract.COMMITA3);
        db.execSQL(TodoContract.COMMITA4);
        db.execSQL(TodoContract.COMMITA5);
        db.execSQL(TodoContract.COMMITA6);
        db.execSQL(TodoContract.COMMITA7);
        db.execSQL(TodoContract.COMMITA8);
        db.execSQL(TodoContract.COMMITA9);
        db.execSQL(TodoContract.COMMITA10);

        //Create B Section Questions
        db.execSQL(TodoContract.COMMITB1);
        db.execSQL(TodoContract.COMMITB2);
        db.execSQL(TodoContract.COMMITB3);
        db.execSQL(TodoContract.COMMITB4);

        //Create C Section Questions
        db.execSQL(TodoContract.COMMITC1);
        db.execSQL(TodoContract.COMMITC2);
        db.execSQL(TodoContract.COMMITC3);
        db.execSQL(TodoContract.COMMITC4);
        db.execSQL(TodoContract.COMMITC5);
        db.execSQL(TodoContract.COMMITC6);
        db.execSQL(TodoContract.COMMITC7);
        db.execSQL(TodoContract.COMMITC8);
        db.execSQL(TodoContract.COMMITC9);
        db.execSQL(TodoContract.COMMITC10);
        db.execSQL(TodoContract.COMMITC11);
        db.execSQL(TodoContract.COMMITC12);

        //Create D Section Questions
        db.execSQL(TodoContract.COMMITD1);
        db.execSQL(TodoContract.COMMITD2);
        db.execSQL(TodoContract.COMMITD3);
        db.execSQL(TodoContract.COMMITD4);
        db.execSQL(TodoContract.COMMITD5);
        db.execSQL(TodoContract.COMMITD6);
        db.execSQL(TodoContract.COMMITD7);
        db.execSQL(TodoContract.COMMITD8);
        db.execSQL(TodoContract.COMMITD9);
        db.execSQL(TodoContract.COMMITD10);

        //Create E Section Questions
        db.execSQL(TodoContract.COMMITE1);
        db.execSQL(TodoContract.COMMITE2);
        db.execSQL(TodoContract.COMMITE3);
        db.execSQL(TodoContract.COMMITE4);
        db.execSQL(TodoContract.COMMITE5);
        db.execSQL(TodoContract.COMMITE6);
        db.execSQL(TodoContract.COMMITE7);

        //Create EXTRA Section Questions
        db.execSQL(TodoContract.COMMITX1);
        db.execSQL(TodoContract.COMMITX2);
        db.execSQL(TodoContract.COMMITX3);
        db.execSQL(TodoContract.COMMITX4);
        db.execSQL(TodoContract.COMMITX5);


    }

    /*
    public void resetDB(SQLiteDatabase db)
    {
        db.execSQL(TodoContract.RESET_DB);
    }
    */

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO: AutoCompleted method
    }
}
