
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BadgeUrls {

    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;
    @JsonProperty("medium")
    private String medium;

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BadgeUrls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("small");
        sb.append('=');
        sb.append(((this.small == null)?"<null>":this.small));
        sb.append(',');
        sb.append("large");
        sb.append('=');
        sb.append(((this.large == null)?"<null>":this.large));
        sb.append(',');
        sb.append("medium");
        sb.append('=');
        sb.append(((this.medium == null)?"<null>":this.medium));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
