package test;

public class MiGong {
    public static void main(String[] args) {
        int[][] map=new int[8][7];
        for (int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }


        map[3][1]=1;map[3][2]=1;

        T t=new T();
        t.findways(map,1,1);


        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
//使用0 表示未走过
//使用1 表示障碍
//使用2 表示走过
//使用3 表示走不通
class T{
    public boolean findways(int[][] map,int i,int j){ //传入一个地图map，和当前坐标ij
        if (map[6][5]==2) {
            return true;
        }else if (map[i][j]==0){
            map[i][j]=2;
            //向下寻路
            if(findways(map,i+1,j)){
                return true;
            } else if (findways(map,i,j+1)) {
                return true;
            } else if (findways(map,i-1,j)) {
                return true;
            }else if(findways(map,i,j-1)){
                return true;
            }else {
                map[i][j]=3;
                return false;
            }
        }else{
            return false;
        }

    }
}
