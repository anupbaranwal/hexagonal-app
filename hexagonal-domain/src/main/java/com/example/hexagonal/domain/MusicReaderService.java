package com.example.hexagonal.domain;

import com.example.hexagonal.domain.model.MusicDto;
import com.example.hexagonal.domain.port.MusicReader;
import com.example.hexagonal.domain.port.MusicRepository;
import java.util.List;

public class MusicReaderService implements MusicReader {

  private MusicRepository musicRepository;

  public MusicReaderService(MusicRepository musicRepository) {
    this.musicRepository = musicRepository;
  }

  @Override
  public List<MusicDto> readMusic() {
    return musicRepository.getListOfMusic();
  }
}
