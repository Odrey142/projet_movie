package Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author odrey
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurDto {
	private String id;
	private String identite;
	private int height;
	private String url;
	private String dateNaissance;

	/**
	 * @param id
	 * @param identite
	 * @param height
	 * @param url
	 * @param dateNaissance
	 */
	public ActeurDto() {
		;
	}

	@Override
	public String toString() {
		return "ActeurDto [id=" + id + ", identite=" + identite + ", height=" + height + ", url=" + url
				+ ", dateNaissance=" + dateNaissance + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
