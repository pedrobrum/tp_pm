package truco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baralho {

    private final List<Carta> baralho;
    private final Random random;

    public Baralho() {
        this.baralho = new ArrayList<>();

        baralho.add(new Carta("🂡", 14));
        baralho.add(new Carta("🂢", 11));
        baralho.add(new Carta("🂣", 12));
        baralho.add(new Carta("🂤", 0));
        baralho.add(new Carta("🂥", 1));
        baralho.add(new Carta("🂦", 2));
        baralho.add(new Carta("🂧", 3));
        baralho.add(new Carta("🂪", 6));
        baralho.add(new Carta("🂫", 7));
        baralho.add(new Carta("🂬", 8));
        baralho.add(new Carta("🂭", 9));
        baralho.add(new Carta("🂮", 10));


        baralho.add(new Carta("🂱", 10));
        baralho.add(new Carta("🂲", 11));
        baralho.add(new Carta("🂳", 12));
        baralho.add(new Carta("🂴", 0));
        baralho.add(new Carta("🂵", 1));
        baralho.add(new Carta("🂶", 2));
        baralho.add(new Carta("🂷", 15));
        baralho.add(new Carta("🂺", 5));
        baralho.add(new Carta("🂻", 6));
        baralho.add(new Carta("🂼", 7));
        baralho.add(new Carta("🂽", 8));
        baralho.add(new Carta("🂾", 9));


        baralho.add(new Carta("🃁", 10));
        baralho.add(new Carta("🃂", 11));
        baralho.add(new Carta("🃃", 12));
        baralho.add(new Carta("🃄", 0));
        baralho.add(new Carta("🃅", 1));
        baralho.add(new Carta("🃆", 2));
        baralho.add(new Carta("🃇", 13));
        baralho.add(new Carta("🃊", 5));
        baralho.add(new Carta("🃋", 6));
        baralho.add(new Carta("🃌", 7));
        baralho.add(new Carta("🃍", 8));
        baralho.add(new Carta("🃎", 9));


        baralho.add(new Carta("🃑", 10));
        baralho.add(new Carta("🃒", 11));
        baralho.add(new Carta("🃓", 12));
        baralho.add(new Carta("🃔", 16));
        baralho.add(new Carta("🃕", 0));
        baralho.add(new Carta("🃖", 1));
        baralho.add(new Carta("🃗", 2));
        baralho.add(new Carta("🃚", 5));
        baralho.add(new Carta("🃛", 6));
        baralho.add(new Carta("🃜", 7));
        baralho.add(new Carta("🃝", 8));
        baralho.add(new Carta("🃞", 9));
        Collections.shuffle(baralho);
        random = new Random();
    }

    public Carta getTopo() {
        int i = random.nextInt(baralho.size());
        Carta c = baralho.get(i);
        baralho.remove(i);
        return c;
    }
}
