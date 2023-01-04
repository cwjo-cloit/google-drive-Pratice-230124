package google.drive.pratice.domain;

import google.drive.pratice.domain.VideoProcessed;
import google.drive.pratice.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FileVideo_table")
@Data

public class FileVideo  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long fileId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String url;

    @PostPersist
    public void onPostPersist(){


        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();

    }

    public static FileVideoRepository repository(){
        FileVideoRepository fileVideoRepository = VideoProcessingApplication.applicationContext.getBean(FileVideoRepository.class);
        return fileVideoRepository;
    }




    public static void videoProcessing(FileUploaded fileUploaded){

        /** Example 1:  new item 
        FileVideo fileVideo = new FileVideo();
        repository().save(fileVideo);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(fileVideo->{
            
            fileVideo // do something
            repository().save(fileVideo);


         });
        */

        
    }


}
