package com.tieto.energy.poc.service;

import com.tieto.energy.poc.ErrandService;
import com.tieto.energy.poc.model.Errand;
import com.tieto.energy.poc.model.Timestamp;
import com.tieto.energy.poc.util.Generator;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
@Named
public class ErrandServiceImpl implements ErrandService {

    public Errand getErrand(Long errandId) {
        Errand errand = new Errand();
        errand.setErrandId(errandId);
        errand.setTimestamps(getTimestamps(errandId));
        return errand;
    }

    public List<Timestamp> getTimestamps(Long errandId) {
        List<Timestamp> timestamps = new ArrayList<Timestamp>();
        for (int i = 1; i <= 100; i++) {
            Timestamp timestamp = new Timestamp();
            timestamp.setTimestampId(Long.valueOf(i));
            timestamp.setTimestampTypeId(Generator.getTimestampType());
            timestamp.setErrandId(errandId);
            if (i % 3 == 0) {
                timestamp.setTimestampDate(new Date());
                timestamp.setTimestampSignature(Generator.getName() + " " + Generator.getSurname());
            }
            timestamps.add(timestamp);
        }
        return timestamps;
    }
}
