package com.udaan.covid.service;

import com.udaan.covid.entity.SelfAssessment;
import com.udaan.covid.entity.User;
import com.udaan.covid.repository.AssessmentRepository;
import com.udaan.covid.repository.UserRepository;
import com.udaan.covid.vo.AssessmentResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AssessmentRepository assessmentRepository;

    public User createUser(User user){

        return userRepository.save(user);
    }

    public AssessmentResult assesUser(SelfAssessment selfAssessment){

        AssessmentResult assessmentResult =  new AssessmentResult();

        assessmentResult.setRiskPercentage(calculatePercentage(selfAssessment));

        assessmentRepository.save(selfAssessment);

        return assessmentResult;
    }


 /*   No symptoms, No travel history, No contact with covid positive patient - Risk = 5%
    Any one symptom, travel history or contact with covid positive patient is true - Risk = 50%
    Any two symptoms, travel history or contact with covid positive patient is true - Risk = 75%
    Greater than 2 symptoms, travel history or contact with covid positive patient is true - Risk = 95%*/

    private int calculatePercentage(SelfAssessment selfAssessment){


        String[] symptoms =  selfAssessment.getSymptoms().split(",");

        if(symptoms.length==0 && !selfAssessment.getTravelHistory() && !selfAssessment.getContactWithPatient()) {
            return 5;
        }else if( selfAssessment.getTravelHistory() || selfAssessment.getContactWithPatient()){
            switch (symptoms.length){
                case  1:
                    return 50;
                case  2:
                    return  75;
                default:
                    return 95;
            }
        }

        return 10;
    }

}
