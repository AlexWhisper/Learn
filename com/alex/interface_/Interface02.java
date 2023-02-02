package com.alex.interface_;

public class Interface02 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        work(mysqlDB);
        work(oracleDB);
//        DBInterface.a=01;//接口中的属性，都是public static final
//        DBInterface dbInterface = new DBInterface();//接口不能被实例化

    }
    public static void work(DBInterface db){
        db.connection();
        db.disconnection();

    }
}
