package com.ElastiSearch.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ElastiSearch.model.Song;
public interface SongService{

	List<Song> findByTitle(String artist);


}