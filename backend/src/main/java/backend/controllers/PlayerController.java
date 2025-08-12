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
        Optional<Player> foundPlayer = Optional.ofNullable(playerRepository.findByPlayerTag(playerTag));

        if (foundPlayer.isEmpty()) {
            throw new PlayerNotFoundException();
        }
        return foundPlayer.get();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Player createPlayer(@RequestBody String newPlayerTag) {
        try {
            if (playerRepository.findByPlayerTag(newPlayerTag) != null) {
                return playerRepository.findByPlayerTag(newPlayerTag);
            }
            Player newPlayer = playerService.getPlayer(newPlayerTag);
            return playerRepository.save(newPlayer);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }





}
