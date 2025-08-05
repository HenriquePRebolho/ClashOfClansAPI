
package backend.models.Player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("townHallLevel")
    private Integer townHallLevel;
    @JsonProperty("townHallWeaponLevel")
    private Integer townHallWeaponLevel;
    @JsonProperty("expLevel")
    private Integer expLevel;
    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("bestTrophies")
    private Integer bestTrophies;
    @JsonProperty("warStars")
    private Integer warStars;
    @JsonProperty("attackWins")
    private Integer attackWins;
    @JsonProperty("defenseWins")
    private Integer defenseWins;
    @JsonProperty("builderHallLevel")
    private Integer builderHallLevel;
    @JsonProperty("builderBaseTrophies")
    private Integer builderBaseTrophies;
    @JsonProperty("bestBuilderBaseTrophies")
    private Integer bestBuilderBaseTrophies;
    @JsonProperty("role")
    private String role;
    @JsonProperty("warPreference")
    private String warPreference;
    @JsonProperty("donations")
    private Integer donations;
    @JsonProperty("donationsReceived")
    private Integer donationsReceived;
    @JsonProperty("clanCapitalContributions")
    private Integer clanCapitalContributions;
    @JsonProperty("clan")
    private Clan clan;
    @JsonProperty("league")
    private League league;
    @JsonProperty("builderBaseLeague")
    private BuilderBaseLeague builderBaseLeague;
    @JsonProperty("achievements")
    private List<Achievement> achievements;
    @JsonProperty("playerHouse")
    private PlayerHouse playerHouse;
    @JsonProperty("labels")
    private List<Label> labels;
    @JsonProperty("troops")
    private List<Troop> troops;
    @JsonProperty("heroes")
    private List<Hero> heroes;
    @JsonProperty("heroEquipment")
    private List<HeroEquipment> heroEquipment;
    @JsonProperty("spells")
    private List<Spell> spells;

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("townHallLevel")
    public Integer getTownHallLevel() {
        return townHallLevel;
    }

    @JsonProperty("townHallLevel")
    public void setTownHallLevel(Integer townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    @JsonProperty("townHallWeaponLevel")
    public Integer getTownHallWeaponLevel() {
        return townHallWeaponLevel;
    }

    @JsonProperty("townHallWeaponLevel")
    public void setTownHallWeaponLevel(Integer townHallWeaponLevel) {
        this.townHallWeaponLevel = townHallWeaponLevel;
    }

    @JsonProperty("expLevel")
    public Integer getExpLevel() {
        return expLevel;
    }

    @JsonProperty("expLevel")
    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("trophies")
    public Integer getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("bestTrophies")
    public Integer getBestTrophies() {
        return bestTrophies;
    }

    @JsonProperty("bestTrophies")
    public void setBestTrophies(Integer bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

    @JsonProperty("warStars")
    public Integer getWarStars() {
        return warStars;
    }

    @JsonProperty("warStars")
    public void setWarStars(Integer warStars) {
        this.warStars = warStars;
    }

    @JsonProperty("attackWins")
    public Integer getAttackWins() {
        return attackWins;
    }

    @JsonProperty("attackWins")
    public void setAttackWins(Integer attackWins) {
        this.attackWins = attackWins;
    }

    @JsonProperty("defenseWins")
    public Integer getDefenseWins() {
        return defenseWins;
    }

    @JsonProperty("defenseWins")
    public void setDefenseWins(Integer defenseWins) {
        this.defenseWins = defenseWins;
    }

    @JsonProperty("builderHallLevel")
    public Integer getBuilderHallLevel() {
        return builderHallLevel;
    }

    @JsonProperty("builderHallLevel")
    public void setBuilderHallLevel(Integer builderHallLevel) {
        this.builderHallLevel = builderHallLevel;
    }

    @JsonProperty("builderBaseTrophies")
    public Integer getBuilderBaseTrophies() {
        return builderBaseTrophies;
    }

    @JsonProperty("builderBaseTrophies")
    public void setBuilderBaseTrophies(Integer builderBaseTrophies) {
        this.builderBaseTrophies = builderBaseTrophies;
    }

    @JsonProperty("bestBuilderBaseTrophies")
    public Integer getBestBuilderBaseTrophies() {
        return bestBuilderBaseTrophies;
    }

    @JsonProperty("bestBuilderBaseTrophies")
    public void setBestBuilderBaseTrophies(Integer bestBuilderBaseTrophies) {
        this.bestBuilderBaseTrophies = bestBuilderBaseTrophies;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("warPreference")
    public String getWarPreference() {
        return warPreference;
    }

    @JsonProperty("warPreference")
    public void setWarPreference(String warPreference) {
        this.warPreference = warPreference;
    }

    @JsonProperty("donations")
    public Integer getDonations() {
        return donations;
    }

    @JsonProperty("donations")
    public void setDonations(Integer donations) {
        this.donations = donations;
    }

    @JsonProperty("donationsReceived")
    public Integer getDonationsReceived() {
        return donationsReceived;
    }

    @JsonProperty("donationsReceived")
    public void setDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    @JsonProperty("clanCapitalContributions")
    public Integer getClanCapitalContributions() {
        return clanCapitalContributions;
    }

    @JsonProperty("clanCapitalContributions")
    public void setClanCapitalContributions(Integer clanCapitalContributions) {
        this.clanCapitalContributions = clanCapitalContributions;
    }

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    @JsonProperty("builderBaseLeague")
    public BuilderBaseLeague getBuilderBaseLeague() {
        return builderBaseLeague;
    }

    @JsonProperty("builderBaseLeague")
    public void setBuilderBaseLeague(BuilderBaseLeague builderBaseLeague) {
        this.builderBaseLeague = builderBaseLeague;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("playerHouse")
    public PlayerHouse getPlayerHouse() {
        return playerHouse;
    }

    @JsonProperty("playerHouse")
    public void setPlayerHouse(PlayerHouse playerHouse) {
        this.playerHouse = playerHouse;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("troops")
    public List<Troop> getTroops() {
        return troops;
    }

    @JsonProperty("troops")
    public void setTroops(List<Troop> troops) {
        this.troops = troops;
    }

    @JsonProperty("heroes")
    public List<Hero> getHeroes() {
        return heroes;
    }

    @JsonProperty("heroes")
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    @JsonProperty("heroEquipment")
    public List<HeroEquipment> getHeroEquipment() {
        return heroEquipment;
    }

    @JsonProperty("heroEquipment")
    public void setHeroEquipment(List<HeroEquipment> heroEquipment) {
        this.heroEquipment = heroEquipment;
    }

    @JsonProperty("spells")
    public List<Spell> getSpells() {
        return spells;
    }

    @JsonProperty("spells")
    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Player.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("townHallLevel");
        sb.append('=');
        sb.append(((this.townHallLevel == null)?"<null>":this.townHallLevel));
        sb.append(',');
        sb.append("townHallWeaponLevel");
        sb.append('=');
        sb.append(((this.townHallWeaponLevel == null)?"<null>":this.townHallWeaponLevel));
        sb.append(',');
        sb.append("expLevel");
        sb.append('=');
        sb.append(((this.expLevel == null)?"<null>":this.expLevel));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("bestTrophies");
        sb.append('=');
        sb.append(((this.bestTrophies == null)?"<null>":this.bestTrophies));
        sb.append(',');
        sb.append("warStars");
        sb.append('=');
        sb.append(((this.warStars == null)?"<null>":this.warStars));
        sb.append(',');
        sb.append("attackWins");
        sb.append('=');
        sb.append(((this.attackWins == null)?"<null>":this.attackWins));
        sb.append(',');
        sb.append("defenseWins");
        sb.append('=');
        sb.append(((this.defenseWins == null)?"<null>":this.defenseWins));
        sb.append(',');
        sb.append("builderHallLevel");
        sb.append('=');
        sb.append(((this.builderHallLevel == null)?"<null>":this.builderHallLevel));
        sb.append(',');
        sb.append("builderBaseTrophies");
        sb.append('=');
        sb.append(((this.builderBaseTrophies == null)?"<null>":this.builderBaseTrophies));
        sb.append(',');
        sb.append("bestBuilderBaseTrophies");
        sb.append('=');
        sb.append(((this.bestBuilderBaseTrophies == null)?"<null>":this.bestBuilderBaseTrophies));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("warPreference");
        sb.append('=');
        sb.append(((this.warPreference == null)?"<null>":this.warPreference));
        sb.append(',');
        sb.append("donations");
        sb.append('=');
        sb.append(((this.donations == null)?"<null>":this.donations));
        sb.append(',');
        sb.append("donationsReceived");
        sb.append('=');
        sb.append(((this.donationsReceived == null)?"<null>":this.donationsReceived));
        sb.append(',');
        sb.append("clanCapitalContributions");
        sb.append('=');
        sb.append(((this.clanCapitalContributions == null)?"<null>":this.clanCapitalContributions));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("builderBaseLeague");
        sb.append('=');
        sb.append(((this.builderBaseLeague == null)?"<null>":this.builderBaseLeague));
        sb.append(',');
        sb.append("achievements");
        sb.append('=');
        sb.append(((this.achievements == null)?"<null>":this.achievements));
        sb.append(',');
        sb.append("playerHouse");
        sb.append('=');
        sb.append(((this.playerHouse == null)?"<null>":this.playerHouse));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("troops");
        sb.append('=');
        sb.append(((this.troops == null)?"<null>":this.troops));
        sb.append(',');
        sb.append("heroes");
        sb.append('=');
        sb.append(((this.heroes == null)?"<null>":this.heroes));
        sb.append(',');
        sb.append("heroEquipment");
        sb.append('=');
        sb.append(((this.heroEquipment == null)?"<null>":this.heroEquipment));
        sb.append(',');
        sb.append("spells");
        sb.append('=');
        sb.append(((this.spells == null)?"<null>":this.spells));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
