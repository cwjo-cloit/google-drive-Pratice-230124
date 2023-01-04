package google.drive.pratice.domain;

import google.drive.pratice.domain.FileIndexed;
import google.drive.pratice.IndexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FileIndex_table")
@Data

public class FileIndex  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long fileId;
    
    
    
    @ElementCollection
    
    private List<String> keyword;
    
    
    
    
    
    private String location;

    @PostPersist
    public void onPostPersist(){


        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();

    }

    public static FileIndexRepository repository(){
        FileIndexRepository fileIndexRepository = IndexerApplication.applicationContext.getBean(FileIndexRepository.class);
        return fileIndexRepository;
    }






}
