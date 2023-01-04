package google.drive.pratice.infra;
import google.drive.pratice.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/fileInfos")
@Transactional
public class FileInfoController {
    @Autowired
    FileInfoRepository fileInfoRepository;




}
