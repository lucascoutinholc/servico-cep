package servicocep;

import javax.enterprise.context.Dependent;

@Dependent
public class WidenetServicoCep extends AbstractServicoCep {

    public WidenetServicoCep() {
        super("https://apps.widenet.com.br/busca-cep/api");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("cep/%s.json", cep);
    }
}
