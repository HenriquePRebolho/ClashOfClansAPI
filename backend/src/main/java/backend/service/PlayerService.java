package backend.service;

import backend.models.Player.Player;
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
public class PlayerService {

    @Value("${clashOfClansBaseURI}")
    private String clashOfClansBaseURI;
    @Value("${clashOfClansToken}")
    private String clashOfClansToken;

    @Autowired
    RestTemplate restTemplate;

    public Player getPlayer(String playerTag) {
        // Remove the '#' from the player tag
        playerTag = playerTag.subSequence(1, playerTag.length()).toString();

        StringBuilder builder = new StringBuilder(clashOfClansBaseURI);
        builder.append("/v1/players/%23");
        builder.append(playerTag);

        URI uri = URI.create(builder.toString());

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(clashOfClansToken);

        HttpEntity<Player> request = new HttpEntity<>(null, headers);
        ResponseEntity<Player> response;
        try {
             response = restTemplate.exchange(uri, HttpMethod.GET, request, Player.class);
             return response.getBody();
        }
        catch (Exception error) {
            System.out.println(error.toString());
            return null;
        }
    }
}
