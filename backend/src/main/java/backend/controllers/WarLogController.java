package backend.controllers;

import backend.exceptions.ClanNotFoundException;
import backend.models.Clan.Clan;
import backend.models.WarLog.WarLog;
import backend.repositories.ClanRepository;
import backend.repositories.WarLogRepository;
import backend.service.WarLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coc.api/v1")
public class WarLogController {

    @Autowired
    WarLogRepository warLogRepository;
    @Autowired
    ClanRepository clanRepository;

    @Autowired
    WarLogService warLogService;


    @GetMapping("/{clanTag}/warlog")
    @ResponseStatus(HttpStatus.OK)
    public WarLog getWarLogByClanTag(@PathVariable String clanTag) throws ClanNotFoundException {
        Optional<Clan> foundClan = Optional.ofNullable(clanRepository.findClanByTag(clanTag));

        if (foundClan.isEmpty()) {
            throw new ClanNotFoundException();
        }

        // Clan might have not participated in war yet, thus it can be empty
        return warLogRepository.findWarLogByClanTag(clanTag);  // VERIFY THIS
    }


    @PostMapping("/{clanTag}/warlog")
    @ResponseStatus(HttpStatus.CREATED)
    public WarLog createWarLog(@PathVariable String clanTag) throws ClanNotFoundException{
        Optional<Clan> foundClan = Optional.ofNullable(clanRepository.findClanByTag(clanTag));

        if (foundClan.isEmpty()) {
            throw new ClanNotFoundException();
        }
        try {
            if (warLogRepository.findWarLogByClanTag(clanTag) != null) {
                return warLogRepository.findWarLogByClanTag(clanTag);
            }
            WarLog newWarLog = warLogService.getWarLog(clanTag);
            return warLogRepository.save(newWarLog);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
