package designPattern.mediator;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:26:35 
 * 中介者模式－－测试
 */
public class TestMediator {

	public static void main(String[] args) {
		 //一个房主、一个租房者、一个中介机构  
        MediatorStructure mediator = new MediatorStructure();  
          
        //房主和租房者只需要知道中介机构即可  
        HouseOwner houseOwner = new HouseOwner("张三", mediator);  
        Tenant tenant = new Tenant("李四", mediator);  
          
        //中介结构要知道房主和租房者  
        mediator.setHouseOwner(houseOwner);  
        mediator.setTenant(tenant);  
          
        tenant.constact("听说你那里有三室的房主出租.....");  
        houseOwner.constact("是的!请问你需要租吗?");  
	}

}
