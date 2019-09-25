package com.monsanto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.monsanto.base.TestBase;
import com.monsanto.util.DataFile;

public class HomePage extends TestBase{
	
	//Define locators related to page
	
	
	@FindBy(xpath = "//*[@src='./assets/images/enrich_logo.svg']")
			WebElement LogoOnHomePage;
	
	@FindBy(xpath = "//*[@id=\"main-page-wrapper\"]/app-header-panel/header/nav/div/div/div[2]/ul/li[6]/a")
	WebElement AdminURL;
	
	@FindBy(xpath = "(//a[@href='/inventory'])[1]")
	WebElement InventoryURL;
	
	@FindBy(xpath = "(//*[@class='nav-title'])[1]")
	WebElement CatalogList;
	
	@FindBy(xpath = "//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dproduct_master']")
	WebElement ProductURL;
	
	@FindBy(xpath = "//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dcategory_master']")
	WebElement CategoryURL;
	
	@FindBy(xpath = "//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dbrand_unit_master']")
	WebElement BrandUnitMasterURL;
	
	@FindBy(xpath = "//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dcase_master']")
	WebElement CaseURL;
	
	@FindBy(xpath = "//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dtag_master']")
	WebElement TagURL;
	
	@FindBy(xpath ="//*[text()='Add Product']")
	WebElement AddProductButton;
	
	public @FindBy(xpath ="//*[@class='catalog-icon']")
	WebElement CatalogIcon;
	
	@FindBy(xpath ="//*[@class='vendor-icon']")
	WebElement VendorIcon;
		
	@FindBy(xpath ="//*[@class='organization-icon']")
	WebElement OrganizationIcon;
	
	@FindBy(xpath ="//*[@class='taxation-icon']")
	WebElement TaxationIcon;
	
//************************************************************************************************//
	         //Product Basic Information//
	
	//Add product Button
		public @FindBy(xpath ="//*[text()='Add Product']")
		WebElement ProductAddProductButton;
	
	
	//Enter the Product Name text field
	public @FindBy(xpath ="//*[@formcontrolname = 'product_name']")
	WebElement ProductNameField;
	
	//Product Type drop down
	public @FindBy(xpath ="(//*[@class='field-control'])[2]")
	WebElement ProductTypeDropDown;

	//Unit of Measure drop down
	public @FindBy(xpath ="(//*[@class='field-control'])[3]")
	WebElement ProductUnitOfMeasureDropDown;
	
	//Quantity field
	public @FindBy(xpath ="//*[@formcontrolname= 'product_amount']")
	WebElement ProductQuantityField;
	
	//Casing drop down
	public @FindBy(xpath ="//*[@formcontrolname='case_id']")
	WebElement ProductCasingDropDown;
			
	//Case Quantity field
	public @FindBy(xpath ="//*[@formcontrolname= 'case_quantity']")
	WebElement ProductCaseQuantity;
		
	//Product Code
	public @FindBy(xpath ="//*[@formcontrolname= 'code']")
	WebElement ProductProductCode;
		
	//Bar Code
	//Generate BarCodeURL
	public @FindBy(xpath ="//*[text()='Auto Generate']")
	WebElement ProductCodeHyperlink;	
	
	//Category drop down
	public @FindBy(xpath ="//button[@data-toggle='dropdown']")
	WebElement ProductCategoryDropDown;
	
	//Tag drop down
	public @FindBy(xpath ="//div[@class='multiselect-dropdown']")
	WebElement ProductTagDropDown;
	
	//Tag drop down value
	public @FindBy(xpath ="//*[text()='111upfrontendtag']")
	WebElement ProductTagDropDownValue;	
	
	
	//Search field present in Tag drop down
	public @FindBy(xpath ="//input[@placeholder='Search']")
	WebElement ProductSearchfieldTagDropDown;
	
	
	//Brand Unit drop down
	public @FindBy(xpath ="(//*[@class='field-control'])[10]")
	WebElement ProductBrnadUnitDropdown;
	
	//MRP field
	public @FindBy(xpath ="//*[@formcontrolname='mrp']")
	WebElement ProductMRPField;	
	
	//Status CheckBox
	public @FindBy(xpath ="//*[@for='inlinecheckbox1']")
	WebElement ProductStatusChecboxSelected;
	
	//is Returnable CheckBox
	public @FindBy(xpath ="//*[@for='inlinecheckbox2']")
	WebElement ProductIsReturnableChecboxSelected;
	
	//Cancel Button
	public @FindBy(xpath ="//*[text()='Cancel']")
	WebElement ProductCancelButton;
	
	//Clear Button
	public @FindBy(xpath ="//*[text()='Clear All']")
	WebElement ProductClearButton;	

	//Save and Next Button
	public @FindBy(xpath ="//*[text()='Save & Next']")
	WebElement ProductSaveAndNextButton;
	
	
	//Save and Next Button
	public @FindBy(xpath ="//*[text()='Save & Next']")
	WebElement ProductVarianHyperlink;
	
