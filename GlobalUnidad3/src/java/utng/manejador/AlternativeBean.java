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
import utng.datos.AltenativeDAO;
import utng.modelo.QuestionDet;
import utng.modelo.Alternative;


/**
 *
 * @author
 */
@ManagedBean(name = "alternativeBean")@SessionScoped
public class AlternativeBean implements Serializable{
    private List<Alternative> alternatives;
    private Alternative alternative;
    private List<QuestionDet> questions;
    
    public AlternativeBean(){
        alternative = new Alternative();
        alternative.setQuestionDet(new QuestionDet());
    } 

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    public Alternative getAlternative() {
        return alternative;
    }

    public void setAlternative(Alternative alternative) {
        this.alternative = alternative;
    }

    public List<QuestionDet> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDet> questions) {
        this.questions = questions;
    }

    
    

   
     public String listar(){
        AltenativeDAO dao = new AltenativeDAO();
        try{
            alternatives= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Alternatives";
        }
     public String eliminar(){
        AltenativeDAO dao = new AltenativeDAO();
        try{
            dao.delete(alternative);
            alternatives = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       alternative= new Alternative();
       alternative.setQuestionDet(new QuestionDet());
       try{
           questions = new QuestionDetDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        AltenativeDAO dao = new AltenativeDAO();
        try{ 
            if(alternative.getIdAlternative()!=0){
                dao.update(alternative);
        }else{ dao.insert(alternative);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        alternatives = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Alternative alternative){
        this.alternative = alternative;
        try{
           questions = new QuestionDetDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
