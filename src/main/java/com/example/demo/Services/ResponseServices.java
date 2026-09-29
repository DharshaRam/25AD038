package com.example.demo.Services;

import com.example.demo.Models.Response;
import com.example.demo.Repository.ResponseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseServices {

    private final ResponseRepository responseRepository;

    public ResponseServices(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    public Response addResponse(Response response) {
        return responseRepository.save(response);
    }

    public List<Response> getAllResponses() {
        return responseRepository.findAll();
    }

    public Optional<Response> getResponseById(Long id) {
        return responseRepository.findById(id);
    }

    public Response updateResponse(Long id, Response response) {

        Response existing = responseRepository.findById(id).get();

        existing.setStudentId(response.getStudentId());
        existing.setRating(response.getRating());

        return responseRepository.save(existing);
    }

    public void deleteResponse(Long id) {

        responseRepository.deleteById(id);
    }
}