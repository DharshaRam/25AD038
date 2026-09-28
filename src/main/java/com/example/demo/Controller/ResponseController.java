package com.example.demo.Controller;

import com.example.demo.Models.Response;
import com.example.demo.Services.ResponseServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responses")
public class ResponseController {

    private final ResponseServices responseServices;

    public ResponseController(ResponseServices responseServices) {
        this.responseServices = responseServices;
    }

    @PostMapping
    public Response addResponse(@RequestBody Response response) {
        return responseServices.addResponse(response);
    }

    @GetMapping
    public List<Response> getAllResponses() {
        return responseServices.getAllResponses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getResponseById(@PathVariable Long id) {
        return responseServices.getResponseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}