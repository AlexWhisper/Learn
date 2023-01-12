package com.alex.HouseRent.service;

import com.alex.HouseRent.domain.House;
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
}
