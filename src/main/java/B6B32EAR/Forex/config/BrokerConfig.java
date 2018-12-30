package B6B32EAR.Forex.config;

import org.springframework.context.annotation.Bean;
import pro.xstore.api.sync.ServerData;
import pro.xstore.api.sync.SyncAPIConnector;

public class BrokerConfig {

    @Bean
    SyncAPIConnector connector(){
        SyncAPIConnector connector = new SyncAPIConnector(ServerData.ServerEnum.DEMO);
        return connector;
    }
}
