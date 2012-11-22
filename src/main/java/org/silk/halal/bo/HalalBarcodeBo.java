package org.silk.halal.bo;

import java.util.List;

import org.silk.halal.model.HalalBarcode;


public interface HalalBarcodeBo {
	void addHalalBarcode(HalalBarcode halalBarcode);
	List<HalalBarcode> listHalalBarcode();
}
