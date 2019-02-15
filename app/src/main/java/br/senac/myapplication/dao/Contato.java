package br.senac.myapplication.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.senac.myapplication.model.ContatoEntity;

public class Contato {


        private SQLLiteHelper sqLiteHelper;
        private SQLiteDatabase sqLiteDatabase;

    public Contato(Context context) {
        this.sqLiteHelper = new SQLLiteHelper(context);



    }

    public void salvar(ContatoEntity contato){

            sqLiteDatabase  = sqLiteHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("NOME", contato.getNome());
            values.put("TELEFONE", contato.getTelefone());
            values.put("PONTUACAO", contato.getPontuacao());

            sqLiteDatabase.insert( "CONTATO",  null, values);
            sqLiteDatabase.close();

        ;
        }

}
