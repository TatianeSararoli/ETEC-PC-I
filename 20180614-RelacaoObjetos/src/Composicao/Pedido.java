package Composicao;

import java.util.ArrayList;

public class Pedido {
	
	private int idPedido;
	
	private ArrayList<ItemPedido> ItemPedido;
	
	public Pedido() {
		ItemPedido = new ArrayList<ItemPedido>();
	}
	
	public void add(ItemPedido umPedido) {
		ItemPedido.add(umPedido);
	}

}
