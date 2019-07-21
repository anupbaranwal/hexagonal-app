package com.example.hexagonal.domain.port;

import com.example.hexagonal.domain.model.MusicDto;

import java.util.List;

public interface MusicRepository {
  List<MusicDto> getListOfMusic();
}
