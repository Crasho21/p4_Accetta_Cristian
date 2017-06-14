package p4_accetta_cristian_uc_4_5_13;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * Classe per definire l'oggetto Dati
 * @author Accetta Cristian
 */
public class Dati implements Serializable{

	private static final long serialVersionUID = 1L;
	/** Constanti per indicare la provenienza dell'App (cioè da quale AppStore è stata salvata)
	 * GOOGLE_PLAY_STORE = 1
	 * APPLE_STORE = 2
	 * WINDOWS_STORE = 3 */
	public final static int GOOGLE_PLAY_STORE = 1;
	public final static int APPLE_STORE = 2;
	public final static int WINDOWS_STORE = 3;
	
    /** Attributi */
	private String versione;
	private int provenienza;

    //############# INSTALLS
	
	//GOOGLEstore
	//Overview
	private ArrayList<String> overview_data;
	private ArrayList<Integer> overview_dailyUserInstalls;	//Anche WinStore (install)
	private ArrayList<Integer> overview_totUserInstalls;	
	private ArrayList<Integer> overview_dailyUserUninstalls;
	private ArrayList<Integer> overview_activeDeviceInstalls;
	
	//Aggregazione per carrier
	private ArrayList<String> carrier_data;
	private ArrayList<Integer> carrier_totUserInstalls;
	private ArrayList<Integer> carrier_dailyUserInstalls;
	private ArrayList<Integer> carrier_dailyUserUninstalls;
	private ArrayList<Integer> carrier_activeDeviceInstalls;

	//Aggregazione per paese
	private ArrayList<String> country_data;
	private ArrayList<Integer> country_dailyUserInstalls;	//Anche WinStore (install_markets)
	private ArrayList<Integer> country_totUserInstalls;
	private ArrayList<Integer> country_dailyUserUninstalls;
	private ArrayList<Integer> country_activeDeviceInstalls;
	
	//Aggregazione per device
	private ArrayList<String> device_data;
	private ArrayList<Integer> device_totUserInstalls;
	private ArrayList<Integer> device_dailyUserInstalls;
	private ArrayList<Integer> device_dailyUserUninstalls;
	private ArrayList<Integer> device_activeDeviceInstalls;
	
	//Aggregazione per lingua
	private ArrayList<String> lang_data;
	private ArrayList<Integer> lang_totUserInstalls;
	private ArrayList<Integer> lang_dailyUserInstalls;
	private ArrayList<Integer> lang_dailyUserUninstalls;
	private ArrayList<Integer> lang_activeDeviceInstalls;
	
	//Aggregazione per versione OS
	private ArrayList<String> osVersion_data;
	private ArrayList<Integer> osVersion_dailyUserInstalls;	//Anche WinStore (acquisition_os)
	private ArrayList<Integer> osVersion_totUserInstalls;
	private ArrayList<Integer> osVersion_dailyUserUninstalls;
	private ArrayList<Integer> osVersion_activeDeviceInstalls;
	
	//Aggregazione per tablet
	private ArrayList<String> tablet_data;
	private ArrayList<Integer> tablet_totUserInstalls;
	private ArrayList<Integer> tablet_dailyUserInstalls;
	private ArrayList<Integer> tablet_dailyUserUninstalls;
	private ArrayList<Integer> tablet_activeDeviceInstalls;
	
	
	//WINDOWSstore
	private ArrayList<String> failure_data;
	private ArrayList<Integer> failure_count;	//Da failure
	
	//################# REVIEW
	
	//GOOGLEstore
	private ArrayList<String> attributi; // ArrayList di attributi che vengono letti all'interno del file
    // App Version 
    private ArrayList<String> data_app_version;
    private String package_name_app_version;
    private ArrayList<String> app_version;
    private ArrayList<Double> daily_average_app_version;
	private ArrayList<Double> total_average_app_version;
	// Carrier
	private ArrayList<String> data_carrier;
	private String package_name_carrier;
	private ArrayList<String> carrier;
	private ArrayList<Double> daily_average_carrier;
    private ArrayList<Double> total_average_carrier;
    // Country
    private ArrayList<String> data_country;
	private String package_name_country;
	private ArrayList<String> country;
	private ArrayList<Double> daily_average_country;
    private ArrayList<Double> total_average_country;
    // Device
    private ArrayList<String> data_device;
	private String package_name_device;
	private ArrayList<String> device;
	private ArrayList<Double> daily_average_device;
    private ArrayList<Double> total_average_device;
    // Language
    private ArrayList<String> data_language;
   	private String package_name_language;
   	private ArrayList<String> language;
   	private ArrayList<Double> daily_average_language;
    private ArrayList<Double> total_average_language;
	// Os Version
    private ArrayList<String> data_os_version;
   	private String package_name_os_version;
   	private ArrayList<String> os_version;
   	private ArrayList<Double> daily_average_os_version;
    private ArrayList<Double> total_average_os_version;
    // Tablet
    private ArrayList<String> data_tablet;
   	private String package_name_tablet;
   	private ArrayList<String> tablet;
   	private ArrayList<Double> daily_average_tablet;
    private ArrayList<Double> total_average_tablet;
    // Overview
    private ArrayList<String> data_overview;
   	private String package_name_overview;
    private ArrayList<Double> daily_average_overview;
    private ArrayList<Double> total_average_overview;
    
    //WINDOWSstore
    
    // Rating new and revised
    private ArrayList<String> rating;
    private ArrayList<String> type;
    private double count_new;
    private double count_revised;
    // Rating average over time
    private String name;
    private ArrayList<String> date_win;
    private ArrayList<Double> count_average;
    // Rating market
    private ArrayList<String> market;
    private ArrayList<Double> average_rating;
    private ArrayList<Integer> number_rating;

	public String getVersione() {
		return versione;
	}
	
	public void setVersione(String versione) {
		this.versione = versione;
	}
	
	public int getProvenienza() {
		return provenienza;
	}
	
	public void setProvenienza(int provenienza) {
		this.provenienza = provenienza;
	}
	
	public ArrayList<String> getOverview_data() {
		return overview_data;
	}
	
	public void setOverview_data(ArrayList<String> overview_data) {
		this.overview_data = overview_data;
	}
	
	public ArrayList<Integer> getOverview_dailyUserInstalls() {
		return overview_dailyUserInstalls;
	}
	
