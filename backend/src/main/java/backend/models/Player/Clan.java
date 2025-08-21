
package backend.models.Player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class Clan {

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("clanLevel")
    private Integer clanLevel;

    @JsonProperty("badgeUrls")
    @Embedded
    private BadgeUrls badgeUrls;

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

    @JsonProperty("clanLevel")
    public Integer getClanLevel() {
        return clanLevel;
    }

    @JsonProperty("clanLevel")
    public void setClanLevel(Integer clanLevel) {
        this.clanLevel = clanLevel;
    }

    @JsonProperty("badgeUrls")
    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    @JsonProperty("badgeUrls")
    public void setBadgeUrls(BadgeUrls badgeUrls) {
        this.badgeUrls = badgeUrls;
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
        sb.append("clanLevel");
        sb.append('=');
        sb.append(((this.clanLevel == null)?"<null>":this.clanLevel));
        sb.append(',');
        sb.append("badgeUrls");
        sb.append('=');
        sb.append(((this.badgeUrls == null)?"<null>":this.badgeUrls));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
