/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.QuestionDetDAO;
import utng.modelo.QuestionDet;

/**
 *
 * @author 
 */
@ManagedBean (name="questionDetBean") @SessionScoped
public class QuestionDetBean implements Serializable {
    
    private List<QuestionDet> questions;
    private QuestionDet question;
    
    
    public QuestionDetBean(){
    question=new QuestionDet();
    
    }

    public List<QuestionDet> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDet> questions) {
        this.questions = questions;
    }

    public QuestionDet getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDet question) {
        this.question = question;
    }

    


   


    
    

     public String listar(){
        QuestionDetDAO dao =new QuestionDetDAO();
        try{
            questions=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Questions";
    }
      public String eliminar(){
        QuestionDetDAO dao = new QuestionDetDAO();
        try{
            dao.delete(question);
           questions = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        question = new QuestionDet();
        return "Iniciar";
        
         }
    public String guardar(){
        QuestionDetDAO dao = new QuestionDetDAO();
        try{
            if(question.getIdQuestion()!=0){
                dao.update(question);
            }else{
                dao.insert(question);
            }
            questions = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(QuestionDet question){
        this.question = question;
        return "Editar";
            }
}//final
