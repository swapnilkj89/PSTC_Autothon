package com.bmc.remedyforce.Helper.propertyFileHandler;

public class PropertyFileEnums {

	
	public enum propertyFileName{
		community("CommunitySetupXpath.properties"),customfields("customField.properties"),install("InstallXpath.properties"),
		login("LoginCreds.properties"),orgsetup("OrgSetup.properties"),resetpassword("ResetPasswordXpath.properties"),rfapp_permissionset("RfApp&PermissionSet.properties"),sitesetup("SiteSetupXpath.properties"),pstc("pstc.properties");
		
		private String propertyFileName;
		
				
		propertyFileName(String propertyFileName) {
			this.propertyFileName = propertyFileName;
		}

		public String propfile() {
			return propertyFileName;
		}
		

		@Override
		public String toString() {
			return propertyFileName;
		}
		
				
		
	}

}
