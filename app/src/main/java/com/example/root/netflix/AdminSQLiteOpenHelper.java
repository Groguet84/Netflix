package com.example.root.netflix;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hector on 25/02/2016.
 */
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table netflix(codigo real primary key, personatges text, fecha text, pagos text)");
        //db.execSQL("create table sexo(codigo text primary key, uno text)");

        //db.execSQL("create table reg_partidas(codigo primary key, tipo_partida text, fecha text, visible real)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists usuario");
        db.execSQL("create table netflix(codigo real primary key, personatges text, fecha text, pagos text)");
    }
}
