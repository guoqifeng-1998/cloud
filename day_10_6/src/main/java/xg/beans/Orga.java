package xg.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class Orga implements Serializable {
    Integer id;
    String name;
    Orga parentOrga;
    String location;
    String orga_number;
    String ext;
}