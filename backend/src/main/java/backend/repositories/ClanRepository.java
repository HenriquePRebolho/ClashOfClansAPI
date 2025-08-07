package backend.repositories;

import backend.models.Clan.Clan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClanRepository extends JpaRepository<Clan, String> {
    Clan findClanByTag(String clanTag);
}