	//Select Value ML
	public @FindBy(xpath ="//option[@value='3']")
	WebElement ProductSelectValueML;
	

	//Select Value Retail
	public @FindBy(xpath ="//option[@value='retail']")
	WebElement ProductSelectValueRetail;	
	
	
	//Select Value Casing
	public @FindBy(xpath ="//*[text()=' 1111upfrontentcase']")
	WebElement ProductSelectValueCase;	
	
	//Select Value Category
	public @FindBy(xpath ="//*[text()='Updatedfrontendcategory']")
	WebElement ProductSelectValueategory;	
	
	//Select Value Brand Unit
	public @FindBy(xpath ="//*[text()=' 11updatedfrontendbrandunit']")
	WebElement ProductSelectValueBrandUnit;		
	
	//Select Value Tag
	public @FindBy(xpath ="//*[text()='111upfrontendtag']")
	WebElement ProductSelectValueTAG;		

	//product Bar Code field
	public @FindBy(xpath ="//*[@formcontrolname='barcode']")
	WebElement ProductBarCodeField;	
	
	//product Bar Code field
	public @FindBy(xpath ="//*[text()='Back']")
	WebElement ProductBackButton;		 
	
	//product Back to Product List
	public @FindBy(xpath ="(//a[@href='/admin/catalog/product_master'])[2]")
	WebElement ProductURLBackToProductList;	
	
	//product Search field
	public @FindBy(xpath ="//*[@placeholder='Search by Name, Code']")
	WebElement ProductSearchTextfield;
	
	
	//product search icon button
	public @FindBy(xpath ="//button[@class='btn btn-danger']")
	WebElement ProductSearchIconButton;		
	
	//product Search data
	public @FindBy(xpath ="//a[text()='1product']")
	WebElement ProductSearchedData;	
	
	//product Edit Button
	public @FindBy(xpath ="//button[@class='btn edit-btn margin-right-20']")
	WebElement ProductEditDataButton;			

	//product HSN CODE drop down
	public @FindBy(xpath ="//*[@formcontrolname='hsn_id']")
	WebElement ProductHSNCodeValueDropDown;	
	
	
	//product HSN CODE Value
	public @FindBy(xpath ="//*[text()='12345 (18.00)% ']")
	WebElement ProductHSNCodeValue;	
	
	//product ShelfLife
	public @FindBy(xpath ="//*[@formcontrolname='shelf_life']")
	WebElement ProductShelfLife;		
	
	//To Supply text in Tag Search field on Select Tag
	public @FindBy(xpath ="//*[@placeholder='Search']")
	WebElement SearchTagNameField;	
	
	//product Short Name
	public @FindBy(xpath ="//*[@formcontrolname='short_name']")
	WebElement ProductShortName;	
	
	//product Code
	public @FindBy(xpath ="//*[@formcontrolname='code']")
	WebElement ProductCode;	
	
//************************************************************************************************//
	//CATEGORY Section
	
	//Add Category Button
	public @FindBy(xpath ="//*[text()='Add Category']")
	WebElement CategoryAddCategoryButton;
	
	//Export Button
	@FindBy(xpath ="//*[@class='btn btn-link export-btn']")
	WebElement CategoryExportButton;
	
	//Category Search Field
	@FindBy(xpath ="//*[@placeholder='Search by Category, Sub Category']")
	WebElement CategorySearchField;	
	
	//Category Search Button
	public @FindBy(xpath ="//*[@class='btn btn-danger']")
	WebElement CategorySearchButton;		
	
	//Category Name field
	public @FindBy(xpath ="//*[@placeholder='Category Name']")
	WebElement CategoryNameField;	
	
	//Generate categoryCodeURL
	@FindBy(xpath ="//*[@placeholder='Enter the Category Code']")
	WebElement CategoryGenerateCategoryCode;

	//Category Description field
	@FindBy(xpath ="//*[@formcontrolname='description']")
	WebElement CategoryDescriptionField;
	

	//Category HTML Description field
	@FindBy(xpath ="//*[@formcontrolname='html_description']")
	WebElement CategoryHTMLDescriptionField;	
	
	//Category Display Order field
	@FindBy(xpath ="//*[@placeholder='Display Order']")
	WebElement DisplayOrderField;
	
	//Show in digital Catalog Checkbox
	@FindBy(xpath ="//*[@id='checkbox1']")
	WebElement CategoryShowInDigitalCheckBoxnotSelected	;
	
	//Category Cancel Button
	public @FindBy(xpath ="//*[text()='Cancel']")
	WebElement CategoryCancelButton;
	
	//Category Submit Button
	public @FindBy(xpath ="//*[text()='Submit']")
	WebElement CategorySubmitButton;	
	
	//Searched Category value
	public @FindBy(xpath ="//*[text()='Frontendcategory']")
	WebElement CategorySearchedResult;
	
	//Updated Searched Category value
	public @FindBy(xpath ="//*[text()='Updatedfrontendcategory']")
	WebElement CategoryUpdatedSearchedResult;

	
	
	//Category Edit Button value
	public @FindBy(xpath ="//*[@class='btn btn-link edit-text-btn']")
	WebElement CategoryEditButton;

