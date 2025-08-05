
package backend.models.Clan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IconUrls {

    @JsonProperty("small")
    private String small;
    @JsonProperty("tiny")
    private String tiny;
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

    @JsonProperty("tiny")
    public String getTiny() {
        return tiny;
    }

    @JsonProperty("tiny")
    public void setTiny(String tiny) {
        this.tiny = tiny;
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
        sb.append(IconUrls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("small");
        sb.append('=');
        sb.append(((this.small == null)?"<null>":this.small));
        sb.append(',');
        sb.append("tiny");
        sb.append('=');
        sb.append(((this.tiny == null)?"<null>":this.tiny));
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
