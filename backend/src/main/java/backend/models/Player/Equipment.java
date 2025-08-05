
package backend.models.Player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Equipment {

    @JsonProperty("name")
    private String name;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("maxLevel")
    private Integer maxLevel;
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

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("maxLevel")
    public Integer getMaxLevel() {
        return maxLevel;
    }

    @JsonProperty("maxLevel")
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
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
        sb.append(Equipment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("maxLevel");
        sb.append('=');
        sb.append(((this.maxLevel == null)?"<null>":this.maxLevel));
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
