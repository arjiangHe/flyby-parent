# spring cloud + spring boot2.0 搭建起来的一个项目
其中：
common-db 数据库相关的一些配置 例如mysql ,redis, mongodb, 服务需要操作数据库的时候可以引用这个包
common-lib 提供一些基础的工具类， 枚举， 自定义异常相关的通用方法
common-model 数据库对应的model 和 业务接口的请求参数，返回参数可以放在这里面
config-server 配置中心，主要作用是获取git上的相关配置文档
eureka 注册中心


corp-user / tmc ... 都是微服务的服务提供者 服务与服务之间的调用spring cloud 采用的是rest api方式，有ribbon 和fegin 两种模式


