package com.elasticsearch.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "commodity")
public class Commodity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7741156067676667818L;

    @Id
    private String skuId;

    private String name;

    private String category;

    private Integer price;

    private String brand;

    private Integer stock;

}
