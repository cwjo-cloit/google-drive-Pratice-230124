package google.drive.pratice.domain;

import google.drive.pratice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="fileInfos", path="fileInfos")
public interface FileInfoRepository extends PagingAndSortingRepository<FileInfo, Long>{

}
