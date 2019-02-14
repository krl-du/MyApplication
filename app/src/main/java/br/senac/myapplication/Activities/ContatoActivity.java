package br.senac.myapplication.Activities;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RatingBar;
        import android.widget.Toast;

        import br.senac.myapplication.R;
        import br.senac.myapplication.model.ContatoEntity;
        import br.senac.myapplication.model.EnderecoEntity;

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
                EditText ruaEditText = findViewById(R.id.ruaEditText);
                EditText numeroEditText = findViewById(R.id.numeroEditText);
                EditText cidadeEditText = findViewById(R.id.cidadeEditText);

                // RatingBar pontuacaoRatingBar = findViewById(R.id.)
                // textos que estvam presentes nos objetos

                String nome = nomeEditText.getText().toString();
                String telefone = telefoneEditText.getText().toString();
                String rua = ruaEditText.getText().toString();
                String numero = numeroEditText.getText().toString();
                String cidade = cidadeEditText.getText().toString();

                ContatoEntity contato = new ContatoEntity(nomeEditText.getText().toString(), telefoneEditText.getText().toString(),Double.valueOf(1));

                EnderecoEntity enderco = new EnderecoEntity(ruaEditText.getText().toString(),numeroEditText.getText().toString(),cidadeEditText.getText().toString());

                //Exibe uma mensagem

                Toast.makeText(ContatoActivity.this, "Contato salvo! Nome: " + contato, Toast.LENGTH_SHORT).show();
                finish();
            }


        });

    }
}
