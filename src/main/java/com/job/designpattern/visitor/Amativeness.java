package com.job.designpattern.visitor;

public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man man) {
        ConclusionData.getInstance().getList().add(man.getClass().getSimpleName() + this.getClass().getSimpleName());
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        ConclusionData.getInstance().getList().add(woman.getClass().getSimpleName() + this.getClass().getSimpleName());
    }
}
