package com.tieto.energy.poc.web.controller.errand;

import com.tieto.energy.poc.ErrandService;
import com.tieto.energy.poc.model.Errand;
import com.tieto.energy.poc.model.Timestamp;
import com.tieto.energy.poc.web.model.TimestampUI;
import org.omnifaces.cdi.ViewScoped;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
@Named
@ViewScoped
public class TimestampController implements Serializable {

    @Inject
    private transient ErrandService errandService;

    private Errand errand;
    private List<TimestampUI> timestamps;

    @PostConstruct
    public void init() {
        System.out.println("POC: init TimestampController " + new Date());
        errand = errandService.getErrand(1L);
        List<Timestamp> errandTimestamps = errand.getTimestamps();

        timestamps = new ArrayList<TimestampUI>(errandTimestamps.size());
        for (Timestamp errandTimestamp : errandTimestamps) {
            timestamps.add(new TimestampUI(errandTimestamp, "John Black"));
        }
    }

    public void setTimestamp(TimestampUI timestamp) {
        System.out.println("POC: setTimestamp() ");
        timestamp.setState(TimestampUI.State.CHANGED_SET);
    }

    public void undoSetTimestamp(TimestampUI timestamp) {
        System.out.println("POC: undoSetTimestamp() ");
        timestamp.setState(TimestampUI.State.NOT_SET);
    }

    public void clearTimestamp(TimestampUI timestamp) {
        System.out.println("POC: clearTimestamp() ");
        timestamp.setState(TimestampUI.State.CHANGED_CLEARED);
    }

    public void undoClearTimestamp(TimestampUI timestamp) {
        System.out.println("POC: undoClearTimestamp() ");
        timestamp.setState(TimestampUI.State.SET);
    }

    public List<TimestampUI> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<TimestampUI> timestamps) {
        this.timestamps = timestamps;
    }
}
