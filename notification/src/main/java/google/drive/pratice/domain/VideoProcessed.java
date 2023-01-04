package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import google.drive.pratice.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}


