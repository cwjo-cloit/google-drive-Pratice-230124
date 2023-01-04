package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import google.drive.pratice.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private Integer size;
    private String type;
    private Long userId;
}


