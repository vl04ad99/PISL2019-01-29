package logic;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Address", propOrder = {
        "actualCity",
        "actualAddress",
        "releaseCity",
        "releaseAddress"
})
@Embeddable
@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Address {
    @Enumerated(EnumType.STRING)
    private City actualCity;
    private String actualAddress;
    @Enumerated(EnumType.STRING)
    private City releaseCity;
    private String releaseAddress;
}
