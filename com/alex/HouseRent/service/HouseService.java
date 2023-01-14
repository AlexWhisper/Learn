package com.alex.HouseRent.service;

import com.alex.HouseRent.domain.House;
import com.alex.HouseRent.utils.Utility;
import com.alex.HouseRent.view.HouseView;

public class HouseService {
    private House[] houses;
    private int HouseNum=1;
    private int idCounter=1;
    public HouseService(int size) {

        houses=new House[size];
        houses[0]=new House(1,"Alex","110","丰台区",20,"未出租");
    }

    public House[] list(){ //返回一个存着房屋对象的数组

        return houses;
    }

    public boolean add(House newhouse){
        if (HouseNum == houses.length){
            System.out.println("数组已满，无法添加");
            return false;
        }
        houses[HouseNum++]=newhouse;

        newhouse.setId(++idCounter);
        return true;
    }
    public void enlarge(){
        House[] newHouses=new House[houses.length+5];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i]=houses[i];
        }
        houses=newHouses;
    }

    public boolean del(int key) {
        int index=-1;
        //找到编号key所对对应下标
        for (int i = 0; i <HouseNum; i++) {
            if (houses[i].getId()==key){
                index=i;
                break;
            }
        }
        if (index==-1) return false; //未找到 ，返回-1；

        for (int i = index; i < houses.length - 1; i++) {
                houses[i]=houses[i+1];
        }
        houses[--HouseNum]=null;
        return true;
    }
    public House search(int key) {
        for (int i = 0; i <=HouseNum; i++) {
            if (houses[i].getId()==key){
                return houses[i];
            }

        }
        return null;
    }

    public void update(int key) {
//        int index=-1;
//        for (int i = 0; i <= HouseNum; i++) {
//            if (houses[i].getId()==key){
//                System.out.println(houses[i].toString());
//                index=i;
//                break;
//            }
//        }
        House res = search(key);
        if (res==null){
            System.out.println("未找到");
        }else {
            System.out.println("信息已找到，请修改（无需修改的直接敲回车）");
            System.out.println("房主("+res.getName()+")：");
            res.setName(Utility.readString(6,res.getName()));
            System.out.println("电话("+res.getPhone()+")：");
            res.setPhone(Utility.readString(12,res.getPhone()));

            System.out.println("地址("+res.getAddress()+")：");
            res.setAddress(Utility.readString(16,res.getAddress()));

            System.out.println("月租("+res.getRent()+")：");
            res.setRent(Utility.readInt(res.getRent()));

            System.out.println("状态("+res.getState()+")：");
            res.setState(Utility.readString(3,res.getState()));


        }
//        if (index==-1){
//            System.out.println("未找到");
//        }else {
//            System.out.println("信息已找到，请修改（无需修改的直接敲回车）");
//            System.out.println("房主：");
//            houses[index].setName(Utility.readString(6,houses[index].getName()));
//
//            System.out.println("电话：");
//            houses[index].setPhone(Utility.readString(12,houses[index].getPhone()));
//
//            System.out.println("地址：");
//            houses[index].setAddress(Utility.readString(16,houses[index].getAddress()));
//
//            System.out.println("月租：");
//            houses[index].setRent(Utility.readInt(houses[index].getRent()));
//
//            System.out.println("状态：");
//            houses[index].setState(Utility.readString(3,houses[index].getState()));
//
//
//        }

    }
}
