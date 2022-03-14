package pers.chris.springdemo.common.base;

import lombok.Data;

@Data
public abstract class BaseQuery {

    protected Integer page;
    protected Integer size;
}