	public void setOverview_dailyUserInstalls(ArrayList<Integer> overview_dailyUserInstalls) {
		this.overview_dailyUserInstalls = overview_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getOverview_totUserInstalls() {
		return overview_totUserInstalls;
	}
	
	public void setOverview_totUserInstalls(ArrayList<Integer> overview_totUserInstalls) {
		this.overview_totUserInstalls = overview_totUserInstalls;
	}
	
	public ArrayList<Integer> getOverview_dailyUserUninstalls() {
		return overview_dailyUserUninstalls;
	}
	
	public void setOverview_dailyUserUninstalls(ArrayList<Integer> overview_dailyUserUninstalls) {
		this.overview_dailyUserUninstalls = overview_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getOverview_activeDeviceInstalls() {
		return overview_activeDeviceInstalls;
	}
	
	public void setOverview_activeDeviceInstalls(ArrayList<Integer> overview_activeDeviceInstalls) {
		this.overview_activeDeviceInstalls = overview_activeDeviceInstalls;
	}
	
	public ArrayList<String> getCarrier_data() {
		return carrier_data;
	}
	
	public void setCarrier_data(ArrayList<String> carrier_data) {
		this.carrier_data = carrier_data;
	}
	
	public ArrayList<Integer> getCarrier_totUserInstalls() {
		return carrier_totUserInstalls;
	}
	
	public void setCarrier_totUserInstalls(ArrayList<Integer> carrier_totUserInstalls) {
		this.carrier_totUserInstalls = carrier_totUserInstalls;
	}
	
	public ArrayList<Integer> getCarrier_dailyUserInstalls() {
		return carrier_dailyUserInstalls;
	}
	
	public void setCarrier_dailyUserInstalls(ArrayList<Integer> carrier_dailyUserInstalls) {
		this.carrier_dailyUserInstalls = carrier_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getCarrier_dailyUserUninstalls() {
		return carrier_dailyUserUninstalls;
	}
	
	public void setCarrier_dailyUserUninstalls(ArrayList<Integer> carrier_dailyUserUninstalls) {
		this.carrier_dailyUserUninstalls = carrier_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getCarrier_activeDeviceInstalls() {
		return carrier_activeDeviceInstalls;
	}
	
	public void setCarrier_activeDeviceInstalls(ArrayList<Integer> carrier_activeDeviceInstalls) {
		this.carrier_activeDeviceInstalls = carrier_activeDeviceInstalls;
	}
	
	public ArrayList<String> getCountry_data() {
		return country_data;
	}
	
	public void setCountry_data(ArrayList<String> country_data) {
		this.country_data = country_data;
	}
	
	public ArrayList<Integer> getCountry_dailyUserInstalls() {
		return country_dailyUserInstalls;
	}
	
	public void setCountry_dailyUserInstalls(ArrayList<Integer> country_dailyUserInstalls) {
		this.country_dailyUserInstalls = country_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getCountry_totUserInstalls() {
		return country_totUserInstalls;
	}
	
	public void setCountry_totUserInstalls(ArrayList<Integer> country_totUserInstalls) {
		this.country_totUserInstalls = country_totUserInstalls;
	}
	
	public ArrayList<Integer> getCountry_dailyUserUninstalls() {
		return country_dailyUserUninstalls;
	}
	
	public void setCountry_dailyUserUninstalls(ArrayList<Integer> country_dailyUserUninstalls) {
		this.country_dailyUserUninstalls = country_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getCountry_activeDeviceInstalls() {
		return country_activeDeviceInstalls;
	}
	
	public void setCountry_activeDeviceInstalls(ArrayList<Integer> country_activeDeviceInstalls) {
		this.country_activeDeviceInstalls = country_activeDeviceInstalls;
	}
	
	public ArrayList<String> getDevice_data() {
		return device_data;
	}
	
	public void setDevice_data(ArrayList<String> device_data) {
		this.device_data = device_data;
	}
	
	public ArrayList<Integer> getDevice_totUserInstalls() {
		return device_totUserInstalls;
	}
	
	public void setDevice_totUserInstalls(ArrayList<Integer> device_totUserInstalls) {
		this.device_totUserInstalls = device_totUserInstalls;
	}
	
	public ArrayList<Integer> getDevice_dailyUserInstalls() {
		return device_dailyUserInstalls;
	}
	
	public void setDevice_dailyUserInstalls(ArrayList<Integer> device_dailyUserInstalls) {
		this.device_dailyUserInstalls = device_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getDevice_dailyUserUninstalls() {
		return device_dailyUserUninstalls;
	}
	
	public void setDevice_dailyUserUninstalls(ArrayList<Integer> device_dailyUserUninstalls) {
		this.device_dailyUserUninstalls = device_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getDevice_activeDeviceInstalls() {
		return device_activeDeviceInstalls;
	}
	
	public void setDevice_activeDeviceInstalls(ArrayList<Integer> device_activeDeviceInstalls) {
		this.device_activeDeviceInstalls = device_activeDeviceInstalls;
	}
	
	public ArrayList<String> getLang_data() {
		return lang_data;
	}
	
	public void setLang_data(ArrayList<String> lang_data) {
		this.lang_data = lang_data;
	}
	
	public ArrayList<Integer> getLang_totUserInstalls() {
		return lang_totUserInstalls;
	}
	
	public void setLang_totUserInstalls(ArrayList<Integer> lang_totUserInstalls) {
		this.lang_totUserInstalls = lang_totUserInstalls;
	}
	
	public ArrayList<Integer> getLang_dailyUserInstalls() {
		return lang_dailyUserInstalls;
	}
	
	public void setLang_dailyUserInstalls(ArrayList<Integer> lang_dailyUserInstalls) {
		this.lang_dailyUserInstalls = lang_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getLang_dailyUserUninstalls() {
		return lang_dailyUserUninstalls;
	}
	
	public void setLang_dailyUserUninstalls(ArrayList<Integer> lang_dailyUserUninstalls) {
		this.lang_dailyUserUninstalls = lang_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getLang_activeDeviceInstalls() {
		return lang_activeDeviceInstalls;
	}
	
	public void setLang_activeDeviceInstalls(ArrayList<Integer> lang_activeDeviceInstalls) {
		this.lang_activeDeviceInstalls = lang_activeDeviceInstalls;
	}
	
	public ArrayList<String> getOsVersion_data() {
		return osVersion_data;
	}
	
	public void setOsVersion_data(ArrayList<String> osVersion_data) {
		this.osVersion_data = osVersion_data;
	}
	
	public ArrayList<Integer> getOsVersion_dailyUserInstalls() {
		return osVersion_dailyUserInstalls;
	}
	
	public void setOsVersion_dailyUserInstalls(ArrayList<Integer> osVersion_dailyUserInstalls) {
		this.osVersion_dailyUserInstalls = osVersion_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getOsVersion_totUserInstalls() {
		return osVersion_totUserInstalls;
	}
	
	public void setOsVersion_totUserInstalls(ArrayList<Integer> osVersion_totUserInstalls) {
		this.osVersion_totUserInstalls = osVersion_totUserInstalls;
	}
	
	public ArrayList<Integer> getOsVersion_dailyUserUninstalls() {
		return osVersion_dailyUserUninstalls;
	}
	
	public void setOsVersion_dailyUserUninstalls(ArrayList<Integer> osVersion_dailyUserUninstalls) {
		this.osVersion_dailyUserUninstalls = osVersion_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getOsVersion_activeDeviceInstalls() {
		return osVersion_activeDeviceInstalls;
	}
	
	public void setOsVersion_activeDeviceInstalls(ArrayList<Integer> osVersion_activeDeviceInstalls) {
		this.osVersion_activeDeviceInstalls = osVersion_activeDeviceInstalls;
	}
	
	public ArrayList<String> getTablet_data() {
		return tablet_data;
	}
	
	public void setTablet_data(ArrayList<String> tablet_data) {
		this.tablet_data = tablet_data;
	}
	
	public ArrayList<Integer> getTablet_totUserInstalls() {
		return tablet_totUserInstalls;
	}
	
	public void setTablet_totUserInstalls(ArrayList<Integer> tablet_totUserInstalls) {
		this.tablet_totUserInstalls = tablet_totUserInstalls;
	}
	
	public ArrayList<Integer> getTablet_dailyUserInstalls() {
		return tablet_dailyUserInstalls;
	}
	
	public void setTablet_dailyUserInstalls(ArrayList<Integer> tablet_dailyUserInstalls) {
		this.tablet_dailyUserInstalls = tablet_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getTablet_dailyUserUninstalls() {
		return tablet_dailyUserUninstalls;
	}
	
	public void setTablet_dailyUserUninstalls(ArrayList<Integer> tablet_dailyUserUninstalls) {
		this.tablet_dailyUserUninstalls = tablet_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getTablet_activeDeviceInstalls() {
		return tablet_activeDeviceInstalls;
	}
	
	public void setTablet_activeDeviceInstalls(ArrayList<Integer> tablet_activeDeviceInstalls) {
		this.tablet_activeDeviceInstalls = tablet_activeDeviceInstalls;
	}
	
	public ArrayList<String> getFailure_data() {
		return failure_data;
	}
	
	public void setFailure_data(ArrayList<String> failure_data) {
		this.failure_data = failure_data;
	}
	
	public ArrayList<Integer> getFailure_count() {
		return failure_count;
	}
	
	public void setFailure_count(ArrayList<Integer> failure_count) {
		this.failure_count = failure_count;
	}
	
	public ArrayList<String> getAttributi() {
		return attributi;
	}
	
	public void setAttributi(ArrayList<String> attributi) {
		this.attributi = attributi;
	}
	
	public ArrayList<String> getData_app_version() {
		return data_app_version;
	}
	
	public void setData_app_version(ArrayList<String> data_app_version) {
		this.data_app_version = data_app_version;
	}
	
	public String getPackage_name_app_version() {
		return package_name_app_version;
	}
	
	public void setPackage_name_app_version(String package_name_app_version) {
		this.package_name_app_version = package_name_app_version;
	}
	
	public ArrayList<String> getApp_version() {
		return app_version;
	}
	
	public void setApp_version(ArrayList<String> app_version) {
		this.app_version = app_version;
	}
	
	public ArrayList<Double> getDaily_average_app_version() {
		return daily_average_app_version;
	}
	
	public void setDaily_average_app_version(ArrayList<Double> daily_average_app_version) {
		this.daily_average_app_version = daily_average_app_version;
	}
	
	public ArrayList<Double> getTotal_average_app_version() {
		return total_average_app_version;
	}
	
	public void setTotal_average_app_version(ArrayList<Double> total_average_app_version) {
		this.total_average_app_version = total_average_app_version;
	}
	
	public ArrayList<String> getData_carrier() {
		return data_carrier;
	}
	
	public void setData_carrier(ArrayList<String> data_carrier) {
		this.data_carrier = data_carrier;
	}
	
	public String getPackage_name_carrier() {
		return package_name_carrier;
	}
	
	public void setPackage_name_carrier(String package_name_carrier) {
		this.package_name_carrier = package_name_carrier;
	}
	
	public ArrayList<String> getCarrier() {
		return carrier;
	}
	
	public void setCarrier(ArrayList<String> carrier) {
		this.carrier = carrier;
	}
	
	public ArrayList<Double> getDaily_average_carrier() {
		return daily_average_carrier;
	}
	
	public void setDaily_average_carrier(ArrayList<Double> daily_average_carrier) {
		this.daily_average_carrier = daily_average_carrier;
	}
	
	public ArrayList<Double> getTotal_average_carrier() {
		return total_average_carrier;
	}
	
	public void setTotal_average_carrier(ArrayList<Double> total_average_carrier) {
		this.total_average_carrier = total_average_carrier;
	}
	
	public ArrayList<String> getData_country() {
		return data_country;
	}
	
	public void setData_country(ArrayList<String> data_country) {
		this.data_country = data_country;
	}
	
	public String getPackage_name_country() {
		return package_name_country;
	}
	
	public void setPackage_name_country(String package_name_country) {
		this.package_name_country = package_name_country;
	}
	
	public ArrayList<String> getCountry() {
		return country;
	}
	
	public void setCountry(ArrayList<String> country) {
		this.country = country;
	}
	
	public ArrayList<Double> getDaily_average_country() {
		return daily_average_country;
	}
	
	public void setDaily_average_country(ArrayList<Double> daily_average_country) {
		this.daily_average_country = daily_average_country;
	}
	
	public ArrayList<Double> getTotal_average_country() {
		return total_average_country;
	}
	
	public void setTotal_average_country(ArrayList<Double> total_average_country) {
		this.total_average_country = total_average_country;
	}
	
	public ArrayList<String> getData_device() {
		return data_device;
	}
	
	public void setData_device(ArrayList<String> data_device) {
		this.data_device = data_device;
	}
	
	public String getPackage_name_device() {
		return package_name_device;
	}
	
	public void setPackage_name_device(String package_name_device) {
		this.package_name_device = package_name_device;
	}
	
	public ArrayList<String> getDevice() {
		return device;
	}
	
	public void setDevice(ArrayList<String> device) {
		this.device = device;
	}
	
	public ArrayList<Double> getDaily_average_device() {
		return daily_average_device;
	}
	
	public void setDaily_average_device(ArrayList<Double> daily_average_device) {
		this.daily_average_device = daily_average_device;
	}
	
	public ArrayList<Double> getTotal_average_device() {
		return total_average_device;
	}
	
	public void setTotal_average_device(ArrayList<Double> total_average_device) {
		this.total_average_device = total_average_device;
	}
	
	public ArrayList<String> getData_language() {
		return data_language;
	}
	
	public void setData_language(ArrayList<String> data_language) {
		this.data_language = data_language;
	}
	
	public String getPackage_name_language() {
		return package_name_language;
	}
	
	public void setPackage_name_language(String package_name_language) {
		this.package_name_language = package_name_language;
	}
	
	public ArrayList<String> getLanguage() {
		return language;
	}
	
	public void setLanguage(ArrayList<String> language) {
		this.language = language;
	}
	
	public ArrayList<Double> getDaily_average_language() {
		return daily_average_language;
	}
	
	public void setDaily_average_language(ArrayList<Double> daily_average_language) {
		this.daily_average_language = daily_average_language;
	}
	
	public ArrayList<Double> getTotal_average_language() {
		return total_average_language;
	}
	
	public void setTotal_average_language(ArrayList<Double> total_average_language) {
		this.total_average_language = total_average_language;
	}
	
	public ArrayList<String> getData_os_version() {
		return data_os_version;
	}
	
	public void setData_os_version(ArrayList<String> data_os_version) {
		this.data_os_version = data_os_version;
	}
	
	public String getPackage_name_os_version() {
		return package_name_os_version;
	}
	
	public void setPackage_name_os_version(String package_name_os_version) {
		this.package_name_os_version = package_name_os_version;
	}
	
	public ArrayList<String> getOs_version() {
		return os_version;
	}
	
	public void setOs_version(ArrayList<String> os_version) {
		this.os_version = os_version;
	}
	
	public ArrayList<Double> getDaily_average_os_version() {
		return daily_average_os_version;
	}
	
	public void setDaily_average_os_version(ArrayList<Double> daily_average_os_version) {
		this.daily_average_os_version = daily_average_os_version;
	}
	
	public ArrayList<Double> getTotal_average_os_version() {
		return total_average_os_version;
	}
	
	public void setTotal_average_os_version(ArrayList<Double> total_average_os_version) {
		this.total_average_os_version = total_average_os_version;
	}
	
	public ArrayList<String> getData_tablet() {
		return data_tablet;
	}
	
	public void setData_tablet(ArrayList<String> data_tablet) {
		this.data_tablet = data_tablet;
	}
	
	public String getPackage_name_tablet() {
		return package_name_tablet;
	}
	
	public void setPackage_name_tablet(String package_name_tablet) {
		this.package_name_tablet = package_name_tablet;
	}
	
	public ArrayList<String> getTablet() {
		return tablet;
	}
	
	public void setTablet(ArrayList<String> tablet) {
		this.tablet = tablet;
	}
	
	public ArrayList<Double> getDaily_average_tablet() {
		return daily_average_tablet;
	}
	
	public void setDaily_average_tablet(ArrayList<Double> daily_average_tablet) {
		this.daily_average_tablet = daily_average_tablet;
	}
	
	public ArrayList<Double> getTotal_average_tablet() {
		return total_average_tablet;
	}
	
	public void setTotal_average_tablet(ArrayList<Double> total_average_tablet) {
		this.total_average_tablet = total_average_tablet;
	}
	
	public ArrayList<String> getData_overview() {
		return data_overview;
	}
	
	public void setData_overview(ArrayList<String> data_overview) {
		this.data_overview = data_overview;
	}
	
	public String getPackage_name_overview() {
		return package_name_overview;
	}
	
	public void setPackage_name_overview(String package_name_overview) {
		this.package_name_overview = package_name_overview;
	}
	
	public ArrayList<Double> getDaily_average_overview() {
		return daily_average_overview;
	}
	
	public void setDaily_average_overview(ArrayList<Double> daily_average_overview) {
		this.daily_average_overview = daily_average_overview;
	}
	
	public ArrayList<Double> getTotal_average_overview() {
		return total_average_overview;
	}
	
	public void setTotal_average_overview(ArrayList<Double> total_average_overview) {
		this.total_average_overview = total_average_overview;
	}
	
	public ArrayList<String> getRating() {
		return rating;
	}
	
	public void setRating(ArrayList<String> rating) {
		this.rating = rating;
	}
	
	public ArrayList<String> getType() {
		return type;
	}
	
	public void setType(ArrayList<String> type) {
		this.type = type;
	}
	
	public double getCount_new() {
		return count_new;
	}
	
	public void setCount_new(double count_new) {
		this.count_new = count_new;
	}
	
	public double getCount_revised() {
		return count_revised;
	}
	
	public void setCount_revised(double count_revised) {
		this.count_revised = count_revised;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getDate_win() {
		return date_win;
	}
	
	public void setDate_win(ArrayList<String> date_win) {
		this.date_win = date_win;
	}
	
	public ArrayList<Double> getCount_average() {
		return count_average;
	}
	
	public void setCount_average(ArrayList<Double> count_average) {
		this.count_average = count_average;
	}
	
	public ArrayList<String> getMarket() {
		return market;
	}
	
	public void setMarket(ArrayList<String> market) {
		this.market = market;
	}
	
	public ArrayList<Double> getAverage_rating() {
		return average_rating;
	}
	
	public void setAverage_rating(ArrayList<Double> average_rating) {
		this.average_rating = average_rating;
	}
	
	public ArrayList<Integer> getNumber_rating() {
		return number_rating;
	}
	
	public void setNumber_rating(ArrayList<Integer> number_rating) {
		this.number_rating = number_rating;
	}
	
	// /**
	//  * Metodo toString per stampare i dati provenienti dal Google Play Store
	//  */
	/*public String toStringGoogle(){
		return this.overview_dailyUserInstalls + "\n" + 
				this.overview_dailyUserUninstalls + "\n" +
				this.overview_totUserInstalls + "\n" +
				this.overview_activeDeviceInstalls + "\n" +
	    		this.carrier_totUserInstalls + "\n" +
	    		this.carrier_dailyUserInstalls + "\n" +
	    		this.carrier_dailyUserUninstalls + "\n" +
	    		this.carrier_activeDeviceInstalls + "\n" +
	    		this.country_dailyUserInstalls + "\n" +
	    		this.country_totUserInstalls + "\n" +
	    		this.country_dailyUserUninstalls + "\n" +
	    		this.country_activeDeviceInstalls + "\n" +
	    		this.device_totUserInstalls + "\n" +
	    		this.device_dailyUserInstalls + "\n" +
				this.device_dailyUserUninstalls + "\n" +
				this.device_activeDeviceInstalls + "\n" +
				this.lang_totUserInstalls + "\n" +
				this.lang_dailyUserInstalls + "\n" +
				this.lang_dailyUserUninstalls + "\n" +
				this.lang_activeDeviceInstalls + "\n" +
				this.osVersion_dailyUserInstalls + "\n" +
				this.osVersion_totUserInstalls + "\n" +
				this.osVersion_dailyUserUninstalls + "\n" +
				this.osVersion_activeDeviceInstalls + "\n" +
				this.tablet_totUserInstalls + "\n" +
				this.tablet_dailyUserInstalls + "\n" +
				this.tablet_dailyUserUninstalls + "\n" +
				this.tablet_activeDeviceInstalls + "\n" +
				this.daily_average_app_version + "\n" +
				this.total_average_app_version + "\n" +
				this.daily_average_carrier + "\n" +
				this.total_average_carrier + "\n" +
				this.daily_average_country + "\n" +
				this.total_average_country + "\n" +
	    		this.daily_average_device + "\n" +
	    		this.total_average_device + "\n" +
	    		this.daily_average_language + "\n" +
	    		this.total_average_language + "\n" +
	    		this.daily_average_os_version + "\n" +
	    		this.total_average_os_version + "\n" +
	    		this.daily_average_tablet + "\n" +
	    		this.total_average_tablet + "\n" +
	    		this.daily_average_overview + "\n" +
	    		this.total_average_overview;
	}*/
	
	// /**
	//  * Metodo toString per stampare i dati provenienti sia dal Google Play Store sia dal Windows Store
	//  */
	/*public String toStringGoogleWindows() {
		return this.overview_dailyUserInstalls + "\n" +
				this.country_dailyUserInstalls + "\n" +
				this.osVersion_dailyUserInstalls;
	}*/
	
	// /**
	//  * Metodo toString per stampare i dati provenienti dal Windows Store
	//  */
	/*public String toStringWindows() {
		return this.overview_dailyUserInstalls + "\n" +
				this.country_dailyUserInstalls + "\n" +
				this.osVersion_dailyUserInstalls + "\n" +
				this.failure_count + "\n" +
				this.count_new + "\n" +
				this.count_revised + "\n" +
				this.count_average + "\n" +
				this.average_rating + "\n" +
				this.number_rating;
	}*/

	/**
	 * Override del metodo hashCode generato automaticamente per utilizzare correttamente assertEquals
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((app_version == null) ? 0 : app_version.hashCode());
		result = prime * result + ((attributi == null) ? 0 : attributi.hashCode());
		result = prime * result + ((average_rating == null) ? 0 : average_rating.hashCode());
		result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
		result = prime * result
				+ ((carrier_activeDeviceInstalls == null) ? 0 : carrier_activeDeviceInstalls.hashCode());
		result = prime * result + ((carrier_dailyUserInstalls == null) ? 0 : carrier_dailyUserInstalls.hashCode());
		result = prime * result + ((carrier_dailyUserUninstalls == null) ? 0 : carrier_dailyUserUninstalls.hashCode());
		result = prime * result + ((carrier_data == null) ? 0 : carrier_data.hashCode());
		result = prime * result + ((carrier_totUserInstalls == null) ? 0 : carrier_totUserInstalls.hashCode());
		result = prime * result + ((count_average == null) ? 0 : count_average.hashCode());
		long temp;
		temp = Double.doubleToLongBits(count_new);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(count_revised);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((country_activeDeviceInstalls == null) ? 0 : country_activeDeviceInstalls.hashCode());
		result = prime * result + ((country_dailyUserInstalls == null) ? 0 : country_dailyUserInstalls.hashCode());
		result = prime * result + ((country_dailyUserUninstalls == null) ? 0 : country_dailyUserUninstalls.hashCode());
		result = prime * result + ((country_data == null) ? 0 : country_data.hashCode());
		result = prime * result + ((country_totUserInstalls == null) ? 0 : country_totUserInstalls.hashCode());
		result = prime * result + ((daily_average_app_version == null) ? 0 : daily_average_app_version.hashCode());
		result = prime * result + ((daily_average_carrier == null) ? 0 : daily_average_carrier.hashCode());
		result = prime * result + ((daily_average_country == null) ? 0 : daily_average_country.hashCode());
		result = prime * result + ((daily_average_device == null) ? 0 : daily_average_device.hashCode());
		result = prime * result + ((daily_average_language == null) ? 0 : daily_average_language.hashCode());
		result = prime * result + ((daily_average_os_version == null) ? 0 : daily_average_os_version.hashCode());
		result = prime * result + ((daily_average_overview == null) ? 0 : daily_average_overview.hashCode());
		result = prime * result + ((daily_average_tablet == null) ? 0 : daily_average_tablet.hashCode());
		result = prime * result + ((data_app_version == null) ? 0 : data_app_version.hashCode());
		result = prime * result + ((data_carrier == null) ? 0 : data_carrier.hashCode());
		result = prime * result + ((data_country == null) ? 0 : data_country.hashCode());
		result = prime * result + ((data_device == null) ? 0 : data_device.hashCode());
		result = prime * result + ((data_language == null) ? 0 : data_language.hashCode());
		result = prime * result + ((data_os_version == null) ? 0 : data_os_version.hashCode());
		result = prime * result + ((data_overview == null) ? 0 : data_overview.hashCode());
		result = prime * result + ((data_tablet == null) ? 0 : data_tablet.hashCode());
		result = prime * result + ((date_win == null) ? 0 : date_win.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((device_activeDeviceInstalls == null) ? 0 : device_activeDeviceInstalls.hashCode());
		result = prime * result + ((device_dailyUserInstalls == null) ? 0 : device_dailyUserInstalls.hashCode());
		result = prime * result + ((device_dailyUserUninstalls == null) ? 0 : device_dailyUserUninstalls.hashCode());
		result = prime * result + ((device_data == null) ? 0 : device_data.hashCode());
		result = prime * result + ((device_totUserInstalls == null) ? 0 : device_totUserInstalls.hashCode());
		result = prime * result + ((failure_count == null) ? 0 : failure_count.hashCode());
		result = prime * result + ((failure_data == null) ? 0 : failure_data.hashCode());
		result = prime * result + ((lang_activeDeviceInstalls == null) ? 0 : lang_activeDeviceInstalls.hashCode());
		result = prime * result + ((lang_dailyUserInstalls == null) ? 0 : lang_dailyUserInstalls.hashCode());
		result = prime * result + ((lang_dailyUserUninstalls == null) ? 0 : lang_dailyUserUninstalls.hashCode());
		result = prime * result + ((lang_data == null) ? 0 : lang_data.hashCode());
		result = prime * result + ((lang_totUserInstalls == null) ? 0 : lang_totUserInstalls.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number_rating == null) ? 0 : number_rating.hashCode());
		result = prime * result
				+ ((osVersion_activeDeviceInstalls == null) ? 0 : osVersion_activeDeviceInstalls.hashCode());
		result = prime * result + ((osVersion_dailyUserInstalls == null) ? 0 : osVersion_dailyUserInstalls.hashCode());
		result = prime * result
				+ ((osVersion_dailyUserUninstalls == null) ? 0 : osVersion_dailyUserUninstalls.hashCode());
		result = prime * result + ((osVersion_data == null) ? 0 : osVersion_data.hashCode());
		result = prime * result + ((osVersion_totUserInstalls == null) ? 0 : osVersion_totUserInstalls.hashCode());
		result = prime * result + ((os_version == null) ? 0 : os_version.hashCode());
		result = prime * result
				+ ((overview_activeDeviceInstalls == null) ? 0 : overview_activeDeviceInstalls.hashCode());
		result = prime * result + ((overview_dailyUserInstalls == null) ? 0 : overview_dailyUserInstalls.hashCode());
		result = prime * result
				+ ((overview_dailyUserUninstalls == null) ? 0 : overview_dailyUserUninstalls.hashCode());
		result = prime * result + ((overview_data == null) ? 0 : overview_data.hashCode());
		result = prime * result + ((overview_totUserInstalls == null) ? 0 : overview_totUserInstalls.hashCode());
		result = prime * result + ((package_name_app_version == null) ? 0 : package_name_app_version.hashCode());
		result = prime * result + ((package_name_carrier == null) ? 0 : package_name_carrier.hashCode());
		result = prime * result + ((package_name_country == null) ? 0 : package_name_country.hashCode());
		result = prime * result + ((package_name_device == null) ? 0 : package_name_device.hashCode());
		result = prime * result + ((package_name_language == null) ? 0 : package_name_language.hashCode());
		result = prime * result + ((package_name_os_version == null) ? 0 : package_name_os_version.hashCode());
		result = prime * result + ((package_name_overview == null) ? 0 : package_name_overview.hashCode());
		result = prime * result + ((package_name_tablet == null) ? 0 : package_name_tablet.hashCode());
		result = prime * result + provenienza;
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((tablet == null) ? 0 : tablet.hashCode());
		result = prime * result + ((tablet_activeDeviceInstalls == null) ? 0 : tablet_activeDeviceInstalls.hashCode());
		result = prime * result + ((tablet_dailyUserInstalls == null) ? 0 : tablet_dailyUserInstalls.hashCode());
		result = prime * result + ((tablet_dailyUserUninstalls == null) ? 0 : tablet_dailyUserUninstalls.hashCode());
		result = prime * result + ((tablet_data == null) ? 0 : tablet_data.hashCode());
		result = prime * result + ((tablet_totUserInstalls == null) ? 0 : tablet_totUserInstalls.hashCode());
		result = prime * result + ((total_average_app_version == null) ? 0 : total_average_app_version.hashCode());
		result = prime * result + ((total_average_carrier == null) ? 0 : total_average_carrier.hashCode());
		result = prime * result + ((total_average_country == null) ? 0 : total_average_country.hashCode());
		result = prime * result + ((total_average_device == null) ? 0 : total_average_device.hashCode());
		result = prime * result + ((total_average_language == null) ? 0 : total_average_language.hashCode());
		result = prime * result + ((total_average_os_version == null) ? 0 : total_average_os_version.hashCode());
		result = prime * result + ((total_average_overview == null) ? 0 : total_average_overview.hashCode());
		result = prime * result + ((total_average_tablet == null) ? 0 : total_average_tablet.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((versione == null) ? 0 : versione.hashCode());
		return result;
	}

	/**
	 * Override del metodo equals generato automaticamente per utilizzare correttamente assertEquals
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dati other = (Dati) obj;
		if (app_version == null) {
			if (other.app_version != null)
				return false;
		} else if (!app_version.equals(other.app_version))
			return false;
		if (attributi == null) {
			if (other.attributi != null)
				return false;
		} else if (!attributi.equals(other.attributi))
			return false;
		if (average_rating == null) {
			if (other.average_rating != null)
				return false;
		} else if (!average_rating.equals(other.average_rating))
			return false;
		if (carrier == null) {
			if (other.carrier != null)
				return false;
		} else if (!carrier.equals(other.carrier))
			return false;
		if (carrier_activeDeviceInstalls == null) {
			if (other.carrier_activeDeviceInstalls != null)
				return false;
		} else if (!carrier_activeDeviceInstalls.equals(other.carrier_activeDeviceInstalls))
			return false;
		if (carrier_dailyUserInstalls == null) {
			if (other.carrier_dailyUserInstalls != null)
				return false;
		} else if (!carrier_dailyUserInstalls.equals(other.carrier_dailyUserInstalls))
			return false;
		if (carrier_dailyUserUninstalls == null) {
			if (other.carrier_dailyUserUninstalls != null)
				return false;
		} else if (!carrier_dailyUserUninstalls.equals(other.carrier_dailyUserUninstalls))
			return false;
		if (carrier_data == null) {
			if (other.carrier_data != null)
				return false;
		} else if (!carrier_data.equals(other.carrier_data))
			return false;
		if (carrier_totUserInstalls == null) {
			if (other.carrier_totUserInstalls != null)
				return false;
		} else if (!carrier_totUserInstalls.equals(other.carrier_totUserInstalls))
			return false;
		if (count_average == null) {
			if (other.count_average != null)
				return false;
		} else if (!count_average.equals(other.count_average))
			return false;
		if (Double.doubleToLongBits(count_new) != Double.doubleToLongBits(other.count_new))
			return false;
		if (Double.doubleToLongBits(count_revised) != Double.doubleToLongBits(other.count_revised))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (country_activeDeviceInstalls == null) {
			if (other.country_activeDeviceInstalls != null)
				return false;
		} else if (!country_activeDeviceInstalls.equals(other.country_activeDeviceInstalls))
			return false;
		if (country_dailyUserInstalls == null) {
			if (other.country_dailyUserInstalls != null)
				return false;
		} else if (!country_dailyUserInstalls.equals(other.country_dailyUserInstalls))
			return false;
		if (country_dailyUserUninstalls == null) {
			if (other.country_dailyUserUninstalls != null)
				return false;
		} else if (!country_dailyUserUninstalls.equals(other.country_dailyUserUninstalls))
			return false;
		if (country_data == null) {
			if (other.country_data != null)
				return false;
		} else if (!country_data.equals(other.country_data))
			return false;
		if (country_totUserInstalls == null) {
			if (other.country_totUserInstalls != null)
				return false;
		} else if (!country_totUserInstalls.equals(other.country_totUserInstalls))
			return false;
		if (daily_average_app_version == null) {
			if (other.daily_average_app_version != null)
				return false;
		} else if (!daily_average_app_version.equals(other.daily_average_app_version))
			return false;
		if (daily_average_carrier == null) {
			if (other.daily_average_carrier != null)
				return false;
		} else if (!daily_average_carrier.equals(other.daily_average_carrier))
			return false;
		if (daily_average_country == null) {
			if (other.daily_average_country != null)
				return false;
		} else if (!daily_average_country.equals(other.daily_average_country))
			return false;
		if (daily_average_device == null) {
			if (other.daily_average_device != null)
				return false;
		} else if (!daily_average_device.equals(other.daily_average_device))
			return false;
		if (daily_average_language == null) {
			if (other.daily_average_language != null)
				return false;
		} else if (!daily_average_language.equals(other.daily_average_language))
			return false;
		if (daily_average_os_version == null) {
			if (other.daily_average_os_version != null)
				return false;
		} else if (!daily_average_os_version.equals(other.daily_average_os_version))
			return false;
		if (daily_average_overview == null) {
			if (other.daily_average_overview != null)
				return false;
		} else if (!daily_average_overview.equals(other.daily_average_overview))
			return false;
		if (daily_average_tablet == null) {
			if (other.daily_average_tablet != null)
				return false;
		} else if (!daily_average_tablet.equals(other.daily_average_tablet))
			return false;
		if (data_app_version == null) {
			if (other.data_app_version != null)
				return false;
		} else if (!data_app_version.equals(other.data_app_version))
			return false;
		if (data_carrier == null) {
			if (other.data_carrier != null)
				return false;
		} else if (!data_carrier.equals(other.data_carrier))
			return false;
		if (data_country == null) {
			if (other.data_country != null)
				return false;
		} else if (!data_country.equals(other.data_country))
			return false;
		if (data_device == null) {
			if (other.data_device != null)
				return false;
		} else if (!data_device.equals(other.data_device))
			return false;
		if (data_language == null) {
			if (other.data_language != null)
				return false;
		} else if (!data_language.equals(other.data_language))
			return false;
		if (data_os_version == null) {
			if (other.data_os_version != null)
				return false;
		} else if (!data_os_version.equals(other.data_os_version))
			return false;
		if (data_overview == null) {
			if (other.data_overview != null)
				return false;
		} else if (!data_overview.equals(other.data_overview))
			return false;
		if (data_tablet == null) {
			if (other.data_tablet != null)
				return false;
		} else if (!data_tablet.equals(other.data_tablet))
			return false;
		if (date_win == null) {
			if (other.date_win != null)
				return false;
		} else if (!date_win.equals(other.date_win))
			return false;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		if (device_activeDeviceInstalls == null) {
			if (other.device_activeDeviceInstalls != null)
				return false;
		} else if (!device_activeDeviceInstalls.equals(other.device_activeDeviceInstalls))
			return false;
		if (device_dailyUserInstalls == null) {
			if (other.device_dailyUserInstalls != null)
				return false;
		} else if (!device_dailyUserInstalls.equals(other.device_dailyUserInstalls))
			return false;
		if (device_dailyUserUninstalls == null) {
			if (other.device_dailyUserUninstalls != null)
				return false;
		} else if (!device_dailyUserUninstalls.equals(other.device_dailyUserUninstalls))
			return false;
		if (device_data == null) {
			if (other.device_data != null)
				return false;
		} else if (!device_data.equals(other.device_data))
			return false;
		if (device_totUserInstalls == null) {
			if (other.device_totUserInstalls != null)
				return false;
		} else if (!device_totUserInstalls.equals(other.device_totUserInstalls))
			return false;
		if (failure_count == null) {
			if (other.failure_count != null)
				return false;
		} else if (!failure_count.equals(other.failure_count))
			return false;
		if (failure_data == null) {
			if (other.failure_data != null)
				return false;
		} else if (!failure_data.equals(other.failure_data))
			return false;
		if (lang_activeDeviceInstalls == null) {
			if (other.lang_activeDeviceInstalls != null)
				return false;
		} else if (!lang_activeDeviceInstalls.equals(other.lang_activeDeviceInstalls))
			return false;
		if (lang_dailyUserInstalls == null) {
			if (other.lang_dailyUserInstalls != null)
				return false;
		} else if (!lang_dailyUserInstalls.equals(other.lang_dailyUserInstalls))
			return false;
		if (lang_dailyUserUninstalls == null) {
			if (other.lang_dailyUserUninstalls != null)
				return false;
		} else if (!lang_dailyUserUninstalls.equals(other.lang_dailyUserUninstalls))
			return false;
		if (lang_data == null) {
			if (other.lang_data != null)
				return false;
		} else if (!lang_data.equals(other.lang_data))
			return false;
		if (lang_totUserInstalls == null) {
			if (other.lang_totUserInstalls != null)
				return false;
		} else if (!lang_totUserInstalls.equals(other.lang_totUserInstalls))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (market == null) {
			if (other.market != null)
				return false;
		} else if (!market.equals(other.market))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number_rating == null) {
			if (other.number_rating != null)
				return false;
		} else if (!number_rating.equals(other.number_rating))
			return false;
		if (osVersion_activeDeviceInstalls == null) {
			if (other.osVersion_activeDeviceInstalls != null)
				return false;
		} else if (!osVersion_activeDeviceInstalls.equals(other.osVersion_activeDeviceInstalls))
			return false;
		if (osVersion_dailyUserInstalls == null) {
			if (other.osVersion_dailyUserInstalls != null)
				return false;
		} else if (!osVersion_dailyUserInstalls.equals(other.osVersion_dailyUserInstalls))
			return false;
		if (osVersion_dailyUserUninstalls == null) {
			if (other.osVersion_dailyUserUninstalls != null)
				return false;
		} else if (!osVersion_dailyUserUninstalls.equals(other.osVersion_dailyUserUninstalls))
			return false;
		if (osVersion_data == null) {
			if (other.osVersion_data != null)
				return false;
		} else if (!osVersion_data.equals(other.osVersion_data))
			return false;
		if (osVersion_totUserInstalls == null) {
			if (other.osVersion_totUserInstalls != null)
				return false;
		} else if (!osVersion_totUserInstalls.equals(other.osVersion_totUserInstalls))
			return false;
		if (os_version == null) {
			if (other.os_version != null)
				return false;
		} else if (!os_version.equals(other.os_version))
			return false;
		if (overview_activeDeviceInstalls == null) {
			if (other.overview_activeDeviceInstalls != null)
				return false;
		} else if (!overview_activeDeviceInstalls.equals(other.overview_activeDeviceInstalls))
			return false;
		if (overview_dailyUserInstalls == null) {
			if (other.overview_dailyUserInstalls != null)
				return false;
		} else if (!overview_dailyUserInstalls.equals(other.overview_dailyUserInstalls))
			return false;
		if (overview_dailyUserUninstalls == null) {
			if (other.overview_dailyUserUninstalls != null)
				return false;
		} else if (!overview_dailyUserUninstalls.equals(other.overview_dailyUserUninstalls))
			return false;
		if (overview_data == null) {
			if (other.overview_data != null)
				return false;
		} else if (!overview_data.equals(other.overview_data))
			return false;
		if (overview_totUserInstalls == null) {
			if (other.overview_totUserInstalls != null)
				return false;
		} else if (!overview_totUserInstalls.equals(other.overview_totUserInstalls))
			return false;
		if (package_name_app_version == null) {
			if (other.package_name_app_version != null)
				return false;
		} else if (!package_name_app_version.equals(other.package_name_app_version))
			return false;
		if (package_name_carrier == null) {
			if (other.package_name_carrier != null)
				return false;
		} else if (!package_name_carrier.equals(other.package_name_carrier))
			return false;
		if (package_name_country == null) {
			if (other.package_name_country != null)
				return false;
		} else if (!package_name_country.equals(other.package_name_country))
			return false;
		if (package_name_device == null) {
			if (other.package_name_device != null)
				return false;
		} else if (!package_name_device.equals(other.package_name_device))
			return false;
		if (package_name_language == null) {
			if (other.package_name_language != null)
				return false;
		} else if (!package_name_language.equals(other.package_name_language))
			return false;
		if (package_name_os_version == null) {
			if (other.package_name_os_version != null)
				return false;
		} else if (!package_name_os_version.equals(other.package_name_os_version))
			return false;
		if (package_name_overview == null) {
			if (other.package_name_overview != null)
				return false;
		} else if (!package_name_overview.equals(other.package_name_overview))
			return false;
		if (package_name_tablet == null) {
			if (other.package_name_tablet != null)
				return false;
		} else if (!package_name_tablet.equals(other.package_name_tablet))
			return false;
		if (provenienza != other.provenienza)
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (tablet == null) {
			if (other.tablet != null)
				return false;
		} else if (!tablet.equals(other.tablet))
			return false;
		if (tablet_activeDeviceInstalls == null) {
			if (other.tablet_activeDeviceInstalls != null)
				return false;
		} else if (!tablet_activeDeviceInstalls.equals(other.tablet_activeDeviceInstalls))
			return false;
		if (tablet_dailyUserInstalls == null) {
			if (other.tablet_dailyUserInstalls != null)
				return false;
		} else if (!tablet_dailyUserInstalls.equals(other.tablet_dailyUserInstalls))
			return false;
		if (tablet_dailyUserUninstalls == null) {
			if (other.tablet_dailyUserUninstalls != null)
				return false;
		} else if (!tablet_dailyUserUninstalls.equals(other.tablet_dailyUserUninstalls))
			return false;
		if (tablet_data == null) {
			if (other.tablet_data != null)
				return false;
		} else if (!tablet_data.equals(other.tablet_data))
			return false;
		if (tablet_totUserInstalls == null) {
			if (other.tablet_totUserInstalls != null)
				return false;
		} else if (!tablet_totUserInstalls.equals(other.tablet_totUserInstalls))
			return false;
		if (total_average_app_version == null) {
			if (other.total_average_app_version != null)
				return false;
		} else if (!total_average_app_version.equals(other.total_average_app_version))
			return false;
		if (total_average_carrier == null) {
			if (other.total_average_carrier != null)
				return false;
		} else if (!total_average_carrier.equals(other.total_average_carrier))
			return false;
		if (total_average_country == null) {
			if (other.total_average_country != null)
				return false;
		} else if (!total_average_country.equals(other.total_average_country))
			return false;
		if (total_average_device == null) {
			if (other.total_average_device != null)
				return false;
		} else if (!total_average_device.equals(other.total_average_device))
			return false;
		if (total_average_language == null) {
			if (other.total_average_language != null)
				return false;
		} else if (!total_average_language.equals(other.total_average_language))
			return false;
		if (total_average_os_version == null) {
			if (other.total_average_os_version != null)
				return false;
		} else if (!total_average_os_version.equals(other.total_average_os_version))
			return false;
		if (total_average_overview == null) {
			if (other.total_average_overview != null)
				return false;
		} else if (!total_average_overview.equals(other.total_average_overview))
			return false;
		if (total_average_tablet == null) {
			if (other.total_average_tablet != null)
				return false;
		} else if (!total_average_tablet.equals(other.total_average_tablet))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (versione == null) {
			if (other.versione != null)
				return false;
		} else if (!versione.equals(other.versione))
			return false;
		return true;
	}
	
}