package com.ElastiSearch.service;


import com.ElastiSearch.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService, ElasticsearchRepository<Song, String> {

    private SongService songRepository;

	@Autowired
    public void setBookRepository(SongService songRepository) {
        this.songRepository = songRepository;
    }

	
    public Song save(Song song) {
        return songRepository.save(song);
    }

    public void delete(Song song) {
    	songRepository.delete(song);
    }


    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }

    public List<Song> findByTitle(String title) {
        return songRepository.findByTitle(title);
    }


	@Override
	public Iterable<Song> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Song> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Song> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Song> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<Song> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Song> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Page<Song> searchSimilar(Song entity, String[] fields, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}




}