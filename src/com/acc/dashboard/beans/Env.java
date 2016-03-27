package com.acc.dashboard.beans;

import java.util.Date;
import java.util.List;

public class Env {

	public String envName;
	public String envOwner;
	public String envDesc;
	public String envMxVersion;
	public Date bookingFrom;
	public Date bookingTill;
	public String envBuilddate;

	public String orch1Server;
	public String orch2Server;
	public List<String> buslaServers;
	
	public String getEnvName() {
		return envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public String getEnvOwner() {
		return envOwner;
	}

	public void setEnvOwner(String envOwner) {
		this.envOwner = envOwner;
	}

	public String getEnvDesc() {
		return envDesc;
	}

	public void setEnvDesc(String envDesc) {
		this.envDesc = envDesc;
	}

	public String getEnvMxVersion() {
		return envMxVersion;
	}

	public void setEnvMxVersion(String envMxVersion) {
		this.envMxVersion = envMxVersion;
	}

	public Date getBookingFrom() {
		return bookingFrom;
	}

	public void setBookingFrom(Date bookingFrom) {
		this.bookingFrom = bookingFrom;
	}

	public Date getBookingTill() {
		return bookingTill;
	}

	public void setBookingTill(Date bookingTill) {
		this.bookingTill = bookingTill;
	}

	
	public String getEnvBuilddate() {
		return envBuilddate;
	}

	public void setEnvBuilddate(String envBuilddate) {
		this.envBuilddate = envBuilddate;
	}

    
	public String getOrch1Server() {
		return orch1Server;
	}

	public void setOrch1Server(String orch1Server) {
		this.orch1Server = orch1Server;
	}

	public String getOrch2Server() {
		return orch2Server;
	}

	public void setOrch2Server(String orch2Server) {
		this.orch2Server = orch2Server;
	}

	public List<String> getBuslaServers() {
		return buslaServers;
	}

	public void setBuslaServers(List<String> buslaServers) {
		this.buslaServers = buslaServers;
	}

	public Env() {

	}

}
