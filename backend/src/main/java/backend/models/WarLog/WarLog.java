
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "WarLog")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarLog {

    @Id
    @JsonProperty("clanTag")
    private String clanTag;

    @JsonProperty("items")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "warLogId")
    private List<Item> items;

    @JsonProperty("paging")
    //@JoinColumn(name = "paging_id", referencedColumnName = "id")
    //@OneToOne(cascade = CascadeType.ALL)
    private Paging paging;

    @JsonProperty("tag")
    public String getClanTag() {
        return clanTag;
    }

    @JsonProperty("tag")
    public void setClanTag(String clanTag) {
        this.clanTag = clanTag;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    @JsonProperty("paging")
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WarLog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("paging");
        sb.append('=');
        sb.append(((this.paging == null)?"<null>":this.paging));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
