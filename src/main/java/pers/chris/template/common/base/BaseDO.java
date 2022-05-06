package pers.chris.template.common.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 通用DO
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Where(clause = "is_deleted!=true")
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseDO implements Serializable {

    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private LocalDateTime createTime;
    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private LocalDateTime updateTime;
    @ApiModelProperty("删除状态")
    @Column(columnDefinition = "boolean DEFAULT false")
    private Boolean isDeleted;
}
