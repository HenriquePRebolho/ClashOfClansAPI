
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class Opponent {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("badgeUrls")
    @Embedded
    @AttributeOverride(name = "small", column = @Column(name = "opponent_small_badgeUrls"))
    @AttributeOverride(name = "medium", column = @Column(name = "opponent_medium_badgeUrls"))
    @AttributeOverride(name = "large", column = @Column(name = "opponent_large_badgeUrls"))
    private BadgeUrls__1 badgeUrls;
    @JsonProperty("clanLevel")
    private Integer clanLevel;
    @JsonProperty("stars")
    private Integer stars;
    @JsonProperty("destructionPercentage")
    private Double destructionPercentage;

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
    public BadgeUrls__1 getBadgeUrls() {
        return badgeUrls;
    }

    @JsonProperty("badgeUrls")
    public void setBadgeUrls(BadgeUrls__1 badgeUrls) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Opponent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("stars");
        sb.append('=');
        sb.append(((this.stars == null)?"<null>":this.stars));
        sb.append(',');
        sb.append("destructionPercentage");
        sb.append('=');
        sb.append(((this.destructionPercentage == null)?"<null>":this.destructionPercentage));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
