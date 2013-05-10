package dropclj;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public abstract class DropcljService extends Service<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.setName("DropClj");
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        cljrun(environment);
    }

    public abstract void cljrun(Environment environment);
}
