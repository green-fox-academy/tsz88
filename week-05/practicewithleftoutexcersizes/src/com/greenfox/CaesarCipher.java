package com.greenfox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaesarCipher {

  public static void encryptTheCode(){
    Path path = Paths.get("caesar.txt");
    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    } catch (IOException x){
    }

    List<Character> alphabet = new ArrayList<>();
    alphabet = (Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','[',']', ',','-', '.', '/', '*', '+'));

    int shift = -1;
    List<String> decodedMessage = new ArrayList<>();
    int index = 0;
    String currentLine = "";

    for (int row = 0; row < lines.size(); row++){
      for (int letter = 0; letter < lines.get(row).length(); letter++){

        if (lines.get(row).charAt(letter) == ' '){
          currentLine += " ";
        } else try{
        index = alphabet.indexOf(lines.get(row).charAt(letter));
        currentLine += (String.valueOf(alphabet.get(index + shift)));
      } catch (ArrayIndexOutOfBoundsException x){
        }
      }
      decodedMessage.add(row,currentLine);
      currentLine = "";
    }

    System.out.println(decodedMessage);

  }
}
