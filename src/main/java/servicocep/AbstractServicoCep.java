package servicocep;

import model.Endereco;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.logging.Logger;

public abstract class AbstractServicoCep implements ServicoCep {
    private static final Logger LOG = Logger.getLogger(AbstractServicoCep.class.getName());

    private final WebTarget target;
    private final String dominio;

    public AbstractServicoCep(String dominio) {
        this.dominio = insertTrailingSlash(dominio);
        Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }

    protected final String insertTrailingSlash(String path) {
        return path.endsWith("/") ? path : path + "/";
    }

    protected abstract String buildPath(String cep);

    protected String getFullPath(String cep) {
        return this.dominio + buildPath(cep);
    }

    @Override
    public Endereco buscarEndereco(String cep) {
        LOG.info(getFullPath(cep));
        return target.path(buildPath(cep)).request().get(Endereco.class);
    }
}
