package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import google.drive.pratice.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String type;
    private String location;

    public FileIndexed(FileIndex aggregate){
        super(aggregate);
    }
    public FileIndexed(){
        super();
    }
}
