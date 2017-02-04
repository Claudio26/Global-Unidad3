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
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity @Table(name= "questionDet")
public class QuestionDet implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_question", length=10)
    private Long idQuestion;
    @Column(length = 30)
    private String examId;
    @Column(length = 30)
    private String text;
    @Column(length = 30)
      private String url;
     @Column(length = 30)
      private String explonation;
      @Column(length = 30)
      private String mark;
       @Column(length = 30)
      private String isMultiSelect;
        @Column(length = 30)
      private String startSecond;
    
     public QuestionDet(){
        this.idQuestion= 0L;
    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExplonation() {
        return explonation;
    }

    public void setExplonation(String explonation) {
        this.explonation = explonation;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getIsMultiSelect() {
        return isMultiSelect;
    }

    public void setIsMultiSelect(String isMultiSelect) {
        this.isMultiSelect = isMultiSelect;
    }

    public String getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(String startSecond) {
        this.startSecond = startSecond;
    }

   

   
     
     
}//final