	//Category Delete Button value
	public @FindBy(xpath ="//*[@class='btn btn-link delete-text-btn']")
	WebElement CategoryDeleteButton;	
	
	//Category Add Subcategory Button value
	public @FindBy(xpath ="//*[text()='Add Subcategory']")
	WebElement CategoryAddSubCategoryButton;
	
	//Category HYperlink Click
		public @FindBy(xpath ="(//*[@href='/admin/catalog/category_master'] )[2]")
		WebElement CategoryHyperlinkCategoryButton;
	
	
	
	//************************************************************************************************//
		//BrandUnit Section
		
		//Add BrandUnit Button
		public @FindBy(xpath ="//*[text()='Add Brand Unit']")
		WebElement BrandUnitAddBrandUnitButton;
				
		
		//BrandUnit Name field
		public @FindBy(xpath ="//*[@placeholder='Enter the Brand Unit']")
		WebElement BrandUnitNameField;	
		
		//BrandUnit Description field
		public @FindBy(xpath ="//*[@formcontrolname='description']")
		WebElement BrandUnitDescriptionField;
		
		//BrandUnit Cancel Button
		public @FindBy(xpath ="//*[text()='Cancel']")
		WebElement BrandUnitCancelButton;
		
		//BrandUnit Clear All Button
		public @FindBy(xpath ="//*[text()='Clear All']")
		WebElement BrandUnitClearAllButton;
		
		//BrandUnit Submit Button
		public @FindBy(xpath ="//*[text()='Submit']")
		WebElement BrnadUnitSubmitButton;
		
		//BrandUnit Pagination Button
		public @FindBy(xpath ="ng-tns-c7-3 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted")
		WebElement BrnadUnitPaginationDropDown;
		
		
		public @FindBy(xpath ="//*[@class='item-pages-count']")
		WebElement PaginationNumbers;
		
		public @FindBy(xpath ="//*[text()='Brand Units']")
		WebElement BrandUnitColumn;
		
		public @FindBy(xpath ="//*[text()='11frontendbrandunit']")
		WebElement BrandUnitValue;
		
		public @FindBy(xpath ="//*[@class='ui-table-tbody']/tr[1]/td[4]/button[1]")
		WebElement EditBrandUnitValue;
		
		public @FindBy(xpath ="//*[@for='inlinecheckbox1']")
		WebElement BrandUnitCheckbox;		
		
		
		//************************************************************************************************//
				//Case Section
		
		
		//Case URL link
		
		public @FindBy(xpath ="//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dcase_master']")
		WebElement CaseHyperlinkURL;
		
		//Add New Case Button
		public @FindBy(xpath ="//*[text()='Add New Case']")
		WebElement CaseAddCaseButton;
				
		
		//Case Name field
		public @FindBy(xpath ="//*[@formcontrolname='case_name']")
		WebElement CaseCaseNameField;	
		
		//Case Description field
		public @FindBy(xpath ="//*[@formcontrolname='description']")
		WebElement CaseCaseDescriptionField;
		
		//Case Cancel Button
		public @FindBy(xpath ="//*[text()='Cancel']")
		WebElement CaseUnitCancelButton;
		
		//Case Submit Button
		public @FindBy(xpath ="//*[text()='Submit']")
		WebElement CaseSubmitButton;	
		
		public @FindBy(xpath ="(//*[text()='Casing'])[2]")
		WebElement CasingColumn;
		
	
				
	//************************************************************************************************//
	//Tag Section
				
		//Add New Tag URL
		public @FindBy(xpath ="//*[@href='#%20%3Dadmin%20%3Dcatalog%20%3Dtag_master']")
		WebElement TagHyperlinkURL;
		
		
		
		//Add New Tag Button
		public @FindBy(xpath ="//*[text()='Add New Tag']")
		WebElement TagAddTagButton;
				
		
		//Tag Name field
		public @FindBy(xpath ="//*[@formcontrolname='tag_name']")
		WebElement TagTagNameField;	
		
		//Tag Description field
		public @FindBy(xpath ="//*[@formcontrolname='description']")
		WebElement TagTagDescriptionField;
		
		//Tag Cancel Button
		public @FindBy(xpath ="//*[text()='Cancel']")
		WebElement TagCancelButton;
		
		//Category Submit Button
		public @FindBy(xpath ="//*[text()='Submit']")
		WebElement TagSubmitButton;	
		
		//Tag Tags Column Name 
		public @FindBy(xpath ="(//*[text()='Tags'])[2]")
		WebElement TagCoulumnName;	

		//************************************************************************************************//
		//Taxation Section: Tax Component		

		//Taxation URL 
		public @FindBy(xpath ="(//*[@class='nav-title'])[3]")
		WebElement TaxationURL;	
				
		//Tax Component URL
		public @FindBy(xpath ="//*[text()=' Tax Component']")
		WebElement TaxComponentURL;		
				
		//Add Tax Component Button
		public @FindBy(xpath ="//*[text()='Add Tax Component']")
		WebElement AddTaxComponentButton;

