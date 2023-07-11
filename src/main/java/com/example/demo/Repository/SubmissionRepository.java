package com.example.demo.Repository;

import com.example.demo.entity.SubmissionDTO;

import java.util.List;

public interface SubmissionRepository {
    public SubmissionDTO getSubmissionById(String id);
    public SubmissionDTO addSubmission(SubmissionDTO submissionDTO);
    public SubmissionDTO modifySubmission(SubmissionDTO submissionDTO);
    public void deleteSubmission(String id);
    public List<SubmissionDTO> filterBySalesPerson(String salesPerson);
}
