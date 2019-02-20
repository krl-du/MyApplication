package br.senac.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.senac.myapplication.R;
import br.senac.myapplication.dao.Contato;
import br.senac.myapplication.model.ContatoEntity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera a referencia da lista que tem no layout do aplicatvo
        ListView listaContatos = findViewById(R.id.ListaContatos);

        //CRIA LISTA DE CONTATO COMO STRING
        Contato contatoDAO = new Contato (this);
        List<ContatoEntity> contatos = contatoDAO.Listar();


        // PARA CONSEGUIRMOS EXIBIR A LISTA DE LISTVIEW PRECISO
        //CRIAR UM ADAPTOR
        ArrayAdapter<ContatoEntity> adapter = new ArrayAdapter<ContatoEntity>(this, android.R.layout.simple_list_item_1, contatos);

        // insere o adaptor na lista de contatos
        listaContatos.setAdapter(adapter);

        //Recuperar o botão e tcriar ação pra ele
        Button novocontato = findViewById(R.id.NovoContatoButton);

        novocontato.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent contato = new Intent(MainActivity.this, ContatoActivity.class);
                                              startActivity(contato);
                                              finish();
                                          }
                                      }

        );



    }
}
