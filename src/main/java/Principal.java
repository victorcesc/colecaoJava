import java.util.ArrayList;
import java.util.Collection;

public class Principal {
    public static void main(String[] args) {

        Agenda a = new Agenda("victor", "cesc", "11-10-1994", "98627832");
        Agenda b = new Agenda("victoria", "souza", "11-10-1995", "93213145");
        Agenda c = new Agenda("victor", "cesc", "11-10-1996", "2378");
        Agenda d = new Agenda("victor", "aaaa", "12-13-1356", "31231");


        Collection<Agenda> col = new ArrayList<>();
        col.add(a);
        col.add(b);
        col.add(c);
        col.add(d);


        for (Agenda elemento : col) {
            System.out.println(elemento.compareTo(a));

        }
    }
}
