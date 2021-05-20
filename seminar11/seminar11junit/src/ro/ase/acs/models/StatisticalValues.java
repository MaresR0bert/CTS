package ro.ase.acs.models;

import ro.ase.acs.exceptions.StatisticalException;

import java.util.List;

public class StatisticalValues {
    private List<Long> values;

    public void setValues(List<Long> values) {
        this.values = values;
    }

    public long getMinim(){
        long min = Long.MAX_VALUE;

        for(Long i : values){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public double getAverage() throws StatisticalException {
        if(values == null){
            throw new StatisticalException("List is null");
        }

        if(values.isEmpty()){
            throw new StatisticalException("List has null element");
        }

        if(values.contains(null)){
            throw new StatisticalException("Null elem");
        }

        double sum = 0;
        for(Long i : values){
            sum+= i;
        }
        return sum/values.size();
    }
}
