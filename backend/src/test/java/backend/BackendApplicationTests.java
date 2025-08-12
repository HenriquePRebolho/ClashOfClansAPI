package backend;

import backend.models.Clan.Clan;
import backend.models.Player.Player;
import backend.models.WarLog.WarLog;
import backend.service.ClanService;
import backend.service.PlayerService;
import backend.service.WarLogService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	PlayerService playerService;
	@Autowired
	ClanService clanService;
	@Autowired
	WarLogService warLogService;

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("Get a player")
	void getPlayerTest() {
		String playerTagTest = "#2PP9JP09R";
		Player player = playerService.getPlayer(playerTagTest);

		assertNotNull(player);
		assertEquals(playerTagTest, player.getTag());

		System.out.println("\nPlayer test:\n" + player);
	}


	@Test
	@DisplayName("Get a clan")
	void getClanTest() {
		String clanTagTest = "#2RRCJJ280";
		Clan clan = clanService.getClan(clanTagTest);

		assertNotNull(clan);
		assertEquals(clanTagTest, clan.getTag());

		System.out.println("\nClan test:\n" + clan);
	}


	@Test
	@DisplayName("Get a clan war log")
	void getClanWarLogTest() {
		String clanTagTest = "#2RRCJJ280";
		WarLog clanWarLog = warLogService.getWarLog(clanTagTest);

		assertNotNull(clanWarLog);
		assertEquals(clanTagTest, clanWarLog.getItems().get(0).getClan().getTag());

		System.out.println("\nClan test:\n" + clanWarLog);
	}

}
