package com.LMSbackend.LMS_backendApplication.Service;

import com.LMSbackend.LMS_backendApplication.Enums.CardStatus;
import com.LMSbackend.LMS_backendApplication.Models.Card;
import com.LMSbackend.LMS_backendApplication.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public Card createCard(Student student){

        Card newCard = new Card();

        // for new foreign key colum in card table(card class)
        // set StudentInfo for unidirectional
        // enum card status --> ACTIVATED
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student); //For that new foreign key column

        return newCard;
    }
}
