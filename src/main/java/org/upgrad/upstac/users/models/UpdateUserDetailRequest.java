package org.upgrad.upstac.users.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class UpdateUserDetailRequest {

    @ApiModelProperty(example = "MK")
    private String firstName;


    @ApiModelProperty(example = "Gandhi")
    private String lastName;

    @ApiModelProperty(example = "newuser@upgrad.com")
    private String email="";

    @ApiModelProperty(example = "+91956567687")
    private String phoneNumber="";

}
