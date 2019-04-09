package com.elasticsearch.demo.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elasticsearch.demo.entity.Commodity;

@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String> {

}