		//Component Name Field
		public @FindBy(xpath ="//*[@placeholder='Component Name']")
		WebElement ComponentNameField;

		//Add Tax Component Submit Button
		public @FindBy(xpath ="//*[@type='submit']")
		WebElement AddTaxComponentSubmitButton;

		//Component Status Checkbox
		public @FindBy(xpath ="//*[@for='inlinecheckbox1']")
		WebElement ComponentStatusCheckbox;

		//Component Column Sort
		public @FindBy(xpath ="(//*[@class='ui-sortable-column'])[1]")
		WebElement ComponentColumnSort;

		//First Component Name
		public @FindBy(xpath ="(//*[@class='ui-table-scrollable-body-table'])/tbody/tr[1]/td[2]/a")
		WebElement FirstComponentNameValue;

		//First Component Name Edit
		public @FindBy(xpath ="//*[@class='ui-table-scrollable-body-table']/tbody/tr[1]/td[4]/button[1]")
		WebElement FirstComponentNameValueEdit;

		//Second Component Name
		public @FindBy(xpath ="//*[@class='ui-table-scrollable-body-table']/tbody/tr[2]/td[2]/a")
		WebElement SecondComponentNameValue;

		//Second Component Name Edit
		public @FindBy(xpath ="//*[@class='ui-table-scrollable-body-table']/tbody/tr[2]/td[4]/button[1]")
		WebElement SecondComponentNameValueEdit;
		
		//Message box Text
		public @FindBy(xpath ="//*[text()='Tax Component has been updated successfully.']")
		WebElement MessageBoxText;	
		
		//Message box OK button
		public @FindBy(xpath ="//*[text()='OK']")
		WebElement MessageBoxOKButton;	
		
		//Message box Text "Success"
		public @FindBy(xpath ="//*[text()='Success']")
		WebElement MessageBoxTextSuccess;

		
		//OK button of confirmation message
		public @FindBy(xpath ="//*[text()='OK']")
		WebElement OKButtonOfMessageBox;

		//icon on confirmation message
		public @FindBy(xpath ="//*[@class='swal2-icon swal2-success swal2-animate-success-icon']")
		WebElement icononComponentConfirmationMessage;
		
//************************************************************************************************//
		//Taxation Section: Tax Group
		
				
		//Tax Group URL
		public @FindBy(xpath ="//*[text()=' Tax Group']")
		WebElement TAXGROUP_TaxGroupURL;		
				
		//Add Tax Group Button
		public @FindBy(xpath ="//*[text()='Add Tax Group']")
		WebElement TAXGROUP_AddTaxGroupButton;

		//Tax Code Field
		public @FindBy(xpath ="//*[@placeholder='Enter the TAX Code']")
		WebElement TAXGROUP_TAXCodeField;

		//Tax Group Name field
		public @FindBy(xpath ="//*[@placeholder='Enter the TAX Group Name']")
		WebElement TAXGROUP_TaxGroupNameField;	
		
		//Tax Group Name Description field
		public @FindBy(xpath ="//*[@placeholder='Enter the Description']")
		WebElement TAXGROUP_DescriptionField;
		
		//Tax Group Effective from Date field
		public @FindBy(xpath ="(//*[@placeholder='DD-MM-YYYY'])[1]")
		WebElement TAXGROUP_EffectiveFromDateField;
		
		//Tax Group EffectiveTo Date field
		public @FindBy(xpath ="(//*[@placeholder='DD-MM-YYYY'])[2]")
		WebElement TAXGROUP_EffectiveToDateField;
		
		//Tax Group Is WithIn State
		public @FindBy(xpath ="//*[@for='inlinecheckbox1']")
		WebElement TAXGROUP_IsWithInStateCheckbox;
		
		//Tax Group Cancel Button
		public @FindBy(xpath ="//*[text()='Cancel']")
		WebElement TAXGROUP_CancelButton;
		
		//Tax Group Clear All button
		public @FindBy(xpath ="//*[text()='Clear All']")
		WebElement TAXGROUP_ClearAllButton;	
		
		//Tax Group Clear All button
		public @FindBy(xpath ="//*[@type='submit']")
		WebElement TAXGROUP_SaveNextButton;	
		
		//Tax Group Component Name Drop Down
		public @FindBy(xpath ="//*[@formcontrolname='tax_component_id']")
		WebElement TAXGROUP_ComponentNameDropDown;	
		
		//Tax Group Percentage Field
		public @FindBy(xpath ="//*[@placeholder='TAX %']")
		WebElement TAXGROUP_TAXPercentageField;
		
		//Tax Group Back button
		public @FindBy(xpath ="//*[text()='Back']")
		WebElement TAXGROUP_BackButton;		
		
		//Tax Group Back button
		public @FindBy(xpath ="//*[text()='Save']")
		WebElement TAXGROUP_SaveButton;	
		
		//Tax Group 11uautostate value drop down
		public @FindBy(xpath ="//*[text()=' 11uautostate']")
		WebElement TAXGROUP_Select_11uautostate;			
		
