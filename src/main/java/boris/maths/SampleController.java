package boris.maths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

@Autowired
private MathService mathService;
	
@PostMapping("/")
public Result getAdditionResult(@RequestParam(name="no1") int no1,@RequestParam(name="no2") int no2 ) {
	
	Result result = mathService.doAddition(no1, no2);
	return result;
	
}

}
