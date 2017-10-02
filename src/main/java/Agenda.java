public class Agenda implements Comparable<Agenda> {
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String Telefone;

    public Agenda(String nome, String sobrenome, String dataNasc, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.Telefone = telefone;
    }

    public int compareTo(Agenda a) {
        if(this.nome.compareTo(a.nome)<0) {
            return -1;

        }
        if(this.nome.compareTo(a.nome)>0) {
            return 1;

        }

        if(this.nome.equals(a.nome)){
            if(this.sobrenome.compareTo(a.sobrenome)<0){
                return -1;
            }
            if(this.sobrenome.compareTo(a.sobrenome)>0){
                return 1;
            }
            return 0;
        }
        if(this.sobrenome.equals(a.sobrenome)){

            if(this.dataNasc.compareTo(a.dataNasc)<0){
                return -1;
            }
            if(this.dataNasc.compareTo(a.dataNasc)>0){
                return 1;
            }
            return 0;
        }
        if(this.dataNasc.equals(a.dataNasc)){
            if(this.Telefone.compareTo(a.Telefone)<0){
                return -1;
            }
            if(this.Telefone.compareTo(a.Telefone)>0){
                return 1;
            }
            return 0;

        }
       return 2;
    }
}
