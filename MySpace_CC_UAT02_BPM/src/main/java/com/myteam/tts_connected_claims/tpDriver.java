package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class tpDriver implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "title")
	private java.lang.String title;
	@org.kie.api.definition.type.Label(value = "firstName")
	private java.lang.String firstName;
	@org.kie.api.definition.type.Label(value = "surname")
	private java.lang.String surname;
	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label(value = "description")
	private java.lang.String description;
	@org.kie.api.definition.type.Label(value = "registrationNumber")
	private java.lang.String registrationNumber;
	@org.kie.api.definition.type.Label(value = "excess")
	private java.lang.String excess;
	@org.kie.api.definition.type.Label(value = "claimedAmount")
	private java.lang.String claimedAmount;

	public tpDriver() {
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getExcess() {
		return this.excess;
	}

	public void setExcess(java.lang.String excess) {
		this.excess = excess;
	}

	public java.lang.String getClaimedAmount() {
		return this.claimedAmount;
	}

	public void setClaimedAmount(java.lang.String claimedAmount) {
		this.claimedAmount = claimedAmount;
	}

	public tpDriver(java.lang.String title, java.lang.String firstName,
			java.lang.String surname, java.lang.String id,
			java.lang.String description, java.lang.String registrationNumber,
			java.lang.String excess, java.lang.String claimedAmount) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
		this.description = description;
		this.registrationNumber = registrationNumber;
		this.excess = excess;
		this.claimedAmount = claimedAmount;
	}

}