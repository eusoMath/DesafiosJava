package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contatos> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contatos(nome, numero));
	}
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	public Set<Contatos> pesquisarPorNome(String nome){
		Set<Contatos> contatosPorNome = new HashSet<>();
		for(Contatos c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contatos atualizarNumeroContato(String nome, int novoNumero) {
		Contatos contatoAtualizado = null;
		for(Contatos c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main (String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila cavalcante", 1111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 111111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Camila"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));
	}
}
