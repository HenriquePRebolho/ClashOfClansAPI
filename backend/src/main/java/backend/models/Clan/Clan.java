
package backend.models.Clan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Clan")
public class Clan {

    @Id
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("description")
    private String description;

    @JsonProperty("location")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "location_id"))
    @AttributeOverride(name = "name", column = @Column(name = "location_name"))
    private Location location;

    @JsonProperty("isFamilyFriendly")
    private Boolean isFamilyFriendly;

    @JsonProperty("badgeUrls")
    @Embedded
    private BadgeUrls badgeUrls;

    @JsonProperty("clanLevel")
    private Integer clanLevel;
    @JsonProperty("clanPoints")
    private Integer clanPoints;
    @JsonProperty("clanBuilderBasePoints")
    private Integer clanBuilderBasePoints;
    @JsonProperty("clanCapitalPoints")
    private Integer clanCapitalPoints;

    @JsonProperty("capitalLeague")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "capital_league_id"))
    @AttributeOverride(name = "name", column = @Column(name = "capital_league_name"))
    private CapitalLeague capitalLeague;

    @JsonProperty("requiredTrophies")
    private Integer requiredTrophies;
    @JsonProperty("warFrequency")
    private String warFrequency;
    @JsonProperty("warWinStreak")
    private Integer warWinStreak;
    @JsonProperty("warWins")
    private Integer warWins;
    @JsonProperty("warTies")
    private Integer warTies;
    @JsonProperty("warLosses")
    private Integer warLosses;
    @JsonProperty("isWarLogPublic")
    private Boolean isWarLogPublic;

    @JsonProperty("warLeague")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "war_league_id"))
    @AttributeOverride(name = "name", column = @Column(name = "war_league_name"))
    private WarLeague warLeague;

    @JsonProperty("members")
    private Integer members;

    @JsonProperty("memberList")
    @JoinColumn(name = "clanId")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Member> memberList;


    @JsonProperty("labels")
    @JoinColumn(name = "clanId")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Label> labels;

    @JsonProperty("requiredBuilderBaseTrophies")
    private Integer requiredBuilderBaseTrophies;
    @JsonProperty("requiredTownhallLevel")
    private Integer requiredTownhallLevel;

    @JsonProperty("clanCapital")
    @Embedded
    private ClanCapital clanCapital;

    @JsonProperty("chatLanguage")
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "chat_language_id"))
    @AttributeOverride(name = "name", column = @Column(name = "chat_language_name"))
    private ChatLanguage chatLanguage;

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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("isFamilyFriendly")
    public Boolean getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    @JsonProperty("isFamilyFriendly")
    public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    @JsonProperty("badgeUrls")
    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    @JsonProperty("badgeUrls")
    public void setBadgeUrls(BadgeUrls badgeUrls) {
        this.badgeUrls = badgeUrls;
    }

    @JsonProperty("clanLevel")
    public Integer getClanLevel() {
        return clanLevel;
    }

    @JsonProperty("clanLevel")
    public void setClanLevel(Integer clanLevel) {
        this.clanLevel = clanLevel;
    }

    @JsonProperty("clanPoints")
    public Integer getClanPoints() {
        return clanPoints;
    }

    @JsonProperty("clanPoints")
    public void setClanPoints(Integer clanPoints) {
        this.clanPoints = clanPoints;
    }

    @JsonProperty("clanBuilderBasePoints")
    public Integer getClanBuilderBasePoints() {
        return clanBuilderBasePoints;
    }

    @JsonProperty("clanBuilderBasePoints")
    public void setClanBuilderBasePoints(Integer clanBuilderBasePoints) {
        this.clanBuilderBasePoints = clanBuilderBasePoints;
    }

    @JsonProperty("clanCapitalPoints")
    public Integer getClanCapitalPoints() {
        return clanCapitalPoints;
    }

    @JsonProperty("clanCapitalPoints")
    public void setClanCapitalPoints(Integer clanCapitalPoints) {
        this.clanCapitalPoints = clanCapitalPoints;
    }

    @JsonProperty("capitalLeague")
    public CapitalLeague getCapitalLeague() {
        return capitalLeague;
    }

    @JsonProperty("capitalLeague")
    public void setCapitalLeague(CapitalLeague capitalLeague) {
        this.capitalLeague = capitalLeague;
    }

    @JsonProperty("requiredTrophies")
    public Integer getRequiredTrophies() {
        return requiredTrophies;
    }

    @JsonProperty("requiredTrophies")
    public void setRequiredTrophies(Integer requiredTrophies) {
        this.requiredTrophies = requiredTrophies;
    }

    @JsonProperty("warFrequency")
    public String getWarFrequency() {
        return warFrequency;
    }

    @JsonProperty("warFrequency")
    public void setWarFrequency(String warFrequency) {
        this.warFrequency = warFrequency;
    }

    @JsonProperty("warWinStreak")
    public Integer getWarWinStreak() {
        return warWinStreak;
    }

    @JsonProperty("warWinStreak")
    public void setWarWinStreak(Integer warWinStreak) {
        this.warWinStreak = warWinStreak;
    }

    @JsonProperty("warWins")
    public Integer getWarWins() {
        return warWins;
    }

    @JsonProperty("warWins")
    public void setWarWins(Integer warWins) {
        this.warWins = warWins;
    }

    @JsonProperty("warTies")
    public Integer getWarTies() {
        return warTies;
    }

    @JsonProperty("warTies")
    public void setWarTies(Integer warTies) {
        this.warTies = warTies;
    }

    @JsonProperty("warLosses")
    public Integer getWarLosses() {
        return warLosses;
    }

    @JsonProperty("warLosses")
    public void setWarLosses(Integer warLosses) {
        this.warLosses = warLosses;
    }

    @JsonProperty("isWarLogPublic")
    public Boolean getIsWarLogPublic() {
        return isWarLogPublic;
    }

    @JsonProperty("isWarLogPublic")
    public void setIsWarLogPublic(Boolean isWarLogPublic) {
        this.isWarLogPublic = isWarLogPublic;
    }

    @JsonProperty("warLeague")
    public WarLeague getWarLeague() {
        return warLeague;
    }

    @JsonProperty("warLeague")
    public void setWarLeague(WarLeague warLeague) {
        this.warLeague = warLeague;
    }

    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
    }

    @JsonProperty("memberList")
    public List<Member> getMemberList() {
        return memberList;
    }

    @JsonProperty("memberList")
    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("requiredBuilderBaseTrophies")
    public Integer getRequiredBuilderBaseTrophies() {
        return requiredBuilderBaseTrophies;
    }

    @JsonProperty("requiredBuilderBaseTrophies")
    public void setRequiredBuilderBaseTrophies(Integer requiredBuilderBaseTrophies) {
        this.requiredBuilderBaseTrophies = requiredBuilderBaseTrophies;
    }

    @JsonProperty("requiredTownhallLevel")
    public Integer getRequiredTownhallLevel() {
        return requiredTownhallLevel;
    }

    @JsonProperty("requiredTownhallLevel")
    public void setRequiredTownhallLevel(Integer requiredTownhallLevel) {
        this.requiredTownhallLevel = requiredTownhallLevel;
    }

    @JsonProperty("clanCapital")
    public ClanCapital getClanCapital() {
        return clanCapital;
    }

    @JsonProperty("clanCapital")
    public void setClanCapital(ClanCapital clanCapital) {
        this.clanCapital = clanCapital;
    }

    @JsonProperty("chatLanguage")
    public ChatLanguage getChatLanguage() {
        return chatLanguage;
    }

    @JsonProperty("chatLanguage")
    public void setChatLanguage(ChatLanguage chatLanguage) {
        this.chatLanguage = chatLanguage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Clan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("isFamilyFriendly");
        sb.append('=');
        sb.append(((this.isFamilyFriendly == null)?"<null>":this.isFamilyFriendly));
        sb.append(',');
        sb.append("badgeUrls");
        sb.append('=');
        sb.append(((this.badgeUrls == null)?"<null>":this.badgeUrls));
        sb.append(',');
        sb.append("clanLevel");
        sb.append('=');
        sb.append(((this.clanLevel == null)?"<null>":this.clanLevel));
        sb.append(',');
        sb.append("clanPoints");
        sb.append('=');
        sb.append(((this.clanPoints == null)?"<null>":this.clanPoints));
        sb.append(',');
        sb.append("clanBuilderBasePoints");
        sb.append('=');
        sb.append(((this.clanBuilderBasePoints == null)?"<null>":this.clanBuilderBasePoints));
        sb.append(',');
        sb.append("clanCapitalPoints");
        sb.append('=');
        sb.append(((this.clanCapitalPoints == null)?"<null>":this.clanCapitalPoints));
        sb.append(',');
        sb.append("capitalLeague");
        sb.append('=');
        sb.append(((this.capitalLeague == null)?"<null>":this.capitalLeague));
        sb.append(',');
        sb.append("requiredTrophies");
        sb.append('=');
        sb.append(((this.requiredTrophies == null)?"<null>":this.requiredTrophies));
        sb.append(',');
        sb.append("warFrequency");
        sb.append('=');
        sb.append(((this.warFrequency == null)?"<null>":this.warFrequency));
        sb.append(',');
        sb.append("warWinStreak");
        sb.append('=');
        sb.append(((this.warWinStreak == null)?"<null>":this.warWinStreak));
        sb.append(',');
        sb.append("warWins");
        sb.append('=');
        sb.append(((this.warWins == null)?"<null>":this.warWins));
        sb.append(',');
        sb.append("warTies");
        sb.append('=');
        sb.append(((this.warTies == null)?"<null>":this.warTies));
        sb.append(',');
        sb.append("warLosses");
        sb.append('=');
        sb.append(((this.warLosses == null)?"<null>":this.warLosses));
        sb.append(',');
        sb.append("isWarLogPublic");
        sb.append('=');
        sb.append(((this.isWarLogPublic == null)?"<null>":this.isWarLogPublic));
        sb.append(',');
        sb.append("warLeague");
        sb.append('=');
        sb.append(((this.warLeague == null)?"<null>":this.warLeague));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("memberList");
        sb.append('=');
        sb.append(((this.memberList == null)?"<null>":this.memberList));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("requiredBuilderBaseTrophies");
        sb.append('=');
        sb.append(((this.requiredBuilderBaseTrophies == null)?"<null>":this.requiredBuilderBaseTrophies));
        sb.append(',');
        sb.append("requiredTownhallLevel");
        sb.append('=');
        sb.append(((this.requiredTownhallLevel == null)?"<null>":this.requiredTownhallLevel));
        sb.append(',');
        sb.append("clanCapital");
        sb.append('=');
        sb.append(((this.clanCapital == null)?"<null>":this.clanCapital));
        sb.append(',');
        sb.append("chatLanguage");
        sb.append('=');
        sb.append(((this.chatLanguage == null)?"<null>":this.chatLanguage));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