		//Tax Group 22uautointernational value drop down
		public @FindBy(xpath ="//*[text()='//*[text()=' 22uautointernational']']")
		WebElement TAXGROUP_Select_22uautointernational;	
		
		//Tax Group Message box Text
		public @FindBy(xpath ="//*[text()='Tax Group has been created successfully.']")
		WebElement TAXGROUP_ConfirmationMessageBoxText;	
		
		//Tax Group Component Message box Text
		public @FindBy(xpath ="//*[text()='Tax Component has been added to Tax Group successfully.']")
		WebElement TAXGROUPComponent_ConfirmationMessageBoxText;	
		
		//Tax Group Message box OK button
		public @FindBy(xpath ="//*[text()='OK']")
		WebElement TAXGROUP_ConfirmationMessageBoxOKButton;	
		
		//Tax Group Message box Text "Success"
		public @FindBy(xpath ="//*[text()='Success']")
		WebElement TAXGROUP_ConfirmationMessageBoxTextSuccess;

		
		//Tax Group OK button of confirmation message
		public @FindBy(xpath ="//*[text()='OK']")
		WebElement TAXGROUP_ConfirmationOKButtonOfMessageBox;

		//Tax Group icon on confirmation message
		public @FindBy(xpath ="//*[@class='swal2-icon swal2-success swal2-animate-success-icon']")
		WebElement TAXGROUP_icononComponentConfirmationMessage;
		
		//Tax Group First Component Name
		public @FindBy(xpath ="(//*[@class='ui-table-scrollable-body-table'])/tbody/tr[1]/td[2]/a")
		WebElement TAXGROUP_FirstComponentNameValueANDGroupName;

		//Tax Group Second Component Name
		public @FindBy(xpath ="//*[@class='ui-table-scrollable-body-table']/tbody/tr[2]/td[2]")
		WebElement TAXGROUP_SecondComponentNameValue;	

