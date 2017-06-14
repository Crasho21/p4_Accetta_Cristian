package p4_accetta_cristian_uc_4_5_13;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Classe per la definizione di Gruppo
 * @author Accetta Cristian
 */
public class Gruppo implements Serializable{
	
    /** Versione dell'oggetto Gruppo, necessaria per la serializzazione (cioè per il salvataggio permanente) */
	private static final long serialVersionUID = 1L;
	
	/** Attributi */
    private String nomeGruppo; 
    
    /** Associations */
    private Dati datiAggregati;
    private ArrayList<App> apps; 
    
    /**
     * Costruttore della classe Gruppo con il nome
     * @param nome Il nome che sarà assegnato al nuovo gruppo
     */
    public Gruppo(String nome) {
    	this.nomeGruppo = nome;
    }
    
	public String getNomeGruppo() {
		return nomeGruppo;
	}
	
	public void setNomeGruppo(String nomeGruppo) {
		this.nomeGruppo = nomeGruppo;
	}
	
	public void setApps(ArrayList<App> a){
		this.apps = a;
	}
	
	public Dati getDatiAggregati(){
		return datiAggregati;
	}
	/**
     * Funzione per la visualizzazione dei dati di un Gruppo
     *
     */
    public void visualizzazioneDati(){

    }
    /**
     * Funzione per l'estrazione dei dati di un Gruppo
     *
     * @return true se è andata a buon fine, false se non è andata a buon fine
     */
    public boolean estrazioneDatiGruppo(){
    	
        return false; 
    }
    /**
     * Funzione per il controllo delle precondizioni di aggregazioneDati
     * 
     * @return true se il gruppo contiene i dati di almeno 2 App, false altrimenti
     */
    public boolean precondizioniAggregazioneDati(){
    	if(apps == null){
    		return false;
    	}
    	else if(apps.size() < 2){
    		return false;
    	} else{
    		int count = 0;
    		Iterator<App> i = apps.iterator();
        	while(i.hasNext()){
        		App a = i.next();
        		if(a.getDati() != null){
        			count += 1;
        		}
        	}
    		if(count < 2){
    			return false;
    		}
    	}
    	return true;
    }
    /**
     * Funzione per l'aggregazione dei dati delle App contenute nel Gruppo
     *
     */
    public void aggregazioneDati(){
    	// Se le precondizioni non sono rispettate termino la funzione
    	if(!precondizioniAggregazioneDati()){
    		System.out.println("Precondizioni aggregazioneDati non verificate");
    		return;
    	}
    	// Ottengo i dati delle app nel gruppo
    	ArrayList<Dati> datiApps = new ArrayList<Dati>();
    	boolean google = false, apple = false, windows = false;
    	Iterator<App> i = apps.iterator();
    	while(i.hasNext()){
    		App a = i.next();
    		if(a.getDati() != null){
	    		datiApps.add(a.getDati());
	    		if(a.getDati().getProvenienza() == Dati.GOOGLE_PLAY_STORE){
	    			google = true;
	    		}
	    		else if(a.getDati().getProvenienza() == Dati.APPLE_STORE){
	    			apple = true;
	    		}
	    		else if(a.getDati().getProvenienza() == Dati.WINDOWS_STORE){
	    			windows = true;
	    		}
    		}
    	}
    	// Aggrego i dati in base alla provenienza
    	datiAggregati = new Dati();
        if(google && apple && windows){
    		// Non implementata per mancanza di dati
    	} else if(google && apple){
    		// Non implementata per mancanza di dati
    	} else if(google && windows){
    		ArrayList<Integer> overview_dailyUserInstalls = new ArrayList<Integer>();
    		int overview_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> country_dailyUserInstalls = new ArrayList<Integer>();
    		int country_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> osVersion_dailyUserInstalls = new ArrayList<Integer>();
    		int osVersion_dailyUserInstallsTemp = 0;
    		
    		Iterator<Integer> temp;
    		for(int j = 0; j < datiApps.size(); j++){
    			Dati d = datiApps.get(j);
    			if(d.getOverview_dailyUserInstalls() != null && d.getOverview_dailyUserInstalls().size() != 0){
	    			temp = d.getOverview_dailyUserInstalls().iterator();
	    			while(temp.hasNext()){
	    				overview_dailyUserInstallsTemp += temp.next();
	    			}
    			}
    			if(d.getCountry_dailyUserInstalls() != null && d.getCountry_dailyUserInstalls().size() != 0){
    				temp = d.getCountry_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					country_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getOsVersion_dailyUserInstalls() != null && d.getOsVersion_dailyUserInstalls().size() != 0){
    				temp = d.getOsVersion_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					osVersion_dailyUserInstallsTemp += temp.next();
    				}
    			}
    		}
    		if(overview_dailyUserInstallsTemp !=0){
    			overview_dailyUserInstalls.add(overview_dailyUserInstallsTemp);
    			datiAggregati.setOverview_dailyUserInstalls(overview_dailyUserInstalls);    			
    		}
    		if(country_dailyUserInstallsTemp !=0){
    			country_dailyUserInstalls.add(country_dailyUserInstallsTemp);
    			datiAggregati.setCountry_dailyUserInstalls(country_dailyUserInstalls);
    		}
    		if(osVersion_dailyUserInstallsTemp !=0){
    			osVersion_dailyUserInstalls.add(osVersion_dailyUserInstallsTemp);
    			datiAggregati.setOsVersion_dailyUserInstalls(osVersion_dailyUserInstalls);
    		}
    	} else if(apple && windows){
    		// Non implementata per mancanza di dati
    	} else if(google){
    		ArrayList<Integer> overview_dailyUserInstalls = new ArrayList<Integer>();
    		int overview_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> overview_totUserInstalls = new ArrayList<Integer>();
    		int overview_totUserInstallsTemp = 0;
    		ArrayList<Integer> overview_dailyUserUninstalls = new ArrayList<Integer>();
    		int overview_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> overview_activeDeviceInstalls = new ArrayList<Integer>();
    		int overview_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> carrier_totUserInstalls = new ArrayList<Integer>();
    		int carrier_totUserInstallsTemp = 0;
    		ArrayList<Integer> carrier_dailyUserInstalls = new ArrayList<Integer>();
    		int carrier_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> carrier_dailyUserUninstalls = new ArrayList<Integer>();
    		int carrier_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> carrier_activeDeviceInstalls = new ArrayList<Integer>();
    		int carrier_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> country_dailyUserInstalls = new ArrayList<Integer>();
    		int country_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> country_totUserInstalls = new ArrayList<Integer>();
    		int country_totUserInstallsTemp = 0;
    		ArrayList<Integer> country_dailyUserUninstalls = new ArrayList<Integer>();
    		int country_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> country_activeDeviceInstalls = new ArrayList<Integer>();
    		int country_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> device_totUserInstalls = new ArrayList<Integer>();
    		int device_totUserInstallsTemp = 0;
    		ArrayList<Integer> device_dailyUserInstalls = new ArrayList<Integer>();
    		int device_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> device_dailyUserUninstalls = new ArrayList<Integer>();
    		int device_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> device_activeDeviceInstalls = new ArrayList<Integer>();
    		int device_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> lang_totUserInstalls = new ArrayList<Integer>();
    		int lang_totUserInstallsTemp = 0;
    		ArrayList<Integer> lang_dailyUserInstalls = new ArrayList<Integer>();
    		int lang_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> lang_dailyUserUninstalls = new ArrayList<Integer>();
    		int lang_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> lang_activeDeviceInstalls = new ArrayList<Integer>();
    		int lang_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> osVersion_dailyUserInstalls = new ArrayList<Integer>();
    		int osVersion_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> osVersion_totUserInstalls = new ArrayList<Integer>();
    		int osVersion_totUserInstallsTemp = 0;
    		ArrayList<Integer> osVersion_dailyUserUninstalls = new ArrayList<Integer>();
    		int osVersion_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> osVersion_activeDeviceInstalls = new ArrayList<Integer>();
    		int osVersion_activeDeviceInstallsTemp = 0;
    		ArrayList<Integer> tablet_totUserInstalls = new ArrayList<Integer>();
    		int tablet_totUserInstallsTemp = 0;
    		ArrayList<Integer> tablet_dailyUserInstalls = new ArrayList<Integer>();
    		int tablet_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> tablet_dailyUserUninstalls = new ArrayList<Integer>();
    		int tablet_dailyUserUninstallsTemp = 0;
    		ArrayList<Integer> tablet_activeDeviceInstalls = new ArrayList<Integer>();
    		int tablet_activeDeviceInstallsTemp = 0;
    		ArrayList<Double> daily_average_app_version = new ArrayList<Double>();
    		double daily_average_app_versionTemp = 0;
    		ArrayList<Double> total_average_app_version = new ArrayList<Double>();
    		double total_average_app_versionTemp = 0;
    		ArrayList<Double> daily_average_carrier = new ArrayList<Double>();
    		double daily_average_carrierTemp = 0;
    		ArrayList<Double> total_average_carrier = new ArrayList<Double>();
    		double total_average_carrierTemp = 0;
    		ArrayList<Double> daily_average_country = new ArrayList<Double>();
    		double daily_average_countryTemp = 0;
    		ArrayList<Double> total_average_country = new ArrayList<Double>();
    		double total_average_countryTemp = 0;
    		ArrayList<Double> daily_average_device = new ArrayList<Double>();
    		double daily_average_deviceTemp = 0;
    		ArrayList<Double> total_average_device = new ArrayList<Double>();
    		double total_average_deviceTemp = 0;
    		ArrayList<Double> daily_average_language = new ArrayList<Double>();
    		double daily_average_languageTemp = 0;
    		ArrayList<Double> total_average_language = new ArrayList<Double>();
    		double total_average_languageTemp = 0;
    		ArrayList<Double> daily_average_os_version = new ArrayList<Double>();
    		double daily_average_os_versionTemp = 0;
    		ArrayList<Double> total_average_os_version = new ArrayList<Double>();
    		double total_average_os_versionTemp = 0;
    		ArrayList<Double> daily_average_tablet = new ArrayList<Double>();
    		double daily_average_tabletTemp = 0;
    		ArrayList<Double> total_average_tablet = new ArrayList<Double>();
    		double total_average_tabletTemp = 0;
    		ArrayList<Double> daily_average_overview = new ArrayList<Double>();
    		double daily_average_overviewTemp = 0;
    		ArrayList<Double> total_average_overview = new ArrayList<Double>();
    		double total_average_overviewTemp = 0;
    		
    		Iterator<Integer> temp;
    		Iterator<Double> temp2;
    		for(int j = 0; j < datiApps.size(); j++){
    			Dati d = datiApps.get(j);
    			if(d.getOverview_dailyUserInstalls() != null && d.getOverview_dailyUserInstalls().size() != 0){
    				temp = d.getOverview_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					overview_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getOverview_totUserInstalls() != null && d.getOverview_totUserInstalls().size() != 0){
    				overview_totUserInstallsTemp += d.getOverview_totUserInstalls().get(d.getOverview_totUserInstalls().size() - 1);
    			}
    			if(d.getOverview_dailyUserUninstalls() != null && d.getOverview_dailyUserUninstalls().size() != 0){
    				temp = d.getOverview_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					overview_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getOverview_activeDeviceInstalls() != null && d.getOverview_activeDeviceInstalls().size() != 0){
    				temp = d.getOverview_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					overview_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getCarrier_totUserInstalls() != null && d.getCarrier_totUserInstalls().size() != 0){
    				carrier_totUserInstallsTemp += d.getCarrier_totUserInstalls().get(d.getCarrier_totUserInstalls().size() - 1);
    			}
    			if(d.getCarrier_dailyUserInstalls() != null && d.getCarrier_dailyUserInstalls().size() != 0){
    				temp = d.getCarrier_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					carrier_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getCarrier_dailyUserUninstalls() != null && d.getCarrier_dailyUserUninstalls().size() != 0){
    				temp = d.getCarrier_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					carrier_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getCarrier_activeDeviceInstalls() != null && d.getCarrier_activeDeviceInstalls().size() != 0){
    				temp = d.getCarrier_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					carrier_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getCountry_dailyUserInstalls() != null && d.getCountry_dailyUserInstalls().size() != 0){
    				temp = d.getCountry_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					country_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getCountry_totUserInstalls() != null && d.getCountry_totUserInstalls().size() != 0){
    				country_totUserInstallsTemp += d.getCountry_totUserInstalls().get(d.getCountry_totUserInstalls().size() - 1);
    			}
    			if(d.getCountry_dailyUserUninstalls() != null && d.getCountry_dailyUserUninstalls().size() != 0){
    				temp = d.getCountry_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					country_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getCountry_activeDeviceInstalls() != null && d.getCountry_activeDeviceInstalls().size() != 0){
    				temp = d.getCountry_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					country_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getDevice_totUserInstalls() != null && d.getDevice_totUserInstalls().size() != 0){
    				device_totUserInstallsTemp += d.getDevice_totUserInstalls().get(d.getDevice_totUserInstalls().size() - 1);
    			}
    			if(d.getDevice_dailyUserInstalls() != null && d.getDevice_dailyUserInstalls().size() != 0){
    				temp = d.getDevice_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					device_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getDevice_dailyUserUninstalls() != null && d.getDevice_dailyUserUninstalls().size() != 0){
    				temp = d.getDevice_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					device_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getDevice_activeDeviceInstalls() != null && d.getDevice_activeDeviceInstalls().size() != 0){
    				temp = d.getDevice_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					device_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getLang_totUserInstalls() != null && d.getLang_totUserInstalls().size() != 0){
    				lang_totUserInstallsTemp += d.getLang_totUserInstalls().get(d.getLang_totUserInstalls().size() - 1);
    			}
    			if(d.getLang_dailyUserInstalls() != null && d.getLang_dailyUserInstalls().size() != 0){
    				temp = d.getLang_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					lang_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getLang_dailyUserUninstalls() != null && d.getLang_dailyUserUninstalls().size() != 0){
    				temp = d.getLang_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					lang_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getLang_activeDeviceInstalls() != null && d.getLang_activeDeviceInstalls().size() != 0){
    				temp = d.getLang_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					lang_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getOsVersion_dailyUserInstalls() != null && d.getOsVersion_dailyUserInstalls().size() != 0){
    				temp = d.getOsVersion_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					osVersion_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getOsVersion_totUserInstalls() != null && d.getOsVersion_totUserInstalls().size() != 0){
    				osVersion_totUserInstallsTemp += d.getOsVersion_totUserInstalls().get(d.getOsVersion_totUserInstalls().size() - 1);
    			}
    			if(d.getOsVersion_dailyUserUninstalls() != null && d.getOsVersion_dailyUserUninstalls().size() != 0){
    				temp = d.getOsVersion_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					osVersion_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getOsVersion_activeDeviceInstalls() != null && d.getOsVersion_activeDeviceInstalls().size() != 0){
    				temp = d.getOsVersion_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					osVersion_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getTablet_totUserInstalls() != null && d.getTablet_totUserInstalls().size() != 0){
    				temp = d.getTablet_totUserInstalls().iterator();
    				while(temp.hasNext()){
    					tablet_totUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getTablet_dailyUserInstalls() != null && d.getTablet_dailyUserInstalls().size() != 0){
    				temp = d.getTablet_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					tablet_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getTablet_dailyUserUninstalls() != null && d.getTablet_dailyUserUninstalls().size() != 0){
    				temp = d.getTablet_dailyUserUninstalls().iterator();
    				while(temp.hasNext()){
    					tablet_dailyUserUninstallsTemp += temp.next();
    				}
    			}
    			if(d.getTablet_activeDeviceInstalls() != null && d.getTablet_activeDeviceInstalls().size() != 0){
    				temp = d.getTablet_activeDeviceInstalls().iterator();
    				while(temp.hasNext()){
    					tablet_activeDeviceInstallsTemp += temp.next();
    				}
    			}
    			if(d.getDaily_average_app_version() != null && d.getDaily_average_app_version().size() != 0){
    				temp2 = d.getDaily_average_app_version().iterator();
    				while(temp2.hasNext()){
    					daily_average_app_versionTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_app_version() != null && d.getTotal_average_app_version().size() != 0){
    				total_average_app_versionTemp += d.getTotal_average_app_version().get(d.getTotal_average_app_version().size() - 1);
    			}
    			if(d.getDaily_average_carrier() != null && d.getDaily_average_carrier().size() != 0){
    				temp2 = d.getDaily_average_carrier().iterator();
    				while(temp2.hasNext()){
    					daily_average_carrierTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_carrier() != null && d.getTotal_average_carrier().size() != 0){
    				total_average_carrierTemp += d.getTotal_average_carrier().get(d.getTotal_average_carrier().size() - 1);
    			}
    			if(d.getDaily_average_country() != null && d.getDaily_average_country().size() != 0){
    				temp2 = d.getDaily_average_country().iterator();
    				while(temp2.hasNext()){
    					daily_average_countryTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_country() != null && d.getTotal_average_country().size() != 0){
    				total_average_countryTemp += d.getTotal_average_country().get(d.getTotal_average_country().size() - 1);
    			}
    			if(d.getDaily_average_device() != null && d.getDaily_average_device().size() != 0){
    				temp2 = d.getDaily_average_device().iterator();
    				while(temp2.hasNext()){
    					daily_average_deviceTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_device() != null && d.getTotal_average_device().size() != 0){
    				total_average_deviceTemp += d.getTotal_average_device().get(d.getTotal_average_device().size() - 1);
    			}
    			if(d.getDaily_average_language() != null && d.getDaily_average_language().size() != 0){
    				temp2 = d.getDaily_average_language().iterator();
    				while(temp2.hasNext()){
    					daily_average_languageTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_language() != null && d.getTotal_average_language().size() != 0){
    				total_average_languageTemp += d.getTotal_average_language().get(d.getTotal_average_language().size() - 1);
    			}
    			if(d.getDaily_average_os_version() != null && d.getDaily_average_os_version().size() != 0){
    				temp2 = d.getDaily_average_os_version().iterator();
    				while(temp2.hasNext()){
    					daily_average_os_versionTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_os_version() != null && d.getTotal_average_os_version().size() != 0){
    				total_average_os_versionTemp += d.getTotal_average_os_version().get(d.getTotal_average_os_version().size() - 1);
    			}
    			if(d.getDaily_average_tablet() != null && d.getDaily_average_tablet().size() != 0){
    				temp2 = d.getDaily_average_tablet().iterator();
    				while(temp2.hasNext()){
    					daily_average_tabletTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_tablet() != null && d.getTotal_average_tablet().size() != 0){
    				total_average_tabletTemp += d.getTotal_average_tablet().get(d.getTotal_average_tablet().size() - 1);
    			}
    			if(d.getDaily_average_overview() != null && d.getDaily_average_overview().size() != 0){
    				temp2 = d.getDaily_average_overview().iterator();
    				while(temp2.hasNext()){
    					daily_average_overviewTemp += temp2.next();
    				}
    			}
    			if(d.getTotal_average_overview() != null && d.getTotal_average_overview().size() != 0){
    				total_average_overviewTemp += d.getTotal_average_overview().get(d.getTotal_average_overview().size() - 1);
    			}
    		}
    		if(overview_dailyUserInstallsTemp !=0){
    			overview_dailyUserInstalls.add(overview_dailyUserInstallsTemp);
    			datiAggregati.setOverview_dailyUserInstalls(overview_dailyUserInstalls);
    		}
    		if(overview_totUserInstallsTemp !=0){
    			overview_totUserInstalls.add(overview_totUserInstallsTemp);
    			datiAggregati.setOverview_totUserInstalls(overview_totUserInstalls);
    		}
    		if(overview_dailyUserUninstallsTemp !=0){
    			overview_dailyUserUninstalls.add(overview_dailyUserUninstallsTemp);
    			datiAggregati.setOverview_dailyUserUninstalls(overview_dailyUserUninstalls);
    		}
    		if(overview_activeDeviceInstallsTemp !=0){
    			overview_activeDeviceInstalls.add(overview_activeDeviceInstallsTemp);
    			datiAggregati.setOverview_activeDeviceInstalls(overview_activeDeviceInstalls);
    		}
    		if(carrier_totUserInstallsTemp !=0){
    			carrier_totUserInstalls.add(carrier_totUserInstallsTemp);
    			datiAggregati.setCarrier_totUserInstalls(carrier_totUserInstalls);
    		}
    		if(carrier_dailyUserInstallsTemp !=0){
    			carrier_dailyUserInstalls.add(carrier_dailyUserInstallsTemp);
    			datiAggregati.setCarrier_dailyUserInstalls(carrier_dailyUserInstalls);
    		}
    		if(carrier_dailyUserUninstallsTemp !=0){
    			carrier_dailyUserUninstalls.add(carrier_dailyUserUninstallsTemp);
    			datiAggregati.setCarrier_dailyUserUninstalls(carrier_dailyUserUninstalls);
    		}
    		if(carrier_activeDeviceInstallsTemp !=0){
    			carrier_activeDeviceInstalls.add(carrier_activeDeviceInstallsTemp);
    			datiAggregati.setCarrier_activeDeviceInstalls(carrier_activeDeviceInstalls);
    		}
    		if(country_dailyUserInstallsTemp !=0){
    			country_dailyUserInstalls.add(country_dailyUserInstallsTemp);
    			datiAggregati.setCountry_dailyUserInstalls(country_dailyUserInstalls);
    		}
    		if(country_totUserInstallsTemp !=0){
    			country_totUserInstalls.add(country_totUserInstallsTemp);
    			datiAggregati.setCountry_totUserInstalls(country_totUserInstalls);
    		}
    		if(country_dailyUserUninstallsTemp !=0){
    			country_dailyUserUninstalls.add(country_dailyUserUninstallsTemp);
    			datiAggregati.setCountry_dailyUserUninstalls(country_dailyUserUninstalls);
    		}
    		if(country_activeDeviceInstallsTemp !=0){
    			country_activeDeviceInstalls.add(country_activeDeviceInstallsTemp);
    			datiAggregati.setCountry_activeDeviceInstalls(country_activeDeviceInstalls);
    		}
    		if(device_totUserInstallsTemp !=0){
    			device_totUserInstalls.add(device_totUserInstallsTemp);
    			datiAggregati.setDevice_totUserInstalls(device_totUserInstalls);
    		}
    		if(device_dailyUserInstallsTemp !=0){
    			device_dailyUserInstalls.add(device_dailyUserInstallsTemp);
    			datiAggregati.setDevice_dailyUserInstalls(device_dailyUserInstalls);
    		}
    		if(device_dailyUserUninstallsTemp !=0){
    			device_dailyUserUninstalls.add(device_dailyUserUninstallsTemp);
    			datiAggregati.setDevice_dailyUserUninstalls(device_dailyUserUninstalls);
    		}
    		if(device_activeDeviceInstallsTemp !=0){
    			device_activeDeviceInstalls.add(device_activeDeviceInstallsTemp);
    			datiAggregati.setDevice_activeDeviceInstalls(device_activeDeviceInstalls);
    		}
    		if(lang_totUserInstallsTemp !=0){
    			lang_totUserInstalls.add(lang_totUserInstallsTemp);
    			datiAggregati.setLang_totUserInstalls(lang_totUserInstalls);
    		}
    		if(lang_dailyUserInstallsTemp !=0){
    			lang_dailyUserInstalls.add(lang_dailyUserInstallsTemp);
    			datiAggregati.setLang_dailyUserInstalls(lang_dailyUserInstalls);
    		}
    		if(lang_dailyUserUninstallsTemp !=0){
    			lang_dailyUserUninstalls.add(lang_dailyUserUninstallsTemp);
    			datiAggregati.setLang_dailyUserUninstalls(lang_dailyUserUninstalls);
    		}
    		if(lang_activeDeviceInstallsTemp !=0){
    			lang_activeDeviceInstalls.add(lang_activeDeviceInstallsTemp);
    			datiAggregati.setLang_activeDeviceInstalls(lang_activeDeviceInstalls);
    		}
    		if(osVersion_dailyUserInstallsTemp !=0){
    			osVersion_dailyUserInstalls.add(osVersion_dailyUserInstallsTemp);
    			datiAggregati.setOsVersion_dailyUserInstalls(osVersion_dailyUserInstalls);
    		}
    		if(osVersion_totUserInstallsTemp !=0){
    			osVersion_totUserInstalls.add(osVersion_totUserInstallsTemp);
    			datiAggregati.setOsVersion_totUserInstalls(osVersion_totUserInstalls);
    		}
    		if(osVersion_dailyUserUninstallsTemp !=0){
    			osVersion_dailyUserUninstalls.add(osVersion_dailyUserUninstallsTemp);
    			datiAggregati.setOsVersion_dailyUserUninstalls(osVersion_dailyUserUninstalls);
    		}
    		if(osVersion_activeDeviceInstallsTemp !=0){
    			osVersion_activeDeviceInstalls.add(osVersion_activeDeviceInstallsTemp);
    			datiAggregati.setOsVersion_activeDeviceInstalls(osVersion_activeDeviceInstalls);
    		}
    		if(tablet_totUserInstallsTemp !=0){
    			tablet_totUserInstalls.add(tablet_totUserInstallsTemp);
    			datiAggregati.setTablet_totUserInstalls(tablet_totUserInstalls);
    		}
    		if(tablet_dailyUserInstallsTemp !=0){
    			tablet_dailyUserInstalls.add(tablet_dailyUserInstallsTemp);
    			datiAggregati.setTablet_dailyUserInstalls(tablet_dailyUserInstalls);
    		}
    		if(tablet_dailyUserUninstallsTemp !=0){
    			tablet_dailyUserUninstalls.add(tablet_dailyUserUninstallsTemp);
    			datiAggregati.setTablet_dailyUserUninstalls(tablet_dailyUserUninstalls);
    		}
    		if(tablet_activeDeviceInstallsTemp !=0){
    			tablet_activeDeviceInstalls.add(tablet_activeDeviceInstallsTemp);
    			datiAggregati.setTablet_activeDeviceInstalls(tablet_activeDeviceInstalls);
    		}
    		if(daily_average_app_versionTemp !=0){
    			daily_average_app_version.add(daily_average_app_versionTemp);
    			datiAggregati.setDaily_average_app_version(daily_average_app_version);
    		}
    		if(total_average_app_versionTemp !=0){
    			total_average_app_version.add(total_average_app_versionTemp);
    			datiAggregati.setTotal_average_app_version(total_average_app_version);
    		}
    		if(daily_average_carrierTemp !=0){
    			daily_average_carrier.add(daily_average_carrierTemp);
    			datiAggregati.setDaily_average_carrier(daily_average_carrier);
    		}
    		if(total_average_carrierTemp !=0){
    			total_average_carrier.add(total_average_carrierTemp);
    			datiAggregati.setTotal_average_carrier(total_average_carrier);
    		}
    		if(daily_average_countryTemp !=0){
    			daily_average_country.add(daily_average_countryTemp);
    			datiAggregati.setDaily_average_country(daily_average_country);
    		}
    		if(total_average_countryTemp !=0){
    			total_average_country.add(total_average_countryTemp);
    			datiAggregati.setTotal_average_country(total_average_country);
    		}
    		if(daily_average_deviceTemp !=0){
    			daily_average_device.add(daily_average_deviceTemp);
    			datiAggregati.setDaily_average_device(daily_average_device);
    		}
    		if(total_average_deviceTemp !=0){
    			total_average_device.add(total_average_deviceTemp);
    			datiAggregati.setTotal_average_device(total_average_device);
    		}
    		if(daily_average_languageTemp !=0){
    			daily_average_language.add(daily_average_languageTemp);
    			datiAggregati.setDaily_average_language(daily_average_language);
    		}
    		if(total_average_languageTemp !=0){
    			total_average_language.add(total_average_languageTemp);
    			datiAggregati.setTotal_average_language(total_average_language);
    		}
    		if(daily_average_os_versionTemp !=0){
    			daily_average_os_version.add(daily_average_os_versionTemp);
    			datiAggregati.setDaily_average_os_version(daily_average_os_version);
    		}
    		if(total_average_os_versionTemp !=0){
    			total_average_os_version.add(total_average_os_versionTemp);
    			datiAggregati.setTotal_average_os_version(total_average_os_version);
    		}
    		if(daily_average_tabletTemp !=0){
    			daily_average_tablet.add(daily_average_tabletTemp);
    			datiAggregati.setDaily_average_tablet(daily_average_tablet);
    		}
    		if(total_average_tabletTemp !=0){
    			total_average_tablet.add(total_average_tabletTemp);
    			datiAggregati.setTotal_average_tablet(total_average_tablet);
    		}
    		if(daily_average_overviewTemp !=0){
    			daily_average_overview.add(daily_average_overviewTemp);
    			datiAggregati.setDaily_average_overview(daily_average_overview);
    		}
    		if(total_average_overviewTemp !=0){
    			total_average_overview.add(total_average_overviewTemp);
    			datiAggregati.setTotal_average_overview(total_average_overview);
    		}
    	} else if(apple){
    		// Non implementata per mancanza di dati
    	} else if(windows){
    		ArrayList<Integer> overview_dailyUserInstalls = new ArrayList<Integer>();
    		int overview_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> country_dailyUserInstalls = new ArrayList<Integer>();
    		int country_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> osVersion_dailyUserInstalls = new ArrayList<Integer>();
    		int osVersion_dailyUserInstallsTemp = 0;
    		ArrayList<Integer> failure_count = new ArrayList<Integer>();
    		int failure_countTemp = 0;
    		double count_new = 0;
    		double count_revised = 0;
    		ArrayList<Double> count_average = new ArrayList<Double>();
    		double count_averageTemp = 0;
    		ArrayList<Double> average_rating = new ArrayList<Double>();
    		double average_ratingTemp = 0;
    		ArrayList<Integer> number_rating = new ArrayList<Integer>();
    		int number_ratingTemp = 0;

    		Iterator<Integer> temp;
    		Iterator<Double> temp2;
    		for(int j = 0; j < datiApps.size(); j++){
    			Dati d = datiApps.get(j);
    			if(d.getOverview_dailyUserInstalls() != null && d.getOverview_dailyUserInstalls().size() != 0){
	    			temp = d.getOverview_dailyUserInstalls().iterator();
	    			while(temp.hasNext()){
	    				overview_dailyUserInstallsTemp += temp.next();
	    			}
    			}
    			if(d.getCountry_dailyUserInstalls() != null && d.getCountry_dailyUserInstalls().size() != 0){
    				temp = d.getCountry_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					country_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getOsVersion_dailyUserInstalls() != null && d.getOsVersion_dailyUserInstalls().size() != 0){
    				temp = d.getOsVersion_dailyUserInstalls().iterator();
    				while(temp.hasNext()){
    					osVersion_dailyUserInstallsTemp += temp.next();
    				}
    			}
    			if(d.getFailure_count() != null && d.getFailure_count().size() != 0){
    				temp = d.getFailure_count().iterator();
    				while(temp.hasNext()){
    					failure_countTemp += temp.next();
    				}
    			}
    			if(d.getCount_new() != 0){
					count_new += d.getCount_new();
    			}
    			if(d.getCount_revised() != 0){
    				count_revised += d.getCount_revised();
    			}
    			if(d.getCount_average() != null && d.getCount_average().size() != 0){
    				temp2 = d.getCount_average().iterator();
    				while(temp2.hasNext()){
    					count_averageTemp += temp2.next();
    				}
    			}
    			if(d.getAverage_rating() != null && d.getAverage_rating().size() != 0){
    				temp2 = d.getAverage_rating().iterator();
    				while(temp2.hasNext()){
    					average_ratingTemp += temp2.next();
    				}
    			}
    			if(d.getNumber_rating() != null && d.getNumber_rating().size() != 0){
    				temp = d.getNumber_rating().iterator();
    				while(temp.hasNext()){
    					number_ratingTemp += temp.next();
    				}
    			}
    		}
    		if(overview_dailyUserInstallsTemp !=0){
    			overview_dailyUserInstalls.add(overview_dailyUserInstallsTemp);
    			datiAggregati.setOverview_dailyUserInstalls(overview_dailyUserInstalls);    			
    		}
    		if(country_dailyUserInstallsTemp !=0){
    			country_dailyUserInstalls.add(country_dailyUserInstallsTemp);
    			datiAggregati.setCountry_dailyUserInstalls(country_dailyUserInstalls);
    		}
    		if(osVersion_dailyUserInstallsTemp !=0){
    			osVersion_dailyUserInstalls.add(osVersion_dailyUserInstallsTemp);
    			datiAggregati.setOsVersion_dailyUserInstalls(osVersion_dailyUserInstalls);
    		}
    		if(failure_countTemp !=0){
    			failure_count.add(failure_countTemp);
    			datiAggregati.setFailure_count(failure_count);
    		}
    		if(count_new !=0){
    			datiAggregati.setCount_new(count_new);
    		}
    		if(count_revised !=0){
    			datiAggregati.setCount_revised(count_revised);
    		}
    		if(count_averageTemp !=0){
    			count_average.add(count_averageTemp);
    			datiAggregati.setCount_average(count_average);
    		}
    		if(average_ratingTemp !=0){
    			average_rating.add(average_ratingTemp);
    			datiAggregati.setAverage_rating(average_rating);
    		}
    		if(number_ratingTemp !=0){
    			number_rating.add(number_ratingTemp);
    			datiAggregati.setNumber_rating(number_rating);
    		}
    	}
        /* Codice commentato perchè non deve essere testato
        // Salvo i dati aggregati permanentemente
    	FileIO fileIO = new FileIO("DatiAggregati" + this.nomeGruppo + ".dat");
        fileIO.salvaDati(datiAggregati);
        System.out.println("Dati aggregati salvati");*/
    }
    /**
     * Funzione per scaricare i dati di un Gruppo
     *
     * @return Il file contente i dati dell'App
     */
    public File scaricamentoDati(){

    	return null;
    }
}