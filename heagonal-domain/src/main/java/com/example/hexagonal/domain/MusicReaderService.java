package com.example.hexagonal.domain;

import com.example.hexagonal.domain.port.HardcodedAdapter;
import com.example.hexagonal.domain.port.MusicReader;
import java.util.List;

public class MusicReaderService implements MusicReader {

  private HardcodedAdapter hardcodedAdapter;

  public MusicReaderService(HardcodedAdapter hardcodedAdapter) {
    this.hardcodedAdapter = hardcodedAdapter;
  }

  @Override
  public List<String> readMusic() {
    return hardcodedAdapter.getListOfMusic();
  }
}