		//Tax Group Sort column
		public @FindBy(xpath ="(//*[@class='ng-star-inserted'])/th[2]")
		WebElement TAXGROUP_CoulmnGroupName;	
		
		
		
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

//Define methods related to page

//Logo Present or not
public boolean logoOnHomePage() {
	
	boolean IsDisplayed = LogoOnHomePage.isDisplayed();
	return IsDisplayed;
}


//Click on Admin URL
public void clickOnHomePageAdminURL() {
	
	AdminURL.click();
}

//Click on Inventory URL
public void clickOnHomePageInventoryURL() {
	
	InventoryURL.click();
}

//Click on Catalog URL
public void clickOnHomePageCatalogListURL() {
	
	CatalogList.click();
}

//Click on Product URL
public void clickOnHomePageProductURL() {
	
	ProductURL.click();
}

//Click on Category URL
public void clickOnHomePageCategoryURL() {
	
	CategoryURL.click();
}

//Click on BrandUnit URL
public void clickOnHomePageBrandUnitMasterURL() {
	
	BrandUnitMasterURL.click();
}

//Click on Case URL
public void clickOnHomePageCaseURL() {
	
	CaseURL.click();
}

//Click on Tag URL
public void clickOnHomePageTagURL() {
	
	TagURL.click();
}

public boolean addProductButtonStatus() {
	
	return AddProductButton.isEnabled();
}

public boolean addCategoryButtonStatus() {
	
	return CategoryAddCategoryButton.isEnabled();
}

public boolean addBusinessUnitButtonStatus() {
	
	return BrandUnitAddBrandUnitButton.isEnabled();
}

public boolean addCaseButtonStatus() {
	
	return CaseAddCaseButton.isEnabled();
}

public boolean addTagButtonStatus() {
	
	return TagAddTagButton.isEnabled();
}

public boolean checkCatalogIconPresent() {
	
	return CatalogIcon.isDisplayed();
}

public boolean checkVendorIconPresent() {
	
	return VendorIcon.isDisplayed();
}

public boolean checkOrganizationIconPresent() {
	
	return OrganizationIcon.isDisplayed();
}


public boolean checkTaxationIconIconPresent() {
	
	return TaxationIcon.isDisplayed();
}
//******************************************************************************************//
                                  //Product//
//Method to click on Add category button//
public void methodToClickOnAddProductButton() {
	
	ProductAddProductButton.click();
}

//Method to supply text in Product Name name text field
public void methodToSupplyTextInProductNameField(String catName) {
	
	ProductNameField.sendKeys(catName);
}

//Method to supply text in Product UNit of Measure text field
public void methodToSupplyTextInProductProductUnitOfMeasureField(String catName) {
	
	ProductQuantityField.sendKeys(catName);
}

//Method to supply text in Product Case Quantity text field
public void methodToSupplyTextInProductCaseQuantityField(String catName) {
	
	ProductCaseQuantity.sendKeys(catName);
}

//Method to supply text in MRP text field
public void methodToSupplyTextInProductMRPField(String catName) {
	
	ProductMRPField.sendKeys(catName);
}

//Method to click on ProductType Drop Down
public void methodToClickOnProductTypeDropDown() {
	
	ProductTypeDropDown.click();
}

//Method to click on Casing Drop Down
public void methodToClickOnCasingDropDown() {
	
	ProductCasingDropDown.click();
}

//Method to click on Unit Of Measure Drop Down
public void methodToClickOnUnitOfMeasureDropDown() {
	
	ProductUnitOfMeasureDropDown.click();
}

//Method to click on Category Drop Down
public void methodToClickOnCategoryDropDown() {
	
	ProductCategoryDropDown.click();
}

//Method to click on Tag Drop Down
public void methodToClickOnTAGDropDown() {
	
	ProductTagDropDown.click();
}

//Method to click on Tag Drop Down Value
public void methodToClickOnTAGDropDownValue() {
	
	ProductTagDropDownValue.click();
}

//Method to click on Tag Drop Down
public void methodToClickOnBrandUnitDropDown() {
	
	ProductBrnadUnitDropdown.click();
}

//Method to Select ML from Drop Down
public void methodToSelectValue_ML() {
	
	ProductSelectValueML.click();
}

//Method to Select RETAIL from Drop Down
public void methodToSelectValue_Retail() {
	
	ProductSelectValueRetail.click();
}


//Method to Select Case Value from Drop Down
public void methodToSelectValue_1111UPFRONTENDCASE() {
	
	ProductSelectValueCase.click();
}


//Method to Select Category Value from Drop Down
public void methodToSelectValue_UPDATEDFRONTENDCATEGORY() {
	
	ProductSelectValueategory.click();
}

//Method to Select BrandUnit Value from Drop Down
public void methodToSelectValue_111UPDATEDFRONTENDBRANDUNIT() {
	
	ProductSelectValueBrandUnit.click();
}


//Method to Select TAG Value from Drop Down
public void methodToSelectValue_111UPDATEDFRONTENDTAG() {
	
	ProductSelectValueTAG.click();
}

//Method to Select Search field in TAG from Drop Down
public void methodToSupplyValueInProductSearchField(String searchdata) {
	
	ProductSearchfieldTagDropDown.sendKeys(searchdata);
}

//Method to Click on Product Save and Next button
public void methodToClickOnProductSaveAndNextButton() {
	
	ProductSaveAndNextButton.click();
}

//Method to generate product uiqiue code
public void methodToClickOnProductProductCodeURL() {
	
	ProductCodeHyperlink.click();
}

//Method to supply unique Bar code
public void methodToSupplyTextinProductBarCodefield(String i) {
	
	ProductBarCodeField.sendKeys(i);
}

//Method to click on Product Back button
public void methodToClickOnProductBackButton() {
	
	ProductBackButton.click();
}

//Method to click on Product Back button
public void methodToClickOnProductURLBackToProductList() {
	
	ProductURLBackToProductList.click();
}

//Method to click on Product Back button
public void methodToSupplyTextInSearchedProductField(String str) {
	
	ProductSearchTextfield.sendKeys(str);
}

//Method to click on Search icon button
public void methodToClickOnProductSearchIconbuttonProductList() {
	
	ProductSearchIconButton.click();
}

//Method to click on Search icon button
public void methodToClickOnProductEditbuttonProductList() {
	
	ProductEditDataButton.click();
}

//Method to give Updated searched data
	public String methodToGetDataFromSearchedProductData() {
		String productname = "1upproduct";
		String xpathBefore = "//a[text()='";
		String xpathAfter =  "']";
		String FinalXpath = xpathBefore+DataFile.productname+xpathAfter;
		String Searchdata = driver.findElement(By.xpath(FinalXpath)).getText();
		return Searchdata;
	}
	
	//Method to give Updated searched data
	public String methodToGetEditedDataFromSearchedProductData() {
		String productname = "1upproduct";
		String xpathBefore = "//a[text()='";
		String xpathAfter =  "']";
		String FinalXpath = xpathBefore+DataFile.updatedproductname+xpathAfter;
		String Searchdata = driver.findElement(By.xpath(FinalXpath)).getText();
		return Searchdata;
		
	}
	
	public void methodToClickOnHSNDropDownOnProductPage() {
		
		ProductHSNCodeValueDropDown.click();
	}	
	
	public void methodToSelectHSNDValueProductPage() {
		
		ProductHSNCodeValue.click();
	}

	public void methodToSupplyProductShelfLifeValue(String string) {
		
		ProductShelfLife.sendKeys(string);;
	}	
	
	public void methodToSupplyTextInSearchTagNameField(String string) {
		
		SearchTagNameField.sendKeys(string);;
	}	

	public void methodToSupplyTextInProductShortNameField(String string) {
		
		ProductShortName.sendKeys(string);;
	}
	
