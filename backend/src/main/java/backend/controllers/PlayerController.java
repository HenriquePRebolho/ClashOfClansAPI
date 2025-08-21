package backend.controllers;

import backend.exceptions.PlayerNotFoundException;
import backend.models.Player.Player;
import backend.repositories.PlayerRepository;
import backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coc.api/v1/players")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerService playerService;

    @GetMapping("/{playerTag}")
    @ResponseStatus(HttpStatus.OK)
    public Player getPlayerByTag(@PathVariable String playerTag) throws PlayerNotFoundException {
        // Postman strips everything followed by a #, so for postman requests we add the #
        if (playerTag.charAt(0) != '#') {
            playerTag = '#' + playerTag;
        }
        Optional<Player> foundPlayer = Optional.ofNullable(playerRepository.findPlayerByTag(playerTag));

        if (foundPlayer.isEmpty()) {
            throw new PlayerNotFoundException();
        }
        return foundPlayer.get();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Player createPlayer(@RequestBody String newPlayerTag) {
        try {
            if (playerRepository.findPlayerByTag(newPlayerTag) != null) {
                return playerRepository.findPlayerByTag(newPlayerTag);
            }
            Player newPlayer = playerService.getPlayer(newPlayerTag);
            return playerRepository.save(newPlayer);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }





}
