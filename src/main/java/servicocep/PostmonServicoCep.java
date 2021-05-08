package servicocep;

public class PostmonServicoCep extends AbstractServicoCep {
    public PostmonServicoCep() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("v1/cep/%s", cep);
    }
}
