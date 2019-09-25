package com.monsanto.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.monsanto.base.TestBase;
import com.monsanto.pages.HomePage;
import com.monsanto.pages.LoginPage;
import com.monsanto.util.DataFile;
import com.monsanto.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	//ExtentReports extent;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil =  new TestUtil();
	}
	
	//Check Logo on Home page
	@Test(priority=1)
	public void checkLogoOnHomePage() throws InterruptedException {
		Thread.sleep(7000);
		Assert.assertEquals(homePage.logoOnHomePage(),true);
	
	}
	
    //Check Catalog Icon on Home Page
	@Test(priority=2)
	public void checkCatalogIcon() throws InterruptedException {
		Thread.sleep(4000);
		homePage.clickOnHomePageAdminURL();
		Assert.assertEquals(homePage.checkCatalogIconPresent(),true);
		
	}
	
	@Test(priority=3)
	public void checkOrganizationIcon() throws InterruptedException {
		Thread.sleep(4000);
		homePage.clickOnHomePageAdminURL();
		Assert.assertEquals(homePage.checkOrganizationIconPresent(),true);

	}
	
	@Test(priority=4)
	public void checkTaxationIconIcon() throws InterruptedException {
		Thread.sleep(4000);
		homePage.clickOnHomePageAdminURL();
		Assert.assertEquals(homePage.checkTaxationIconIconPresent(),true);

	}
	
	@Test(priority=5)
	public void checkVendorIcon() throws InterruptedException {
		Thread.sleep(4000);
		homePage.clickOnHomePageAdminURL();
		Assert.assertEquals(homePage.checkVendorIconPresent(),true);
	}
	
	//Checking the status of Add product Button
	
	@Test(priority=6)
	public void checkStatusOfAddProductButtonOnHomePage() throws InterruptedException{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		Thread.sleep(2000);
		homePage.clickOnHomePageCatalogListURL();
		Thread.sleep(2000);
		homePage.clickOnHomePageProductURL();
		Thread.sleep(2000);
		boolean statusAddProductButton = homePage.addProductButtonStatus();
		Assert.assertEquals(statusAddProductButton, true);
	}
	
	
	@Test(priority=7)
	public void checkStatusOfAddCategoryButtonOnHomePage() throws InterruptedException{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageCategoryURL();
		testUtil.explicitWaitForElements(driver, homePage.CategoryAddCategoryButton);
		boolean statusAddCategoryButton = homePage.addCategoryButtonStatus();
		Assert.assertEquals(statusAddCategoryButton, true);
	}
	
	@Test(priority=8)
	public void checkStatusOfAddBusinessUnitButtonOnHomePage() throws InterruptedException{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageBrandUnitMasterURL();
		boolean statusAddBradUnitButton = homePage.addBusinessUnitButtonStatus();
		Assert.assertEquals(statusAddBradUnitButton, true);
	}
	
	@Test(priority=9)
	public void checkStatusOfAddCaseButtonOnHomePage() throws InterruptedException{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageCaseURL();
		boolean statusCaseButton = homePage.addCaseButtonStatus();
		Assert.assertEquals(statusCaseButton, true);
	}
	
	@Test(priority=10)
	public void checkStatusOfAddTagButtonOnHomePage() throws InterruptedException{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageTagURL();
		boolean statusAddTagButton = homePage.addTagButtonStatus();
		Assert.assertEquals(statusAddTagButton, true);
	}
	
	@Test(priority=11)
	public void checkCreatedCategory() throws InterruptedException{
	
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageCategoryURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.CategoryAddCategoryButton);
		homePage.methodToClickOnAddCategoryButton();
		testUtil.explicitWaitForElements(driver, homePage.CategoryNameField);
		homePage.methodToSupplyTextInCategoryNameField(DataFile.categoryname);
		homePage.methodToSupplyTextInCategoryDescriptionField(DataFile.categorydescription);
		homePage.methodToSupplyTextInCategoryHTMLDescriptionFiel(DataFile.categorydescription);
		homePage.methodToClickOnCategoryCodeHyperlink();
		homePage.methodToSupplyTextInDisplayOrderField(DataFile.categorydisplayorder);
		testUtil.pageDown(driver);
		testUtil.explicitWaitForElements(driver, homePage.CategorySubmitButton);
		homePage.methodToClickOnCategorySubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		homePage.methodToSupplyTextInSearchedCategoryField(DataFile.categoryname);
		testUtil.explicitWaitForElements(driver, homePage.CategorySearchButton);
		homePage.methodToClickOnSearchCategoryIcon();
		Assert.assertEquals(homePage.methodToShowSearchedCategoryData(), DataFile.categoryname);
		
	}

	
	@Test(priority=12)
	public void checkEditedCategory1() throws InterruptedException{
	
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageCategoryURL();
		testUtil.explicitWaitForElements(driver, homePage.CategoryAddCategoryButton);
		Thread.sleep(3000);
		homePage.methodToSupplyTextInSearchedCategoryField(DataFile.categoryname);
		testUtil.explicitWaitForElements(driver, homePage.CategorySearchButton);
		Thread.sleep(6000);
		homePage.methodToClickOnSearchCategoryIcon();
		testUtil.enterKeyPress(driver);
		homePage.methodToShowSearchedCategoryData();
		Thread.sleep(3000);
		homePage.methodToClickCategorySearchedData();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.CategorySearchButton);
		homePage.methodToClickOnCategoryEditButton();
		testUtil.explicitWaitForElements(driver, homePage.CategoryNameField);
		Thread.sleep(3000);
		testUtil.clearfield(homePage.CategoryNameField);
		Thread.sleep(6000);
		homePage.methodToSupplyTextInCategoryNameField(DataFile.updatedcategoryname);
		testUtil.pageDown(driver);
		testUtil.explicitWaitForElements(driver, homePage.CategorySubmitButton);
		homePage.methodToClickOnCategorySubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		homePage.methodToSupplyTextInSearchedCategoryField(DataFile.updatedcategoryname);
		testUtil.explicitWaitForElements(driver, homePage.CategorySearchButton);
		Thread.sleep(3000);
		homePage.methodToClickOnSearchCategoryIcon();
		Thread.sleep(3000);
		Assert.assertEquals(homePage.methodToShowUpdatedCategorySearchedData(), DataFile.updatedcategoryname);
		
	}
	
  
	@Test(priority=13)
	public void checkCreatedBrandUnit() throws InterruptedException
	{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		testUtil.pageDown(driver);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageBrandUnitMasterURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.BrandUnitAddBrandUnitButton);
		homePage.methodToClickOnAddBrandUnitButton();
		testUtil.explicitWaitForElements(driver, homePage.BrandUnitNameField);
		homePage.methodToSupplyTextInBrandUnitNameField(DataFile.brandunitname);
		homePage.methodToSupplyTextInBrandUnitDescriptionFiel(DataFile.brandunitdescription);
		testUtil.pageDown(driver);
		Thread.sleep(2000);
		testUtil.explicitWaitForElements(driver, homePage.BrnadUnitSubmitButton);
		homePage.methodToClickOnBrandUnitSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		testUtil.explicitWaitForElements(driver, homePage.BrandUnitColumn);
		Thread.sleep(3000);
		homePage.clickOnBrandUnitsForSort();
		int MatchedIntegerValue = testUtil.dataCheckInTable(driver, DataFile.brandunitname);
		//If MatchedIntegerValue is equal to 1 than test case PASS
		Assert.assertEquals(MatchedIntegerValue,1);
	}
		
	 
	@Test(priority=14)
		public void checkUpdatedBrandUnit() throws InterruptedException
		{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		Thread.sleep(2000);
		homePage.clickOnHomePageBrandUnitMasterURL();
		testUtil.explicitWaitForElements(driver, homePage.BrandUnitColumn);
		Thread.sleep(3000);
	    homePage.clickOnBrandUnitsForSort();
	    Thread.sleep(3000);
	    homePage.clickOnEditBrandUnit();
	    homePage.methodToSupplyTextInBrandUnitNameField(DataFile.updatedbrandunitname);
	    Thread.sleep(3000);
	    testUtil.pageDown(driver);
	    Thread.sleep(3000);
	    homePage.methodToClickOnBrandUnitClearAllButton();
	    Thread.sleep(2000);
	    homePage.methodToSupplyTextInBrandUnitNameField(DataFile.updatedbrandunitname);
		//Thread.sleep(2000);
		homePage.methodToSupplyTextInBrandUnitDescriptionFiel(DataFile.brandunitdescription);
		Thread.sleep(4000);
		homePage.methodToClickOnBrandUnitCheckboxButton(driver);
		testUtil.pageDown(driver);
		Thread.sleep(2000);
		testUtil.explicitWaitForElements(driver, homePage.BrnadUnitSubmitButton);
		homePage.methodToClickOnBrandUnitSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.BrandUnitColumn);
		Thread.sleep(1000);
		homePage.clickOnBrandUnitsForSort();
		Thread.sleep(3000);
		int MatchedIntegerValue1 = testUtil.dataCheckInTable(driver, DataFile.updatedbrandunitname);
		Assert.assertEquals(MatchedIntegerValue1,1);
		}
	
	@Test(priority=15)
	public void checkCreatedCase() throws InterruptedException
	{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.methodToClickOnCaseURL();
		testUtil.explicitWaitForElements(driver, homePage.CaseAddCaseButton);
		Thread.sleep(3000);
		homePage.methodToClickOnAddCaseButton();
		testUtil.explicitWaitForElements(driver, homePage.CaseCaseNameField);
		homePage.methodToSupplyTextCaseNameField(DataFile.casename);
		homePage.methodToSupplyTextInCaseDescriptionFiel(DataFile.casedescription);
		testUtil.pageDown(driver);
		testUtil.explicitWaitForElements(driver, homePage.CaseSubmitButton);
		homePage.methodToClickOnCaseSubmitButton();
		Thread.sleep(2000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.CasingColumn);
		
		homePage.methodToClickOnCasingColumnName();
		//Integer Pagenumber = homePage.methodForPaginationNumber();
				Integer Pagenumber = 1;
		if(Pagenumber<=1)
		{		
		int MatchedIntegerValue = testUtil.dataCheckInTable(driver, DataFile.casename);
		//If MatchedIntegerValue is equal to 1 than test case PASS
		Assert.assertEquals(MatchedIntegerValue,1);
		}
	}
	
	
	@Test(priority=16)
		public void checkUpdatedCase() throws InterruptedException
		{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		Thread.sleep(2000);
		homePage.methodToClickOnCaseURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.CaseAddCaseButton);
		testUtil.explicitWaitForElements(driver, homePage.CasingColumn);
		homePage.methodToClickOnCasingColumnName();
		Thread.sleep(3000);
		//Integer Pagenumber = homePage.methodForPaginationNumber();
		Integer Pagenumber = 1;
			if(Pagenumber<=1)
			{		
			int MatchedIntegerValue = testUtil.updateddataCheckInTable(driver, DataFile.casename);
			//If MatchedIntegerValue is equal to 1 than move to editing part
				if (MatchedIntegerValue ==0)
				{
				Assert.assertTrue(false);
					
				}
			
				if (MatchedIntegerValue ==1)
				{
					testUtil.explicitWaitForElements(driver, homePage.CaseCaseNameField);
					Thread.sleep(2000);
					testUtil.clearfield(homePage.CaseCaseNameField);
					homePage.methodToSupplyTextCaseNameField(DataFile.updatedcasename);
					homePage.methodToSupplyTextInCaseDescriptionFiel(DataFile.casedescription);
					testUtil.pageDown(driver);
					testUtil.explicitWaitForElements(driver, homePage.CaseSubmitButton);
					homePage.methodToClickOnCaseSubmitButton();
					Thread.sleep(2000);
					testUtil.ESCKeyPress(driver);
					Thread.sleep(3000);
					testUtil.explicitWaitForElements(driver, homePage.CasingColumn);
					homePage.methodToClickOnCasingColumnName();
					//Integer Pagenumber1 = homePage.methodForPaginationNumber();
					Integer Pagenumber1 = 1;
					if(Pagenumber1<=1)
					{		
						int MatchedIntegerValue1 = testUtil.dataCheckInTable(driver, DataFile.updatedcasename);
						//If MatchedIntegerValue is equal to 1 than test case PASS
						Assert.assertEquals(MatchedIntegerValue1,1);
					}
					
				}			
			
			
			
			}	
	 }
	
	
	@Test(priority=17)
	public void checkCreatedTAG() throws InterruptedException
	{
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.methodToClickOnAddTagHyperLink();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TagAddTagButton);
		Thread.sleep(3000);
		homePage.methodToClickOnAddTagButton();
		testUtil.explicitWaitForElements(driver, homePage.TagTagNameField);
		homePage.methodToSupplyTextInTagNameField(DataFile.tagname);
		homePage.methodToSupplyTextInTagDescriptionFiel(DataFile.tagdescription);
		testUtil.pageDown(driver);
		testUtil.explicitWaitForElements(driver, homePage.TagSubmitButton);
		homePage.methodToClickOnTagSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TagCoulumnName);
		Thread.sleep(3000);
		homePage.methodToClickOnTagColumnName();
		//Integer Pagenumber = homePage.methodForPaginationNumber();
		Integer Pagenumber = 1;
		if(Pagenumber<=1)
		{		
		int MatchedIntegerValue = testUtil.dataCheckInTable(driver, DataFile.tagname);
		//If MatchedIntegerValue is equal to 1 than test case PASS
		Assert.assertEquals(MatchedIntegerValue,1);
		}
	}
	
	
	@Test(priority=18)
	public void checkUpdatedTag() throws InterruptedException
	{
	Thread.sleep(3000);
	homePage.clickOnHomePageAdminURL();
	testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
	homePage.clickOnHomePageCatalogListURL();
	Thread.sleep(2000);
	homePage.methodToClickOnAddTagHyperLink();
	Thread.sleep(1000);
	testUtil.explicitWaitForElements(driver, homePage.TagAddTagButton);
	testUtil.explicitWaitForElements(driver, homePage.TagCoulumnName);
	Thread.sleep(2000);
	homePage.methodToClickOnTagColumnName();;
	Thread.sleep(1000);
	//Integer Pagenumber = homePage.methodForPaginationNumber();
	Integer Pagenumber = 1;
		if(Pagenumber<=1)
		{		
		int MatchedIntegerValue = testUtil.updateddataCheckInTable(driver, DataFile.tagname);
		//If MatchedIntegerValue is equal to 1 than move to editing part
			if (MatchedIntegerValue ==0)
			{
			Assert.assertTrue(false);
				
			}
		
			if (MatchedIntegerValue ==1)
			{
				testUtil.explicitWaitForElements(driver, homePage.TagTagNameField);
				Thread.sleep(2000);
				testUtil.clearfield(homePage.TagTagNameField);
				homePage.methodToSupplyTextInTagNameField(DataFile.updatedtagname);
				homePage.methodToSupplyTextInCaseDescriptionFiel(DataFile.tagdescription);
				testUtil.pageDown(driver);
				testUtil.explicitWaitForElements(driver, homePage.TagSubmitButton);
				homePage.methodToClickOnTagSubmitButton();
				Thread.sleep(1000);
				testUtil.ESCKeyPress(driver);
				Thread.sleep(1000);
				testUtil.explicitWaitForElements(driver, homePage.TagCoulumnName);
				homePage.methodToClickOnTagColumnName();
				//Integer Pagenumber1 = homePage.methodForPaginationNumber();
				Integer Pagenumber1 = 1;
				if(Pagenumber1<=1)
				{		
					int MatchedIntegerValue1 = testUtil.dataCheckInTable(driver, DataFile.updatedtagname);
					//If MatchedIntegerValue is equal to 1 than test case PASS
					Assert.assertEquals(MatchedIntegerValue1,1);
				}
				
			}			
		
		
		
		}	
 }
	
	@Test(priority=19)
	public void checkCreatedProduct() throws InterruptedException{
	
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageProductURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver,homePage.ProductAddProductButton);
		homePage.methodToClickOnAddProductButton();
		Thread.sleep(2000);
		testUtil.explicitWaitForElements(driver, homePage.ProductNameField);
		homePage.methodToSupplyTextInProductNameField(DataFile.productname);
		homePage.methodToClickOnProductTypeDropDown();
		Thread.sleep(2000);
		homePage.methodToSelectValue_Retail();
		Thread.sleep(1000);
		homePage.methodToSupplyTextInProductShortNameField(DataFile.productshortname);
		Thread.sleep(1000);
		homePage.methodToSupplyTextInProductCodeField(testUtil.uiqueID());
		homePage.methodToClickOnUnitOfMeasureDropDown();
		homePage.methodToSelectValue_ML();
		homePage.methodToSupplyTextInProductProductUnitOfMeasureField(DataFile.productmeasurequantity);
		homePage.methodToClickOnCasingDropDown();
		Thread.sleep(2000);
		homePage.methodToSelectValue_1111UPFRONTENDCASE();
		Thread.sleep(2000);
		homePage.methodToSupplyTextInProductCaseQuantityField(DataFile.productcasingquantity);
		Thread.sleep(2000);
		testUtil.pageDown(driver);
		Thread.sleep(2000);
		homePage.methodToClickOnCategoryDropDown();
		Thread.sleep(2000);
		homePage.methodToSelectValue_UPDATEDFRONTENDCATEGORY();
		Thread.sleep(2000);
		homePage.methodToClickOnTAGDropDown();
		Thread.sleep(2000);
		homePage.methodToSupplyTextInSearchTagNameField(DataFile.updatedtagname);
		homePage.methodToClickOnTAGDropDownValue();
		Thread.sleep(2000);
		homePage.methodToClickOnBrandUnitDropDown();
		Thread.sleep(1000);
		homePage.methodToSelectValue_111UPDATEDFRONTENDBRANDUNIT();
		Thread.sleep(1000);
		homePage.methodToClickOnHSNDropDownOnProductPage();
		Thread.sleep(1000);
		homePage.methodToSelectHSNDValueProductPage();
		Thread.sleep(1000);
		homePage.methodToSupplyProductShelfLifeValue("100");
		homePage.methodToSupplyTextInProductMRPField("1000");
		homePage.methodToSupplyTextinProductBarCodefield(testUtil.uiqueID());
		Thread.sleep(2000);
		testUtil.pageDown(driver);
		Thread.sleep(1000);
		homePage.methodToClickOnProductSaveAndNextButton();
		Thread.sleep(2000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(2000);
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageProductURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.ProductSearchTextfield);
		Thread.sleep(2000);
		homePage.methodToSupplyTextInSearchedProductField(DataFile.productname);
	    homePage.methodToClickOnProductSearchIconbuttonProductList();
	    Thread.sleep(2000);
	    String str = homePage.methodToGetDataFromSearchedProductData();
	    Assert.assertEquals(str, DataFile.productname);
	    
	}

	
	@Test(priority=20)
	public void checkEditedCategory() throws InterruptedException{
	
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnHomePageCatalogListURL();
		homePage.clickOnHomePageProductURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver,homePage.ProductAddProductButton);
		testUtil.explicitWaitForElements(driver, homePage.ProductSearchTextfield);
		Thread.sleep(2000);
		homePage.methodToSupplyTextInSearchedProductField(DataFile.productname);
	    homePage.methodToClickOnProductSearchIconbuttonProductList();
	    Thread.sleep(2000);
	    homePage.methodToClickOnProductEditbuttonProductList();
	    Thread.sleep(2000);
	    testUtil.explicitWaitForElements(driver, homePage.ProductNameField);
	    testUtil.clearfield(homePage.ProductNameField);
		homePage.methodToSupplyTextInProductNameField(DataFile.updatedproductname);
		Thread.sleep(2000);
		testUtil.pageDown(driver);
		Thread.sleep(1000);
		testUtil.pageDown(driver);
		Thread.sleep(2000);
		homePage.methodToClickOnProductSaveAndNextButton();
		Thread.sleep(2000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(2000);
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		Thread.sleep(1000);
		homePage.clickOnHomePageProductURL();
		Thread.sleep(3000);
		testUtil.explicitWaitForElements(driver, homePage.ProductSearchTextfield);
		Thread.sleep(2000);
		homePage.methodToSupplyTextInSearchedProductField(DataFile.updatedproductname);
	    homePage.methodToClickOnProductSearchIconbuttonProductList();
	    Thread.sleep(2000);
	    String str = homePage.methodToGetEditedDataFromSearchedProductData();
	    Assert.assertEquals(str, DataFile.updatedproductname);
		
	}
	

	@Test(priority=21)
