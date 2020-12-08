package com.data.structure.chapter3;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * 自定义一个单链表类, 这个链表包含结点的相关信息
 *
 * 单链表的简单操作(增加，删除，获取总长度，链表元素排序，链表遍历)
 *
 * @ClassName: SingleLinkList
 * @Description: 自定义一个链表类
 * @Author: lin
 * @Date: 2020/5/29 16:37
 * History:
 * @<version> 1.0
 */
public class SingleLinkList {


    public static void main(String[] args) {


//        System.out.println("--------添加到链表的最前面---------");
//        int t= 10;
//        for (int i = 0; i < t; i++) {
//            addFirst(i);
//        }
//        display();
//        System.out.println("--------打印包含元素---------");
//
//        System.out.println("链表是否包含该元素："+contains(11));

        addData(4);
        addData(3);
        addData(1);
        addData(5);
        addData(2);
        traverse(head);

        System.out.println("--------查看长度---------");
//        System.out.println(linkNodeLength());
//        System.out.println("========size=====" + getSize());

        System.out.println("--------插入节点到指定位置---------");
        insertNode( head, 2, 9);
        traverse(head);


//        System.out.println("--------删除节点---------");
//        delete(1);
//        traverse(head);


//        System.out.println("---------冒泡排序-----------");
//        sortLinkList(head);
//        traverse(head);


        System.out.println("---------选择排序-----------");
        selectSortNode();
        traverse(head);

//        System.out.println("---------插入选择排序-----------");
//        insertSortNode();
//        traverse(head);

        System.out.println("---------插入选择排序2-----------");
        insertSortNode2(head);
        traverse(head);


        System.out.println("--------倒数第n个节点---------");

       ListNode kNode = findKeyNode(head, 4);
       assert kNode != null;
       System.out.println("倒数第n个节点="+kNode.data);


        System.out.println("--------倒着输出链表---------");
        //从首节点开始
        printListReversely(head.next);

        System.out.println("--------非递归方式从尾部到头输出链表---------");
        reservePrt2(head);


        System.out.println("--------查询链表中间节点---------");
        ListNode searchMid = searchMid(head);
        System.out.println(searchMid.data);


//        System.out.println("--------递归链表反转---------");
//
//        ListNode reverseHead = reverseLinkList(head.next);
//        traverse4Reverse(reverseHead);

//        System.out.println("--------非递归链表反转---------");
//        ListNode node = reverseList(head);
//        traverse4Reverse(node);

        System.out.println("--------非递归链表反转2---------");
        ListNode reverse = reverse(head);
        traverse4Reverse(reverse);

    }


    /**
     * 头指针
     */
    private static ListNode head = new ListNode() ;

    private static ListNode firstNode = null;
    /**
     * 链表长度
     */
    private static   int size;





    /**
     * 是否含有元素
     * @return
     */
    public static   boolean isEmpty(){
        return  size == 0;
    }

    /**
     * 清空链表
     */
    public void  clear(){
        head = null;
        /**
         * 尾结点
         */
        ListNode tail = null;
    }









    /**
     * 1.2
     *  直接在链表的最后插入新增的结点即可
     *   将原本最后一个结点的next指向新结点
     * @param node
     */
    public static void addNode(ListNode node){
        //临时节点, 从头节点开始
        //一个移动的指针(把头结点看做一个指向结点的指针)
        ListNode temp = head;
        //遍历单链表，直到遍历到最后一个则跳出循环。
        while (temp.next != null){
             temp = temp.next;
        }
        //temp为最后一个结点或者是头结点，将其next指向新结点
        temp.next= node;
    }



    /**
     * 向添加插入数据
     *
     * @param value 要添加的数据
     */
    public static void addData(int value) {

        //初始化要加入的节点
        ListNode newNode = new ListNode(value);

        //临时节点(head我已经初始化了)
        ListNode temp = head;


        // 找到尾节点
        while (temp.next != null) {
            temp = temp.next;
        }

        // 已经包括了头节点.next为null的情况了～
        temp.next = newNode;

        size++;
    }

    /**
     * 2、链表的长度
     * @return
     */
    public static int linkNodeLength(){
        int length = 0;
        ListNode listNode = head;
        while (listNode.next != null){
            length ++;
            listNode = listNode.next;
        }
        return  length;
    }


    public static int getSize(){
        return  size;
    }


