package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import google.drive.pratice.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private Integer size;
    private String type;
    private Long userId;

    public FileUploaded(FileInfo aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
