
package backend.models.Clan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "ClanMember")
public class Member {

    @Id
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("townHallLevel")
    private Integer townHallLevel;
    @JsonProperty("expLevel")
    private Integer expLevel;

    @JsonProperty("league")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "league_id"))
    @AttributeOverride(name = "name", column = @Column(name = "league_name"))
    private League league;

    @JsonProperty("trophies")
    private Integer trophies;
    @JsonProperty("builderBaseTrophies")
    private Integer builderBaseTrophies;
    @JsonProperty("clanRank")
    private Integer clanRank;
    @JsonProperty("previousClanRank")
    private Integer previousClanRank;
    @JsonProperty("donations")
    private Integer donations;
    @JsonProperty("donationsReceived")
    private Integer donationsReceived;

    @JsonProperty("playerHouse")
    @Embedded
    private PlayerHouse playerHouse;

    @JsonProperty("builderBaseLeague")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "builder_base_league_id"))
    @AttributeOverride(name = "name", column = @Column(name = "builder_base_league_name"))
    private BuilderBaseLeague builderBaseLeague;

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

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("townHallLevel")
    public Integer getTownHallLevel() {
        return townHallLevel;
    }

    @JsonProperty("townHallLevel")
    public void setTownHallLevel(Integer townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    @JsonProperty("expLevel")
    public Integer getExpLevel() {
        return expLevel;
    }

    @JsonProperty("expLevel")
    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    @JsonProperty("trophies")
    public Integer getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("builderBaseTrophies")
    public Integer getBuilderBaseTrophies() {
        return builderBaseTrophies;
    }

    @JsonProperty("builderBaseTrophies")
    public void setBuilderBaseTrophies(Integer builderBaseTrophies) {
        this.builderBaseTrophies = builderBaseTrophies;
    }

    @JsonProperty("clanRank")
    public Integer getClanRank() {
        return clanRank;
    }

    @JsonProperty("clanRank")
    public void setClanRank(Integer clanRank) {
        this.clanRank = clanRank;
    }

    @JsonProperty("previousClanRank")
    public Integer getPreviousClanRank() {
        return previousClanRank;
    }

    @JsonProperty("previousClanRank")
    public void setPreviousClanRank(Integer previousClanRank) {
        this.previousClanRank = previousClanRank;
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

    @JsonProperty("playerHouse")
    public PlayerHouse getPlayerHouse() {
        return playerHouse;
    }

    @JsonProperty("playerHouse")
    public void setPlayerHouse(PlayerHouse playerHouse) {
        this.playerHouse = playerHouse;
    }

    @JsonProperty("builderBaseLeague")
    public BuilderBaseLeague getBuilderBaseLeague() {
        return builderBaseLeague;
    }

    @JsonProperty("builderBaseLeague")
    public void setBuilderBaseLeague(BuilderBaseLeague builderBaseLeague) {
        this.builderBaseLeague = builderBaseLeague;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("townHallLevel");
        sb.append('=');
        sb.append(((this.townHallLevel == null)?"<null>":this.townHallLevel));
        sb.append(',');
        sb.append("expLevel");
        sb.append('=');
        sb.append(((this.expLevel == null)?"<null>":this.expLevel));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("builderBaseTrophies");
        sb.append('=');
        sb.append(((this.builderBaseTrophies == null)?"<null>":this.builderBaseTrophies));
        sb.append(',');
        sb.append("clanRank");
        sb.append('=');
        sb.append(((this.clanRank == null)?"<null>":this.clanRank));
        sb.append(',');
        sb.append("previousClanRank");
        sb.append('=');
        sb.append(((this.previousClanRank == null)?"<null>":this.previousClanRank));
        sb.append(',');
        sb.append("donations");
        sb.append('=');
        sb.append(((this.donations == null)?"<null>":this.donations));
        sb.append(',');
        sb.append("donationsReceived");
        sb.append('=');
        sb.append(((this.donationsReceived == null)?"<null>":this.donationsReceived));
        sb.append(',');
        sb.append("playerHouse");
        sb.append('=');
        sb.append(((this.playerHouse == null)?"<null>":this.playerHouse));
        sb.append(',');
        sb.append("builderBaseLeague");
        sb.append('=');
        sb.append(((this.builderBaseLeague == null)?"<null>":this.builderBaseLeague));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
