package dao.interfaces;

import java.util.List;

import model.Pessoa;

public interface PessoaDao {

	public void salvar(Pessoa pessoa);
	public void alterar(Pessoa pessoa);
	public void remover(Long cpf);
	public Pessoa pesquisar(Long cpf);
	public List<Pessoa> listarTodos();
	
}