
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clan {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("badgeUrls")
    private BadgeUrls badgeUrls;
    @JsonProperty("clanLevel")
    private Integer clanLevel;
    @JsonProperty("attacks")
    private Integer attacks;
    @JsonProperty("stars")
    private Integer stars;
    @JsonProperty("destructionPercentage")
    private Double destructionPercentage;
    @JsonProperty("expEarned")
    private Integer expEarned;

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

    @JsonProperty("attacks")
    public Integer getAttacks() {
        return attacks;
    }

    @JsonProperty("attacks")
    public void setAttacks(Integer attacks) {
        this.attacks = attacks;
    }

    @JsonProperty("stars")
    public Integer getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @JsonProperty("destructionPercentage")
    public Double getDestructionPercentage() {
        return destructionPercentage;
    }

    @JsonProperty("destructionPercentage")
    public void setDestructionPercentage(Double destructionPercentage) {
        this.destructionPercentage = destructionPercentage;
    }

    @JsonProperty("expEarned")
    public Integer getExpEarned() {
        return expEarned;
    }

    @JsonProperty("expEarned")
    public void setExpEarned(Integer expEarned) {
        this.expEarned = expEarned;
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
        sb.append("badgeUrls");
        sb.append('=');
        sb.append(((this.badgeUrls == null)?"<null>":this.badgeUrls));
        sb.append(',');
        sb.append("clanLevel");
        sb.append('=');
        sb.append(((this.clanLevel == null)?"<null>":this.clanLevel));
        sb.append(',');
        sb.append("attacks");
        sb.append('=');
        sb.append(((this.attacks == null)?"<null>":this.attacks));
        sb.append(',');
        sb.append("stars");
        sb.append('=');
        sb.append(((this.stars == null)?"<null>":this.stars));
        sb.append(',');
        sb.append("destructionPercentage");
        sb.append('=');
        sb.append(((this.destructionPercentage == null)?"<null>":this.destructionPercentage));
        sb.append(',');
        sb.append("expEarned");
        sb.append('=');
        sb.append(((this.expEarned == null)?"<null>":this.expEarned));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
