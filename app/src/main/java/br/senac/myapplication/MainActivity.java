package br.senac.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera a referencia da lista que tem no layout do aplicatvo
        ListView listaContatos = findViewById(R.id.ListaContatos);

        //Cria Lista de contTOA COMO STRING
        String [] contatos = {"André","Ari", "Roberto", "luzia"};

        // PARA CONSEGUIRMOS EXIBIR A LISTA DE LISTVIEW PRECISO
        //CRIAR UM ADAPTOR
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);

        // insere o adaptor na lista de contatos
        listaContatos.setAdapter(adapter);


    }
}
