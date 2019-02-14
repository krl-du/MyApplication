package br.senac.myapplication.model;

public class EnderecoEntity {
    public EnderecoEntity(String to, String s1, String s2) {
    }

    public class ContatoEntity {
        private Integer id;
        private String rua;
        private String numero;
        private String cidade;

        public ContatoEntity(String rua, String numero, String cidade) {
            this.rua = rua;
            this.numero = numero;
            this.cidade = cidade;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    }
}