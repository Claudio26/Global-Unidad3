/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.QuestionDet;


/**
 *
 * @author 
 */
public class QuestionDetDAO extends DAO<QuestionDet>{
    public QuestionDetDAO(){
        super(new QuestionDet());
    }
     public QuestionDet getOneById(QuestionDet question)
            throws HibernateException{
        return super.getOneById(question.getIdQuestion());
    }
}//final
