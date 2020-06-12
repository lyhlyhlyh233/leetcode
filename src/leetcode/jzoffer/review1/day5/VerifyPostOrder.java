package leetcode.jzoffer.review1.day5;

/**
 * @Author :   lyh
 * @Dtae :     2020/6/12     14:47
 */
public class VerifyPostOrder {
    //验证数组是否为二叉搜索的后续遍历。
    //二叉搜索数  左小又大。
    //后序遍历   左 右 上
    //最右边是父节点。
    public boolean verifyPostorder(int[] postorder) {
            if(postorder.length==0) {
                return true;
            }
            return go(postorder,0,postorder.length-1);
    }

    /**
     * 判断i 到  j 是否合格
     * @param postorder
     * @param i
     * @param j
     * @return
     */
    public boolean go(int[] postorder,int i, int j){
        if(j-1<i){
            return  true;
        }
            int root = postorder[j];
            //找到最后一个小于root的数，以及最后一个大于root的数
           //即反向遍历j-1 到 i 第一个大于 root的数，以及第一个小于root的数
           //左边没有元素了。

           int m = 0;
           int p = i;
           while(postorder[p]<root) {
               p++;//找到一个大于root的数
           }
           m = p;
           while(postorder[p]>root) {
               p++;
           }

           return  p==j&&go(postorder,i,m-1)&&go(postorder,m,j-1);
    }
}
