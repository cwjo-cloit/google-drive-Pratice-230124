package google.drive.pratice.domain;

import google.drive.pratice.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String FileName;
    private Integer size;
    private String type;
    private Long userId;
}
