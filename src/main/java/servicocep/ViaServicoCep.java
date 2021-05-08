package servicocep;


public class ViaServicoCep extends AbstractServicoCep {
    public ViaServicoCep() {
        super("https://viacep.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
}
