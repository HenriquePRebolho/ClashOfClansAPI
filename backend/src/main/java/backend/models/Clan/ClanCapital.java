
package backend.models.Clan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClanCapital {

    @JsonProperty("capitalHallLevel")
    private Integer capitalHallLevel;
    @JsonProperty("districts")
    private List<District> districts;

    @JsonProperty("capitalHallLevel")
    public Integer getCapitalHallLevel() {
        return capitalHallLevel;
    }

    @JsonProperty("capitalHallLevel")
    public void setCapitalHallLevel(Integer capitalHallLevel) {
        this.capitalHallLevel = capitalHallLevel;
    }

    @JsonProperty("districts")
    public List<District> getDistricts() {
        return districts;
    }

    @JsonProperty("districts")
    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClanCapital.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("capitalHallLevel");
        sb.append('=');
        sb.append(((this.capitalHallLevel == null)?"<null>":this.capitalHallLevel));
        sb.append(',');
        sb.append("districts");
        sb.append('=');
        sb.append(((this.districts == null)?"<null>":this.districts));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
