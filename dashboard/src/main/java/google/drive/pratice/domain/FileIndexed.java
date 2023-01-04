package google.drive.pratice.domain;

import google.drive.pratice.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String type;
    private String location;
}
