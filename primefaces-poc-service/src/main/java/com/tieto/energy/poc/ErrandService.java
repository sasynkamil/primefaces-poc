package com.tieto.energy.poc;

import com.tieto.energy.poc.model.Errand;

import java.io.Serializable;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-09-10
 */
public interface ErrandService extends Serializable {

    Errand getErrand(Long errandId);
}
