package br.senac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera a referencia da lista que tem no layout do aplicatvo
        ListView listaContatos = findViewById(R.id.ListaContatos);

        //Cria Lista de contTOA COMO STRING
        String [] contatos = {"Duplo Cilindro", "Mono Cilindro", "Aldo", "Ponga", "recupera filo", "Mancata ucita della calza", "abassa aghi scarico bordo", "Fillo Rotto ", "abassa aghi talone", "Tiragio", "Apripalete scarico bordo", "Filo no tagliato"};

        // PARA CONSEGUIRMOS EXIBIR A LISTA DE LISTVIEW PRECISO
        //CRIAR UM ADAPTOR
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contatos);

        // insere o adaptor na lista de contatos
        listaContatos.setAdapter(adapter);

        //Recuperar o botão e tcriar ação pra ele
        Button novocontato = findViewById(R.id.NovoContatoButton);

        novocontato.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent contato = new Intent(MainActivity.this, ContatoActivity.class);
                                              startActivity(contato);
                                          }
                                      }

        );


    }
}
