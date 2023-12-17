package com.example.calculatrice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String User = "User";
    public static final String Id = "Id";
    public static final String FIRST_NAME = "First_name";
    public static final String LAST_NAME = "Last_name";
    public static final String LOGIN = "Login";
    public static final String PWD = "Password";


    public DBHelper(@Nullable Context context) {
        super(context, LOGIN + "DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + User + " (" +
                Id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FIRST_NAME + " TEXT, " +
                LAST_NAME + " TEXT, " +
                LOGIN + " TEXT, " +
                PWD + " TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    boolean AlreadyExists(String email){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = " SELECT " + LOGIN +" from " + User + " WHERE "+ LOGIN + "=?";
        String [] args = {email};
        Cursor cursor = db.rawQuery(query,args);
        boolean exists = cursor.moveToFirst();
        cursor.close();
        return exists;
    }
    void AddUser(Context context,User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FIRST_NAME,user.getPrenom());
        cv.put(LAST_NAME,user.getNom());
        cv.put(LOGIN,user.getLogin());
        cv.put(PWD,user.getPassword());
        if(!(AlreadyExists(user.getLogin()))){
        db.insert(User,null,cv);
            Toast.makeText(context, "User successfully added!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "A user with the same logon already exists ! Try another logon", Toast.LENGTH_SHORT).show();
        }
    }
    void RemoveUser(Context context,String email){
        SQLiteDatabase db = this.getWritableDatabase();
        if((AlreadyExists(email))){
            String query= " DELETE FROM "+User+" WHERE "+LOGIN+ " =? ";
            String [] params = {email};
            db.execSQL(query, params);
            Toast.makeText(context, "User successfully deleted !", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "The user you're trying to delete doesn't even exist !", Toast.LENGTH_SHORT).show();
        }
    }
    boolean VerifyPwd(Context context,String pwd,String mail){
        SQLiteDatabase db= this.getReadableDatabase();
        String query = " SELECT " + PWD +" from " + User + " WHERE "+ LOGIN + "=?";
        String [] args = {mail};
        Cursor cursor = db.rawQuery(query,args);
        boolean exists = false;
        int count = 0;
        if (cursor.moveToFirst()) {
            do {
                // Use getString(0) to get the value from the first column of the current row
                if (pwd.equals(cursor.getString(0))) {
                    count++;
                }
            } while (cursor.moveToNext());
        }
        if(count != 0) {
            exists = true;
            Toast.makeText(context,"Authentification succeded! ", Toast.LENGTH_SHORT).show();
        }
        else{
            exists = false;
        }
        cursor.close();
        return exists;
    }
}