    /**
     *3、将节点插入到指定的位置
     *    插入操作需要知道1个结点即可，当前位置的前一个结点
     * @param index 插入链表的位置，从1开始
     * @param node 插入的结点
     */
    public static void insertNodeByIndex(int index, ListNode node){
        //首先需要判断指定位置是否合法，
        if(index< 1 || index> linkNodeLength()+1){
            System.out.println("插入位置不合法。");
            return;
        }
        //记录位置
        int leg = 1;
        //可移动的指针
        ListNode temp = head;

        while (head.next !=null ){
            //判断是否到达指定位置。
            //链表还有下一个元素，然后这里就加1，并判断位置是否相等
            if(index == leg++){
             //注意，我们的temp代表的是当前位置的前一个结点。
             //前一个结点        当前位置        后一个结点
             //temp            temp.next     temp.next.next
             //插入操作。
             node.next = temp.next;
             temp.next = node;
             return;
            }
           temp = temp.next;

        }

    }

    /**
     * 在指定的位置插入节点和值
     * @param head
     * @param index
     * @param value
     */
    public static void insertNode(ListNode head, int index, int value){
        //首先需要判断指定位置是否合法，
        if (index < 1 || index > linkNodeLength() + 1) {
            System.out.println("插入位置不合法。");
            return;
        }
        //记录遍历的当前位置
        int currentPos = 0;
        //可移动的指针
        ListNode temp = head;
        //初始化要插入的节点
        ListNode insertNode = new ListNode(value);

        while (temp.next != null){
            //找到上一个节点的位置
            if((index -1) == currentPos){
                //temp表示的是上一个节点
                //将原本由上一个节点的指向交由 插入的节点来指向
                // 这个地方的意思是，在插入一个节点时， 需要将原来上一个节点指向下一个节点的指针，
                // 赋值给新的节点 指向下一个节点的指针
                insertNode.next = temp.next;

                //然后原来的前一个节点的指针，指向这个新的节点
                temp.next = insertNode;
                return;
            }
            currentPos++;
            // 往下，继续查找
            temp = temp.next;
        }
    }



    /**
     *4、 删除第一个元素
     * @return
     */
    public static int removeFirst(){
        if(linkNodeLength() == 0){
            throw  new NoSuchElementException();
        }
        //如果链表没有数据,那么就抛出异常
        ListNode first = head.next;
        head.next = first.next;
        return  first.data;
    }


    /**
     * 4.1、删除指定位置上的结点
     *
     * 通过index删除指定位置的结点,跟指定位置增加结点是一样的，先找到准确位置。然后进行删除操作。
     *     删除操作需要知道1个结点即可：和当前位置的前一个结点。
     * @param index
     */
    public static void delete(int index){
        //判断index是否合理
        if(index<1 || index> linkNodeLength()){
            System.out.println("给定的位置不合理");
            return;
        }
        //步骤跟insertNodeByIndex是一样的，只是操作不一样。
        int legth = 1;
        //可移动的指针
        ListNode temp = head;
        while (temp.next !=null ){
            //判断是否到达指定位置。
            // 链表还有下一个元素，然后这里就加1，并判断位置是否相对
            if(index == legth++){
                //前一个结点        当前位置        后一个结点
                //temp            temp.next     temp.next.next
                //删除操作。 删除当前这个下标位置的节点，
                //然后将这个当前节点的指针指向 下一个节点
                 temp.next = temp.next.next;
                return;
            }
            temp = temp.next;

        }

    }

    /**
     *5、 遍历链表
     * @param head 头节点
     */
    public static void traverse(ListNode head){
        //从头节点开始
        ListNode temp = head.next;

        while (temp != null){
                System.out.println("遍历链表数据：" + temp.data);
            temp = temp.next;
        }
    }


    /**
     * 6.1、链表排序(冒泡排序)
     * @param head
     */
    public static  void sortLinkList(ListNode head){
        ListNode currentNode ;
        ListNode nextNode ;

        //外层循环
        for(currentNode = head.next; currentNode.next != null; currentNode = currentNode.next){
            //内层循环，
            for (nextNode = head.next; nextNode.next != null; nextNode = nextNode.next){
                //判断当前元素的值是否大于下一个元素的值，如果大于则将量元素位置交换
                if(nextNode.data > nextNode.next.data){
                    int temp = nextNode.data;
                    nextNode.data = nextNode.next.data;
                    nextNode.next.data = temp;
                }
            }
        }
    }


