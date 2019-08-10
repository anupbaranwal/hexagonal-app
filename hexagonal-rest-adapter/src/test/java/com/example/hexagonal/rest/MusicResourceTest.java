package com.example.hexagonal.rest;

import com.example.hexagonal.domain.model.MusicDto;
import com.example.hexagonal.domain.port.MusicRepository;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MusicResourceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MusicResourceTest {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  private MusicRepository musicRepository;

  private List<MusicDto> expectedMusics;

  @Before
  public void setUp() {
    expectedMusics = Arrays.asList(
        new MusicDto("Cardi B, straight stuntin", "Skepta", 4.2),
        new MusicDto("Whenever you feel like letting go and you’ve got your back against the wall",
            "Skepta", 4.2));
  }

  @Test
  public void testGetAllMusics() {
    //Given
    Mockito.when(musicRepository.getListOfMusic()).thenReturn(expectedMusics);

    //When
    ResponseEntity<List<MusicDto>> response = restTemplate.exchange(
        "http://localhost:" + port + "/api/v1/musics", HttpMethod.GET, null,
        new ParameterizedTypeReference<List<MusicDto>>() {
        });

    //Then
    Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    Assertions.assertThat(response.getBody()).isEqualTo(expectedMusics);
  }
}
