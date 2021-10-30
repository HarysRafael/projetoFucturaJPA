package dao.interfaces;

import java.util.List;

import model.Endereco;

public interface EnderecoDao {

	public void salvar(Endereco endereco);
	public void alterar(Endereco endereco);
	public void remover(Integer id);
	public Pessoa pesquisar(Integer id);
	public List<Endereco> listarTodos();
	
}