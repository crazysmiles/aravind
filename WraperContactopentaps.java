package HomeWorkThree;

import org.junit.Test;

public class WraperContactopentaps extends Wrapper {
	
	@Test
	public void contactopentap()
	{
		launchapp("firefox", "http://demo1.opentaps.org/opentaps/control/main");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='button']/a");
		clickByLinkText("Create Contact");
		
		enterById("firstNameField", "march");
		enterById("lastNameField","test");
		enterById("createContactForm_firstNameLocal","localfirst");
		enterById("createContactForm_lastNameLocal","locallast");
		enterById("createContactForm_personalTitle", "mr");
		enterById("createContactForm_birthDate","07/22/90");
		enterById("createContactForm_birthDate","07/22/90");
		enterById("createContactForm_generalProfTitle","test");
		enterById("createContactForm_departmentName", "testing");
		selectValueByIndex("createContactForm_preferredCurrencyUomId", 1);
		enterById("createContactForm_accountPartyId", "testaccount");
		enterById("createContactForm_description", "testign description");
		enterById("createContactForm_importantNote","imnpoertant test notes");
		enterById("createContactForm_primaryPhoneCountryCode", "91");
		enterById("createContactForm_primaryPhoneAreaCode", "044");
		enterById("createContactForm_primaryPhoneNumber", "9791173797");
		enterById("createContactForm_primaryPhoneExtension", "54333");
		enterById("createContactForm_primaryPhoneAskForName", "myself");
		enterById("createContactForm_primaryEmail", "test123@gmail.com");
		enterById("generalToNameField", "testgeneral");
		enterById("createContactForm_generalAttnName", "general name");
		
		enterById("createContactForm_generalAddress1", "123 main street");
		enterById("createContactForm_generalAddress2", "123 last");
		enterById("createContactForm_generalCity", "chennai");
		selectValueByIndex("createContactForm_generalStateProvinceGeoId",31);
		
		
		enterById("createContactForm_generalPostalCode", "600020");
		selectValueByIndex("createContactForm_generalCountryGeoId",102);
		enterById("createContactForm_generalPostalCodeExt", "21212");
		
		
	}		
		
}
