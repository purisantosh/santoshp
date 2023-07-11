package com.example.demo.service;

import com.example.demo.entity.SubmissionDTO;

import java.util.List;

public interface SubmissionService {
    public SubmissionDTO getSubmissionById(String id);
    public SubmissionDTO addSubmission(SubmissionDTO submissionDTO);
    public SubmissionDTO modifySubmission(SubmissionDTO submissionDTO);
    public void deleteSubmission(String id);
    public List<SubmissionDTO> filterBySalesPerson(String salesPerson);
}