    /**
     *  对链表中的结点进行排序，按照从小到大的顺序，使用选择排序。
     *
     *  使用双层遍历。第一层遍历，正常遍历链表，
     *  第二层遍历，遍历第一层遍历时所用的结点后面所有结点并与之比较
     *
     */
    public static void selectSortNode(){
        int count = 2;
        //判断链表长度大于2，不然只有一个元素，就不用排序了。
       if(linkNodeLength() < count){
           System.out.println("无需排序");
       }
        //第一层遍历使用的移动指针，最处指向头结点，第一个结点用temp.next表示
       ListNode temp = head;
        //第一层遍历链表，从第一个结点开始遍历
       while (temp.next != null){
        //第二层遍历使用的移动指针，secondTemp指向第一个结点，我们需要用到是第二个结点开始，
        // 所以用secondNode.next
           ListNode secondTemp = temp.next;
          //第二层遍历,从第二个结点开始遍历
           while (secondTemp.next != null){
               //第二层中的所有结点依次与第一次遍历中选定的结点进行比较，
              if(temp.next.data > secondTemp.next.data){
                  //如果大于，则将选定的节点的值赋值给一个临时变量
                 int t = secondTemp.next.data;
                 // 将第一个节点的值赋值给选定节点的值
                 secondTemp.next.data = temp.next.data;
                 // 然后将临时变量的值 赋值给 第一个节点
                 temp.next.data = t;
              }
              //再次选择一个节点进行比较
              secondTemp = secondTemp.next;
           }

           //外层循环也选择一个节点来进行比较
           temp = temp.next;
       }
   }


    /**
     * 对链表进行插入排序，按从大到小的顺序，只要这里会写，那么手写用数组插入排序
     * 也是一样的。先要明白原理。什么是插入排序，这样才好写代码。
     *      插入排序：分两组，一组当成有序序列，一组当成无序，将无序组中的元素与有序组中的元素进行比较(如何比较，
     *      那么就要知道插入排序的原理是什么)
     *   这里的方法是，构建一个空的链表当成有序序列，而原先的旧链表为无序序列，按照原理，
     *   一步步进行编码即可。
     *
     */
   public static void insertSortNode(){
       int count = 2;
       //判断链表长度大于2，不然只有一个元素，就不用排序了。
       if(linkNodeLength() < count){
           System.out.println("无需排序");
       }
       //创建新链表
       ListNode newHead = new ListNode(0);
       //新链表的移动指针
       ListNode newTemp = newHead;
       //旧链表的移动指针
       ListNode temp = head;
       //将第一个结点直接放入新链表中。
       if(newTemp.next == null){
           ListNode node = new ListNode(temp.next.data);
           newTemp.next = node;
           //旧链表中指针移到下一位(第二个结点处)。
           temp = temp.next;
       }
       // 遍历现有链表
       while (temp.next != null){
           //下个元素是否为空
           while (newTemp.next != null){
           //先和新链表中的第一个结点进行比较,如果符合条件则添加到新链表，注意是在第一个位置上增加结点
            //如果不符合，则跟新链表中第二个结点进行比较，如果都不符合，跳出while，
               // 判断是否是到了新链表的最后一个结点，如果是则直接在新链表后面添加即可
               if(newTemp.next.data < temp.next.data ){
                   //将这个节点添加到新的链表中
                   ListNode node = new ListNode(temp.next.data);
                   node.next = newTemp.next;
                   //将这个新链表赋值给 临时节点
                   newTemp.next = node;
                   break;
               }
               newTemp = newTemp.next;
           }
           //到达最末尾还没符合，那么说明该值是新链表中最小的数，直接添加即可到链表中即可
           if(newTemp.next == null){
               //直接在新链表后面添加
               ListNode node = new ListNode(temp.next.data);
               newTemp.next = node;
           }
           //旧链表指针指向下一位结点，继续重复和新链表中的结点进行比较。
           temp = temp.next;
           //新链表中的移动指针需要复位，指向头结点
           newTemp = newHead;
       }
       //开始使用新链表，旧链表等待垃圾回收机制将其收回。
       head = newHead;
   }


    /**
     * 插入排序2
     *
     * 将一个元素插入到已有序的数组中，在初始时未知是否存在有序的数据，因此将元素第一个元素看成是有序的
     *
     * 与有序的数组进行比较，比它大则直接放入，比它小则移动数组元素的位置，找到个合适的位置插入
     *
     *  当只有一个数时，则不需要插入了，因此需要n-1趟排序，比如10个数，需要9趟排序
     * @param head
     */
    public static void insertSortNode2(ListNode head){
       if(head == null ){
           System.out.println("链表没有元素，不能排序");
           return ;
       }

       //创建一个新的链表
       ListNode dummyNode = new ListNode(0);
       ListNode pre = dummyNode;
       //当前链表
       ListNode cur = head;

       while (cur != null){
           // 提前将cur的下一个节点保存起来，因为后面需要将cur节点进行删除→插入
            ListNode temp = cur.next;
            // 新的链表的下一个节点不为空，并且 下一个节点的值 小于当前节点的值
           // 注意 这里的data的类型不能是 integer类型，如果是integer类型，那么这里就会空指针异常
            while (pre.next != null  && pre.next.data < cur.data){
                    // 那么就将这个 pre移动到下一个节点。使用下一个节点来进行比较
                    pre = pre.next;
            }
           //因为cur.data的大小介于pre.data和pre.next.data之间
           //将cur插入到pre和pre.next之间，注意①和②之间的顺序
           //注意此处是不会形成死循环的：由于dummy是新开辟的链表，
           // 此处是将cur节点移到了dummyNode所在的新链表中
           //①
           cur.next = pre.next;
           //②
           pre.next = cur;
           // 虚拟机节点
           pre = dummyNode;
           // 下一个节点
           cur = temp;

       }
       dummyNode = dummyNode.next;

    }






