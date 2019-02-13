package br.senac.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class ContatoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        //
        //
        //Ação de clique no salvar'

        Button salvarContatoButton = findViewById(R.id.salvarContatoButton);
        salvarContatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // recuperar o texto dos EditTexts

                EditText nomeEditText = findViewById(R.id.nomeEditText);
                EditText telefoneEditText = findViewById(R.id.telefoneEditText);

                // textos que estvam presentes nos objetos

                String nome = nomeEditText.getText().toString();
                String telefone = telefoneEditText.getText().toString();

                //Exibe uma mensagem

                Toast.makeText(ContatoActivity.this, "Contato salvo! Nome: "+ nome + "Tel:" + telefone, Toast.LENGTH_SHORT).show();
                finish();
            }






        });

    }
}
