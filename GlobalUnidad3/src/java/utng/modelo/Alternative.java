/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "alternative")
public class Alternative implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_alternative")
    private Long idAlternative;
    @Column(name = "text", length = 10)
    private String text;
    @Column(length = 15)
     private String correct;

    @ManyToOne
    @JoinColumn(name = "id_question")
    private QuestionDet questionDet;

    public Alternative() {
        this.idAlternative=0L;
    }

    public Long getIdAlternative() {
        return idAlternative;
    }

    public void setIdAlternative(Long idAlternative) {
        this.idAlternative = idAlternative;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public QuestionDet getQuestionDet() {
        return questionDet;
    }

    public void setQuestionDet(QuestionDet questionDet) {
        this.questionDet = questionDet;
    }

    
    
    
    

    
     
}//final