    public static ListNode insertSortNode3(ListNode head){
        if(head == null || head.next==null ){
            System.out.println("链表没有元素，不能排序");
            return head;
        }

        // 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
        // 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
        // 每次迭代完成，从插入元素为止，该链表可以被认为已经部分排序
        // 重复直到所有输入数据插入完为止

        // 1.遍历并与前面已经有序的序列向前逐一比较排序，找到合适为止插入

        // 定义三个指针 pre, cur, lat
        //pre    cur    lat
        // h  ->  4  ->  2  ->  5  ->  3  ->  null
        //创建一个新的节点，用于遍历链表
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        //当前链表
        ListNode cur = head;
        ListNode lat;

        while (cur != null){
            //  记录下一个要插入排序的值
            lat = cur.next;
            // 只有 cur.next 比 cur 小才需要向前寻找插入点
            if ( lat !=null && lat.data < cur.data){
                // 寻找插入点，从 pre 开始遍历 （每次都是头节点 h 开始向后遍历，因为单向链表是无法从后往前遍）
                // 如果当前节点的值小于要插入排序的值
                while (pre.next !=null && pre.next.data < lat.data){
                    // 那么就将这个 pre移动到下一个节点。使用下一个节点来进行比较
                    pre = pre.next;
                }

                // 找到要插入的位置，此时 pre 节点后面的位置就是 lat 要插入的位置
                // 交换 pre 跟 lat 节点需要一个 temp 节点来临时保存下插入位置 node 后 next
                ListNode tmp = pre.next;
                // 在 pre 节点后面插入
                pre.next = lat;
                // 此时 cur 节点还是 pre 所在的节点，所以其 next 要指向插入节点 lat 指向的 next
                cur.next = lat.next;
                // 插入let节点后，把记录的原先插入位置后续的 next 节点传给它
                lat.next = tmp;
                // 由于每次都是从前往后找插入位置，但是单向链表是无法从后往前遍历，所以需要每次插入完成后要让 pre 复位
                pre = dummyNode;
            }else {
                // 都这直接把 cur 指针指向到下一个
                cur = lat;
            }

        }
        return dummyNode.next;

    }

    /**
     * 找到链表中倒数第k个节点
     *
     * 设置两个指针p1、p2，让p2比p1快k个节点，同时向后遍历，当p2为空，则p1为倒数第k个节点
     * @param head
     * @param k 倒数第k个节点
     */
   public static  ListNode  findKeyNode(ListNode head, int k){
       if(k <1 || k> linkNodeLength()){
           return  null;
       }
       ListNode p1 = head;
       ListNode p2 = head;

       // p2比 p1快k个节点
       for (int i = 0; i <k-1 ; i++) {
           p2 = p2.next;
       }

       // 只要p2为null，那么p1就是倒数第k个节点了
       while (p2.next != null){
           p2 = p2.next;
           p1 = p1.next;
       }
       return p1;
   }

    /**
     * 查询链表的中间节点
     * 一个每次走1步，一个每次走两步，走两步的遍历完，然后走一步的指针，那就是中间节点
     * @param head
     * @return
     */
   public static ListNode searchMid(ListNode head){
     ListNode p1 = head;
     ListNode p2 = head;

     while (p2 != null && p2.next != null && p2.next.next != null){
         p1 = p1.next;
         p2 = p2.next.next;
     }
     return  p1;
   }


    /**
     * 方法1
     * 通过递归从尾到头输出单链表
     * (链表很长的时候，就会导致方法调用的层级很深，有可能造成StackOverflowError)
     * @param head
     */
   public static void printListReversely(ListNode head){
       if(head != null){
           //只要下面还有数据，那就往下找，递归是从最后往前翻
           printListReversely(head.next);
          System.out.println("从尾到头的输出链表："+head.data);
       }
   }

