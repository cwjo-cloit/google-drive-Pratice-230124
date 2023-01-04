package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import google.drive.pratice.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;

    public VideoProcessed(FileVideo aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
