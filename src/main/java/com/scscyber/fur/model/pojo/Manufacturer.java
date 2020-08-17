package com.scscyber.fur.model.pojo;

import com.apple.eawt.AppEvent;
import lombok.Data;

@Data
public class Manufacturer {
    private int manufacturerId;
    private String manufacturerName;
    private String address;
    private String country;
    private String city;

}
