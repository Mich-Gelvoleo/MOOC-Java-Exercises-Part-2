/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;


/**
 *
 * @author Michele Gelvoleo
 */
public class AtLeastOne implements Criterion{
    private Criterion[] criterions;
    
    public AtLeastOne(Criterion... criterias){
        this.criterions = criterias;
    }
    @Override
    public boolean complies(String line) {
        for(Criterion criterion : criterions){
            if(criterion.complies(line)){
                return true;
            }
        }
        
        return false;
    }
    
}
