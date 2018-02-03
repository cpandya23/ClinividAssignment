
package be.example;

import java.util.HashMap;
import java.util.Map;
//import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "long",
    "lat"
})
public class Coords {

    @JsonProperty("long")
    private Double longi;
    @JsonProperty("lat")
    private Double lat;
    

    @JsonProperty("long")
    public Double getLong() {
        return longi;
    }

    @JsonProperty("long")
    public void setLong(Double longi) {
        this.longi = longi;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

  

}
