package ficheros.modelos;

public class Country {
	private String country_id;

	private String country_name;
	private String region_id; //FK mismo nombre que si desnito _id para identificar que el una PK de region
	
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String string) {
		this.country_id = string;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getRegion_id() {
		return region_id;
	}
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + ", region_id=" + region_id
				+ "]";
	}
}
