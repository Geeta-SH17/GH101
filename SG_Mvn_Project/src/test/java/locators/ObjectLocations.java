package locators;

public interface ObjectLocations {
	String obj_UserName_Edit = "//input[@id='username']";
	String obj_Password_Edit = "//input[@name='pwd']";
	String obj_Login_Btn = "//a[@id='loginButton']";
	String obj_Logout_Btn = "//a[@id='logoutLink']";
	String obj_ExploreActiTime_Btn = "//div[@class='startExploringLink']/span[text()='Start exploring actiTIME']";
	String obj_Shortcut_Window = "//div[@style='display: block;']";
	String obj_Shortcut_Close_Btn = "//div[@id='gettingStartedShortcutsMenuCloseId']";
	String obj_TimeTrack_Page = "//td[@class='pagetitle']";
	String obj_Users_Menu = "//div[text()='USERS']";
	String obj_AddUser_Btn = "//div[text()='Add User']";
	String obj_FirstName_Edit = "//input[@name='firstName']";
	String obj_LastName_Edit = "//input[@name='lastName']";
	String obj_Email_Edit = "//input[@name='email']";
	String obj_User_UserName_Edit = "//input[@name='username']";
	String obj_User_Password_Edit = "//input[@name='password']";
	String obj_RetypePassword_Edit = "//input[@name='passwordCopy']";
	String obj_CreateUser_Btn = "//span[text()='Create User']";
	String obj_DeleteUser_Btn = "//button[contains(text(), 'Delete User')]";
	String obj_LoginHeader = "//td[@id='headerContainer']";
	String obj_LoginImage = "//img[contains(@src, '/timer.png')]";
	
	String obj_Tasks_Menu = "//div[text()='TASKS']";
	String obj_AddNewTask_btn = "//div[text()='Add New Task']";
	String obj_CreatNewTask_Btn = "//div[contains(text(),'Create new tasks')]";
	String obj_EnterTaskName_Edit = "//body[1]/div[8]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	String obj_ClickTaskDesc_Btn = "//a[@title='Click to enter task description']";
	String obj_EnterTaskDesc_Edit = "//textarea[@id='editDescriptionPopupText']";
	String obj_save_btn = "//input[@id='scbutton']";
	String obj_CheckBox = "//tbody/tr[1]/td[5]/div[1]/input[1]";
	String obj_CreateTask_Btn = "//span[contains(text(),'Create Tasks')]";
	
	String obj_Action_Btn = "//body/div[@id='taskManagementPage']/div[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]";
	String obj_Delete_Btn = "//body/div[@id='taskManagementPage']/div[@id='taskListBlock']/div[3]/div[4]/div[1]/div[3]/div[1]";
	String obj_DeleteConfirm_Btn = "//span[@id='taskPanel_deleteConfirm_submitTitle']";
			
}
