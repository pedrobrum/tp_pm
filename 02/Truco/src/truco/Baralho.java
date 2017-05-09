/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truco;

/**
 *
 * @author rafael
 */
public class Baralho {

	private List<Carta> baralho;

	public Baralho() throws Exception {

		this.baralho = new ArrayList<Carta>();

		baralho.add(new Carta("♠", "🂡", 14));
		baralho.add(new Carta("♠", "🂢", 11));
		baralho.add(new Carta("♠", "🂣", 12));
		baralho.add(new Carta("♠", "🂤", 0));
		baralho.add(new Carta("♠", "🂥", 1));
		baralho.add(new Carta("♠", "🂦", 2));
		baralho.add(new Carta("♠", "🂧", 3));
		baralho.add(new Carta("♠", "🂨", 4));
		baralho.add(new Carta("♠", "🂩", 5));
		baralho.add(new Carta("♠", "🂪", 6));
		baralho.add(new Carta("♠", "🂫", 7));
		baralho.add(new Carta("♠", "🂬", 8));
		baralho.add(new Carta("♠", "🂭", 9));
		baralho.add(new Carta("♠", "🂮", 10));


		baralho.add(new Carta("♥", "🂱", 10));
		baralho.add(new Carta("♥", "🂲", 11));
		baralho.add(new Carta("♥", "🂳", 12));
		baralho.add(new Carta("♥", "🂴", 0));
		baralho.add(new Carta("♥", "🂵", 1));
		baralho.add(new Carta("♥", "🂶", 2));
		baralho.add(new Carta("♥", "🂷", 15));
		baralho.add(new Carta("♥", "🂸", 3));
		baralho.add(new Carta("♥", "🂹", 4));
		baralho.add(new Carta("♥", "🂺", 5));
		baralho.add(new Carta("♥", "🂻", 6));
		baralho.add(new Carta("♥", "🂼", 7));
		baralho.add(new Carta("♥", "🂽", 8));
		baralho.add(new Carta("♥", "🂾", 9));


		baralho.add(new Carta("♦", "🃁", 10));
		baralho.add(new Carta("♦", "🃂", 11));
		baralho.add(new Carta("♦", "🃃", 12));
		baralho.add(new Carta("♦", "🃄", 0));
		baralho.add(new Carta("♦", "🃅", 1));
		baralho.add(new Carta("♦", "🃆", 2));
		baralho.add(new Carta("♦", "🃇", 13));
		baralho.add(new Carta("♦", "🃈", 3));
		baralho.add(new Carta("♦", "🃉", 4));
		baralho.add(new Carta("♦", "🃊", 5));
		baralho.add(new Carta("♦", "🃋", 6));
		baralho.add(new Carta("♦", "🃌", 7));
		baralho.add(new Carta("♦", "🃍", 8));
		baralho.add(new Carta("♦", "🃎", 9));


		baralho.add(new Carta("♣", "🃑", 10));
		baralho.add(new Carta("♣", "🃒", 11));
		baralho.add(new Carta("♣", "🃓", 12));
		baralho.add(new Carta("♣", "🃔", 16));
		baralho.add(new Carta("♣", "🃕", 0));
		baralho.add(new Carta("♣", "🃖", 1));
		baralho.add(new Carta("♣", "🃗", 2));
		baralho.add(new Carta("♣", "🃘", 3));
		baralho.add(new Carta("♣", "🃙", 4));
		baralho.add(new Carta("♣", "🃚", 5));
		baralho.add(new Carta("♣", "🃛", 6));
		baralho.add(new Carta("♣", "🃜", 7));
		baralho.add(new Carta("♣", "🃝", 8));
		baralho.add(new Carta("♣", "🃞", 9));
	}

	public void embaralha() {

		Collections.shuffle(baralho);
	}

	public void corta() {


	}

	public void distribuiCartas() {

	}
}
