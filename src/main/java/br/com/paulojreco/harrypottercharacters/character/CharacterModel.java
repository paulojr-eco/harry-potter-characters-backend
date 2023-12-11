package br.com.paulojreco.harrypottercharacters.character;

import lombok.Data;

@Data
public class CharacterModel {
  private String image;
  private String name;
  private String dateOfBirth;
  private String house;
}
