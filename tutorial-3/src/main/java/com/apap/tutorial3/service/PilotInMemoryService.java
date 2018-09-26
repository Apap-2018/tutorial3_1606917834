package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3.model.PilotModel;

@Service
public class PilotInMemoryService implements PilotService {
	private List<PilotModel> archivePilot;

	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}
	@Override
	public void addPilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		archivePilot.add(pilot);
	}

	@Override
	public List<PilotModel> getPilotList() {
		// TODO Auto-generated method stub
		return archivePilot;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		for (PilotModel search : archivePilot) {
			if (search.getLicenseNumber().equalsIgnoreCase(licenseNumber)) {
				return search;
			}
		}
		return null;
	}
	 
}
