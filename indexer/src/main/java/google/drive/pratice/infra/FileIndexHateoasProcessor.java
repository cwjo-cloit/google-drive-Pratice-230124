package google.drive.pratice.infra;
import google.drive.pratice.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FileIndexHateoasProcessor implements RepresentationModelProcessor<EntityModel<FileIndex>>  {

    @Override
    public EntityModel<FileIndex> process(EntityModel<FileIndex> model) {

        
        return model;
    }
    
}
