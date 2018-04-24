package com.example.macstudent.c0732238_carservicereminder.Db;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by macstudent on 2018-04-13.
 */

public class Db_User extends SQLiteOpenHelper
{





    private static final String DB_NAME  = "carservice";
    private static final int DB_VERSION = 1;

    public Db_User(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String userTable = "CREATE TABLE " + DBUser.TABLE_USER
                + "(" + CarUser.KEY_USER_EMAIL + " TEXT PRIMARY KEY, "
                + CarUser.KEY_USER_PASSWORD + " TEXT )";

        db.execSQL(userTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE " + CarUser.TABLE_USER);

        onCreate(db);
    }
}

}
public class User {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int UserId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
