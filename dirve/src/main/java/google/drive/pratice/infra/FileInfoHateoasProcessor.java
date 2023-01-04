package google.drive.pratice.infra;
import google.drive.pratice.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FileInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<FileInfo>>  {

    @Override
    public EntityModel<FileInfo> process(EntityModel<FileInfo> model) {

        
        return model;
    }
    
}
