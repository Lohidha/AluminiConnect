package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.MentorshipRequest;

public interface MentorshipService {

    MentorshipRequest addMentorship(MentorshipRequest mentorship);

    MentorshipRequest updateMentorship(MentorshipRequest mentorship);

    void deleteMentorship(int requestId);

    MentorshipRequest getMentorshipById(int requestId);

    List<MentorshipRequest> getAllMentorships();

}