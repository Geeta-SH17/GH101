package testScripts;

import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import driver.DriverScript;

public class TaskModuleScripts extends DriverScript{
	/****************************************************
	 * Script Name	: TS_CreateDeleteTask()
	 * Test Case ID	: SRC_102
	 * 
	 * 
	 * 
	 * 
	 * *************************************************
	 */
	@Test
	public boolean TS_CreateDeleteTask()
	{
		WebDriver oBrowser = null;
		String strStatus = null;
		Map<String, String> objData = null;
		try {
			extent = reports.startReport("create", testCaseID, appInd.readPropData("BuildNum"));
			objData = datatable.getExcelData("taskModule", "TS_CreateDelete");
			oBrowser = appInd.launchApp(objData.get("BrowserName"));
			strStatus+= appDep.navigateURL(oBrowser, appInd.readPropData("URL"));
			strStatus+= appDep.loginToApp(oBrowser, objData.get("UN"), objData.get("PWD"));
			String taskName = taskMethods.createTask(oBrowser, objData);
			strStatus+= taskMethods.deleteTask(oBrowser, taskName);
			strStatus+= appDep.logoutFromApp(oBrowser);
			appInd.closeBrowser(oBrowser);
			
			if(strStatus.contains("false")) {
				reports.writeResult(oBrowser, "Fail", "The script TS_CreateTask() failed.", test);
				return false;
			}else {
				reports.writeResult(oBrowser, "Pass", "The script TS_CreateTask() passed.", test);
				return true;
			}
		}catch(Exception e)
		{
			reports.writeResult(oBrowser, "Exception", "Exception in TS_CreateTask() test script. "+e.getMessage(), test);
			return false;
		}
		finally {
			reports.endTest(test);
			oBrowser = null;
		}
	}
}
