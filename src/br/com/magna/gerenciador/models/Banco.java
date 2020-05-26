package br.com.magna.gerenciador.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Empresa> listaempresas = new ArrayList<>();
	private static List<Usuario> listausuarios = new ArrayList<>();
	private static Integer idSeq = 1;
	
	static {
	
		Empresa empresa1 = new Empresa();
		empresa1.setId(idSeq++);
		empresa1.setNome("Magna");
		empresa1.setCnpj("47.419.978/0001-14");
		Empresa empresa2 =  new Empresa();
		empresa2.setId(idSeq++);
		empresa2.setNome("YKP");	
		empresa2.setCnpj("12.587.568/0002-58");
		
		Usuario user1 = new Usuario();
		user1.setUsuario("Wagner");
		user1.setSenha("1234567");
		
		Usuario user2 = new Usuario();
		user2.setUsuario("Ana");
		user2.setSenha("1354265");
		
		
		listaempresas.add(empresa1);
		listaempresas.add(empresa2);
		
		listausuarios.add(user1);
		listausuarios.add(user2);
		
	
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.idSeq++);
		this.listaempresas.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaempresas;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = listaempresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId()==id) {
				it.remove();
			}
		}		
	}

	public Empresa getEmpresa(Integer id) {
		// TODO Auto-generated method stub
		//Iterator<Empresa> it = listaempresas.iterator();
		for (Empresa empresa : listaempresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void alteraempresa(Integer id, String nome, String cnpj) {
		Empresa empresa = this.getEmpresa(id);
		empresa.setCnpj(cnpj);
		empresa.setNome(nome);
	}
	
	public Usuario getUsuario(String userid, String pwd) {
		for (Usuario usuario : listausuarios) {
			System.out.println("User: " + usuario.getUsuario());
			if(usuario.validaUser(userid, pwd)) {
				return usuario;
			}
		}		
		return null;
	}
	
}
