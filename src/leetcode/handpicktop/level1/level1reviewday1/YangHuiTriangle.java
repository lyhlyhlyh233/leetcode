package leetcode.handpicktop.level1.level1reviewday1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/3     14:19
 */
public class YangHuiTriangle {
    //生成前n行杨辉三角
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            for(int i = 0 ; i <  numRows ;i++){//每一层
                List<Integer> list = new ArrayList<Integer>();
                List<Integer> listTop = new ArrayList<>();
                if(i!=0){
                   listTop = result.get(i-1);//上层
                }
                for(int j = 0 ; j <= i ; j++){//每层的每一个
                    if(j==0||j==i) list.add(1);
                    else{
                        list.add(listTop.get(j-1)+listTop.get(j));
                    }
                }
                result.add(list);
            }
            return  result;
    }
}
