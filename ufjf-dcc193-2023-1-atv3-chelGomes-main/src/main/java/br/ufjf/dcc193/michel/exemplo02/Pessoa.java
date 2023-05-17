package br.ufjf.dcc193.michel.exemplo02;

public class Pessoa {
    private String nome;
    private Integer idade;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        return true;
    }

    public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(Integer idade) {
    this.idade = idade;
}

    public String getNome(){
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