public void checkCreatedComponentonStateTaxation() throws InterruptedException
{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentButton);
		Thread.sleep(1000);
		homePage.clickOnAddTaxComponentButton();
		testUtil.explicitWaitForElements(driver, homePage.ComponentNameField);
		Thread.sleep(1000);
		homePage.supplyTextInComponentNameField(DataFile.componentnamefirst);
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		String text = homePage.toGetTextOfFirstcomponentValue();
		System.out.println(text);
		Assert.assertEquals(text, DataFile.componentnamefirst);
		System.out.println("Verified Copmonent Creation");	
	}
	
	@Test(priority=22)
    public void checkConfirmationSuccessMessageOnComponentonTaxation() throws InterruptedException
   {
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnFirstcomponentValueToEdit();
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		String successmsg= homePage.getMessageText_Success_OfComponentConfirmation();
		Assert.assertEquals(successmsg, DataFile.componentmessagetextSUCCESS);
		System.out.println("Verified Success Message of Copmonent Creation");	
     }
	
	@Test(priority=23)
   public void checkConfirmationMessageOnComponentonTaxation() throws InterruptedException
  {
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnFirstcomponentValueToEdit();
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		String msg= homePage.getMessageTextOfComponentConfirmation();
		Assert.assertEquals(msg, DataFile.componentmessagetext);
		System.out.println("Verified Message of Copmonent Creation");	
   }
	
	@Test(priority=24)
    public void checkOKButtonConfirmationMessageOnComponentonTaxation() throws InterruptedException
    {
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnFirstcomponentValueToEdit();
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		String ok= homePage.OKButtonOnComponentConfirmationMessageBox();
		Assert.assertEquals(ok, DataFile.componentmessageOKButtontext);
		homePage.clickOnOKButtonOnComponentConfirmationMessageBox();
		System.out.println("Verified OK Button of Component Creation and its functionality");	
     }
	
	@Test(priority=25)
    public void checkIconIsPresentOnConfirmationMessageOnComponentonTaxation() throws InterruptedException
   {
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnFirstcomponentValueToEdit();
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		boolean icon= homePage.checkIconOnComponentConfirmationMessageBox();
		Assert.assertTrue(icon);
		System.out.println("Verified icon of Component Creation");	
    }
	
	
	@Test(priority=26)
