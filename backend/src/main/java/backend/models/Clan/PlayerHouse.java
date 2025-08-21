
package backend.models.Clan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class PlayerHouse {
    @JsonProperty("elements")
    @ElementCollection
    @CollectionTable(name = "playerhouse_elements",
            joinColumns = @JoinColumn(name = "member_tag"))
    @AttributeOverride(name = "id", column = @Column(name = "element_id"))
    private List<Element> elements;

    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerHouse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elements");
        sb.append('=');
        sb.append(((this.elements == null)?"<null>":this.elements));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
