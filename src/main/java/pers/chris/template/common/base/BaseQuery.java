package pers.chris.template.common.base;

import lombok.Data;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 通用Query
 */

@Data
public abstract class BaseQuery {

    protected Integer page;
    protected Integer size;
}
