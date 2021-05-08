package servicocep;

import model.Endereco;

public interface  ServicoCep {
    Endereco buscarEndereco(String cep);
}
