package com.hackathon.vm.domain.traffic;

/**
 * @author Michal Dojcar
 */
public class Events
{
    private String happened_at;

    private String event_id;

    private _embedded _embedded;

    public String getHappened_at ()
    {
        return happened_at;
    }

    public void setHappened_at (String happened_at)
    {
        this.happened_at = happened_at;
    }

    public String getEvent_id ()
    {
        return event_id;
    }

    public void setEvent_id (String event_id)
    {
        this.event_id = event_id;
    }

    public _embedded get_embedded ()
    {
        return _embedded;
    }

    public void set_embedded (_embedded _embedded)
    {
        this._embedded = _embedded;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [happened_at = "+happened_at+", event_id = "+event_id+", _embedded = "+_embedded+"]";
    }
}
