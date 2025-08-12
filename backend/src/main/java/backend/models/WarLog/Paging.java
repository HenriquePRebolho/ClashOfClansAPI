
package backend.models.WarLog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Paging")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Paging {

    @JsonProperty("cursors")
    private Cursors cursors;

    @JsonProperty("cursors")
    public Cursors getCursors() {
        return cursors;
    }

    @JsonProperty("cursors")
    public void setCursors(Cursors cursors) {
        this.cursors = cursors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Paging.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cursors");
        sb.append('=');
        sb.append(((this.cursors == null)?"<null>":this.cursors));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
