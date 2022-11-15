package com.ElastiSearch.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;



@Document(indexName = "musicsong",createIndex = true)
//@Setting(settingPath = "static/es-settings.json")
public class Song {
    @Id
	private String id;
    private List<String> title,artist,description;
    private Integer year;
    
	public Song() {
		super();
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", title=" + title + ", artist=" + artist + ", description=" + description + ", year="
				+ year + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getTitle() {
		return title;
	}

	public void setTitle(List<String> title) {
		this.title = title;
	}

	public List<String> getArtist() {
		return artist;
	}

	public void setArtist(List<String> artist) {
		this.artist = artist;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Song(List<String> title, List<String> artist, List<String> description, Integer year) {
		super();
		this.title = title;
		this.artist = artist;
		this.description = description;
		this.year = year;
	}

	public Song(String id, List<String> title, List<String> artist, List<String> description, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.description = description;
		this.year = year;
	}
	
    
    
}
