package com.example.hexagonal.infra.dao;

import com.example.hexagonal.infra.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicDao extends JpaRepository<Music, Long>
{

}
