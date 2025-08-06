package backend.service;

import backend.models.Clan.Clan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class ClanService {

    @Autowired
    RestTemplate restTemplate;

    public Clan getClan(String clanTag, String clashOfClansToken,
                          String clashOfClansBaseURI) {
        // Remove the '#' from the clan tag
        clanTag = clanTag.subSequence(1, clanTag.length()).toString();

        StringBuilder builder = new StringBuilder(clashOfClansBaseURI);
        builder.append("/v1/clans/%23");
        builder.append(clanTag);

        URI uri = URI.create(builder.toString());

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(clashOfClansToken);

        HttpEntity<Clan> request = new HttpEntity<>(null, headers);
        ResponseEntity<Clan> response;
        try {
            response = restTemplate.exchange(uri, HttpMethod.GET, request, Clan.class);
            return response.getBody();
        }
        catch (Exception error) {
            System.out.println(error.toString());
            return null;
        }
    }

}
