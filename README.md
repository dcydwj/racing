# SEDA Java implementation --- racing

### java实现的 **seda** 架构

* 与spring-boot完美集成，简单易用
* 核心实现不依赖任何容器，可随意在各种项目中集成
* 依赖 java8


### 集群拓扑结构管理
![管理面板](dash.png)
* 项目依赖 racing-boot 子项目
* 管理地址：http://localhost:8080/

### 详细使用参考 racing-demo 子项目
```
@Component
public class DemoStage extends Stage<String> {

    private ArrayList<Handler<String>> outputHandlers = Lists.newArrayList();

    public DemoStage() {
        super("DemoStage");
        outputHandlers.add(new OutputHandler<String>());
    }

    @PostConstruct
    public void init() {
        setSink(new UuidSink(2000));
        setDecoder(new StringDecoder());
        setHandlers(outputHandlers);
    }
}

```

### SEDA
[Matthew David Welsh--An Architecture for Highly Concurrent](http://www.eecs.harvard.edu/~mdw/papers/mdw-phdthesis.pdf)
