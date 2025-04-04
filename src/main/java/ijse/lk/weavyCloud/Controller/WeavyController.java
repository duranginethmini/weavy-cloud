package ijse.lk.weavyCloud.Controller;

import ijse.lk.weavyCloud.Sevice.WeavyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weavy/users")
public class WeavyController {

    @Autowired
    private WeavyUserService userService;

    @PostMapping
    public String createUser(@RequestBody String userJson) throws Exception {
        return userService.createUser(userJson);
    }
}