package com.example.hexagonal.domain.port;

import java.util.List;

public interface MusicRepository {
  List<String> getListOfMusic();
}
