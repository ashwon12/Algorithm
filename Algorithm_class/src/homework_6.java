class binaryTree {
	
    private int num;
    private binaryTree left;
    private binaryTree right;

    /* 생성자 */
    public binaryTree (int num){
        this.setNum(num);
    }


    public int getNum() {
        return num;
    }

    public void setNum(int data) {
        this.num = num;
    }

    public binaryTree getLeft() {
        return left;
    }

    public void setLeft(binaryTree left) {
        this.left = left;
    }

    public binaryTree getRight() {
        return right;
    }

    public void setRight(binaryTree right) {
        this.right = right;
    }
}


public class homework_6 {
    static binaryTree root = new binaryTree(3);
    static binaryTree left = new binaryTree(8);
    static binaryTree left1 = new binaryTree(4);
    static binaryTree left3 = new binaryTree(6);
    static binaryTree right3 = new binaryTree(17);
    static binaryTree right1 = new binaryTree(9);
    static binaryTree left4 = new binaryTree(13);
    static binaryTree right4 = new binaryTree(24);
    static binaryTree right = new binaryTree(5);
    static binaryTree left2 = new binaryTree(2);
    static binaryTree left5 = new binaryTree(18);
    static binaryTree right5 = new binaryTree(20);
    static binaryTree right2 = new binaryTree(16);
    static binaryTree left6 = new binaryTree(32);
    static binaryTree right6 = new binaryTree(7);
    
	private static void setBinaryTree() {
		root.setLeft(left);root.setRight(right);
		left.setLeft(left1);left.setRight(right1);
		right.setLeft(left2);right.setRight(right2);
		left1.setLeft(left3);left1.setRight(right3);
		right1.setLeft(left4);right1.setRight(right4);
		left2.setLeft(left5);left2.setRight(right5);
		right2.setLeft(left6);right2.setRight(right6);
		
	}
	
	private static void greedy(binaryTree root) {
		int count = root.getNum();

		while(root.getLeft()!= null && root.getRight()!=null) {
			if(root.getLeft().getNum() < root.getRight().getNum()) {
				count += root.getLeft().getNum();
				root = root.getLeft();
			}else if(root.getLeft().getNum() > root.getRight().getNum()) {
				count += root.getLeft().getNum();
				root = root.getRight();
			}
		}

	}
    
    
	public static void main(String[] args) {
		System.out.print("실행");
		setBinaryTree();
		greedy(root);
	}
	
}


