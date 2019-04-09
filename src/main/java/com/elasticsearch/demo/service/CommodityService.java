package com.elasticsearch.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.elasticsearch.demo.entity.Commodity;

public interface CommodityService {

    long count();

    Commodity save(Commodity commodity);

    void delete(Commodity commodity);

    Iterable<Commodity> getAll();

    List<Commodity> getByName(String name);

    Page<Commodity> pageQuery(Integer pageNo, Integer pageSize, String kw);

}
