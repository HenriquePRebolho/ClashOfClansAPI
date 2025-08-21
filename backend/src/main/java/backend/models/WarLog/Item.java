
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Item")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    @Id
    @Setter
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @JsonProperty("result")
    private String result;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("teamSize")
    private Integer teamSize;
    @JsonProperty("attacksPerMember")
    private Integer attacksPerMember;
    @JsonProperty("battleModifier")
    private String battleModifier;

    @JsonProperty("clan")
    @Embedded
    @AttributeOverride(name = "tag", column = @Column(name = "clan_tag"))
    @AttributeOverride(name = "name", column = @Column(name = "clan_name"))
    @AttributeOverride(name = "clanLevel", column = @Column(name = "clan_level"))
    @AttributeOverride(name = "stars", column = @Column(name = "clan_stars"))
    @AttributeOverride(name = "destructionPercentage", column = @Column(name = "clan_destruction_percentage"))
    private Clan clan;

    @JsonProperty("opponent")
    @Embedded
    @AttributeOverride(name = "tag", column = @Column(name = "opponent_id"))
    @AttributeOverride(name = "name", column = @Column(name = "opponent_name"))
    @AttributeOverride(name = "clanLevel", column = @Column(name = "opponent_clan_level"))
    @AttributeOverride(name = "stars", column = @Column(name = "opponent_stars"))
    @AttributeOverride(name = "destructionPercentage", column = @Column(name = "opponent_destruction_percentage"))
    private Opponent opponent;

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("teamSize")
    public Integer getTeamSize() {
        return teamSize;
    }

    @JsonProperty("teamSize")
    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    @JsonProperty("attacksPerMember")
    public Integer getAttacksPerMember() {
        return attacksPerMember;
    }

    @JsonProperty("attacksPerMember")
    public void setAttacksPerMember(Integer attacksPerMember) {
        this.attacksPerMember = attacksPerMember;
    }

    @JsonProperty("battleModifier")
    public String getBattleModifier() {
        return battleModifier;
    }

    @JsonProperty("battleModifier")
    public void setBattleModifier(String battleModifier) {
        this.battleModifier = battleModifier;
    }

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @JsonProperty("opponent")
    public Opponent getOpponent() {
        return opponent;
    }

    @JsonProperty("opponent")
    public void setOpponent(Opponent opponent) {
        this.opponent = opponent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("teamSize");
        sb.append('=');
        sb.append(((this.teamSize == null)?"<null>":this.teamSize));
        sb.append(',');
        sb.append("attacksPerMember");
        sb.append('=');
        sb.append(((this.attacksPerMember == null)?"<null>":this.attacksPerMember));
        sb.append(',');
        sb.append("battleModifier");
        sb.append('=');
        sb.append(((this.battleModifier == null)?"<null>":this.battleModifier));
        sb.append(',');
        sb.append("clan");
        sb.append('=');
        sb.append(((this.clan == null)?"<null>":this.clan));
        sb.append(',');
        sb.append("opponent");
        sb.append('=');
        sb.append(((this.opponent == null)?"<null>":this.opponent));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
