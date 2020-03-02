import java.util.ArrayList;
import java.util.Random;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
//        int[] nums = {5,3,6,8,4,2};
//        for(int num:nums)
//            bst.add(num);
        //bst.inOrder();
        //bst.preOrder();
        //System.out.println(bst);

        //bst.preOrderNR();

//        bst.levelOrder();
        int n = 1000;
        Random random = new Random();
        for(int i = 0; i < n; i++){
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while(!bst.isEmpty()){
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
    }
}
