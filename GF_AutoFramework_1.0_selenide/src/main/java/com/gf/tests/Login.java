package com.gf.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Login {
	WebDriver driver=new ChromeDriver();	
	@BeforeClass
	public void login() {
		driver.get("https://gcfw.dongjiang.com.cn/wf/");
		WebElement username=driver.findElement(By.xpath("//*[@id=\"login\"]/div/label[1]/input"));
		username.clear();
		username.sendKeys("zhaojiaxi");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"login\"]/div/label[2]/input"));
		password.clear();
		password.sendKeys("123456");
		WebElement login=driver.findElement(By.linkText("登陆"));
		login.click();
	}
	//物料基础数据维护
	@Test(priority=0)
	public void materialBasicDataMaintenance() throws InterruptedException {
		Thread.sleep(2000);
		WebElement warehouse=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/ul/li[2]/a"));
		warehouse.click();
		WebElement materialBasic=driver.findElement(By.linkText("物料基础数据维护"));
		materialBasic.click();
	}
	//新建
	@Test(priority=1)
	public void materialBasicCreate () throws InterruptedException {
		Thread.sleep(1000);
		WebElement createMB=driver.findElement(By.linkText("新建"));
		createMB.click();
		Thread.sleep(1000);
		//输入物料信息
		WebElement materialName=driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div/input"));
		materialName.sendKeys("PAC");
		WebElement materialType=driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div/div/div[1]/label/input"));
		materialType.click();
		Thread.sleep(500);
		WebElement chooseMT=driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div/div/div[2]/div/li[1]"));
		chooseMT.click();
		WebElement materialModel=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/input"));
		materialModel.sendKeys("27%");
		WebElement materialBrand=driver.findElement(By.xpath("//*[@id=\"form\"]/div[4]/div/input"));
		materialBrand.sendKeys("杂牌");
		WebElement materialCode=driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/input"));
		materialCode.sendKeys("CG11010009");
		WebElement materialUnit=driver.findElement(By.xpath("//*[@id=\"form\"]/div[6]/div/input"));
		materialUnit.sendKeys("吨");
		WebElement materialLimit=driver.findElement(By.xpath("//*[@id=\"form\"]/div[11]/div/label/input"));
		materialLimit.sendKeys("5000");
		WebElement comfirmButton=driver.findElement(By.linkText("确认"));
		comfirmButton.click();
		Thread.sleep(1000);
		WebElement message=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]"));
		boolean msg=message.getText().contains("保存成功");
		Assert.assertTrue(msg);
	}
    //查看
	@Test(priority=2)
	public void materialBasicCheck() throws InterruptedException {
		Thread.sleep(500);
		WebElement checkMB=driver.findElement(By.xpath("//*[@id=\"material-maintance\"]/div/div[2]/div[3]/div[2]/div[2]/ul[1]/li[10]/a[1]"));
		checkMB.click();
		Thread.sleep(500);
		WebElement closeMB=driver.findElement(By.xpath("//*[@id=\"material-maintance\"]/div[2]/div/div[1]/div/span"));
		closeMB.click();
	}
	//修改
	@Test(priority=3)
	public void materialBasicModify() throws InterruptedException {
		Thread.sleep(1000);
		WebElement modifyMB=driver.findElement(By.xpath("//*[@id=\"material-maintance\"]/div/div[2]/div[3]/div[2]/div[2]/ul[1]/li[10]/a[2]"));
		modifyMB.click();
		Thread.sleep(500);
		WebElement materialName=driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div/input"));
		materialName.clear();
		materialName.sendKeys("无水氯化钙");
		WebElement materialModel=driver.findElement(By.xpath("//*[@id=\"form\"]/div[4]/div/input"));
		materialModel.clear();
		materialModel.sendKeys("0.97");
		WebElement materialCode=driver.findElement(By.xpath("//*[@id=\"form\"]/div[6]/div/input"));
		materialCode.clear();
		materialCode.sendKeys("CG11010214");
		WebElement materialUnit=driver.findElement(By.xpath("//*[@id=\"form\"]/div[7]/div/input"));
		materialUnit.clear();
		materialUnit.sendKeys("千克");
		WebElement materialPrice=driver.findElement(By.xpath("//*[@id=\"form\"]/div[8]/div/input"));
		materialPrice.clear();
		materialPrice.sendKeys("200");
		WebElement materialUnitConsumption=driver.findElement(By.xpath("//*[@id=\"form\"]/div[9]/div/input"));
		materialUnitConsumption.clear();
		materialUnitConsumption.sendKeys("20");
		WebElement materialFloor=driver.findElement(By.xpath("//*[@id=\"form\"]/div[10]/div/input"));
		materialFloor.clear();
		materialFloor.sendKeys("1000");
		WebElement materialUpper=driver.findElement(By.xpath("//*[@id=\"form\"]/div[11]/div/input"));
		materialUpper.clear();
		materialUpper.sendKeys("2000");
		WebElement materialLimit=driver.findElement(By.xpath("//*[@id=\"form\"]/div[11]/div/input"));
		materialLimit.clear();
		materialLimit.sendKeys("20");
		WebElement materialLimitModify=driver.findElement(By.xpath("//*[@id=\"form\"]/div[12]/div/select"));
		materialLimitModify.click();
		Thread.sleep(300);
		WebElement materialLimitModify2=driver.findElement(By.xpath("//*[@id=\"form\"]/div[12]/div/select/option[2]"));
		materialLimitModify2.click();
		WebElement comfirmButton=driver.findElement(By.linkText("确认"));
		comfirmButton.click();
		Thread.sleep(1000);
		WebElement message=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]"));
		boolean msg=message.getText().contains("保存成功");
		Assert.assertTrue(msg);
	}
	//物料申请管理
	@Test(priority=4)
	public void materialsApplicationManagement() throws InterruptedException {
		Thread.sleep(300);
		WebElement materialsApplicationManagement=driver.findElement(By.linkText("物料申请管理"));
		materialsApplicationManagement.click();
	}
	//新建
	@Test(priority=5)
	public void materialsApplicationCreate() throws InterruptedException {
		Thread.sleep(1000);
		WebElement createMA=driver.findElement(By.linkText("新建"));
		createMA.click();
		Thread.sleep(500);
		WebElement addLine=driver.findElement(By.linkText("新增一行"));
		addLine.click();
		WebElement materialName=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[2]/select"));
		materialName.click();
		Thread.sleep(300);
		WebElement materialName2=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[2]/select/option[2]"));
		materialName2.click();
		WebElement materialCount=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[5]/input"));
		materialCount.sendKeys("1500");
		WebElement materialDeliveryDate=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[7]/div/div[1]/label/input"));
		materialDeliveryDate.sendKeys("2019-01-31");
		WebElement materialSubscribeReason=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[8]/select"));
		materialSubscribeReason.click();
		Thread.sleep(300);
		WebElement materialSubscribeReason2=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[8]/select/option[3]"));
		materialSubscribeReason2.click();
		WebElement submitButton=driver.findElement(By.linkText("提交"));
		submitButton.click();
		Thread.sleep(1000);
		WebElement message=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]"));
		boolean msg=message.getText().contains("提交成功");
		Assert.assertTrue(msg);
	}
	
	
	//修改
	@Test(priority=7)
	public void materialsApplicationModify() throws InterruptedException {
		WebElement modifyButton=driver.findElement(By.xpath("//*[@id=\"material-application\"]/div/div[2]/div[2]/div[2]/div[2]/ul[1]/li[9]/a[2]"));
		modifyButton.click();
		Thread.sleep(500);
		WebElement materialName=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[2]/select"));
		materialName.click();
		Thread.sleep(300);
		WebElement materialName2=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[2]/select/option[1]"));
		materialName2.click();
		WebElement materialBrand=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[3]/input"));
		materialBrand.clear();
		materialBrand.sendKeys("英飞凌");
		WebElement materialType=driver.findElement(By.xpath("//*[@id=\"table-body\"]/ul[1]/li[4]/input"));
		materialType.clear();
		materialType.sendKeys("30%");
		
	}
	
	
}
