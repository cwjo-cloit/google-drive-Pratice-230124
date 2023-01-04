package google.drive.pratice.infra;
import google.drive.pratice.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FileVideoHateoasProcessor implements RepresentationModelProcessor<EntityModel<FileVideo>>  {

    @Override
    public EntityModel<FileVideo> process(EntityModel<FileVideo> model) {

        
        return model;
    }
    
}
