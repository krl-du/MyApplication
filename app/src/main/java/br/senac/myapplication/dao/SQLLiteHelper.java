package br.senac.myapplication.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Agenda.Senac.db";

    private static final Integer DB_VERSION = 1;

    private final String DB_CREATE = "CREATE TABLE CONTATO (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
            " NOME TEXT," +
            " TELEFONE TEXT," +
            " EMAIL TEXT," +
            " PONTUACAO REAL)";

    public SQLLiteHelper( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

