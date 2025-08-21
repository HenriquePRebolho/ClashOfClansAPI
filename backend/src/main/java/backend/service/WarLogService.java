package backend.service;

import backend.models.WarLog.WarLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class WarLogService {

    @Value("${clashOfClansBaseURI}")
    private String clashOfClansBaseURI;
    @Value("${clashOfClansToken}")
    private String clashOfClansToken;

    @Autowired
    RestTemplate restTemplate;

    public WarLog getWarLog(String clanTag) {
        // Remove the '#' from the player tag
        if (clanTag.charAt(0) == '#') {
            clanTag = clanTag.subSequence(1, clanTag.length()).toString();
        }

        StringBuilder builder = new StringBuilder(clashOfClansBaseURI);
        builder.append("/v1/clans/%23");
        builder.append(clanTag);
        builder.append("/warlog");

        URI uri = URI.create(builder.toString());

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(clashOfClansToken);

        HttpEntity<WarLog> request = new HttpEntity<>(null, headers);
        ResponseEntity<WarLog> response;
        try {
            response = restTemplate.exchange(uri, HttpMethod.GET, request, WarLog.class);
            WarLog warLog = new WarLog();
            warLog.setClanTag('#'+clanTag);
            warLog.setItems(response.getBody().getItems());  // FIX
            warLog.setPaging(response.getBody().getPaging());
            return warLog;
        }
        catch (Exception error) {
            System.out.println(error.toString());
            return null;
        }
    }

}
