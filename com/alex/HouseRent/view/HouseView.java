package com.alex.HouseRent.view;

import com.alex.HouseRent.domain.House;
import com.alex.HouseRent.service.HouseService;
import com.alex.HouseRent.utils.Utility;

public class HouseView {
    private boolean loop=true;
    private String key;

    HouseService houseService = new HouseService(2);
    public void MainMenu(){

        do {
            System.out.println("===========房屋出租系统菜单===========");
            System.out.println("\t\t\t1. 新增房屋信息");
            System.out.println("\t\t\t2. 查询房屋信息");
            System.out.println("\t\t\t3. 修改房屋信息");
            System.out.println("\t\t\t4. 删除房屋信息");
            System.out.println("\t\t\t5. 全部房屋信息");
            System.out.println("\t\t\t6. 退       出");
            System.out.println("请输入你的选择（1-6）：");
            key= Utility.readString(1);
            switch(key){
                case "1":
                    addHouse();
                    break;
                case "2":
                    searchHouse();
                    break;
                case "3":
                    updateHouse();
                    break;
                case "4":
                    delHouse();
                    break;
                case "5":
                    listHouse();
                    break;
                case "6":
                    exit();
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }


        }while(loop);
    }

    private void updateHouse() {
        System.out.println("=============修改房屋信息=============");
        System.out.println("请输入要修改的房屋编号（-1为取消）");
        int key = Utility.readInt();
        if(key==-1) return;
        houseService.update(key);
        System.out.println("=============修改完毕=============");
    }

    private void searchHouse() {
        System.out.println("=============查询房屋信息=============");
        System.out.println("请输入要查询的房屋编号（-1为取消）");
        int key = Utility.readInt();
        if(key==-1) return;
        if (!(houseService.search(key))){
            System.out.println("未找到房源");
        }
        System.out.println("=============查找结束=============");
    }

    private void exit() {
        if (Utility.readConfirmSelection()=='Y'){
            loop=false;
        }
    }

    public void listHouse(){

        House[] list = houseService.list();
        System.out.println("=============全部房屋信息=============");

        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i <list.length; i++) {
            if (list[i]==null)break;
            System.out.println(list[i].toString());
        }
        System.out.println("=============输出完毕=============");
    }
    public void delHouse(){
        System.out.println("=============删除房源=============");
        System.out.println("请输入要删除的房子编号(-1为取消)：");
        int key = Utility.readInt();
        if (key==-1){
            return;
        }
        System.out.println("请确认是否要删除Y/N");
        char c = Utility.readConfirmSelection();
        if (c=='N') {
            System.out.println("删除已取消！");
            return;
        }
        if (houseService.del(key)==true){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败，未找到");
        }


    }
    public void addHouse(){

        System.out.println("房主：");
        String name=Utility.readString(6);
        System.out.println("电话：");
        String phone=Utility.readString(11);
        System.out.println("地址：");
        String addr=Utility.readString(16);
        System.out.println("月租：");
        int rent=Utility.readInt();
        System.out.println("状态：");
        String state=Utility.readString(3);

        House newHouse = new House(1,name,phone,addr,rent,state);

        if(houseService.add(newHouse)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败，数组已满,将扩容5个空余的容量");
            houseService.enlarge();
            houseService.add(newHouse);
            System.out.println("扩容成功，新数据已存放好");

        }
    }

}
