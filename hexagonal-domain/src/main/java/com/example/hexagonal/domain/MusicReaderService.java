package com.example.hexagonal.domain;

import com.example.hexagonal.domain.port.MusicRepository;
import com.example.hexagonal.domain.port.MusicReader;
import java.util.List;

public class MusicReaderService implements MusicReader {

  private MusicRepository musicRepository;

  public MusicReaderService(MusicRepository musicRepository) {
    this.musicRepository = musicRepository;
  }

  @Override
  public List<String> readMusic() {
    return musicRepository.getListOfMusic();
  }
}
