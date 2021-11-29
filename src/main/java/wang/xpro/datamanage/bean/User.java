package wang.xpro.datamanage.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@ApiModel(description="用户实体")
public class User {

    @NotNull
    @ApiModelProperty("用户id")
    private Long id;

    @NotNull
    @Size(min = 2, max = 12)
    @ApiModelProperty("唯一用户名")
    private String accountName;


    @ApiModelProperty("用户昵称")
    private String nickName;

    @NotNull
    @Email
    @ApiModelProperty("用户email")
    private String email;

    @ApiModelProperty("用户手机号")
    private String phone;

    @ApiModelProperty("用户头像Url")
    private String gravatarUri;


    @Max(150)
    @Min(0)
    @ApiModelProperty("用户年龄")
    private Integer age;

    @NotNull
    @ApiModelProperty("用户密码")
    private String password;
}
