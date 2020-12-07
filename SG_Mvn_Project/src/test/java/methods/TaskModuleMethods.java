package methods;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.DriverScript;
import locators.ObjectLocations;

public class TaskModuleMethods extends DriverScript implements ObjectLocations{
	/*********************************************
	 * Method Name	: createTask()
	 * Purpose		: to create the new task in the actiTime application
	 * Author		: tester1
	 * Parameters	: WebDriver
	 * Return Type	: String
	 * Reviewed By	: Tester2
	 * Date Created	:
	 *********************************************/
	public String createTask(WebDriver oDriver, Map<String, String> objData)
	{
		String strStatus = null;
		try {
			test = extent.startTest("createTask");
			strStatus+= appInd.clickObject(oDriver, obj_Tasks_Menu);
			Thread.sleep(2000);
			
			strStatus+= appInd.clickObject(oDriver, obj_AddNewTask_btn);
			Thread.sleep(2000);
			
			strStatus+= appInd.clickObject(oDriver, obj_CreatNewTask_Btn);
			Thread.sleep(2000);
			
			strStatus+= appInd.setObject(oDriver, obj_EnterTaskName_Edit, objData.get("TaskName"));
			strStatus+= appInd.clickObject(oDriver, obj_ClickTaskDesc_Btn);
			Thread.sleep(2000);
			
			strStatus+= appInd.setObject(oDriver, obj_EnterTaskDesc_Edit, objData.get("TaskDesc"));
			strStatus+=appInd.clickObject(oDriver, obj_save_btn);
			Thread.sleep(2000);
			
			strStatus+= appInd.clickObject(oDriver, obj_CheckBox);
			Thread.sleep(4000);
			
			
			strStatus+= appInd.clickObject(oDriver, obj_CreateTask_Btn);
			Thread.sleep(4000);
			
			String taskName = objData.get("TaskName");
			strStatus+= appInd.verifyElementExist(oDriver, By.xpath("//div[contains(text(),"+"'"+taskName+"'"+")]"));
			if(strStatus.contains("false")) {
				reports.writeResult(oDriver, "Fail", "Failed to create the new User in actiTime application", test);
				return null;
			}else {
				reports.writeResult(oDriver, "Pass", "The new user '"+taskName+"' has created successful", test);
				return taskName;
			}
		}catch(Exception e)
		{
			reports.writeResult(oDriver, "Exception", "Exception in the method createUser(). "+e.getMessage(), test);
			return null;
		}
	}
	
	
	
	/*********************************************
	 * Method Name	: deleteUser()
	 * Purpose		: to delete the user in the actiTime application
	 * Author		: tester1
	 * Parameters	: WebDriver, userName
	 * Return Type	: boolean
	 * Reviewed By	: Tester2
	 * Date Created	:
	 *********************************************/
	public boolean deleteTask(WebDriver oDriver, String tasktoDelete)
	{
		String strStatus = null;
		try
		{
			test = extent.startTest("deleteTask");
			strStatus += appInd.clickObject(oDriver,By.xpath("//div[contains(text(),"+"'"+tasktoDelete+"'"+")]"));
			Thread.sleep(2000);
			
			strStatus += appInd.clickObject(oDriver, obj_Action_Btn);
			Thread.sleep(2000);
			
			strStatus += appInd.clickObject(oDriver, obj_Delete_Btn);
			Thread.sleep(2000);
			
			strStatus += appInd.clickObject(oDriver, obj_DeleteConfirm_Btn);
			Thread.sleep(5000);
			
			strStatus += appInd.verifyElementExist(oDriver, By.xpath("//body/div[@id='taskManagementPage']/div[@id='taskListBlock']/div[1]/div[2]/div[1]/div[1]"));
			//div[contains(text(),'task1')]  //body/div[@id='taskManagementPage']/div[@id='taskListBlock']/div[1]/div[2]/div[1]/div[1]
			if(strStatus.contains("false"))
			{
				reports.writeResult(oDriver, "Fail", "Failed to delete task"+tasktoDelete+" from actiTime Application", test);
				return false;
			}
			else
			{
				reports.writeResult(oDriver, "Pass", "The Task "+tasktoDelete+" deleted successfully", test);
				return true;
			}
			
		}
		catch(Exception e)
		{
			reports.writeResult(oDriver, "Exception", "Exception in the Method DeleteTask(). "+e.getMessage(), test);
			return false;
		}
	}
}
