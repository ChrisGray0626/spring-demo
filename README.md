# 项目说明

- 个人Spring项目模板

# 技术说明

- 持久层：JPA

- 集成插件：swagger、lombok、mapstruct

# 功能描述

## 跨域处理

- 配置CorsConfig

## Swagger中token验证配置

- 配置SwaggerConfig的securityContexts、securitySchemes，开启安全验证

## 静态资源映射

- 配置ResourceHandlerConfigurer的addResourceHandler、addResourceLocations，形成映射关系

## 统一返回值处理

- 配置GlobalResponseAdvice，统一包装、返回数据

## 统一异常处理

- 配置GlobalExceptionHandler，统一处理、返回异常

## 启动后初始化任务配置

- 配置InitApplicationRunner，实现初始化任务运行

## 通用CRUD

- 编写DO、Repo、Service、Controller的基类与通用方法
- 继承基类实现通用方法

## 通用条件查询

- 配置CriteriaQueryWrapper、CriteriaQueryUtil，快速构建自定义条件查询

## Bean映射

- 编写所需的BeanMapper，实现符合MapStruct规范的转换接口

## Application.yml切换

- 配置pom.xml中的profile标签指向不同配置文件
- 编写指定的配置文件
- 通过Maven的Profiles实现自由切换

## 统一HTTP访问

// TODO
