package com.a1dnan.demospringcloudstreamskafka.entities;

import lombok.*;

import java.util.Date;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}