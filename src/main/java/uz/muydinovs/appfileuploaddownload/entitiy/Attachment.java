package uz.muydinovs.appfileuploaddownload.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fileOriginalName; // pdp.jpg, inn.pdf

    private long size; //2048000

    private String contentType; //application/pdf, image/png

    //To save file into system
    private String name; //Papkani ichidan topish uchun unique name
}