    /**
     * 把链表中的元素放入栈中再输出，需要维护额外的栈空间
     * @param node
     */
   public static void reservePrt2(ListNode node){
       if(node != null){
           //新建一个栈
           Stack<ListNode> stack = new Stack<>();
           ListNode current = head.next;
           //将链表的所有结点压栈
           while (current != null){
               //将当前结点压栈
               stack.push(current);
               //然后继续下一个节点
               current = current.next;
           }
           //将栈中的结点打印输出即可
           while (stack.size() > 0){
               //出栈操作
               System.out.println("从栈取出数据：" + stack.pop().data );
           }

       }
   }



    /**
     * 实现链表的反转(递归)
     * @param node
     * @return
     */
   public static ListNode reverseLinkList(ListNode node){
       ListNode prev;
       if (node == null || node.next == null) {
           prev = node;
       } else {
           ListNode tmp = reverseLinkList(node.next);
           node.next.next = node;
           node.next = null;
           prev = tmp;
       }
       return prev;
   }


    /**
     * 反转链表（非递归）
     * @param head
     * @return
     */
   public static  ListNode reverseList(ListNode head){
       ListNode pre = null;
       // 这里应该除去 头节点，不然反转出来后，会有0这个数据
       ListNode cur = head.next;
       //判断第一个节点是否为空
       while (cur != null){
           // 下一个节点
           ListNode next = cur.next;
           // 将空的节点赋值给，下一个节点
           cur.next = pre;
           // 然后将当前链表，赋值给 pre。
           pre = cur;
           //新的链表赋值给 当前的链表
           cur = next;
       }
       return  pre;
   }



   public static ListNode  reverse(ListNode head){
       if(head == null){
           System.out.println("节点为空");
       }
       ListNode preNode = null;
       // 头节点
       ListNode current = head;

       while (current!= null){
           // 记录下一个节点
           ListNode nextNode = current.next;

           current.next = preNode;
           // 将节点赋值给新的 节点
           preNode = current;
           // 往下走
           current = nextNode;
       }

       return  preNode;

   }

    /**
     * 翻转完，使用下面的代码进行遍历吧：
     * @param head
     */
    public static void traverse4Reverse(ListNode head) {

        //临时节点，从首节点开始
        ListNode temp = head;

        while (temp != null) {
          System.out.println("反转链表后遍历：" + temp.data);
            //继续下一个
            temp = temp.next;
        }
    }



    /**
     * 1.1、尾插法
     * @param element
     */
    public static void  addLast(int element){
        ListNode newNode = new ListNode(element);
        ListNode tail = head;
        //从头开始找,当某个结点的下个结点为null时,那么就是尾结点
        //也可能 头结点和尾结点 都是null.
        while (tail.next != null){
            tail =  tail.next;
        }
        tail.next = newNode;
        size ++ ;
    }

    /**
     *1、 添加到链表的最前面(头插法)
     * 向链表中添加结点,也就是将这个数据添加到一个新的结点上去
     * @param value
     */
    public static void addFirst(int value){
        //初始化要加入的结点,并将数据加入到该结点
        ListNode newNode = new ListNode(value);
        // 这里不能使用head，如果使用head, 那么在打印出来时就会多一个0
        newNode.next= firstNode;
        firstNode = newNode;
        size ++ ;
    }
    /**
     *
     *循环添加10个数据，打印出来的结果
     * 9	8	7	6	5	4	3	2	1	0
     * /



    /**
     * 打印出所有的元素
     */
    public static void display(){
        if(!isEmpty()){
            // 这里不能使用head，如果使用head, 那么在打印出来时就会多一个0
            ListNode current= firstNode;
            while(current!=null){
                System.out.print(current.data+"\t");
                current=current.next;
            }
        }
    }



    /**
     * 查看链表是否包含某个元素
     * @param element
     * @return
     */
    public static boolean contains(int element){
        if(size == 0){
            return  false;
        }
        ListNode current = firstNode;
        while (current != null){
            boolean flag = (current.data <0 && element <0);
            if(flag || (current.data == element) ){
                return  true;
            }
            current = current.next;
        }
        return  false;
    }


    /**
     *
     * 参考资料：
     * https://juejin.im/post/6844903584027377677
     * https://www.cnblogs.com/bywallance/p/6726251.html
     * https://www.cnblogs.com/whgk/p/6589920.html
     * https://liweiwei1419.gitee.io/leetcode-algo/2017/08/17/leetcode-algo/0147-insertion-sort-list/
     * http://www.tianshouzhi.com/api/tutorials/basicalgorithm/44
     */



}
