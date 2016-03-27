package com.acc.dashboard.beans;

public class Server {

	
	public String serverType;
	public String hostName;
	public String os;
	public String kernelVersion;
	public String uptime;
	public String lastBoot;
	public String cpuModel;

	public double loadAvg;
	public int cpuCores;

	public double totalMem;
	public double freeMem;
	public double usedMemperc;

	public double totalSwap;
	public double freeSwap;
	public double usedSwapperc;

	public String localFsname;
	public String localFstotal;
	public String localFsavail;
	public String localFsusedperc;

	public String sharedFsname;
	public String sharedFstotal;
	public String sharedFsavail;
	public String sharedFsusedperc;

	
	
	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getKernelVersion() {
		return kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getLastBoot() {
		return lastBoot;
	}

	public void setLastBoot(String lastBoot) {
		this.lastBoot = lastBoot;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public double getLoadAvg() {
		return loadAvg;
	}

	public void setLoadAvg(double loadAvg) {
		this.loadAvg = loadAvg;
	}

	public int getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}

	public double getTotalMem() {
		return totalMem;
	}

	public void setTotalMem(double totalMem) {
		this.totalMem = totalMem;
	}

	public double getFreeMem() {
		return freeMem;
	}

	public void setFreeMem(double freeMem) {
		this.freeMem = freeMem;
	}

	public double getUsedMemperc() {
		return usedMemperc;
	}

	public void setUsedMemperc(double usedMemperc) {
		this.usedMemperc = usedMemperc;
	}

	public double getTotalSwap() {
		return totalSwap;
	}

	public void setTotalSwap(double totalSwap) {
		this.totalSwap = totalSwap;
	}

	public double getFreeSwap() {
		return freeSwap;
	}

	public void setFreeSwap(double freeSwap) {
		this.freeSwap = freeSwap;
	}

	public double getUsedSwapperc() {
		return usedSwapperc;
	}

	public void setUsedSwapperc(double usedSwapperc) {
		this.usedSwapperc = usedSwapperc;
	}

	public String getLocalFsname() {
		return localFsname;
	}

	public void setLocalFsname(String localFsname) {
		this.localFsname = localFsname;
	}

	public String getLocalFstotal() {
		return localFstotal;
	}

	public void setLocalFstotal(String localFstotal) {
		this.localFstotal = localFstotal;
	}

	public String getLocalFsavail() {
		return localFsavail;
	}

	public void setLocalFsavail(String localFsavail) {
		this.localFsavail = localFsavail;
	}

	public String getLocalFsusedperc() {
		return localFsusedperc;
	}

	public void setLocalFsusedperc(String localFsusedperc) {
		this.localFsusedperc = localFsusedperc;
	}

	public String getSharedFsname() {
		return sharedFsname;
	}

	public void setSharedFsname(String sharedFsname) {
		this.sharedFsname = sharedFsname;
	}

	public String getSharedFstotal() {
		return sharedFstotal;
	}

	public void setSharedFstotal(String sharedFstotal) {
		this.sharedFstotal = sharedFstotal;
	}

	public String getSharedFsavail() {
		return sharedFsavail;
	}

	public void setSharedFsavail(String sharedFsavail) {
		this.sharedFsavail = sharedFsavail;
	}

	public String getSharedFsusedperc() {
		return sharedFsusedperc;
	}

	public void setSharedFsusedperc(String sharedFsusedperc) {
		this.sharedFsusedperc = sharedFsusedperc;
	}

	public Server() {

	}

	public Server(String serverType,String hostName, String os, String kernelVersion,
			String uptime, String lastBoot, String cpuModel, String loadAvg,
			String cpuCores, String totalMem, String freeMem, String usedMemperc,
			String totalSwap, String freeSwap, String usedSwapperc,
			String localFsname, String localFstotal, String localFsavail,
			String localFsusedperc) {
		this.serverType=serverType;
		this.hostName = hostName;
		this.os = os;
		this.kernelVersion = kernelVersion;
		this.uptime = uptime;
		this.lastBoot = lastBoot;
		this.cpuModel = cpuModel;
		this.loadAvg = new Double(loadAvg);
		this.cpuCores = new Integer(cpuCores);
		this.totalMem = new Double(totalMem);
		this.freeMem = new Double(freeMem);
		this.usedMemperc = new Double(usedMemperc);
		this.totalSwap = new Double(totalSwap);
		this.freeSwap = new Double(freeSwap);
		this.usedSwapperc = new Double(usedSwapperc);
		this.localFsname = localFsname;
		this.localFstotal = localFstotal;
		this.localFsavail = localFsavail;
		this.localFsusedperc = localFsusedperc;
	}
	
	
	
	
}
