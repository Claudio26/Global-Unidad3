/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Alternative;

/**
 *
 * @author 
 */
public class AltenativeDAO extends DAO<Alternative>{
    public AltenativeDAO(){
        super(new Alternative());
       
    }
    
    public Alternative getOneById(Alternative alternative)
            throws HibernateException{
        return super.getOneById(alternative.getIdAlternative());
    }
     
}//final
