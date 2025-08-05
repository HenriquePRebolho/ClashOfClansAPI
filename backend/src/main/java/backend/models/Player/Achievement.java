
package backend.models.Player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Achievement {

    @JsonProperty("name")
    private String name;
    @JsonProperty("stars")
    private Integer stars;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("target")
    private Integer target;
    @JsonProperty("info")
    private String info;
    @JsonProperty("completionInfo")
    private String completionInfo;
    @JsonProperty("village")
    private String village;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stars")
    public Integer getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("target")
    public Integer getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Integer target) {
        this.target = target;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("completionInfo")
    public String getCompletionInfo() {
        return completionInfo;
    }

    @JsonProperty("completionInfo")
    public void setCompletionInfo(String completionInfo) {
        this.completionInfo = completionInfo;
    }

    @JsonProperty("village")
    public String getVillage() {
        return village;
    }

    @JsonProperty("village")
    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Achievement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("stars");
        sb.append('=');
        sb.append(((this.stars == null)?"<null>":this.stars));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("completionInfo");
        sb.append('=');
        sb.append(((this.completionInfo == null)?"<null>":this.completionInfo));
        sb.append(',');
        sb.append("village");
        sb.append('=');
        sb.append(((this.village == null)?"<null>":this.village));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
