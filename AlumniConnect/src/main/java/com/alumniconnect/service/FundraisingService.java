package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Fundraising;

public interface FundraisingService {

    Fundraising addFundraising(Fundraising fundraising);

    Fundraising updateFundraising(Fundraising fundraising);

    void deleteFundraising(int fundId);

    Fundraising getFundraisingById(int fundId);

    List<Fundraising> getAllFundraisings();

}