package truco;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private static Baralho instance = null;
    private final List<Carta> baralho;
    private int i;

    private Baralho() {
        this.baralho = new ArrayList<>();

        baralho.add(new Carta("🂡", 14, Color.BLACK));
        baralho.add(new Carta("🂢", 11, Color.BLACK));
        baralho.add(new Carta("🂣", 12, Color.BLACK));
        baralho.add(new Carta("🂤", 0, Color.BLACK));
        baralho.add(new Carta("🂥", 1, Color.BLACK));
        baralho.add(new Carta("🂦", 2, Color.BLACK));
        baralho.add(new Carta("🂧", 3, Color.BLACK));
        baralho.add(new Carta("🂫", 7, Color.BLACK));
        baralho.add(new Carta("🂭", 9, Color.BLACK));
        baralho.add(new Carta("🂮", 10, Color.BLACK));

        baralho.add(new Carta("🂱", 10, Color.RED));
        baralho.add(new Carta("🂲", 11, Color.RED));
        baralho.add(new Carta("🂳", 12, Color.RED));
        baralho.add(new Carta("🂴", 0, Color.RED));
        baralho.add(new Carta("🂵", 1, Color.RED));
        baralho.add(new Carta("🂶", 2, Color.RED));
        baralho.add(new Carta("🂷", 15, Color.RED));
        baralho.add(new Carta("🂻", 6, Color.RED));
        baralho.add(new Carta("🂽", 8, Color.RED));
        baralho.add(new Carta("🂾", 9, Color.RED));


        baralho.add(new Carta("🃁", 10, Color.RED));
        baralho.add(new Carta("🃂", 11, Color.RED));
        baralho.add(new Carta("🃃", 12, Color.RED));
        baralho.add(new Carta("🃄", 0, Color.RED));
        baralho.add(new Carta("🃅", 1, Color.RED));
        baralho.add(new Carta("🃆", 2, Color.RED));
        baralho.add(new Carta("🃇", 13, Color.RED));
        baralho.add(new Carta("🃋", 6, Color.RED));
        baralho.add(new Carta("🃍", 8, Color.RED));
        baralho.add(new Carta("🃎", 9, Color.RED));


        baralho.add(new Carta("🃑", 10, Color.BLACK));
        baralho.add(new Carta("🃒", 11, Color.BLACK));
        baralho.add(new Carta("🃓", 12, Color.BLACK));
        baralho.add(new Carta("🃔", 16, Color.BLACK));
        baralho.add(new Carta("🃕", 0, Color.BLACK));
        baralho.add(new Carta("🃖", 1, Color.BLACK));
        baralho.add(new Carta("🃗", 2, Color.BLACK));
        baralho.add(new Carta("🃛", 6, Color.BLACK));
        baralho.add(new Carta("🃝", 8, Color.BLACK));
        baralho.add(new Carta("🃞", 9, Color.BLACK));
    }

    public Carta getTopo() {
        Carta c = baralho.get(i);
        baralho.remove(i++);
        return c;
    }
    
    public static Baralho getInstance(){
        if (instance == null)
            instance = new Baralho();
        return instance;
    }
    
    public void embaralhar(){
        Collections.shuffle(baralho);   
        i = 0;
    }
}