	public void methodToSupplyTextInProductCodeField(String string) {
		
		ProductCode.sendKeys(string);;
	}	
	
	
//*****************************************************************************************//
                                        //CATEGORY//

//Method to click on Add category button//
public void methodToClickOnAddCategoryButton() {
	
	CategoryAddCategoryButton.click();
}

//Method to supply text in Category name text field
public void methodToSupplyTextInCategoryNameField(String catName) {
	
	CategoryNameField.sendKeys(catName);
}

//Method to click On Category code button
public void methodToClickOnCategoryCodeHyperlink() {
	
	CategoryGenerateCategoryCode.sendKeys("100");
}

//Method to supply text in Category Description field
public void methodToSupplyTextInCategoryDescriptionField(String CategoryDescription ) {
CategoryDescriptionField.sendKeys(CategoryDescription);
}

//Method to supply text in HTML Description field
public void methodToSupplyTextInCategoryHTMLDescriptionFiel(String HTMLCategoryDescription ) {
	CategoryHTMLDescriptionField.sendKeys(HTMLCategoryDescription);
}


public void methodToSelectCategoryShowInDigitalCheckBox() {
	CategoryShowInDigitalCheckBoxnotSelected.click();
}

public void methodToClickOnCategoryCancelButton() {
	CategoryCancelButton.click();
}

public void methodToClickOnCategorySubmitButton() {
	CategorySubmitButton.click();
}

//Method to supply text in Display OrderField field
public void methodToSupplyTextInDisplayOrderField(String CategoryDisplayOrder ) {
	DisplayOrderField.sendKeys(CategoryDisplayOrder);

}
//Return result value of Searched text
public String methodToShowSearchedCategoryData() {
	return CategorySearchedResult.getText();
}

//Select Return result value of Searched text
public String methodToShowUpdatedCategorySearchedData() {
	return CategoryUpdatedSearchedResult.getText();
}
//Select Return result value of Searched text
public void methodToClickCategorySearchedData() {
	CategorySearchedResult.click();
}


//Supply text in Category Searched field
public void methodToSupplyTextInSearchedCategoryField(String Searched) {
	CategorySearchField.sendKeys(Searched);
}

public void methodToClickOnSearchCategoryIcon() {
	CategorySearchButton.click();
}

public void methodToClickOnCategoryEditButton() {
	CategoryEditButton.click();
}

public void methodToClickOnCategoryHyperlink() {
	CategoryHyperlinkCategoryButton.click();
}


//Create Category

//*****************************************************************************************//
                              //BRAND UNIT//

//Method to click On Brand Unit button
public void methodToClickOnAddBrandUnitButton() {
	
	BrandUnitAddBrandUnitButton.click();
}

//Method to supply text in Brand Unit Description field
public void methodToSupplyTextInBrandUnitNameField(String BrandUnitField ) {
	BrandUnitNameField.sendKeys(BrandUnitField);
}

//Method to supply text in Brand Unit Description field
public void methodToSupplyTextInBrandUnitDescriptionFiel(String BrandUnitDescription ) {
	BrandUnitDescriptionField.sendKeys(BrandUnitDescription);
}

//Method to click on Brand Unit Cancel button
public void methodToClickOnBrandUnitCancelButton() {
	BrandUnitCancelButton.click();
}

//Method to click on Brand Unit Submit button
public void methodToClickOnBrandUnitSubmitButton() {
	BrnadUnitSubmitButton.click();
}

//Method to click on Brand Unit Clear All button
public void methodToClickOnBrandUnitClearAllButton() {
	BrandUnitClearAllButton.click();
}


public Integer methodForPaginationNumber() {
String PageCountText = PaginationNumbers.getText();
String amt  = PageCountText;
String strArray[] = amt.split(" ");
//System.out.println(strArray[3]);
Integer PageCount = Integer.parseInt(strArray[3]);
return PageCount;
}

public void methodToClickOnBrandUnitCheckboxButton(WebDriver driver) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", BrandUnitCheckbox);
}




public void clickOnBrandUnitsForSort() 
{
	BrandUnitColumn.click();
	
}

public void clickOnBrandUnitValue() 
{
	BrandUnitValue.click();
	
}

public void clickOnEditBrandUnit() 
{
	EditBrandUnitValue.click();
	
}


//*****************************************************************************************//
                                    //CASE//
//Method to Click on CaseURL
public void methodToClickOnCaseURL()
{
	CaseHyperlinkURL.click();	
}


//Method to click On Case button
public void methodToClickOnAddCaseButton() {

	CaseAddCaseButton.click();
}

//Method to supply text in Case Name field
public void methodToSupplyTextCaseNameField(String CaseField ) {
	CaseCaseNameField.sendKeys(CaseField);
}

//Method to supply text in Case Description field
public void methodToSupplyTextInCaseDescriptionFiel(String CaseDescription ) {
	CaseCaseDescriptionField.sendKeys(CaseDescription);
}

//Method to click on Case Cancel button
public void methodToClickOnCaseCancelButton() {
	CaseUnitCancelButton.click();
}

//Method to click on Case Submit button
public void methodToClickOnCaseSubmitButton() {
	CaseSubmitButton.click();
}

//Method to click on Casing Column button
public void methodToClickOnCasingColumnName() {
	CasingColumn.click();
}

//Method to click on Tag Hyperlink
//*****************************************************************************************//
                                        //TAG//


