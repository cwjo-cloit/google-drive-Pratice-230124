package google.drive.pratice.domain;

import google.drive.pratice.domain.FileUploaded;
import google.drive.pratice.DirveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FileInfo_table")
@Data

public class FileInfo  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String fileName;
    
    
    
    
    
    private Integer size;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private Long userId;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static FileInfoRepository repository(){
        FileInfoRepository fileInfoRepository = DirveApplication.applicationContext.getBean(FileInfoRepository.class);
        return fileInfoRepository;
    }






}
