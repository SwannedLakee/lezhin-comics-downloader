package io.github.imsejin.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Episode {

    private String name;
    private Display display;
    private Properties properties;
    private int coin;
    private int point;
    private long updatedAt;
    private long freedAt;
    private int seq;
    private long publishedAt;
    private long id;

}
