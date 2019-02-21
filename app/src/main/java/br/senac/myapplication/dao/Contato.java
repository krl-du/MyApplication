package br.senac.myapplication.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.senac.myapplication.model.ContatoEntity;

public class Contato {


        private SQLLiteHelper sqLiteHelper;
        private SQLiteDatabase sqLiteDatabase;

    public Contato(Context context) {
        this.sqLiteHelper = new SQLLiteHelper(context);



    }

    public void salvar(ContatoEntity contato) {

        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("NOME", contato.getNome());
        values.put("TELEFONE", contato.getTelefone());
        values.put("PONTUACAO", contato.getPontuacao());

        sqLiteDatabase.insert("CONTATO", null, values);
        sqLiteDatabase.close();

    }

        public List<ContatoEntity>Listar(){
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        String sql = "SELECT * FROM CONTATO;";

        Cursor c = sqLiteDatabase.rawQuery(sql, null);

        List<ContatoEntity> contatos = new ArrayList<ContatoEntity>();

        while (c.moveToNext())

            {
            ContatoEntity contato = new ContatoEntity();
            contato.setId(c.getInt(c.getColumnIndex("ID")));
            contato.setNome(c.getString(c.getColumnIndex("NOME")));
            contato.setTelefone(c.getString(c.getColumnIndex("TELEFONE")));
            contato.setPontuacao(c.getDouble(c.getColumnIndex("PONTUACAO")));

            contatos.add(contato);
            }
            return contatos;
    }


}
