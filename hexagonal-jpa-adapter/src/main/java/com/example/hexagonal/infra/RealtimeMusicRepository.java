package com.example.hexagonal.infra;

import com.example.hexagonal.domain.port.MusicRepository;
import com.example.hexagonal.infra.dao.MusicDao;
import com.example.hexagonal.infra.entity.Music;

import java.util.List;
import java.util.stream.Collectors;

public class RealtimeMusicRepository implements MusicRepository {

    private MusicDao musicDao;

    public RealtimeMusicRepository(MusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public List<String> getListOfMusic() {
        List<Music> musics = musicDao.findAll();
        return musics.stream().map(Music::getLyrics).collect(Collectors.toList());
    }
}

