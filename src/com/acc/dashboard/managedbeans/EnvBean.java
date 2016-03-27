package com.acc.dashboard.managedbeans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.acc.dashboard.beans.Env;
import com.acc.dashboard.beans.Server;

@ManagedBean
public class EnvBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Env selectedEnv = new Env();
	List<Server> envServers = new ArrayList<Server>();

	
	
	public Env getSelectedEnv() {
		return selectedEnv;
	}

	public void setSelectedEnv(Env selectedEnv) {
		this.selectedEnv = selectedEnv;
	}

	public List<Server> getEnvServers() {
		return envServers;
	}

	public void setEnvServers(List<Server> envServers) {
		this.envServers = envServers;
	}



	String env;

	public EnvBean() {

		Map<String, String> params = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		env = params.get("env");
	}

	@PostConstruct
	public void Request() {

		List<String> buslaservers = new ArrayList<String>();
		selectedEnv.setEnvName(env);
		selectedEnv.setEnvDesc("This is an dev env for front office development");
		selectedEnv.setEnvOwner("Acc Murex");
		selectedEnv.setEnvMxVersion("Mx 3.1.41 patch 13f");
		selectedEnv.setEnvBuilddate("04-Apr-2015");
		//selectedEnv.setBookingFrom(new Date("2015-Jan-04"));
		//selectedEnv.setBookingTill(new Date("2016-Feb-04"));
		selectedEnv.setOrch1Server("a301-425-4567");
		selectedEnv.setOrch2Server("a301-425-4567");
		buslaservers.add("a301-425-4568");
		buslaservers.add("a301-425-4569");

		selectedEnv.setBuslaServers(buslaservers);
		
		envServers.add(getServerDetails(selectedEnv.getOrch1Server(),"ORCH1"));
		envServers.add(getServerDetails(selectedEnv.getOrch2Server(),"ORCH2"));
		
		for (String s : buslaservers) {
			envServers.add(getServerDetails(s,"BUSLA"));	
		}
		

	}


	
	public Server getServerDetails(String servername, String servertype) {

		Server server = null;
		try {

			InputStream in = new FileInputStream(
					"C:\\Nagaharshith\\Study_tech\\Dashboard\\DB\\WebContent\\"
							+ servername + ".properties");
			Properties prop = new Properties();
			prop.load(in);

			server = new Server(servertype, prop.getProperty("hostName"),
					prop.getProperty("os"), prop.getProperty("kernelVersion"),
					prop.getProperty("uptime"), prop.getProperty("lastBoot"),
					prop.getProperty("cpuModel"), prop.getProperty("loadAvg"),
					prop.getProperty("cpuCores"), prop.getProperty("totalMem"),
					prop.getProperty("freeMem"),
					prop.getProperty("usedMemperc"),
					prop.getProperty("totalSwap"),
					prop.getProperty("freeSwap"),
					prop.getProperty("usedSwapperc"),
					prop.getProperty("localFsname"),
					prop.getProperty("localFstotal"),
					prop.getProperty("localFsavail"),
					prop.getProperty("localFsusedperc"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return server;
	}

}
