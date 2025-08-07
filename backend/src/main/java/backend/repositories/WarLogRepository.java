package backend.repositories;

import backend.models.WarLog.WarLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarLogRepository extends JpaRepository<WarLog, String> {
    WarLog findWarLogByClanTag(String clanTag);
}
