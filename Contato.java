package aulajava;

public class Contato {

    private String contato;
    private String idade;
    private String altura;

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    //Metodo que faz imprimir um objeto em string sem precisar converter
    @Override
    public String toString() {
        return "Nome:" + contato + "  Idade:" + idade + " Altura:" + altura + "\n";
    }

    //Metodo reponsavel por procurar um contato por nome - (é criado automatico)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contato == null) ? 0 : contato.hashCode());
        return result;
    }
    //Metodo reponsavel por procurar um contato por nome - (é criado automatico)

    @Override//@Override significa sobreescrito
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Contato other = (Contato) obj;
        if (contato == null) {
            if (other.contato != null) {
                return false;
            }
        } else if (!contato.equals(other.contato)) {
            return false;
        }
        return true;
    }

    void setcontato(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getContato(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnome(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setemail(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settelefone(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
