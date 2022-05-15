package pageObject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uiStore.HomeUi;
import utility.Logs;

public class HomePage {
	
	WebDriverHelper helper;
	Logs logutil;
	Logger log;
	
	public HomePage() {
		helper=new WebDriverHelper();
		logutil=new Logs();
		log=logutil.createLog();
	}
	
	public void clickOnMenu() {
		helper.explicitWaitForInvisibilty(HomeUi.menu, 20);
		helper.clickOn(HomeUi.menu);
		log.info("Clicked on Menu");
	}
	
	public void clickOnFindAndRes() {
		helper.explicitWaitForInvisibilty(HomeUi.findAndReserve, 20);
		helper.hiddenClickOn(HomeUi.findAndReserve);
		log.info("Clicked on Find and Reserve");
	}
}
