package com.hackathon.vm.domain.actions;

/**
 * @author Michal Dojcar
 */
public class _embedded
{
    private Actions[] actions;

    public Actions[] getActions ()
    {
        return actions;
    }

    public void setActions (Actions[] actions)
    {
        this.actions = actions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [actions = "+actions+"]";
    }
}