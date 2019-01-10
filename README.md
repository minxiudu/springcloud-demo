# springcloud-demo
the popular springcloud plugin
SpringCloud常用项目练习

本地多端口启动cloud项目，启动时需配置启动参数：spring.profiles.active。值为各项目的端口号。
本地host映射：dmx  127.0.0.1
优先启动config-server项目，然后启动eureka-server项目。eureka-server读取config-server配置文件，config-server注册到eureka-server。