public void checkUpdatedComponentonStateTaxation() throws InterruptedException
{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentButton);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnFirstcomponentValueToEdit();
		Thread.sleep(1000);
		homePage.clickOnComponentNameField();
		testUtil.clearfield(homePage.ComponentNameField);
		Thread.sleep(1000);
		homePage.supplyTextInComponentNameField(DataFile.updatedcomponentnamefirst);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		String text = homePage.toGetTextOfFirstcomponentValue();
		System.out.println(text);
		Assert.assertEquals(text, DataFile.updatedcomponentnamefirst);
		System.out.println("Verified State Component Updated");		
		
}
	
	
	@Test(priority=26)
public void checkCreatedComponentonInternationalTaxation() throws InterruptedException
{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentButton);
		Thread.sleep(1000);
		homePage.clickOnAddTaxComponentButton();
		testUtil.explicitWaitForElements(driver, homePage.ComponentNameField);
		Thread.sleep(1000);
		homePage.supplyTextInComponentNameField(DataFile.componentnamesecond);
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		String text = homePage.toGetTextOfSecondcomponentValue();
		System.out.println(text);
		Assert.assertEquals(text, DataFile.componentnamesecond);
		System.out.println("Verified INternational Component Creation");	
	}
	
	@Test(priority=27)
public void checkUpdatedComponentonInternationalTaxation() throws InterruptedException
{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TaxComponentURL);
		homePage.clickOnTaxationComponentURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentButton);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		homePage.clickOnSecondComponentValueToEdit();
		Thread.sleep(1000);
		homePage.clickOnComponentNameField();
		testUtil.clearfield(homePage.ComponentNameField);
		Thread.sleep(1000);
		homePage.supplyTextInComponentNameField(DataFile.updatedcomponentnamesecond);
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.ComponentStatusCheckbox);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.AddTaxComponentSubmitButton);
		homePage.clickOnAddTaxComponentSubmitButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		homePage.clickOncomponentSortColumn();
		Thread.sleep(1000);
		String text = homePage.toGetTextOfSecondcomponentValue();
		System.out.println(text);
		Assert.assertEquals(text, DataFile.updatedcomponentnamesecond);
		System.out.println("Verified International Copmonent Updated");		
		
}
	
	@Test(priority=28)
