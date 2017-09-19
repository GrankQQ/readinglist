package readinglist;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by guoruirui on 2017/9/19.
 */
@Component
@ConfigurationProperties("amazon")
public class AmazonProperties {

    private String associateId;

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }
}
