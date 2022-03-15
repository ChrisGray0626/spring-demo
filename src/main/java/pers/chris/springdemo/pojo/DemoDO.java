package pers.chris.springdemo.pojo;

import lombok.Data;
import pers.chris.springdemo.common.base.BaseDO;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
@Data
public class DemoDO extends BaseDO {

    private String name;
}
