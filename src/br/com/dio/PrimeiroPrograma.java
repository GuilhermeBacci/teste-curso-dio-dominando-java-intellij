package br.com.dio;

import br.com.dio.model.gato;

import java.sql.SQLOutput;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

       /* int a = 5;
        int b = 3;
        System.out.println("Hello world! " + (a+b));*/
    }
}
    class Livro {
        private String nome;
        private Intereger numPaginas;

        public Livro(String nome, Intereger numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Intereger getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Intereger numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
