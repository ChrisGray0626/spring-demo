# 项目说明

- 个人 Spring 项目模板

# 技术说明

- 持久层：JPA

## 集成依赖

- swagger
- lombok
- mapstruct
- snakeyaml
- commons-lang3
- hutool

# 功能描述

## 跨域处理

- 配置 `CorsConfig`

## Swagger中token验证配置

- 配置 `SwaggerConfig` 的 `securityContexts`、`securitySchemes`，开启安全验证

## 静态资源映射

- 配置 `ResourceHandlerConfig` 的 `addResourceHandler`、`addResourceLocations`，形成映射关系

## 统一返回值处理

- 配置 `GlobalResponseAdvice`，统一包装、返回数据

## 统一异常处理

- 配置 `GlobalExceptionHandler`，统一处理、返回异常

## 拦截器配置

- 编写具体拦截方法，参考 `InterceptorTemplate` 的 `preHandle`
- 配置 `InterceptorConfig` 的 `addInterceptors`，添加指定拦截器的指定拦截路径

## 启动后的前置任务配置

- 编写 `PreTask` 的 `run`

## 非 Web 项目运行

- 编写 `NoWebApplication` 的 `run`
- 可移除依赖 `spring-boot-starter-web`

## 通用CRUD

- 编写 `Enitity`、`Repo`、`Service`、`Controller` 的基类与通用方法
- 继承基类实现通用方法

## 通用条件查询

- 配置CriteriaQueryWrapper、CriteriaQueryUtil，快速构建自定义条件查询

## 通用 Http 请求

- 构建 `HttpWrapper`，使用 `request`，实现通用化参数包装与请求
- 使用特定方法，参照 `doGet` 实现特定请求

## Bean映射

- 编写 `Mapper`，参照 `MapperTemplate`，实现符合MapStruct规范的转换接口

## Application.yml切换

- 配置 `pom.xml` 中的 `profile` 标签指向不同配置文件
- 编写指定的配置文件
- 通过 `Maven` 的 `Profiles` 实现自由切换
