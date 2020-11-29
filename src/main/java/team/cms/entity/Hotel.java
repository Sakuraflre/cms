package team.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private int id;
    private int accountId;
    private String name;
    private String address;
    private String detail;
    private String telephone;
}