//Method to click On Tag HyperLink
public void methodToClickOnAddTagHyperLink() {

	TagHyperlinkURL.click();
}



//Method to click On Tag button
public void methodToClickOnAddTagButton() {

	TagAddTagButton.click();
}

//Method to supply text in Case Name field
public void methodToSupplyTextInTagNameField(String TagField ) {
	TagTagNameField.sendKeys(TagField);
}

//Method to supply text in Case Description field
public void methodToSupplyTextInTagDescriptionFiel(String TagDescription ) {
	TagTagDescriptionField.sendKeys(TagDescription);
}

//Method to click on Case Cancel button
public void methodToClickOnTagCancelButton() {
	TagCancelButton.click();
}

//Method to click on Case Submit button
public void methodToClickOnTagSubmitButton() {
	TagSubmitButton.click();
}

//Method to click on Tag column Name
public void methodToClickOnTagColumnName() {
	TagCoulumnName.click();
}

//Method to click on Taxation Hyperlink
//*****************************************************************************************//
                                      //Tax Component//

//Click on Taxation URL
public void clickOnTaxationURL()
{
TaxationURL.click();
}

//Click on Tax Component URL
public void clickOnTaxationComponentURL()
{
TaxComponentURL.click();
}

//Click on Add Tax Component Button
public void clickOnAddTaxComponentButton()
{
AddTaxComponentButton.click();
}

//Supply text in Component Name field
public void supplyTextInComponentNameField(String string)
{
ComponentNameField.sendKeys(string);
}

//Click on Submit Button
public void clickOnAddTaxComponentSubmitButton()
{
AddTaxComponentSubmitButton.click();
}

//Click on ComponentSortColumn
public void clickOncomponentSortColumn()
{
	ComponentColumnSort.click();
}

//To get text of First Component Value
public String toGetTextOfFirstcomponentValue()
{
	return FirstComponentNameValue.getText();
}

//Click on Edit button of First Component Value
public void clickOnFirstcomponentValueToEdit()
{
	FirstComponentNameValueEdit.click();
}

//To get text of Second Component Value
public String toGetTextOfSecondcomponentValue()
{
	return SecondComponentNameValue.getText();
}

//Click on Edit button of Second Component Value
public void clickOnSecondComponentValueToEdit()
{
	SecondComponentNameValueEdit.click();
}

//Get text of Component Confirmation Message box
public String getMessageTextOfComponentConfirmation()
{
	return MessageBoxText.getText();
}

//Click on OK button Component Confirmation Message box
public void clickOnComponentConfirmationMessage()
{
	MessageBoxOKButton.click();
}

public String getMessageText_Success_OfComponentConfirmation()
{
	return MessageBoxTextSuccess.getText();
}

public String OKButtonOnComponentConfirmationMessageBox()
{
	return OKButtonOfMessageBox.getText();
}

public void clickOnOKButtonOnComponentConfirmationMessageBox()
{
	OKButtonOfMessageBox.click();
}

public boolean checkIconOnComponentConfirmationMessageBox()
{
	return icononComponentConfirmationMessage.isEnabled();
}

public void clickOnComponentNameField()
{
	ComponentNameField.click();
}

//*****************************************************************************************//
                                    //Tax Group//
//click on Tax Group URL
public void TAXGROUP_clickOnTAXGroupURL()
{
	TAXGROUP_TaxGroupURL.click();
}

//click on Tax Group URL
public void TAXGROUP_clickOnAddTAXGroupButton()
{
	TAXGROUP_AddTaxGroupButton.click();
}

//Supply text in Tax Code field
public void TAXGROUP_SupplyTextInTAXCodeField(String string)
{
	TAXGROUP_TAXCodeField.sendKeys(string);
}

//Supply text in Tax Group field
public void TAXGROUP_SupplyTextInTAXGroupField(String string)
{
	TAXGROUP_TaxGroupNameField.sendKeys(string);
}

//Supply text in Tax Group Description field
public void TAXGROUP_SupplyTextInTAXGroupDescriptionField(String string)
{
	TAXGROUP_DescriptionField.sendKeys(string);
}

//Supply text in Tax Group Effective To Date field
public void TAXGROUP_SupplyTextInTAXGroupEffectiveFromField(String string)
{
	TAXGROUP_EffectiveFromDateField.sendKeys(string);
}

//Supply text in Tax Group Effective From Date field
public void TAXGROUP_SupplyTextInTAXGroupEffectiveToField(String string)
{
	TAXGROUP_EffectiveToDateField.sendKeys(string);
}

public void TAXGROUP_clickOnCancelButton()
{
	TAXGROUP_CancelButton.click();
}

public void TAXGROUP_clickOnSaveNextButton()
{
	TAXGROUP_SaveNextButton.click();
}

public void TAXGROUP_clickOnClearAllButton()
{
	TAXGROUP_ClearAllButton.click();
}

public void TAXGROUP_clickOnTaxGroupColumn()
{
	TAXGROUP_CoulmnGroupName.click();
}

















}