public void checkCreatedTaxGroupTaxation() throws InterruptedException
{
		
		Thread.sleep(3000);
		homePage.clickOnHomePageAdminURL();
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		homePage.clickOnTaxationURL();
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_TaxGroupURL);
		homePage.TAXGROUP_clickOnTAXGroupURL();
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_AddTaxGroupButton);
		Thread.sleep(1000);
		homePage.TAXGROUP_clickOnAddTAXGroupButton();
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_TaxGroupNameField);
		Thread.sleep(1000);
		homePage.TAXGROUP_SupplyTextInTAXGroupField(DataFile.taxgroupname);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_TAXCodeField);
		Thread.sleep(1000);
		homePage.TAXGROUP_SupplyTextInTAXCodeField(DataFile.taxgroupname);
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_DescriptionField);
		Thread.sleep(1000);
		homePage.TAXGROUP_SupplyTextInTAXGroupDescriptionField(DataFile.taxdescription);
		Thread.sleep(1000);
		testUtil.pageDown(driver);
		Thread.sleep(1000);
		homePage.TAXGROUP_SupplyTextInTAXGroupEffectiveFromField(testUtil.localDateFormaDDMMYYYY());
		Thread.sleep(1000);
		homePage.TAXGROUP_SupplyTextInTAXGroupEffectiveToField(testUtil.localDateFormaDDMMYYYYPlusOneYear());
		Thread.sleep(1000);
		testUtil.javaScriptExecutor(homePage.TAXGROUP_IsWithInStateCheckbox);
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_SaveNextButton);
		Thread.sleep(1000);
		homePage.TAXGROUP_clickOnSaveNextButton();
		Thread.sleep(1000);
		testUtil.ESCKeyPress(driver);
		Thread.sleep(1000);
		testUtil.toPerformMouseHover(driver, homePage.CatalogIcon);
		Thread.sleep(1000);
		testUtil.explicitWaitForElements(driver, homePage.TAXGROUP_TaxGroupURL);
		Thread.sleep(1000);
		homePage.TAXGROUP_clickOnTAXGroupURL();
		Thread.sleep(1000);
		homePage.TAXGROUP_clickOnTaxGroupColumn();
		Thread.sleep(1000);
		String text = homePage.toGetTextOfFirstcomponentValue();
		Assert.assertEquals(text, DataFile.taxgroupname);
		System.out.println("Verified TAX Group Creation");
	}
	
    @AfterMethod
	public void tearDown() 
	{
		driver.quit();

    }

}