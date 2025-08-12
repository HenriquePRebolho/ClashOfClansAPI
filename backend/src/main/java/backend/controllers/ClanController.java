package backend.controllers;

import backend.exceptions.ClanNotFoundException;
import backend.models.Clan.Clan;
import backend.repositories.ClanRepository;
import backend.service.ClanService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coc.api/v1/clans")
public class ClanController {

    @Autowired
    ClanRepository clanRepository;

    @Autowired
    ClanService clanService;

    @GetMapping("/{clanTag}")
    @ResponseStatus(HttpStatus.OK)
    public Clan getClanByTag( // @Parameter(descripiton="tag of the clan to be found")
                                 @PathVariable String clanTag) throws ClanNotFoundException {
        Optional<Clan> foundClan = Optional.ofNullable(clanRepository.findClanByTag(clanTag));

        if (foundClan.isEmpty()) {
            throw new ClanNotFoundException();
        }
        return foundClan.get();
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Clan createClan(@RequestBody String newClanTag) {
        try {
            // Avoid a duplicated clan
            if (clanRepository.findClanByTag(newClanTag) != null) {
                return clanRepository.findClanByTag(newClanTag);
            }
            Clan newClan = clanService.getClan(newClanTag);
            return clanRepository.save(newClan);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
