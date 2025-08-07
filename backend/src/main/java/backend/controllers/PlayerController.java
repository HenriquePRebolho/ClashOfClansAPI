package backend.controllers;

import backend.exceptions.PlayerNotFoundException;
import backend.models.Player.Player;
import backend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coc.api/v1/players")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

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
    public Player createPlayer(@RequestBody Player newPlayer) {
        try {
            if (playerRepository.findByPlayerTag(newPlayer.getTag()) != null) {
                return playerRepository.findByPlayerTag(newPlayer.getTag());
            }
            return playerRepository.save(newPlayer);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }





}
