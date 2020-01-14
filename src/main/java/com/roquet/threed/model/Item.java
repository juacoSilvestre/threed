package com.roquet.threed.model;

import java.io.Serializable;

public abstract class Item extends BaseEntity implements Serializable {
    private String name;
    private String description;
    private String code;
    private float price;

}
