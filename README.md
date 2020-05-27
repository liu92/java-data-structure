#       `数据结构与基础算法`

`一、数据基本信息`

`1、数据、数据元素、数据项和数据对象`

  &nbsp;&nbsp;&nbsp;&nbsp;a、数据 
     .是能输入计算机且能被计算机处理的各种符合的集合

       * 信息的载体
              * 是对客观事物符号化的表示
              * 能够被计算机识别、存储和加工

     .包括:
       * 数值型的数据:整数、实数等
       * 非数值型的数据:文字、图像、图形、声音等

  &nbsp;&nbsp;&nbsp;&nbsp;b、数据元素
     . 是数据的基本单位，在计算机程序中通常作为一个整体进行考虑和处理      
     . 也简称为元素，或称为记录，结点或顶点。 
     . 一个数据元素可由若干数据项组成
     
  &nbsp;&nbsp;&nbsp;&nbsp;c、数据项
     . 构成数据元素的不可分割的最小单位。
     
  &nbsp;&nbsp;&nbsp;&nbsp;d、数据对象
     . 是性质相同的数据元素的集合，是数据的一个子集。   
     
  &nbsp;&nbsp;&nbsp;&nbsp;e、数据类型
     例如C语言中:

   * 提供 int、char、float、double等基本数据类型
   * 数组、结构、共用体、枚举等构造数据类型
   * 还有指针、空（void）类型
   * 用户还可以用typedef来自己定义数据类型  
     

`2、什么是数据结构`
```
   a、数据元素不是孤立存在的，它们之间存在着某种关系，数据元素相互之间的关系成为结构
  
   b、是指相互之间存在一种或多种特定关系的数据元素集合
  
   c、或者说，数据结构是带结构的数据元素的集合
```

`2.1、数据结构包括以下三个方面的内容:`

```
   a、数据元素之间的逻辑关系，也称为逻辑结构
  
   b、数据元素及其关系在计算机内存中的表示（又称为映像），称为数据的物理结构或数据的存储结构。
  
   c、数据的运算和实现，即对数据元素可以施加的操作以及这些操作在想要的存储结构上的实现
```

`2.2 数据结构的两个层次`
```
  a.逻辑结构 
   * 描述数据元素之间的逻辑关系
   * 与数据的存储无关，独立于计算机
   * 是从具体问题抽象出来的数学模型
   
  b.物理结构（存储结构）
   * 数据元素及其关系在计算机存储器中的结构（存储方式）
   * 是数据结构在计算机中的表示
  c.逻辑结构与存储结构的关系
   * 存储结构是逻辑关系的映像与元素本身的映像。
   * 逻辑结构是数据结构的抽象，存储结构是数据结构的实现
   * 两者综合起来建立了数据元素之间的结构关系。    
```
2.3、逻辑结构的种类
```
  划分方式一
    
  1)、线性结构
        有且仅有一个开始和一个终端结点，并且所有结点都最多只有一个直接前趋和一个直接后继
         例如:线性表、栈、队列、串
  
  2)、非线性结构
        一个结点可能有多个直接前趋和直接后继
         例如:树、图           
   
  划分方式二
   * 集合结构:结构中的数据元素之间除了同属于一个集合的关系外，无任何其他关系
   * 线性几个:结构中的数据元素之间存在一对一的线性关系
   * 树形结构:结构中的数据元素之间存在着一对多的层次关系
   * 图状结构或网状结构:结构中的数据元素之间存在着多对的的任意关系。
```

2.4、存储结构的种类
```
  1)、顺序存储结构
   * 用一组连续的存储单元依次存储数据元素，数据元素之间的逻辑关系由元素的存储位置来表示。
   * C 语言中用数组来实现顺序存储结构
  2)、链式存储结构
   * 用一组任意的存储单元存储数据元素，数据元素之间的逻辑关系用指针来表示。
   * C 语言中用指针（地址）来实现链式存储结构
  3)、索引存储结构
   * 在存储结点信息的同时，还建立附加的索引表。
   * 索引表的每一项称为一个索引项
   * 索引项的一般形式是:（关键字，地址）
   * 关键是能唯一标识一个结点的那些数据项。
  4)、散列存储结构     
   * 根据结点的关键字直接计算出该结点的存储地址
```

2.5 用C语言实现抽象数据类型
```
void assign(Complex *A , float real, float image){
   A ->realpart = real; //实部
   A ->imagepart = imag; // 虚部
 }
 
 void add(Complex *c, Complex A, Complex B){
   c -> realpart = A.realpart + B.realpart;
   c -> imagepart = A.imagepart + B.imagepart;
 }
 注:Complex 是我们定义的一个结构类型
  带*:表示指针变量，他是指向Complex类型的指针
  不带*:Complex类型的普通变量
```

2.6、算法

&nbsp;&nbsp;&nbsp;&nbsp;1)、算法的定义:对特定问题求解方法和步骤的一种描述，它是指令的有限序列，其中每个指令表示一个或多个操作     

&nbsp;&nbsp;&nbsp;&nbsp;2)、算法与程序:
  * 算法是解决问题的一种方法或一个过程，考虑如何将输入转换成输出，一个问题可以有多种算法
  * 程序是用某种程序设计语言对算法的具体实现

&nbsp;&nbsp;&nbsp;&nbsp;3)、算法特性 :一个算法必须具备以下五个重要特性
  * 有穷性:一个算法必须总是在执行有穷步之后结束，且每一步都在有穷时间内完成
  * 确定性:算法中的每一条指令必须有确切的含义，没有二义性，在任何条件下，只有
       唯一的一条执行路径，即对于相同的输入只能得到相同的输出
  * 可行性: 算法是可执行的，算法描述的操作可以通过已经实现的基本操作执行有限次来实现
  * 输入 : 一个算法有零个或多个输入
  * 输出 : 一个算法一个多个多个输出
    

&nbsp;&nbsp;&nbsp;&nbsp;4)、算法设计的要求
  * 正确性（Correctness）
  * 可读性（Readability）
  * 健壮性（Robustness）
  * 高效性（Efficiency）  

&nbsp;&nbsp;&nbsp;&nbsp;5)、算法时间复杂度的渐进表示法
  * 为了便于比较不同算法的时间效率，我们仅比较它们的数量级
    例如:两个不同的算法，时间消耗分别是:
      T1(n) = 10n^2 与 T2(n) = 5n^3  
    

&nbsp;&nbsp;&nbsp;&nbsp;6)、若某个辅助函数f(n),使得当n趋近于无穷大时，T(n)/f(n)的极限值为不等于零的常数，
     则称f(n)是T(n)的同数量级函数。记作T(n) =O(f(n)), 称O(f(n))为算法的渐进时间复杂度(O是数量级的符号)，简称时间复杂度。
 ```
例如:对于求解矩阵相乘问题，算法耗费时间:
        T(n) = 2n^3 + 3n^2 + 2n +1
        当n--->无穷大时，T(n)/n^3 -->2,这表示n充分大时，T(n)与n^3是同阶或同数量级，引入大“O”记号，则T(n)可以记作:
            T(n)= O(n^3)  这就是求解矩阵相乘问题的算法的渐进时间复杂度 

 ```
&nbsp;&nbsp;&nbsp;&nbsp;7)、 一般情况下，不必计算所有操作的执行次数，而只考虑算法中基本操作执行的次数，它是问题规模n的某个函数，用T(n)表示。
     
&nbsp;&nbsp;&nbsp;&nbsp;8)、算法时间复杂度的定义
    *算法中基本语句重复执行的次数是问题规模n的某个函数f(n),算法的时间量度记作:T(n)=O(f(n))
      a、算法中重复执行次数和算法的执行时间成正比的语句
      b、对算法运行时间的贡献最大的
      c、执行次数最多的     
      
    对应n 越大算法的执行时间越长
     *排序:n为记录数
     *矩阵:n为矩阵的阶数
     *多项式:n为多项式的项数
     *集合:n为元素个数
     *树:n为树的结点个数
     *图:n为图的顶点数或边数

&nbsp;&nbsp;&nbsp;&nbsp;9)、分析算法时间复杂度的基本方法
    a、找出语句频度最大的那条语句作为基本语句
    b、计算基本语句的频度得到问题规模n的某个函数f(n)
    c、取其数量级用符号“O”表示
```
x=0; y=0;
 for(int k=0;k<n;k++){ // for循环是n+1次，循环体是n次
  x++;
}

```

&nbsp;&nbsp;&nbsp;&nbsp;例2:N*N矩阵相乘
![image](image/image-5538.png)   

&nbsp;&nbsp;&nbsp;&nbsp;算法时间复杂度分析示例
![image](image/image-1227.png)   

&nbsp;&nbsp;&nbsp;&nbsp;算法时间复杂度分析例题，示例3
![image](image/image-1746.png)   
    

&nbsp;&nbsp;&nbsp;&nbsp;(10) 渐进空间复杂度
```
  * 空间复杂度:算法所需存储空间的度量， 记作:S(n)=O(f(n))  其中n为问题的规模(或大小)
  * 算法要占用的空间
     a.算法本身要占据的空间，输入/输出，指令，常数，变量等
     b.算法要使用的辅助空间
```

2.7、知识回顾小结
       
     1、数据结构 
      a.数据的逻辑结构
          * 线性结构:
              线性表
              栈(特殊线性表)
              队列
              字符串、数组、广义表
          * 非线性结构:
              树形结构
              图形结构   
      b.数据的存储结构
          * 顺序存储
          * 链式存储
      c.数据的运算  
          * 检索、排序、插入、删除、修改等

3、线性表要研究的内容
```
a.线性表的定义和特点
  
   b.案例引入
  
   c.线性的类型定义
  
   d.线性表的顺序表示和实现2
  
   e.线性表的链式表示和实现
  
   f.顺序表和链表的比较
  
   g.线性表的应用
  
   h.案例分析与实现
```

3.1线性表的定义和特点

  &nbsp;&nbsp;&nbsp;&nbsp;线性表示具有相同特性的数据元素的一个有限序列 
  ![image](image/image-0102.png)      
        
  &nbsp;&nbsp;&nbsp;&nbsp;1、线性表(Linear List)
  ![image](image/image-1235.png) 

3.2、案例引入

 &nbsp;&nbsp;&nbsp;&nbsp;案例:一元多项式的运算，实现两个多项式加、减、乘运算  
  ![image](image/image-2000.png)

 &nbsp;&nbsp;&nbsp;&nbsp;稀疏多项式:存储是就不根据上面的方法来存储了，因为按照那种方式存储会操作空间浪费
  ![image](image/image-3229.png)

 &nbsp;&nbsp;&nbsp;&nbsp;稀疏多项式的运算
  ![image](image/image-3942.png)
 &nbsp;&nbsp;&nbsp;&nbsp;注意: 稀疏多项式运算
      
      1、创建一个新的数组c
      2、分别从头遍历比较a和b的每一项
         *指数相同，对应系数相加，若相加不为零，则在c中增加一个新项
         *指数不相同，则将指数较小的项复制到c中

 &nbsp;&nbsp;&nbsp;&nbsp;顺序存储结构存在问题

      1、存储空间分配不灵活
      2、运算的空间复杂度高

3.3、线性的类型定义

  &nbsp;&nbsp;&nbsp;&nbsp;1、抽象数据类型线性表的定义如下:
   ![image](image/image-0119.png)

    2、InitList(&L) (Initialization List)
       操作结果:构造一个空的线性表L
      
    3、DestroyList(&L)
    
    初始条件:线性表L已经存在
    操作结果:销毁线性表
      
    4、ClearList(&L)
    
    初始条件:线性表L已经存在。
    操作结果:将线性表L重置为空表。
     
    5、ListEmpty(L)
       
    初始条件:线性表L已经存在。
    操作结果:若线性表L为空表,则返回TRUE;否则返回FALSE。     
      
    6、ListLength(L)
       
    初始条件:线性表L已经存在。
    操作结果:返回线性表L中的数据元素个数。  
      
    7、GetElem(L,i,&e)  (加上&表示要返回值)
    
    初始条件:线性表L已经存在,1<=i<=ListLength(l)。
    操作结果:用e返回线性表L中第1个数据元素的值。
      
    8.LocateElem(L,e,compare())
    
    初始条件:线性表L已经存在,compare()是数据元素判定函数。
    操作结果:返回L中第1个与e满足compare的数据元素的位序,若这样的数据元素不存在则返回值为0。
     
    9.PriorElem(L,cur_e,&pre_e)
    
    初始条件:线性表L已经存在。
    操作结果:若cur_e是L的数据元素,且不是第1个，则用pre_e返回它的前趋否则操作失败,pre_e无意义。  
      
    10、NextElem(L,cur_e,&next_e)
       
    初始条件:线性表L已经存在。
    操作结果:若cur_e是L的数据元素,且不是最后一个，则用next_e返回它的后继否则操作失败,next_e无意义。
      
    11、ListInsert(&L,i,e)
       
    初始条件:线性表L已经存在,1<=i<=ListLength(L)+1。
    操作结果:在L的第i个位置之前插入新的数据元素e,L的长度加1   
      
    12、ListDelete(&L,i,&e)
       
    初始条件:线性表L已经存在,1<=i<=ListLength(L)。
    操作结果:删除L的第i个数据元素,并用e返回其值,L的长度减一。   
      
    13、ListTraverse(&L,visited())
       
    初始条件:线性表L已经存在。
    操作结果:依次对线性表中每个元素调用visited()。   

3.4、线性表的顺序存储表示

   &nbsp;&nbsp;&nbsp;&nbsp;线程表的顺序表示又称为顺序存储结构或顺序映像

   &nbsp;&nbsp;&nbsp;&nbsp;a、顺序存储定义:把逻辑上相邻的数据元素存储在物理上相邻的存储单元中的存储结构
  ![image](image/image-4323.png)

3.4.1、顺序表的顺序存储表示
  ![image](image/image-20200509140440.png)

 &nbsp;&nbsp;&nbsp;&nbsp;定义多项式的结构，然后去计算多项式。
  ![image](image/image-20200509140808.png)

3.5 补充 类c语言的有关操作

 &nbsp;&nbsp;&nbsp;&nbsp;a、对一些问题的补充说明
  ![image](image/image-20200509143202.png)                                      

 &nbsp;&nbsp;&nbsp;&nbsp;b、C语言的内存动态分配
  (Sequence List) 顺序表，下面的SqList L 定义变量，L是SqList这种类型的。
  这个就像 int a; //定义变量a, a是int型。
  SqList L;

   L.data=(ElemType*)malloc(sizeof(ElemType)*MaxSize);  
   这里ElemType*, *表示指针 这里进行了强制类型转换。

  &nbsp;&nbsp;&nbsp;&nbsp;1)、malloc(m)函数，开辟m字节长度的地址空间，并返回这段空间的首地址, 参数要求是整数

  &nbsp;&nbsp;&nbsp;&nbsp;2)、sizeof(x)运算，计算变量x的长度

  &nbsp;&nbsp;&nbsp;&nbsp;3)、free(p)函数，释放指针p所指变量的存储空间，即彻底删除一个变量

  这些函数在头文件里面，所以需要加载头文件:<stdlib.h>  

3.5.1 C++中参数传递
```
  1、函数调用时传送给形参表的实参必须与形参三个一致 
     类型、个数、顺序
  
  2、参数传递有两种方式
     * 传值方式(参数为整型、实型，字符型等)
     * 传地址
         参数为指针变量
         参数为引用类型
         参数为数组名 
```

 &nbsp;&nbsp;&nbsp;&nbsp;a、传值方式:把实参的值传送给函数局部工作区相应的副本中，函数使用这个副本执行必要的功能。
  函数修改的是副本的值，实参的值不变。
  ![image](image/image-20200509150056.png)

 &nbsp;&nbsp;&nbsp;&nbsp;b、传地址方式---指针变量作为参数
  * 形参变化影响实参
    这个指针指向的就是这个参数地址位置
      这里方式是改变指针指向的内容
    ![image](image/image-20200509151040.png)

  * 形参变化不影响实参??
      这里只是改变指向，但是不改变指针指向的地址
    ![image](image/image-20200509151505.png)


  &nbsp;&nbsp;&nbsp;&nbsp;c、传地址方式--数组名作为参数
  * 传递的是数组的首地址
  * 对形参数组所做的任何改变都将反映到实参数组中

  &nbsp;&nbsp;&nbsp;&nbsp;d、传地址方式-- 引用类型做参数
  引用:它用来给一个对象提供一个替代的名字
```
#include<iostream.h>
void main(){
   int i=5;
   int &j=i;
   i=7;
   count<<"i="<<i<<" j="<<j;
}

这里j是一个引用类型，代表i的一个替代名i值改变是，j值也跟着改变，所以会输出i=7 j=7

```

 &nbsp;&nbsp;&nbsp;&nbsp;e、引用类型作为形参的三点说明
 ```
 (1).传递引用给函数与传递指针的效果是一样的，形参变化实参也发生变化
 
 (2).引用类型作参数，在内存中并没有产生实参的副本，它直接对实参操作;
    而一般变量作参数，形参与实参就占用不同的存储单元，所以形参变量的值是实参变量的副本。
    因此，当参数传递的数据量较大时，用引用比用一般变量传递参数的时间和空间效率都好    
 
 (3).指针参数虽然也能达到与使用引用的效果，但在被调用函数中需要重复使用
   "*指针变量名(取这个指针变量的内容)"的形式进行运算，这很容易产生错误且程序的阅读性较差;另一方面，
   在主调函数的调用点处，必须用变量的地址作为实参。    
 ```

3.6线性表的顺序表示和实现

  &nbsp;&nbsp;&nbsp;&nbsp;顺序表示意图
  ![image](image/image-20200509154801.png)  

&nbsp;&nbsp;&nbsp;&nbsp;补充:操作算法中用到的预定义常量和类型
```
//函数结果状态代码
#define TRUE  1
#define FALSE 0
#define OK    1 
#define ERROE 0
#define INFEASIBLE -1
#define OVERFLOW   -2
//Status 是函数类型，其值是函数结果状态代码
typedef int Status;
typedef char ElemType;
```
3.6.1 顺序表基本操作的实现

 【算法2.1】 线性表L的初始化(参数用引用类型)
```
 //这里参数应的是引用型的，也就是说这里对形参进行操作实际上也对实参进行了操作
 Status InitList_Sq(SqList &L){ // 构造一个空的顺序表L
  L.elem = new ElemType[MAXSIZE]; // 为顺序表发分配空间
  if(!L.elem) exit(OVERFLOW);  //存储分配失败
  L.length=0;                  //空表长度为0
  return OK; 
}
```
3.7 顺序表上的查找操作

  &nbsp;&nbsp;&nbsp;&nbsp;a.按值查找:按照给定的运算进行查找,从头到尾一个一个的查找
  算法示例: 
  ![image](image/image-20200509164812.png)

  &nbsp;&nbsp;&nbsp;&nbsp;b. 平均查找长度ASL(Average Search Length)
     *为确定记录在表中的位置，需要与给定值进行比较的关键字的个数的期望值叫做查找算法的凭据查找长度

   &nbsp;&nbsp;&nbsp;&nbsp;平均查找长度公式:  这个公式中大E是累加和，P表示第i个记录被查询的概率
     C表示第i个记录需比较的次数。
   ![image](image/image-20200509170041.png)  
    
   &nbsp;&nbsp;&nbsp;&nbsp;公式的推导:每个元素的概率提取出来，然后在进行元素相加，这个是等差数列求和。所以最终的公式如图
   ![image](image/image-20200509170632.png)
             
3.8、插入算法如果在顺序表上表现出来

  &nbsp;&nbsp;&nbsp;&nbsp;顺序表的插入
 ![image](image/image-20200509173101.png)

  &nbsp;&nbsp;&nbsp;&nbsp;算法的实现
  注意:这里的i是位序，不是数组下标
 ``` 
 Status ListInsert_Sq(SqList &L,int i,ElemType e){ // 构造一个空的顺序表L
  if(i<1 || i>L.length+1) return ERROR; //i值不合法 
  if(L.length == MAXSIZE) return ERROR;  //当前存储空间已满
  for(j=L.length-1;j>=i-1;j--){
   L.elem[j+1]=L.elem[j]; //插入位置及之后的元素后移
  }
   L.elem[i-1] = e;      //将新元素e放入第i个位置
   L.length++;           //表长增加1
   return OK;
   
 }
 ```
  &nbsp;&nbsp;&nbsp;&nbsp;算法时间主要耗费在移动元素的操作上
   * 若插入在尾结点之后，则根本无需移动(特别快);
   * 若插入在首结点之前，则表中元素全部后移(特别慢);
   * 若要考虑在各种位置插入(共n+1中可能)的平均移动次数，该如何计算?
 ![image](image/image-20200509175127.png)
   * 顺序表插入算法的平均时间复杂度为O(n)

3.9、顺序表的删除算法。 

 &nbsp;&nbsp;&nbsp;&nbsp;算法时间主要耗费在移动元素的操作上
   * 若删除尾结点之后，则根本无需移动(特别快);
   * 若删除在首结点之前，则表中元素全部后移(特别慢);
   * 若要考虑在各种位置删除(共n中可能)的平均移动次数，该如何计算?
 ![image](image/image-20200510164533.png)
   * 其中中1/n 表示每个元素的出现的概率，而(n-i)表示每个元素需要移动多少次。然后将积数和求出来，其实就是等差数列
   * 顺序表删除算法的平均时间复杂度为O(n) 
         

3.10 顺序表(线性表的顺序存储结构)的特点 
```
 (1)、利用数据元素的存储位置表示线性表相邻数据元素直接的前后关系，即线性表的逻辑结构与存储结构一致
 
 (2)、在访问线性表时，可以快速地计算任何一个数据元素的存储地址。因此可以粗略的认为访问每个元素所花时间相等。
    *这种存储元素的方法被称为随机存取法 
 
 (3)优点:
    a.存储密度大(结点本身所占存储量/结点结构所占存储量)
    b.可以随机存取表中任一元素
 
 (4)缺点:
   a.在插入、删除某一个元素时，需要移动大量元素
   b.浪费存储空间
   c.属于静态存储形式，数据元素的个数不能自由扩充
```
4.0 线性表的链式存储 
    
    链式存储结构特点:
     a.结点在存储器中的位置是任意的，即逻辑上相邻的数据元素在物理上不一定相邻。
     b.访问时只能通过头指针进入链表，并通过每个结点的指针域依次向后顺序扫描其余结点，
        所以寻找第一个结点和最后一个结点所花费的时间不等。
          这种存储元素的方法被称为"顺序存取法"

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、单链表是由头指针唯一确定，因此单链表可以用头指针的名字来命名。 
           最后一个元素如果后面没有了那么使用NUll表示没有元素了，这个空在计算机内部存储的是0。

  &nbsp;&nbsp;&nbsp;&nbsp;(2)、与链式存储有关的术语
     a.结点:数据元素的存储映像。由数据域和指针域两部分组成
     b.链表:n个结点由指针链组成一个链表。 它是线性表的链式存储映像，称为线性表的链式存储结构

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、单链表、双链表、循环链表:
     a.结点只有一个指针域的链表，称为单链表或线性链表
     b.结点有两个指针域的链表，称为双链表 ，一个指向前驱，一个指向后继结点，还有一个数据域。
     c.首尾相接的链表称为循环链表              
    ![image](image/image-20200510172014.png)
    
  &nbsp;&nbsp;&nbsp;&nbsp;(4)、头指针、头结点和首结点 ,头结点是附加的，而这个带头结点的链表中往往不是存储第一个元素的，而是我们额外附加的结点。
    ![image](image/mage-20200510172239.png)
    
  &nbsp;&nbsp;&nbsp;&nbsp;(5)、讨论1:如何表示空表?  使用^表示空
   ![image](image/image-20200510174038.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(6)、讨论2:在链表中设置头结点有什么好处?
      a、便于首元结点的处理
          首元结点的地址保存在头结点的指针域中,所以在链表的第一个位置的操作和其它位置一致，无须进行特殊处理；
      b、便于空表和非空表的统一处理
          无论链表是否为空，头指针都是指向头结点的非空指针，因此空表和非空表的处理也就统一了。
          
  &nbsp;&nbsp;&nbsp;&nbsp;(7)、讨论3:头结点的数据域内装的是什么?
      头结点的数据域可以为空，也可以存放线性表长度等附加信息，但此结点不能计入链表长度值。
    
4.1、线性表的链式存储结构2 
    &nbsp;&nbsp;&nbsp;&nbsp;a. 单链表的存储结构
    ![image](image/image-20200510181039.png)  
    &nbsp;&nbsp;&nbsp;&nbsp;b.定义单链表的存储结构
     ![image](image/iamge-20200510181240.png)
    &nbsp;&nbsp;&nbsp;&nbsp;c.示例
     ![image](image/iamge-20200510181743.png)
    &nbsp;&nbsp;&nbsp;&nbsp;通常常用下的这种定义
     ![image](image/iamge-20200510181841.png)
     
4.2、线性表的链式存储结构3

&nbsp;&nbsp;&nbsp;&nbsp;(1)、单链表的初始化(带头结点的单链表)
     .即构造一个如图的空表
     
    【算法步骤】
      a.生成新结点作头结点，用头指向L指向头结点。
      b.将头结点的指针域置空
    【算法描述】
      Status InitList_L(LinkList &L){
       //从内存中申请一个空间，然后获取这个空间的地址赋值给L
       L = new LNode; // 或L=(LinkList)malloc(sizeof(LNode));
       L->next = NULL;
       return OK;
      }       

   ![image](image/image-20200510214158.png)

&nbsp;&nbsp;&nbsp;&nbsp;(2)、补充单链表的几个常用简单算法

 &nbsp;&nbsp;&nbsp;&nbsp;a.【补充算法1】-----判断链表是否为空
      空表:链表中无元素，称为空链表(头指针和头结点仍然在)
    ```
    【算法思路】判断头结点指针域是否为空
       int ListEmpty(LinkList L){
             if(L->next) //非空
              return 0;
             else
              return 1; 
           } 
    ``` 
 &nbsp;&nbsp;&nbsp;&nbsp;b.【补充算法2】----单链表的销毁，链表销毁后不存在
    ![image](image/image-20200510220149.png)    
```
Status DestroyList_L(LinkList &L){//销毁单链表L
   Lnode *p; // 或LinkList p;
   while(L){
    p=L;
    L=L->next;
    delete p;
   }
 }
```
  &nbsp;&nbsp;&nbsp;&nbsp;c.补充算法3----清空链表;
  链表仍存在,但链表中无元素，成为空链表(头指针和头结点仍然在)     
 【算法思路】依次释放所有结点，并将头结点指针域设置为空  
  ![image](image/image-20200510223656.png)
```
Status ClearList_L(LinkList &L){//将L重置为空表
   //有时候是L, 有时候是&L, 这里说明下:&L是将表用L返回，如果不返回是，就不用&
   Lnode *p,*q; // 或LinkList p,q;
   p = L->next;
   while(p){
    q=p->next; 
    delete p;
    p=q;
   }
   L->next=NUll; //头结点指针域为空
   return OK;  
 }
```
 &nbsp;&nbsp;&nbsp;&nbsp;d.补充算法4----求单链表的表长;
 ```
 Status Listlength_L(LinkList L){//返回L中数据元素个数
    //有时候是L, 有时候是&L, 这里说明下:&L是将表用L返回，如果不返回是，就不用&
    Lnode p; // 或LinkList p,q;
    p = L->next;  // p指向第一个结点
    i=0;
    while(p){
     i++;
     p=p->next; 
    }
    return i;  
  }
 ```

4.3 知识回顾

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、类型定义
```
typedef struct LNode
{
    ElemType data;
    struct LNode *next; // 指针，它是指向一个同样式这个结点类型的一个指针，存放的是一个地址
    //*LinkList 表示指向结构体Lnode的指针类型
}LNode, *LinkList; // 重新定义了类型名，一个是这个结点的LNode,一个是指向这个结点的LinkList

```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、变量定义
```
LinkList L; //因为LinkList本身就是一个指针型，所以L前面不用加上*号。
LNode *p,*s; //存储结点地址的指针呢，就用LNode来声明。LNode来声明是指向这种结点的指针 所以p前面需要加*号。
  *p,*s都是用来指向这种类型结点的指针。
```

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、重要操作
```
p=L; //p指向头结点
s=L->next;//s指向首元结点
p=p->next;//p指向下一结点

```
![image](image/image-20200510231139.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、类C语言实现 元素i查找
 ```
 Status GetElem_L(LinkList L,int i, ElemType &e){//获取线性表中的某个数据元素的内容，通过变量e返回
    p = L->next;j=1;  // 初始化
    while(p && j<i){//向后扫描，直到p指向第i个元素或p为空
     p=p->next;++j; 
    }
    if(!p||j>i) return ERROR; //第i个元素不存在
    e=p->data;    //取第i个元素
    return OK;  
  } //GetElem_L
 ```

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、按值查找---根据指定数据获取该数据所在的位置(地址)

    算法步骤
    a.从第一个结点起,依次和e相比较。
    b.如果找到一个其值与e相等的数据元素，则返回其在链表中 "位置" 或者 地址。
    c.如果查遍整个链表都没有找到其值和e相等的元素,则返回 0 或者"NULL"。
//按值查找 ，返回地址
 ```
  Lnode *LocateElem_L(LinkList L, ElemType e){
     //在线性表L中查找值为e的数据元素
     // 找到,则返回L中值为e的数据元素的地址,查找失败返回NULL
     p = L->next;
     // p不为空 并且 p->data和e不想等那么就继续查询
     while(p && p->data!=e){
      p=p->next; 
     }
     return p;  
   } 
 ```
//按值查找 ，返回位置序号
 ```
 //在线性表L中查找值为e的数据元素的位置序号
  int LocateElem_L(LinkList L,ElemType e){
     // 返回L中值为e的数据元素的位置序号,查找失败返回0
     p = L->next; j=1; //j记录位置
     // 当前p值不为空 并且 p->data和e值不想等那么就继续查询
     while(p && p->data!=e){
      p=p->next;   
      j++;
     }
     if(p){ 
       return j;
     }else{
       return 0;  
     }
   } 
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(6)、插入---在第i个结点签插入值为e的新节点 

    a. 首先找到i-1的存储位置p。
    b. 生成一个数据域为e的新结点s。
    c. 插入新结点: (1)新结点的指针域指向结点i
                  (2)结点i-1的指针域指向新结点
   ![image](image/image-20200511093138.png) 
示例代码
 ```
 //在线性表L中第i个元素之前插入数据元素e
  Status ListInsert_L(LinkList &L,int i,ElemType e){
     // 返回L中值为e的数据元素的位置序号,查找失败返回0
     p = L->next; j=0; //j记录位置
     // 当前p值不为空 并且 p->data和e值不想等那么就继续查询
     while(p && j<i-1){ // 寻找第i-1个结点，p指向i-1结点
      p=p->next;   
      ++j;
     }
     if(!p || j>i-1){ 
       return ERROR; //i大于表长+1或者小于1,插入位置非法
     }
     s = new LNode; s->data=e; //生成新结点s,将结点s的数据域置为e
     s->next = p->next;    // 将结点s插入L中,先将第i个结点放在新结点的后面 作为新结点的后继
     p->next = s;          // 然后再把这个新结点 接到i-1这个结点的后面
     return OK;
   } 
 ```
&nbsp;&nbsp;&nbsp;&nbsp;(7)、删除---删除第i个结点

    算法步骤: 
      a.首先找到i-1的存储位置p,保存要删除的i的值。
      b.令p->next指向i+1。 
      c.释放结点i的空间。
  ![image](image/image-20200511100457.png)
示例代码
 ```
 //将线性表L中第i个数据元素删除
  Status ListDelete_L(LinkList &L,int i,ElemType &e){
     p = L; j=0; q=i; //j记录位置
     //从头往后进行查找 ，并且用计数器数着 是否到i-1个位置。如果不是那么再次循环
     while(p->next && j<i-1){ // 寻找第i个结点，并令p指向前趋
      p=p->next;   
      ++j;
     }
     if(!(p->next) || j>i-1){ //当数据元素在1~n之间,如果查找到n之后,那么指针 p->next就为空了 
       return ERROR; //不合理位置报错
     }
     q=p->next;           // 临时保存被删除结点的地址以备释放
     p->next = q->next;   // 改变删除结点前趋结点的指针
     e=q->data;           // 保存被删除结点的数据域
     delete q;            //释放删除结点的空间
     return OK;
   } 
 ```
&nbsp;&nbsp;&nbsp;&nbsp;(8)、单链表的查找、插入、删除的时间效率

    a.查找
      *因线性链表只能顺序存取,即在查找是要从头指针找起,查找的时间复杂度为O(n)
    
    b.插入和删除
      *因线性链表不需要移动元素,只要修改指针,一般情况下时间复杂度为O(1)
      *但是,如果要在单链表中进行前插或删除操作,由于要从头查找前趋结点,所耗时间复杂度为O(n)

&nbsp;&nbsp;&nbsp;&nbsp;(9)、单链表的建立
    
    1.头插法----元素插入在链表头部，也叫前插法
      a.从一个空表开始,重复读入数据;
      b.生成新结点,将读入数据存放到新结点的数据域中
      c.从最后 一个结点开始,依次将各结点插入到链表的前端
 示例图;     
 ![image](image/image-20200511104247.png)     


    2.在内存中申请一个地址，然查找到这个空间 然后将空间地址赋值给L
    L = new LNode;// C++申请地址
    L=(LinkList)malloc(sizeof(LNode));//c语言方式，使用malloc分配函数来分配一个结点这么大的空间
 示例图:
 ![image](image/image-20200511105952.png)

 &nbsp;&nbsp;&nbsp;&nbsp;算法实现
```
 //倒位序输入元素
  void CreateList_H(LinkList &L,int n){
     L =new LNode;
     L->next=NULL;//先建立一个带头结点的单链表 
     for(i=n;i>0;--i){
      p=new LNode; // 生成新结点p=(LNode*)malloc(sizeof(LNode));
      cin>>p->data; //输入元素值 前面的是c++写法, 后面的 scanf(&p->data) 是c语言写法;  
      p->next=L->next; //插入到表头
      L->next = p;
     }
   } 
算法时间复杂度是:O(n)
```


(9.1)、尾插法------元素插入到链表尾部,也叫后插法

   &nbsp;&nbsp;&nbsp;&nbsp;a.从一个空表L开始,将新结点逐个插入到链表的尾部，尾指针r执行链表的尾结点。

   &nbsp;&nbsp;&nbsp;&nbsp;b.初始时,r同L均指向头结点 。没读入一个数据元素则申请一个新结点,将新结点插入到尾结点后,r指向新结点。
  算法实现
```
  //正未序输入n个元素的值，建立带表头结点的单链表L
  void CreateList_H(LinkList &L,int n){
     L =new LNode;
     L->next=NULL;//先建立一个带头结点的单链表 
     r=L; //尾指针r指向头结点
     for(i=n;i>0;++i){
      p=new LNode; // 生成新结点，输入元素,指针变量p指向这个空间
                   // p=(LNode*)malloc(sizeof(LNode));
      cin>>p->data; //输入元素值  前面的是c++写法, 后面的 scanf(&p->data) 是c语言写法;  
      p->next=NULL;
      r->next=p; //插入到表尾
      r = p; //r指向新的尾结点
     }
   } //CreateList_R
算法时间复杂度是:O(n)
```
&nbsp;&nbsp;&nbsp;&nbsp;4.4 线性表的链式表示和实现--循环链表

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、 循环链表:是一种头尾相接的链表(即:表中最后一个结点的指针域指向头结点,整个链表形成一个环)
   优点:从表中任一结点出发均可找到表中其他结点   

   注意:由于循环链表中没有NULL指针,故涉及遍历操作时,其终止条件就不再像非循环链表那样判断
   p或p->next是否为空,而是判断它们是否等于头指针。

   循环条件:
```
 p!=NULL                   p!=L (不等于头指针)
 p->next!=NULL             p->next!=L
 单链表                    单循环链表
```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、头指针表示   找a1的复杂度:O(1)
单循环链表   找an的复杂度:O(n) 
注意:表的操作常常是在表的首尾位置上进行

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、尾指针表示   找a1的存储位置是: R->next->next    时间复杂度都是O(1)
单循环链表   找an的存储位置是: R
示意图:
![image](image/image-20200511122701.png)

&nbsp;&nbsp;&nbsp;&nbsp;(4)、合并两个单循环链表
![image](image/image-20200511134359.png)
```
  LinkList Connect(LinkList Ta,LinkList Tb){
     //假设Ta、Tb都是非空的单循环链表
     p = Ta->next;            // p存表头结点
     Ta->next=Tb->next->next; // Tb表头连结Ta表尾
     delete Tb->next;         // 释放Tb表头结点 或free(Tb->next);
     Tb->next=p;              // 修改指针
     return Tb;
   } //CreateList_R
算法时间复杂度是:O(n)
```

&nbsp;&nbsp;&nbsp;&nbsp;4.5 线性表的链式表示和实现--双向链表
   * 单链表: 单链表的结点 -->有指示后继的指针域-->找后继结点方便； 
       即:查找某结点的后继结点的执行时间为O(1).
       无指示前驱的指针域--->找前驱结点难:要从表头出发开始查找
       即:查找某结点的前驱结点的执行时间为O(n)
   * 双向链表:在单链表的每个结点里面再增加一个指向其直接前驱的指针域prior, 
      这样链表中就形成了有两个方向不同的链表,故称为双向链表。(可以用双向链表来克服单链表查找前驱结点的缺点)    
![image](image/image-20200511135501.png)

&nbsp;&nbsp;&nbsp;&nbsp;(1)、双向链表的结构可定义如下
```
typedef struct DuLNode
{
    ElemType data;
    struct DuLNode *prior *next; // 指针，它是指向一个同样式这个结点类型的一个指针，存放的是一个地址
    //*LinkList 表示指向结构体Lnode的指针类型
}DuLNode, *DuLinkList; // 重新定义了类型名，一个是这个结点的LNode,一个是指向这个结点的LinkList

```
![image](image/image-20200511140603.png)

&nbsp;&nbsp;&nbsp;&nbsp;(3)、双向循环链表
   和单链表的循环表类似，双向链表也可以有循环表
  * 让头结点的前驱指针指向链表的最后一个结点
  * 让最后一个结点的后继指针指向头结点
    ![image](image/ image-20200511141047.png)

&nbsp;&nbsp;&nbsp;&nbsp;(4)、双向链表结构的对称性(设指针p指向某一结点)
   p->prior->next = p = p-> next ->prior
  在双向链表中有些操作(如:ListLength, GetElem等),因仅涉及一个方向的指针,
  故它们的算法与线性链表的相同。但在插入、删除时,则需要同时修改两个方向上的指针,
  两者的操作的时间复杂度为O(n) 
  ![image](image/image-20200511141826.png)


&nbsp;&nbsp;&nbsp;&nbsp;(5)、双向链表的插入 
插入示意图:
 ![image](image/image-20200511143045.png)

算法实现:
```
  //头结点的指针 &L, 插入一个元素后仍然用这个返回，所以前面带了连字符& 引用型变量
  void ListInsert_DuL(DuLinkList &L,int i, ElemType e){
     //在带头结点的双向循环链表L中第i个位置之前插入元素e
     //在链表L上找到第i个，找到结果后赋值个p,让p指向第i个结点
     //如果位置是不合理的 那么就返回错误。
    if(!(p=GetElemP_Dul(L,i))) return RRROR;
     s=new DuLNode;  
     s->data=e;
     s->prior=p->prior; //1 p->prior表示的是前驱结点, 是存的前驱结点的地址 
     p->prior->next =s; //2 p->prior->next 表示前驱结点的地址，然后再根据这个查找next 就表示后继
     s->next = p;       //3
     p->prior=s;        //4
     return OK; 
   } //ListInsert_DuL
```

&nbsp;&nbsp;&nbsp;&nbsp;(6)、双向链表的删除 
删除示意图:
 ![image](image/image-20200511150055.png)

算法实现:
```
  //头结点的指针 &L, 插入一个元素后仍然用这个返回，所以前面带了连字符& 引用型变量
  void ListDelete_DuL(DuLink &L,int i, ElemType &e){
     //删除带头结点的双向循环链表L的第i个元素,并用e返回。
    if(!(p=GetElemP_Dul(L,i))) return RRROR;
     e = p->data;
     p->prior->next = p->next; 
     p->next->prior = p->prior;      
     free(p)
     return OK; 
   } //ListDelete_DuL
```
![image](image/image-20200511150727.png)



&nbsp;&nbsp;&nbsp;&nbsp;(7)、单链表、循环链表和双向链表的时间效率比较 
![image](image/image-20200511151659.png)

4.6 顺序表和链式的比较

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、链式存储结构的优点

    结点空间可以动态申请和释放;
    数据元素的逻辑次序靠结点的指针来指示,插入和删除时不需要移动数据元素;
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、链式存储结构的缺点
    
    存储密度小,每个结点的指针域需要额外占用存储空间。当每个结点的数据域所占字节不多时，
       指针域所占存储空间的比重显得很大
      存储密度计算方法如图:  

  ![image](image/image-20200511152937.png) 
    
    链式存储结构是非随机存取结构。对任一结点的操作都要从头指针依指针链查找到该结点，
      这增加了算法的复杂度。

 (3)、比较图
  ![image](image/image-20200511153341.png) 

4.7 线性表的应用

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、问题描述

    假设利用两个线性表La和Lb分别表示两个集合A和B,现要求一个新的集合A=A 并集 B(
      La=(7,5,3,11) Lb=(2,6,3) ====> La=(7,5,3,11,2,6)
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、有序表的合并
    
    问题描述:
       已知线性表La和Lb中的数据元素按值非递减有序排列,现要求将La和Lb归并为一个新的线性表Lc,
       且Lc中的数据元素仍按值非递减有序排列。
       La=(1,7,8) Lb=(2,4,6,8,10,11) ====> Lc=(1,2,4,6,7,8,8,10,11)        
 ![image](image/image-20200511155148.png)        

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、第一个问题 两个线性表集合求并集 实现

    a.简单实现步骤: 依次取出Lb集合中的每一个元素, 执行以下操作
      在La中查该元素是否存在
      如果没有找到,那么就将其插入到La的最后

```
  //头结点的指针 &L, 插入一个元素后仍然用这个返回，所以前面带了连字符& 引用型变量
  void unio(List &La,list &Lb){
    La_len = ListLength(La);
    Lb_len = ListLength(Lb);
    for(i=1;i<=Lb_len;i++){
      GetElem(Lb,i,e);
        if(!LocateElem(La,e))  
         ListInsert(&La,++La_len,e);
     }
   } //ListDelete_DuL
```
图示:
![image](image/image-20200511173927.png)

&nbsp;&nbsp;&nbsp;&nbsp;(4)、第二个问题 有序表的合并 实现:
  算法步骤:

    a. 创建一个空表Lc
    b. 依次从La或Lb中"摘取"元素值较小的结点插入到Lc表的最后，直至其中一个表边空位为止
    c. 继续将La或Lb其中一个表的剩余结点插入在Lc表的最后


&nbsp;&nbsp;&nbsp;&nbsp;1.用顺序表实现 (也就是数组)    
 ```
   void MergeList_Sq(SqList LA, SqList LB, SqList &LC){
     pa = LA.elem;
     pb = LB.elem;      //指针pa和pb的初值分别指向两个表的第一个元素
     LC.length = LA.length+LB.length;     //新表长度待合并两表的长度之和
     LC.elem = new ElemType[LC.length];   //为合并后新表分配一个数组空间
     pc = LC.elem;                         //指针pc指向新表的第一个元素
     //怎么知道没有元素了呢?那么就是在最后一个元素加进去就没有了。
     // 那pa_last怎么得到呢? 那么就是基地址+ 长度减一 就是最后一个元素的地址
     pa_last = LA.elem + LA.length-1;      // 指针pa_last指向LB表的最后一个元素
     pb_last = LB.elem + LB.length-1;      // 指针pb_last指向LB表的最后一个元素
     
     while(pa<pa_last && pb<pb_last){  //两个表都非空
        if(*pa <= *pb) {
          *pc++=*pa++;                //依次"摘取" 两表中值较小的结点
        }else{
          *pc++=*pb++; 
        }
     }

     while(pa<=pa_last){
       *pc++=*pa++;  //LB表已达到表尾，将LA中剩余元素加入到LC中
     }
     while(pb<=pb_last){
            *pc++=*pb++;  //LA表已达到表尾，将LB中剩余元素加入到LC中
     }

    } //MergeList_Sq
 ```
算法图示:
![image](image/image-20200511223535.png)

![image](image/image-20200511223609.png)


&nbsp;&nbsp;&nbsp;&nbsp;2.用链表表实现合并
![image](image/image-20200511224045.png)

&nbsp;&nbsp;&nbsp;&nbsp; 移动指针pa,  这里pa指针来操作La中结点，pb指针来操作Lb中的结点，pc指针来操作Lc中的结点
![image](image/image-20200511224641.png)

&nbsp;&nbsp;&nbsp;&nbsp;当Lb中元素小于La中的 data域，那么将小的那个加入到lc当做去
![image](image/iamge-20200511224945.png)

&nbsp;&nbsp;&nbsp;&nbsp;也是重复操作，判断是否那个小，然后将小的加入到Lc中，
![image](image/iamge-20200511225214.png)

&nbsp;&nbsp;&nbsp;&nbsp;如果当pa指针 为空时，这就表示一个链表已经全部加入到 一个新的链表中去了，那么没有元素就不管了，只是将还有元素的链表加入到新的链表中去
![image](image/iamge-20200511225537.png)

&nbsp;&nbsp;&nbsp;&nbsp;合并之后
![image](image/iamge-20200511225707.png)

&nbsp;&nbsp;&nbsp;&nbsp;链表算法实现:
```
   void MergeList_Sq(LinkList &La, LinkList &Lb, LinkList &Lc){
     pa = La->next;
     pb = Lb->next;      
     pc=Lc=La;     //用La的头结点作为Lc的头结点

     while(pa && pb){  
        if(pa ->data<=pb->data) {
          pc->next=pa;
          pc=pa;
          pa=pa->next;
        }else{
          pc->next=pb;
          pc=pb;
          pb=pb->next; 
        }
     }
     pc->next=pa?pa:pb; //插入剩余段
     delete Lb; //释放Lb的头结点    
    } //MergeList_Sq
```
![image](image/iamge-20200511230502.png)

4.8 案例分析和实现

&nbsp;&nbsp;&nbsp;&nbsp;(1)一元多项式计算
  使用数组来表示:
  多项式的指数表示数组的下标， 然后存储值用系数表示
  ![image](image/iamge-20200511230816.png)

  &nbsp;&nbsp;&nbsp;&nbsp;使用数组存储，因为都是相同指数来表示，所以多项式相加就是将数组相同下标进行相加
![image](image/iamge-20200511231444.png)

(2) 稀疏多项式的运算

  &nbsp;&nbsp;&nbsp;&nbsp;1.多项式非零项的数组表示
      比如 (a)、A(x) = 7+3X+9X^8 + 5X^17
  表示方式:
       下标i:  0, 1, 2, 3
      系数a[i]:7, 3, 9, 5
      指数:   0, 1, 8, 17
      
 &nbsp;&nbsp;&nbsp;&nbsp;2.使用线性表来表示:
  线性表A=((7,0),(3,1),(9,8),(5,17))
图示:
![image](image/image-20200511232121.png)

 &nbsp;&nbsp;&nbsp;&nbsp;3.示例:   

    线性表A=((7,0),(3,1),(9,8),(5,17))
    线性表B=((8,1),(22,7),(-9,8))
    
    创建一个新数组c
    
    分别从头遍历比较a和b的每一项
    a.如果指数相同,对应系数相加,若其和不为零,则在c中增加一个新项;
    b.如果指数不相同,则将指数较小的复制到c中  

  * 一个多项式已遍历完毕时,将另一个剩余项依次复制到c中即可。

  并且数组大小不好确定
  ![image](image/image-20200511232956.png)      

3、顺序存储结构存在的问题
  * 存储空间分配不够灵活
  * 运算的空间复杂度高

  所以使用链式存储
 ```
 typedef struct PNode{
    float coef; //系数
    int expn; //指数
    struct PNode * next;//指针域
  }PNode, *Polynomial;
 ```
  从上面的链式存储结构得知,在将多项式存入到链表中的方式是 一个系数、一个指数、还一个指向下一个结点的指针 
![image](image/image-20200512083945.png)

4、多项式创建---【算法步骤】
 ```
 a.创建一个只有头结点的空链表。
 
 b.根据多项式的项的个数n,循环n次执行以下操作:
   * 生成一个新结点*s;
   * 输入多项式当前项的系数和指数赋个新结点*s的数据域;
   * 设置一个前驱指针pre,用于指向待找到的第一个大于输入项指数的结点的前驱,
      pre初值指向头结点;
   * 指针q初始化,指向首元结点;
   * 循环链向下逐个比较链表中当前结点与输入项指数,找到第一个大于输入项指数的结点*q;
   * 将输入项结点*s插入到结点*q之前;
 ```

![image](image/image-20200512085236.png)  

多项式创建---算法描述  
```
   //输入m项的系数和指数,建立表多项式的有序链表P
   void CreatePolyn(Polynomial &p, int n){
 
     P = new PNode;
     P->next = NULL; //先建立一个带头结点的单链表 
     for(i=1;i<=n;++i){  //依次输入n个非零项
       s =new PNode; //生成新结点
       cin>>s->coef>>s->expn; //输入系数和指数
       pre=P;                  //pre用于保存q的前驱,初始值为头结点
       q=P->next;              // q初始化,指向首元结点
       while(q&&q->expn<s->expn){  // 找到第一个大于输入项指数的项*q
         pre=q;
         q=q->next;
       }
      s->next=q;               // 将输入项s插入到q和其前驱结点pre之间
      pre->next=s;
   }      
      
    } //MergeList_Sq
```
![image](image/image-20200512092628.png)

实现稀疏多项式的加法运算--算法步骤
    
    a、指针p1和p2初始化,分别指向Pa和Pb的首元结点。
    b、p3指向和多项式的当前结点,初始值Pa的头结点。
    c、当指针p1和p2均未到达相应表尾时,则循环比较p1和p2所指结点对应的指数值
      (p1->expn与p2->expn), 有下列3中情况:
       * 当p1->expn==p2->expn 时,则将两个结点中的系数相加
           若和不为零,则修改p1所指结点的系数值,同时删除p2所指结点
           若和为零,则删除p1和p2所指结点;
       * 当p1->expn < p2->expn 时,则应摘取p1所指结点插入到"和多项式"链表中去;
       * 当p1->expn > p2->expn 时,则应摘取p2所指结点插入到"和多项式"链表中去;
    d、将非空多项式的剩余段插入p3所指结点之后。
    e、释放Pb的头结点。   

4.9、案例分析与实现3
图书管理系统
```
struct Book{
   char id[20]; //ISBN
   char name[50]; //书名
   int price;//定价
} 
      
typedef struct{//顺序表
 Book *elem;
 int length;
}SqList;
    
typedef struct LNode{ //链表
 Book *data;
 struct LNode *next;
}LNode, *LinkList;
 
```
![image](image/image-20200512095852.png) 

5、栈和队列

    (1)、栈和队列的定义和特点
    (2)、案例引入
    (3)、栈的表示和操作的实现
    (4)、栈与递归
    (5)、队列的表示和操作实现
    (6)、案例分析与实现

5.1、栈和队列的定义和特点    

  * 栈和队列是两种常用的、重要的数据结构
  * 栈和队列是限定插入和删除只能在表的"端点"进行的线性表
    a.栈和队列是线性表的子集(是插入和删除位置受限的线性表)
```
 线性表              栈                  队列
 Insert(L,i,x)      Insert(S,n+1,x)      Insert(Q, n+1, x)
 1<=i<=n+1             
 Delete(L,i)        Delete(S,n)          Delete(Q, 1)
 1<=i<=n
```
![image](image/image-20200512162057.png) 
Tips: 栈: 后进先出 
      队列: 先进先出
      
  &nbsp;&nbsp;&nbsp;&nbsp;(1)栈的引用
   * 由于栈的操作具有 "后进先出" 的固有特性,使得栈称为程序设计中的有用工具。另外,如果问题起见的过程具有
      "后进先出"的天然特性的话,则求解的算法中也必然需要利用"栈"。

```
 a.数制转换         b.表达式求值                   
 c.括号匹配的检验   d.八皇后问题
 e.行编辑程序       f.函数调用
 g.迷宫求解         h.递归调用的实现
```
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、队列的常见应用
   * 由于队列的操作具有 "先进先出" 的特性,使得队列称为程序设计中解决类似排队问题的有用工具。
 ```
  a. 脱机打印输出:按申请的先后顺序依次输出
  b. 多用户系统中,多个用户排成队列,分时地循环使用CPU和主存
  c. 按用户的优先级排成多个队,每个优先级一个队列
  d. 实时控制系统中,信号按接收的先后顺序依次处理
  e. 网络电文传输,按到达的时间先后顺序依次进行
 ```

5.1.1 栈的定义和特点

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、栈的定义
    
    栈(stack)是一种特殊的线性表,是限定仅在一端(通常是表尾)进行插入和删除操作的线性表。
    又称为 "后进先出"(Last First Out)的线性表,简称为LIFO结构

  &nbsp;&nbsp;&nbsp;&nbsp;(2)、栈的相关概念
    
    栈 是仅在表尾进行插入、删除操作的线性表。
    表尾(即an端)称为栈顶Top; 表头(即a1端)称为栈低Base

```
例如: 栈  S =(A1,A2,A3.......,A(n-1), An) ; 表示下标
             A1称为栈低元素           An称为栈顶元素
```

  &nbsp;&nbsp;&nbsp;&nbsp;插入元素到栈顶(即表尾)的操作,称为入栈。
  从栈顶(即表尾)删除最后一个元素的操作,称为出栈。
   "入" = "压入" = PUSH(x)      "出" = "弹出" = POP(y)
![image](image/image-20200512163825.png)     

思考题:
![image](image/image-20200512164457.png)    

&nbsp;&nbsp;&nbsp;&nbsp;(3)、栈的相关概念
```
   * 定义: 限定只能在表的一端进行插入和删除运算的线性表(只能在栈顶操作)
   * 逻辑结构: 与同线性表相同,仍为一对一关系.
   * 存储结构: 用顺序栈或链栈存储均可，但是顺序栈更常见
   * 运算规则: 只能在栈顶运算,且访问结点时依照后进先出(LIFO)的原则
   * 实现方式: 关键是编写入栈和出栈函数,具体实现依顺序或链栈的不同而不同
```
![image](image/image-20200512165156.png)  


&nbsp;&nbsp;&nbsp;&nbsp;(4)、栈与一般线性表有什么不同
  栈与一般线性表的区别: 仅在于运算规则不同。
```
   一般线性表               栈
逻辑结构: 一对一          逻辑结构: 一对一
存储结构: 顺序表、链表    存储结构: 顺序表、链表
运算规则: 随机存取        运算规则: 后进先出(LIFO)
```
![image](image/iamge-20200512165235.png)


5.1.2 队列的定义和特点

   &nbsp;&nbsp;&nbsp;&nbsp;(1)、队列的定义
     
     * 队列(queue)是一种先进先出(First In First Out ---FIFO)的线性表,在表一端插入(表尾),
      在另一端(表头)删除
   &nbsp;&nbsp;&nbsp;&nbsp;(2)、队列的相关概念

     * 定义: 只能在表的一端进行插入,在表的另一端进行删除运算的线性表(头删尾插)
     * 逻辑结构: 与同线性表相同,仍为一对一关系.
     * 存储结构: 顺序队或链队，但是循环顺序队更常见
     * 运算规则: 只能在对首和队尾运算,且访问结点时依照 先进先出(FIFO)的原则
     * 实现方式: 关键是编写入队和出队函数,具体实现依顺队或链队的不同而不同

5.2 案例引入
```  
  (1).进制转换        栈
  (2).括号匹配的检验  栈
  (3).表达式求值      栈
 
  (4).舞伴问题    队列
```
  ![image](image/image-20200512170734.png)

&nbsp;&nbsp;&nbsp;&nbsp;1、进制转换  
    
    进制转换示例图:
  ![image](image/image-20200512171059.png)

```
 例:把十进制数159转换成八进制数。
```
![image](image/image-20200512171612.png)

&nbsp;&nbsp;&nbsp;&nbsp;2、括号匹配的检验
```
 (1)假设表达式中允许包含两种括号:圆括号和方括号
 (2)其嵌套的顺序随意,即
    * ([], []) 或[([] [])] 为正确格式;
    * [(]) 为错误确格式;
    * ([()) 或(()}) 为错误确格式;
```
![image](image/image-20200512172144.png)


&nbsp;&nbsp;&nbsp;&nbsp;3、表达式求值

    * 表达式求值是程序设计语言编译中一个最基本的问题,它的实现也需要用栈
    * 这里介绍的算法是由运算符优先级确定运算顺序的对表达式求值算法 --算符优先算法

  * 表达式的组成
```
  操作数(operand):常数、变量。
  运算法(operator):算术运算符、关系运算符和逻辑运算符。
  界限符(delimiter): 左右括弧和表达式结束符。
```
  * 任何一个算术表达式都由操作数(常数、变量)、算术运算符(+、-、*、/)和界限符
    (括号、表达式结束符 '#'、虚设的表达式起始符 '#')组成。后两者统称为算符。
```
  例如: # 3*(7-2)#
```

  ![image](image/image-20200512172912.png) 


  &nbsp;&nbsp;&nbsp;&nbsp;求表达式
```
 * 为了实现表达式求值。需要设置两个栈:
     一个是算符栈OPTR,用于寄存运算符
     另一个称为操作数栈OPND,用于寄存器运算符和运算结果
 * 求值的处理过程是自左至右扫描表达式的每一个字符
   当扫描到的是运算数,则将其压入栈OPND,
   当扫描到的是运算符时
      a.若这个运算符比OPTR栈顶运算符的优先级高,则入栈OPTR,继续先后处理
      b.若这个运算符比OPTR栈顶运算符的优先级低,则从OPND栈中弹出两个运算数,
         从栈OPTR中弹出栈顶运算符进行运算,并将运算结果压入栈OPND
 * 继续处理当前字符,直到遇到结束符为止。       
```

  ![image](image/image-20200512173621.png) 



&nbsp;&nbsp;&nbsp;&nbsp;4、舞伴问题
  ![image](image/iamge-20200512173914.png) 

  

5.3 栈的表示和操作的实现

 &nbsp;&nbsp;&nbsp;&nbsp;1、栈的抽象数据类型的类型定义
 ```
  ADT Stack{
   数据对象:
       D={ai|ai∈ElemSet, i=1,2,...,n,n>=0 }
   数据关系:
       R1={<ai-1,ai> | ai-1, ai∈D,i=2,...,n}
       约定an端为栈顶,a1端为底。
   基本操作:初始化、进栈、出栈、取栈顶元素等
 } ADT Stack
 ```
 ![image](image/iamge-20200512214609.png) 

&nbsp;&nbsp;&nbsp;&nbsp;2、相关操作
```
  InitStack(&S) 初始化操作
  操作结果:构造一个空栈S。
  
  DestroyStack(&s) 销毁栈操作
  初始条件:栈S已存在。
  操作结果:栈S被销毁。

  StackEmpty(S) 判定s是否为空栈
  初始条件:栈S已存在。
  操作结果:若栈S为空栈,则返回TRUE, 否则FALSE。
 
  StackLength(S) 求栈的长度
  初始条件:栈S已存在。
  操作结果:返回S的元素个数,即栈的长度。

  GetTop(S, &e) 取栈顶元素
  初始条件:栈S已存在且非空。
  操作结果:用e返回S的栈顶元素。

  ClearStack(&S) 栈置空操作
  初始条件:栈S已存在。
  操作结果:将S清为空栈。

  Push(&S,e)  入栈操作
  初始条件:栈S已存在。
  操作结果:插入元素e为新的栈顶元素。
 
  Pop(&S, &e)  出栈操作
  初始条件:栈S已存在且非空。
  操作结果:删除S的栈顶元素an,并用e返回其值。

```
![image](image/iamge-20200512215633.png) 


&nbsp;&nbsp;&nbsp;&nbsp;3、栈的存储
```  
  由于栈本身就是线性表,于是栈也有顺序存储和链式存储两种实现方式
  * 栈的顺序存储---顺序栈
  * 栈的链式存在---链栈  
```

&nbsp;&nbsp;&nbsp;&nbsp;4、存储方式:
```
 同一般线性表的顺序存储结构完全相同，利用一组地址连续的存储单元依次存放自栈低
   到栈顶的数据元素。栈底一般在低地址端。
    a、附设top指针，指示栈顶元素在顺序栈中的位置。(注意top指针不是指的栈顶元素，而是栈顶元素之上的下标地址)
    b、另设base指针，指示栈底元素在顺序栈中位置
     但是，为了方便操作，通常top指示真正的栈顶元素之上的下标地址
    c、另外，用stacksize表示栈可使用的最大容量 
```
![image](image/image-20200512221543.png) 

&nbsp;&nbsp;&nbsp;&nbsp;声明一个栈,然后进行入栈和出栈操作   

空栈:base==top 是栈空标志
栈满了就是: top-base == stacksize
![image](image/image-20200512222246.png)  


&nbsp;&nbsp;&nbsp;&nbsp;(1)使用数组作为顺序栈存储方式的特点: 简单、方便、但易产生溢出(数组大小固定)
  * 上溢(overflow): 栈已满,又要压入元素
  * 下溢(underflow): 栈已经空，还要弹出元素   
    注意:上溢是一种错误，使问题的处理无法进行; 而下溢一般任务是一种结束条件，即问题处理结束。

顺序栈的表示
```
# define MAXSIZE 100
//定义一个结构类型
 typedef struct{
    SElemType *base; //栈底指针
    SElemType *top; //栈顶指针
    int stacksize; //栈可以最大容量  
}SqStack;
```

指针相减得到的是栈中元素个数= top -base
![image](image/iamge-20200512223554.png)


&nbsp;&nbsp;&nbsp;&nbsp;5、顺序栈的初始化
```
Status InitStack(SqStack &S){ //构造一个空栈，这个S就是 SqStck类型，这个类型上面已经定义了
   S.base = new SElemType[MAXSIZE]; // SElemType 数组类型， 数组名字是S， 这个是C语言语法
     // 或使用C++语法  S.basee = (SElemType)malloc(MAXSIZE*sizeof(SElemType))
   if(!S.base) exit(OVERFLOW);//存储分配失败
   S.top = S.base; //栈顶指针等于栈底指针
   S.stacksize = MAXSIZE;
   return OK;   
}
```

&nbsp;&nbsp;&nbsp;&nbsp;6、顺序栈判断栈是否为空
```
Status StackEmpty(SqStack S){
   //若栈为空,返回TRUR; 否则返回FALSE 
   if(S.top == S.base) 
    return TRUE;   
   else 
    return FALSE;
}
```
&nbsp;&nbsp;&nbsp;&nbsp;7、求顺序栈长度
```
int StackLength(SqStack S){
   return S.top - S.base;
}
```

&nbsp;&nbsp;&nbsp;&nbsp;8、清空顺序栈
```
Status  ClearStackLength(SqStack S){
 if(S.base){S.top == S.base;} 
   return OK;
}
```
&nbsp;&nbsp;&nbsp;&nbsp;9、销毁顺序栈
```
Status  DestroyStack(SqStack S){
 if(S.base){
    delete S.base; // 只是释放空间，不销毁指针
    S.stacksize = 0;
    S.base = S.top =NULL:
 } 
   return OK;
}
```

&nbsp;&nbsp;&nbsp;&nbsp;10、顺序栈入栈
```
(1)判断是否栈满，若满则出错(上溢)
(2)元素e 压入栈顶
(3) 栈顶指针加1

Status  Push(SqStack &S,SElemType e){
 if(S.top -S.base == S.stacksize){ //栈满
   return ERROR;
 } 
   
    *S.top = e; //将top指针所指的这一块空间用*运算符，来取值
     S.top ++;
    // *S.Stop++=e; //这一步是上面的两步合起来的
    
   return OK;
}
```
![image](image/image-20200512231353.png)  

&nbsp;&nbsp;&nbsp;&nbsp;11、顺序栈出栈
```
(1)判断是否空栈，若空则出错(下溢)
(2)获取栈顶元素 e
(3) 栈顶指针减1

Status  Pop(SqStack &S,SElemType &e){
  //若栈不为空，则删除S的栈顶元素，用e返回其值，返回返回Ok; 否则返回ERROR
 if(S.top == S.base  ){ //等价于 if(StackEmpty(S))
    //空栈
   return ERROR;
 } 
    --S.top;
    e=*S.top;
     //e= --*S.top ;  这一步是上面两步结合
    
   return OK;
}
```
![image](image/image-20200512231257.png)


5.3.2 栈的表示和操作的实现2

  &nbsp;&nbsp;&nbsp;&nbsp;1、链栈的表示

    * 链栈是运算受限的单链表，只能在链表头部进行操作

```
//定义一个结构类型
 typedef struct SatckNode{ //栈的结点
    SElemType data;  //数据域，用来存储栈中元素的
    struct SatckNode * next; 
   
}SatckNode, *LinkStack; //再用这个类型定义一个指向这样一个结点的指针类型 叫做 LinkStack
LinkStack S;
```
&nbsp;&nbsp;&nbsp;&nbsp;2、 链栈:
```
  a.链表的头指针就是栈顶
  b.不需要头结点
  c.基本不存在栈满的情况
  d.空栈相当于头指针指向空
  e.插入和删除仅在栈顶处执行
```
![image](image/image-20200513085430.png)


&nbsp;&nbsp;&nbsp;&nbsp;3、链栈的初始化
```
Status InitStack(LinStack &S){ //构造一个空栈，栈顶指针置为空
   S = NULL;
   return  OK;   
}
```

&nbsp;&nbsp;&nbsp;&nbsp;4、判断链栈是否为空
```
 Status StackEmpty(LinStack S){
     //若栈为空,返回TRUR; 否则返回FALSE 
     if(S == NULL) 
      return TRUE;   
     else 
      return FALSE;
  }
```

&nbsp;&nbsp;&nbsp;&nbsp;5、链栈的入栈
```
// S即是指向栈顶元素的一个头指针,又表示这个栈。只要找到它就可以找到整个栈

Status  Push(LinStack &S,SElemType e){
   p = new StackNode; // 生成新结点p
   p->data = e; //将新结点数据域置为e
   p->next = S; //将新结点插入栈顶
   S = p; // 修改栈顶指针   
   return OK;
}
```
![image](image/image-20200513091346.png)

&nbsp;&nbsp;&nbsp;&nbsp;5、链栈出栈
```
//删除结点 只能删除最后一个结点，所以这里不能 删除其它的
//删除这个结点的值 用e来返回
Status  Pop(LinStack &S, SElemType &e){
 if(S == NULL  ){
    //空栈
   return ERROR;
 } 
    e = S ->data; // 先将数据域值 保留到e中
    p=S;
    S = S->next; // 指针指向下一个位置赋值给S,那么就可以释放p;
                 // 所以在S指向下一个结点时 先将 S结点存到临时p 中，用来指向要释放的结点
    delete p; 
   return OK;
}
```
![image](image/image-20200513092621.png)

&nbsp;&nbsp;&nbsp;&nbsp;6、取栈顶元素
```
SElemType  GetTop(LinStack S){
 if(S!=NULL){
   return S->data;
  }
}

```

5.4 栈与递归

  * 递归的定义
   
    (1).若一个对象部分地包含自己,或用它自己给自己定义,则称这个对象是递归的；
   
    (2).若一个过程直接地或间接地调用自己,则称这个过程是递归的过程。
      例如:递归求n阶乘
```
long Fact(long n){
  if(n==0) return 1;
   else retunr n* Fact(n-1);
}
```

&nbsp;&nbsp;&nbsp;&nbsp;1、递归定义的数学函数:

    a.阶乘函数   
    b、斐波拉契数列: 第一项或第二项它的值是1,从第三项开始每一项都是前两项的和 
![image](image/image-20200513094452.png)

&nbsp;&nbsp;&nbsp;&nbsp;2、具有递归性质的数据结构

     二叉树、广义表

&nbsp;&nbsp;&nbsp;&nbsp;3、可递归求解的问题 
    
    迷宫问题
![image](image/image-20200513094649.png)

&nbsp;&nbsp;&nbsp;&nbsp;4、递归问题---用分治法求解

    分治法:对于一个较为复杂的问题,能够分解成几个相对简单的且解法相同或类似的子问题来求解

  必备的三个条件
      
      (1)、能将一个问题转变成一个新问题,而新问题与原问题的解法相同或类同，
       不同的仅是处理的对象,且这些处理对象是变化有规律的。
      (2)、可以通过上述转化而使问题简化
      (3)、必须有一个明确的递归出口,或称递归的边界

 &nbsp;&nbsp;&nbsp;&nbsp;(2) 分治法求解递归问题算法的一般形式:
  ```
   void p(参数表){
     if(递归结束条件) 可直接求解步骤; ---基本项
     else p(较小的参数); ---归纳项         
   }
  ```
 ![image](image/image-20200513095607.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(3)、函数调用过程
    
    a.调用前,系统完成
      
     (1)、将实参,返回地址等传递给被调用函数     
     (2)、为被调用函数的局部变量分配存储区
     (3)、将控制转移到被调用函数的入口


​        
​    b.调用后,系统完成   
​      
     (1)、保存被调用函数的计算结果    
     (2)、释放被调用函数的数据区
     (3)、依照被调用函数保存的返回地址将控制转移到调用函数

  ![image](image/image-20200513102833.png)

  &nbsp;&nbsp;&nbsp;&nbsp;当多个函数构成嵌套调用时:
  ![image](image/image-20200513102808.png)


   * 求解阶乘n!的过程 

    ![image](image/image-20200513100738.png)

   * 递归函数调用的实现
 ![image](image/image-20200513102957.png) 
  
   * 进行fact(4)调用的系统栈的变化状态
 ![image](image/image-20200513103029.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、递归的优缺点
     
     
     优点:结构清晰,程序易读
     缺点:每次调用要生成工作记录,保存状态信息,入栈;返回时要出栈,恢复状态信息。时间开销大

   递归-->非递归
    方法1:尾递归、单向递归--->循环结构
    方法2:自用栈模拟系统的运行时栈
    
    
 &nbsp;&nbsp;&nbsp;&nbsp;(5)、尾递归-->循环结构
 ```
   long Fact(long n){
      if(n==0) return 1;
       else return n* Fact(n-1);
   }

  //转换为循环结构
   long Fact(long n){
   t=1;
   for(i=1;i<n;i++){
    t=t*i; 
  }
    return t;
 }
 ```
 ![image](image/image-20200513103838.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(6)单向递归->循环结构

    虽然有一处以上的递归调用语句,但各次递归调用语句的参数只和主调函数有关,相互之间参数无关,
    并且这些递归调用语句处于算法的最后。

  ```
    long Fib(long n){
       if(n==1 || n==2) return 1;
        else return  Fib(n-1) + Fib(n-2);
    }

  //转换成循环结构
   long Fib(long n){
    if(n==1 || n==2) return 1;
    else{
     t1=1;t2=1;
      for(i=3;i<=n;i++){
        t3=t1+t2;
        t1=t2;t2=t3;
      }
     return t3;
    }
  }
  ```
![image](image/image-20200513104149.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、借助栈改写递归
 ```
    1.递归程序在执行时需要系统提供栈来实现
    2.仿照递归算法执行过程中递归工作栈的状态变化可写出相应的非递归程序
    3.改写后的非递归算法与原来的递归算法相比,结构不够清晰,可读性较差，
      有的还需要经过一系列优化
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(8)、借助栈改写递归的方(了解)
 ```
    1.设置一个工作栈存放递归工作记录(包括实参、返回地址及局部变量等)
    2.进入非递归调用入口(即被调用程序开始处)将调用程序传来的
       实在参数和返回地址入栈(递归程序不可以作为主程序,因而可认为初始是被某个调用程序调用)。
    3.进入递归调用入口:当不满足递归结束条件时,逐层递归,将实参、返回地址以及局部变量入栈,这一过程
      可用循环语句来实现---模拟递归分解的过程
    4.递归结束条件满足,将到达递归出口的给定常数作为当前的函数值
    5.返回处理:在栈不空的情况下,反复退出栈顶记录,根据记录中的返回地址进行题意规定的操作,
      即逐层计算当前函数值,直至栈空为止--模拟递归求值过程。
 ```
![image](image/image-20200513111956.png) 


5.5 队列的表示和操作的实现
```
   a. 队列(Queue)是仅在表尾进行插入操作,在表头进行删除操作的线性表
   b. 表尾即an端,称为队尾;表头即a1端,称为队头。
   c. 它是一种先进先出(FIFO)的线性表。  
    例如: 队列Q=(a1,a2,a3,...,an-1, an)
  插入元素称为入队;删除元素称为出队。
  队列的存储结构为链队或顺序队(常用循环顺序队列)

```

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、队列的相关概念

    * 定义: 只能在表的一端进行插入,在表的另一端进行删除运算的线性表(头删尾插)
    * 逻辑结构: 与同线性表相同,仍为一对一关系.
    * 存储结构: 顺序队或链队，但是循环顺序队更常见
    * 运算规则: 只能在对首和队尾运算,且访问结点时依照 先进先出(FIFO)的原则
    * 实现方式: 关键是编写入队和出队函数,具体实现依顺队或链队的不同而不同

 ```
   ADT Queue{
    数据对象: D={ai|ai∈ElemSet, i=1,2,...,n,n>=0 }
    数据关系: R={<ai-1,ai> | ai-1, ai∈D,i=2,...,n}
        约定其中a1端为队列头,an端为队列尾。
    基本操作:
        InitQueue(&Q) 操作结果:构造空队列Q
        DestroyQueue(&Q) 条件:队列Q已存在; 操作结果:队列Q被销毁
        ClearQueue(&Q) 条件:队列Q已存在; 操作结果:将Q清空
        QueueLength(Q) 条件:队列Q已存在; 操作结果:返回Q的元素个数,即队长
        GetHead(Q, &e) 条件:Q为非空队列; 操作结果:用e返回Q的队头元素
        EnQueue(&Q, e) 条件:队列Q已存在; 操作结果:插入元素e为Q的队尾元素
        DeQueue(&Q, &e) 条件:Q为非空队列; 操作结果:删除Q的队头元素,用e返回值
       .....
  } ADT Queue
 ```
![image](image/image-20200513133332.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、顺序"队列"
```
  a. 队列的物理存储可以用顺序存储结构,也可用链式存储结构。相应地，队列的存储方式也分为两种,
     即顺序队列和链式队列。
  b. 队列的顺序表示 ----用一维数组base[MAXQSIZE]

# define MAXQSIZE 100 //最大队列长度
  Typedef struct{
     QElemType *base; //初始化的动态分配存储空间
     int front;       // 头部指针,若队列不空,指向队列头元素
     int rear;       //尾指针,若队列不空,指向队列尾元素的下一个位置
 }SqQueue;

```
&nbsp;&nbsp;&nbsp;&nbsp;使用数组存储时,当rear等于MAXQSIZE 时发生溢出。所以出现数组越界
![image](image/image-20200513141048.png) 
* 思考问题?
```

设数组大小为MAXQSIZE
rear = MAXQSIZE 时,发生溢出。不过这有两种情况
1、若front = 0时,rear = MAXQSIZE时再入队--真溢出
2、若front 不等于0时, rear = MAXQSIZE时再入队--假溢出,
  这种方式中只存储两个元素还有其他的内存空间这种情况怎么办呢?
 
```
![image](image/image-20200513141424.png) 

 * 解决假上溢的方法
```
  1、将队中元素依次向队头方向移动
    缺点:浪费时间,每移动一次,队中元素都要移动

  2、将队空间设想成一个循环的表,即分配给队列的m个存储单元
     可以循环使用,当rear为maxqsize时,若向量的开始端空着,又可以
     从头使用空着的空间。当front为maxqsize时，也一样。

```
![image](image/image-20200513143000.png) 

 * 解决假上溢的方法----引入循环队列
``` 
   base[0]接在base[MAXQSIZE-1]之后,若rear+1 == M, 则令rear=0;
   实现方法: 利用求模运算(mod, C语言中:%)。
   插入元素: Q.base[Q.rear] = x;
             Q.rear=(Q.rear+1)% MAXQSIZE;
   删除元素: x=Q.base[s.front]
             Q.front=(Q.front+1) % MAXQSIZE;
   循环队列: 循环使用为队列分配的存储空间。
```
![image](image/image-20200513143913.png) 

 * 问题 队空和队满都是 front==rear 那么怎么去判断喃
 ```
  解决方案:
   1、另外设一个标志以区别对空,队满
   2、另设置一个变量,记录元素个数
   3、少用一个元素空间 (一般使用这种方式)

 ```
![image](image/image=20200513144351.png) 


 * 循环队列解决队满时判断方法---少用一个元素空间:
``` 
  队空:front == rear 
  队满: (rear+1)% MAXQSIZE == front
      队尾指针再+1,就与队头指针重合
```
![image](image/image-20200513145057.png) 


5.5.1 队列的表示和操作的实现--循环队列的操作
``` 
# define MAXQSIZE 100 //最大队列长度
  Typedef struct{
     QElemType *base; //初始化的动态分配存储空间
     int front;       // 头部指针,若队列不空,指向队列头元素
     int rear;       //尾指针,若队列不空,指向队列尾元素的下一个位置
 }SqQueue; //这里没有加*号,那么就是普通类型,
     //普通类型在引用它的成员就不是使用 -> 方式了,而是用. 来调用

```
&nbsp;&nbsp;&nbsp;&nbsp;1、 队列初始化

```
Status InitQueue(SqQueue &Q){
   //Q.base这里为什么是指针,因为用数组来存储,数组当中首元素的地址就是一个指针
   Q.base = new QElemType[MAXQSIZE]; // QElemType 数组类型,分配数组空间
     // 或使用C++语法  Q.basee = (QElemType)malloc(MAXQSIZE*sizeof(QElemType))
   if(!Q.base) exit(OVERFLOW);//存储分配失败
   Q.front = Q.rear=0; //头指针尾指针为0,队列为空
   return OK;   
}
```
![image](image/image-20200513150848.png) 


&nbsp;&nbsp;&nbsp;&nbsp;2、循环队列---求队列长度
```
int QueueLength(SqQueue Q){
   return (Q.rear -Q.front+MAXQSIZE)/%MAXQSIZE);
}
```
![image](image/image-20200513150935.png) 



&nbsp;&nbsp;&nbsp;&nbsp;3、循环队列---入队
```
// S即是指向栈顶元素的一个头指针,又表示这个栈。只要找到它就可以找到整个栈

Status  EnQueue(SqQueue &Q,QElemType e){
  if((Q.rear+1)%MAXQSIZE==Q.front) return ERROR; //队满
   Q.base[Q.rear] = e;   //新元素加入队尾
   Q.rear=(Q.rear+1)%MAXQSIZE;  //队尾指针+1
   return OK;
}
```
![image](image/image-20200513151439.png)



&nbsp;&nbsp;&nbsp;&nbsp;5、循环队列----出队
```
Status  DeQueue(SqQueue &Q, QElemType &e){
  if(Q.front==Q.rear) return ERROR; //队空
   e = Q.base[Q.front];   //保存队头元素
   Q.front = (Q.front+ 1)%MAXQSIZE;   //队头指针加1
   return OK;
}
```
![image](image/image-20200513151852.png)



&nbsp;&nbsp;&nbsp;&nbsp;6、循环队列 ------取队头元素
```
SElemType  GetHead(SqQueue Q){
 if(Q.front!=Q.rear){  //队列不为空
    return  Q.base[Q.front]; //返回队头指针元素的值,对头指针不变
  }
}

```
![image](image/image-20200513152125.png)

5.5.2 链列----队列的链式操作的实现

 * 若用户无法估计所用队列的长度,则宜采用链队列。
 * 链队列的类型定义
```
# define MAXQSIZE 100 //最大队列长度
  typedef struct Qnode{
     QElemType data; 
     struct Qnode *next;      
 }Qnode ,*QuenePtr; //声明了两个类型,一个是结点本身类型Qnode,
    一个是指向这个结点的一个指针类型*QuenePtr



 typedef struct{
  //这里两个都是指向Qnode结点类型的指针
   QuenePtr front;// 队头指针
   QuenePtr rear; //队尾指针
 }LinkQueue
```
![image](image/image-20200513153514.png)


  * 链队列运算指针变化状况   
![image](image/image-20200513154231.png)


&nbsp;&nbsp;&nbsp;&nbsp;1、链队列初始化
```
Status InitQueue(LinkQueue &Q){
   Q.front=Q.rear= (QuenePtr)malloc(sizeof(QNode));
   if(!Q.front) exit(OVERFLOW);
   Q.front->next = NULL;
   return OK;   
}
```
![image](image/image-20200513154632.png) 


&nbsp;&nbsp;&nbsp;&nbsp;2、销毁链队列
```
Status DestroyQueue(LinkQueue &Q){
   while(Q.front){
   p=Q.front->next; free(Q.front); Q.front=p;
   //或者使用 Q.rear=Q.front->next; free(Q.front); Q.front=Q.rear;
  }
   return OK;   
}
```
![image](image/image-20200513154952.png) 


&nbsp;&nbsp;&nbsp;&nbsp;3、将元素e入队
```

Status  EnQueue(LinkQueue &Q,QElemType e){
   p= (QuenePtr)malloc(sizeof(QNode)); //首先在内存中分配一个结点空间,因为要入队所以要有一个空间来存储要插入的元素
   if(!p) exit(OVERFLOW);  //分配不成功 直接退出
   p->data = e; p->next=NULL;
   Q.rear->next = p; //将p接到 尾指针的next域中
   Q.rear=p;     //然后修改尾指针指向
   return OK;
}
```
![image](image/image-20200513155931.png)

&nbsp;&nbsp;&nbsp;&nbsp;4、链队列的操作----链队列出队
```
Status  DeQueue(LinkQueue &Q, QElemType &e){
  if(Q.front==Q.rear) return ERROR; //队空
   p = Q.front->next; //先将 头结点的下一个指针 指向p
   e = p->data;       // 记录下, 将p的数据域 赋值给 e;
   Q.front->next = p->next;   // 将 p的next域赋值给 头结点的next域;
   if(Q.rear==p) Q.rear=Q.front;  //如果头结点的下一元素本身就是尾结点, 
   // 也就是说删除的恰好是尾结点,那么就不仅要修改头指针,还需要修改尾指针
   // 那么删除的就是尾结点, 删除完了之后,尾指针和头指针应该一样 都指向头结点
   
   delete p; 
   return OK;
}
```
![image](image/image-20200513161713.png)


&nbsp;&nbsp;&nbsp;&nbsp;5、链队列的操作----链队列取队头元素
```
SElemType  GetHead(LinkQueue Q, QElemType &e){
 if(Q.front==Q.rear){  
     return ERROR;
  }
  //链队列中队头元素 就放在头结点的下一个元素。
  e = Q.front->next->data;
 return OK;
}
```
![image](image/image-20200513162131.png)



&nbsp;&nbsp;&nbsp;&nbsp;6、串、数组和广义表

   &nbsp;&nbsp;&nbsp;&nbsp;(1)、串---零个或多个任意字符组成的有限序列
    
 ```
 子串: 一个串中任意个连续字符组成的子序列(含空串)称为该串的子串。
  例如: "abcde"的子串有:
      "" 、 "a" 、"ab"、"abc"、"abcd" 和"abcde"等  "" 是空串
    真子串是指不包含自身的所有子串
 ```
 ![image](image/image-20200513165934.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、串的子串和主串
``` 
 子串: 串中任意个连续字符组成的子序列(含空串)称为该串的子串。
 主串: 包含子串的串相应地称为主串
 字符位置: 字符在序列中的序号为该字符在串中的位置
 子串位置: 子串第一个字符在主串中的位置
 空格串:  由一个或多个空格组成的串,与空串不同
 例如: 字符串 a、b、c、d
 a ='BEI'
 b ='JING'
 c ='BEIJING'
 d ='BEI JING'
 
 它们的长度是: 3, 4, 7,8
 c的子串是: a,b
 d的子串是: a,b
 a在c中的位置是: 1
 a在d中的位置是: 1
 b在c中的位置是: 4
 b在c中的位置是: 5
```
![image](image/image-20200513165402.png)

&nbsp;&nbsp;&nbsp;&nbsp;(3)、串相等
```
 串相等: 当且仅当两个串的长度相等并且各个对应位置上的字符都相同时,这两个串才是相等的
  例如: 
     "abcd" 不等于 "abc"
     "abcd" 不等于 "abcde"
  b、所有空串是相等的
```
![image](image/image-20200513170609.png)

6.2、案例引入

  串的应用非常广泛,计算机上的非数值处理的对象大部分是字符串数据,例如:文字编辑,符号处理,各种信息处理系统等等。
![image](image/image-20200513171226.png)

![image](image/image-20200513171502.png)

6.3、串的类型定义、存储结构及其运算

&nbsp;&nbsp;&nbsp;&nbsp;(1)、串的类型定义 
```
  ADT String{
   数据对象: D={ai|ai∈CharaterSet, i=1,2,...,n,n>=0 }
   数据关系: R1={<ai-1,ai> | ai-1, ai∈D,i=2,...,n}
       约定an端为栈顶,a1端为底。
   基本操作:
    (1) StrAssign(&T, chars) // 串赋值
    (2) StrCompare(S,T)  //串比较
    (3) StrLength(S)  //求串长
    (4) Concat(&T,S1,S2)  //串连结 
    (5) SubString(&Sub,S,pos,len)  //求子串 
    (4) ClearString(&S)  //清空串 
    (4) Index(S,T,pos)  //子串的位置 
    (4) Replace(&S,T,V)  //串替换 
     .....等等
 } ADT String
```
![image](image/image-20200513172951.png)
![image](image/image-20200513173015.png)


&nbsp;&nbsp;&nbsp;&nbsp;(2)、串的存储方式
  串中元素逻辑关系与线性表的相同,串可以采用与线性表相同的存储结构
![image](image/image-20200513173321.png)

&nbsp;&nbsp;&nbsp;&nbsp;(3)、串的顺序存储结构

``` 
# define MAXLEN 255
  Typedef struct{
     char ch[MAXLEN+1];  //存储串的一维数组, 可以存储256个元素
     // 这里只是类型和线性表不一样
     int length;       // 串的当前长度
 }SString;

```

&nbsp;&nbsp;&nbsp;&nbsp;(4)、串的链式存储结构
 ```
  优点:操作方便  缺点:存储密度较低

  存储密度: 串值所占的存储/实际分配的存储
 ```
![image](image/image-20200513174031.png)

 ```
  可以将多个字符放在一个结点中,以克服其缺点,我们可以多个字符存放的一个结点称为块
 ```
![image](image/image-20200513174230.png)

&nbsp;&nbsp;&nbsp;&nbsp;(5)、串的链式存储结构--块链结构
``` 
# define CHUNKSIZE 80 //块的大小可由用户定义
  typedef struct Chunk{
     char ch[CHUNKSIZE]; 
     struct Chunk *next;
 }Chunk;

typedef struct{
     Chunk *head, *tail; //串的头指针和尾指针
     int curlen;       // 串的当前长度
 }LString;            // 字符串的块链结构

```

&nbsp;&nbsp;&nbsp;&nbsp;(6)、串的操作----串的模式匹配算法
    
    1、算法的目的: 确定主串中所含子串(模式串)第一次出现的位置(定位)
    2、算法应用: 搜索引擎、拼写检查、语言翻译、数据压缩
    3、算法种类: 
       a.BF算法(Brute-Force,又称古典的、经典的、朴素的、穷举的)
       b.KMP算法(特点:速度快)

![image](image/image-20200513223154.png)

  &nbsp;&nbsp;&nbsp;&nbsp;1、Brute-Force简称为BF算法,亦称为单匹配算法。采用穷举法的思路。(就是一个个的来比较)
   ```
    算法的思想是从S的每一个字符开始依次于T的字符进行匹配
   ```
![image](image/image-20200513223253.png)

  &nbsp;&nbsp;&nbsp;&nbsp;2、例如,
   设目标串S= "aaaaab", 模式串T= "aaab"。
    S的长度n(n=6), T的长度为m(m=4)。

    BF算法的匹配过程如下：
    用一维数组来存储ch[],其中ch[0]不存元素 为了处理方法，从第一个开始存元素 
    所以下面第一个元素的位置i和j都是1, 然后一直比对是否相同，
    j=1,j=1 
    
    S: a a a a a a b
               |
    T: a a a a b 
       
    当i=4, j=4 比较下一位时不相等，这个时候要让i回退,回退到第二个字符位置
       
    匹配失败:
     i=i-j+2=2(回溯)
     j=1(从头开始)
      
    这里的i-j+2 可以看成是(i-j+1)+1 ,
    括号里面的解释 当j=4时,j移动了3格,i也移动了3格, 所以i-j 回到了后面。
    如果i直接减j, 就是减去4 就多减去了1格,所以加上1就是往回退了。移了及格就回退几格
    然后在+1 就是不回退到原来的位置，原来是从第一个字符开始的 现在退到第二个字符的位置就可以了
    所以 (i-j+1)是退到原来的位置,再加1就是退到原来位置加1。 然后j再从1开始,i从第二个位置开始
    比较的时候i=2 和j=1进行比较,依次比较下去。


​    
![image](image/image-20200513223459.png)

  当i=2,j=1时
![image](image/image-20200513225450.png)    


  当匹配成功时：子串出现的位置是 i-t.length=3 就是匹配成功后i的值减去串的长度
![image](image/image-20200513225809.png)    


 &nbsp;&nbsp;&nbsp;&nbsp;3、BF算法设计思想
```
  a.将主串的第pos个字符和模式串的第一个字符比较
     若相等，继续逐个比较后续字符; 
     若不等，从主串的下一个字符起,重新与模式串的第一个字符比较。
 
    * 直到主串的一个连续字符序列与模式串相等。返回值为S中与T匹配的子序列第一个字符的序号,即匹配成功。
    * 否则,匹配失败,返回值0 
```
  &nbsp;&nbsp;&nbsp;&nbsp;4、算法描述
``` 
 int Index_BF(SString S, SSstring T){
  int i=1,j=1;
  //有几个难点, 1就是这个循环什么时候结束，一种是匹配成功了， 一种是所有子串都扫描过了也不行
  while(i<=S.length && j<=T.length){ //匹配成功 两个条件必须都成立，当这个n超过这个长度就不比了
     //ch[0]不存元素为了方便计算
    if(s.ch[i] == t.ch[j]){++i;++j;}//主串和子串依次匹配下一个字符
    //如果发现两个字符不相等，那么就要进行回溯操作
    else{i=i-j+2;i=1;} // 主串、子串指针回溯重新开始下一次匹配  
 }
  if(j>=T.length) return i-T.length;  //返回匹配的第一个字符的下标
  else return 0; //模式匹配不成功
}
```
![image](image/image-20200513232218.png)    

 &nbsp;&nbsp;&nbsp;&nbsp;5、习题算法
![image](image/image-20200513232439.png)    

 &nbsp;&nbsp;&nbsp;&nbsp;6、时间复杂度
```
 例: S='00000000001',T='0001', pos =1 
    若n为主串长度,m为子串长度，最坏情况是
       主串前面n-m个位置都部分匹配到子串的最后一位，即这n-m位各比较了m次
       最后m位也各比较了1次
       总次数为:(n-m)*m+m=(n-m+1)*m
        若m 远远小于n,则算法复杂度O(n*m)
```
![image](image/image-20200513232758.png)    

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、串的操作----KMP算法设计思想
  利用已经部分匹配的结果而加快模式串的滑动速度?
  且主串S的指针i不必回溯!可提速到O(n+m)!
![image](image/image-20200514084300.png)    

```
KMP算法: 为此,定义next[j]函数,表明当模式中第j个字符与主串中相应字符"失配"时,
   在模式中需要新和主串中该字符进行比较的字符的位置
                 
               P1...Pk-1 :表示从头开始的 k-1个元素
               Pj-k+1 ...Pj-1 :j前面的k-1个元素 

          max{k|1<k<j,且"P1...Pk-1" = "Pj-k+1 ...Pj-1" }  
next[j] = 0       当j=1时
          1       其他情况 

   "P1...Pk-1":从头开始的(k-1)的位置就是前缀
   "Pj-k+1 ...Pj-1": 是某一个字符串的后缀
    比如:   abcd
               d, cd ,bcd 不过不包含本身
    当这两个相等是就找到了k的值,但是k的值可能不止一个 那么我们找到里面的最大值
    那么这个值就作为下一个j的位置
    如果没有找到那么就是1(没有前缀也没有后缀)

```
![image](image/image-20200514085215.png)    


计算示例:
```
j        1   2   3   4   5   6   7   8   9   10   11   12   13   14   15   
 
模式串   a   b   c   a   a   b   b   c   a    b    c    a    a   b    d

next[j]  0  1   1   1    2   2   3   1   1   2    3    4    5   6    7

说明: 
当j=1时 从上面的那个公式可以知道, next[j]=next[j] =0
当j=2时 也就是模式串在 第一个b这个位置, 然后查找这个b前面 模式串 有没有前缀 然后继续比较
        如果没有则没有找到 next[j] = next[2] = 1
当j=3时 模式串=c 那么找这个模式串前面的元素 b和 模式串从头开始比较  如果没有则没有找到 next[j] = next[2] = 1

当j=4时 模式串=a 那么找这个模式串前面的元素 c和 模式串从头a开始比较 ,
        然后在使用bc 和 ab比较 如果没有则没有找到 next[j] = next[2] = 1

当j=5时 模式串=a 那么找这个模式串前面的元素 a和 模式串从头a开始比较 ,
        如相等, 那么就再使用 ca 和 ab比较 如不相等 那么就取最大值
        也就是相等时的最大值, 所以这时k-1=1 表示 一个字符相等 那么k=2
        所以这时k=2就是next[j]的值

当j=6时 模式串=b 那么找这个模式串前面的元素 a和 模式串从头a开始比较 ,
        如相等, 那么就再使用 aa 和 ab比较 若不相等 ,
        再用caa和abc比较 若如不相等 直到这个字符比较比较完为止
          (注意前缀和后缀不包含本身)
        那么就取最大值
        也就是相等时的最大值, 所以这时k-1=1 表示 一个字符相等 那么k=2
        所以这时k=2就是next[j]的值
  
当j=7时 模式串=b 那么找这个模式串前面的元素 b和 模式串从头a开始比较 ,
        如相等, 那么就再使用模式串b前面的 ab 和 从头ab比较 若相等 ,
        那么就取最大值
        也就是相等时的最大值, 所以这时k-1=2 表示 两个字符相等 那么k=3
        所以这时k=3就是next[j]的值
  
 然后依次往下类推。。。。
```


![image](image/image-20200514092707.png)    


算法
``` 
 int Index_KMP(SString S, SSstring T, int pos){
  int i=pos, j=1;
  while(i<=S.length && j<=T.length){ 
    if(j==0 || S.ch[i]==T.ch[j]){++i;++j;}
    else{
       j=next[j]; //i不变,j后退
    }  
 }
  if(j>T.length) return i-T.length;  //匹配成功
  else return 0; //模式匹配不成功
}
```
![image](image/image-20200514095842.png)    

获取
``` 
 void get_next(SString S, int &next[]){
  int i=1, next[1]=0;j=0;
  while(i<=T.length){ 
    if(j==0 || T.ch[i]==T.ch[j]){++i;++j;
      next[i] = j;    
     }
    else{j=next[j]} 
 }
 
}
```
![image](image/image-20200514095922.png)    


next函数的改进
![image](image/image-20200514100731.png)    

根据next值求nextval值的方法:
``` 
  模式串       a   b   a   a   b   c   a    c 
  next值       0   1   1   2   2   3   1    2  
  nextval值    0   1   0   2   1   3   0    2

1.第一位的nextval值必定为0,第二位如果于第一位相同则为0,如果不同则为1。
2.第三位的next值为1,那么将第三位和第一位进行比较,均为a,
   相同,则第三位的nextval值为第一位的next值,为0。
3.第四位的next值为2,那么将第四位和第二位进行比较,
  不同,则第四位的nextval值为其next值,为2。
4.第五位的next值为2,那么将第五位和第二位进行比较,
  相同,第二位的next值为1,则继续将第二位与第一位进行比较,
  不同,则第五位的nextval值为第二位的next值, 为1。
5.第六位的next值为3,那么将第六位和第三位进行比较,不同,则第六位的nextval值为其next值,为3。
6.第七位的next值为1,那么将第七位和第一位进行比较,相同,则第七位的nextval值为0。
7.第八位的next值为2,那么将第八位和第二位进行比较,不同,则第八位的nextval值为其next值,为2。
 
```
![image](image/image-20200514102449.png)    



6.1、 数组
```
 数组:按一定格式排列起来的 具有相同类型的数据元素的集合
 一维数组: 若线性表中的数据元素为非结构的简单元素,则称为一维数组
 一维数组的逻辑结构: 线性结构。定长的线性表
 声明格式: 数据类型 变量名称[长度]; 
```
![image](image/image-20200514103916.png)   
&nbsp;&nbsp;&nbsp;&nbsp;1、二维数组:
```
声明格式: 数据类型  变量名称[行数] [列数];
       例: int num[5] [8];
注意: 行和列都是从0开始的 
```
 ![image](image/image-20200514104446.png)   
&nbsp;&nbsp;&nbsp;&nbsp;2、其他数组:
```
  三维数组: 若二维数组中的元素又是一个一维数组,则称作三维数组
  n维数组: 若n-1维数组中元素又是一个一维数组结构,则称作n维数组。

  结论: 线性表结构是数组结构的一个特例, 而数组结构又是线性表结构的扩展。

   数组特点:结构固定---定义后,维数和维界不再改变
   数组基本操作:除了结构的初始化和销毁之外,只有取元素和修改元素值的操作  
```
 ![image](image/image-20200514104846.png)   


&nbsp;&nbsp;&nbsp;&nbsp;3、n维数组的抽象数据类型
![image](image/image-20200514105923.png) 


&nbsp;&nbsp;&nbsp;&nbsp;4.示例
![image](image/image-20200514110519.png) 



&nbsp;&nbsp;&nbsp;&nbsp;5、数组的顺序存储
```
   数组特点: "结构固定" ------维数和维界不再改变
   数组基本操作:初始化、销毁、取元素、修改元素值
               一般不做插入和删除操作。
  所以: 一般都是采用顺序存储结构来表示数组
  注意: 数组可以是多维的,但存储数据元素的内存单元地址是一维的,因此,
    在存储数组结构之前,需要解决将多维关系映射到一维关系的问题。
```

   * 一维数组
```
 例,有数组定义: int a[5];
 每个元素占用4字节,假设a[0]存储在2000单元,a[3]地址是多少?
  a[3] 地址是 2012开始.

  LOC(0)=a=2000  L=4 表示占用的每一个元素占用字节
  LOC(3)= 3*4+2000 , 表示LOC(3)前面有3个元素，每个元素占用4个字节,然后再加上首地址2000；
 
  LOC(i)= i*L +a  ,那么第i个元素所在的位置是 i前面多少个元素 * 每个元素所占用的字节,再加上首地址  
```

  ![image](image/image-20200514111839.png) 

  ![image](image/image-20200514112335.png)

  ![image](image/image-20200514112859.png)


   * 二维数组

    ![image](image/image-20200514113359.png)


&nbsp;&nbsp;&nbsp;&nbsp;(1)、以行序为主序
```
 存储单元是一维结构,而数组是个多维结构,则用一组连续存储单元存放数组的数据元素就有
个次序约定问题 
```
![image](image/image-20200514133001.png)

&nbsp;&nbsp;&nbsp;&nbsp;(2)、以列序为主序


![image](image/image-20200514133330.png)


&nbsp;&nbsp;&nbsp;&nbsp;(3)、二维数组的行序优先表示
```
以行序为主序:
   设数组开始存储位置LOC(0,0),存储每个元素 "需要L个存储单元" 数组元素a[i][j]的存储位置是：
    LOC(i,j) = LOC(0,0) + (n*i+j)*L;  
     (n*i+j)表示在a[i][j]前面所有元素个数 
    
     上面表示有i行,每一行都有n个元素,所以前面有n*i个元素, 
     然后j表示所在行的列坐标 就表示 j个元素   

    这里理解这个公式的意义 就可以知道怎么去计算了
    
```
![image](image/image-20200514133947.png)

&nbsp;&nbsp;&nbsp;&nbsp;(4)、三维数组
```
 按页/行/列存放,页优先的顺序存储 
```
![image](image/image-20200514135011.png)

&nbsp;&nbsp;&nbsp;&nbsp;(5)、计算在三维数组中某个元素的存储位置
```
  a[m1][m2][m3]各维元素个数为 m1,m2,m3
  下标为i1,i2,i3的数组元素的存储位置
    LOC(i1,i2,i3) = a + i1*m2*m3+ i2*m3 + i3
    a:表示首地址
    i1*m2*m3:表示前i1页总元素个数, i1页每一个都有m2*m3个元素
    i2*m3:第i1页前i2行总元素个数
    i3:表示第i2行前i3列元素个数
  
   解释:首先要知道 存储了多少页, 然后在数出来它前面有多少行，
     然后再数出来他的行前面有多少个 ,就是这样去计算的
```
![image](image/image-20200514135120.png)

&nbsp;&nbsp;&nbsp;&nbsp;(6)、n维数组

![image](image/image-20200514135755.png)

&nbsp;&nbsp;&nbsp;&nbsp;(7)、数组的存储例子
```
 例:设有一个二维数组A[m][n]按行优先顺序存储,假设A[0][0]存放位置在644(10),
  A[2][2]存放位置在676(10),每个元素占一个空间,问A[3][3](10)存放在什么位置?
 (脚住(10)表示用10进制表示,是下标)

 设数组元素A[i][j]存放在起始地址为Loc(i,j)的存储单元中

  * Loc(2,2) = Loc(0,0)+ 2*n +2  = 644+2*n+2=647
  * n = (676 -2 -644)/2 =15
  * Loc(3,3) = Loc(0,0) + 3*15+3 = 644 +45+3 = 692
```
![image](image/image-20200514140834.png)

![image](image/image-20200514141044.png)


6.2、特殊矩阵的压缩存储
```
 矩阵: 一个由m*n 个元素排成的m行n列的表。
 矩阵的常规存储:  将矩阵描述为一个二维数组。
 矩阵的常规存储的特点:
       a.可以对其元素进行随机存取;
       b.矩阵运算非常简单;存储的密度为1。
 不适宜常规存储的矩阵: 值相同的元素很多且呈某种规律分别;零元素多。

 矩阵的压缩存储: 为多个相同的非零元素只分配一个存储空间;对零元素不分配空间

```

&nbsp;&nbsp;&nbsp;&nbsp;1、什么是压缩存储?

    若多个数据元素的值都相同,则只分配一个元素值的存储空间,且零元素不占存储空间。

&nbsp;&nbsp;&nbsp;&nbsp;2、什么样的矩阵能够压缩?

    一些特性矩阵,如:对称矩阵,对角矩阵,三角矩阵,稀疏矩阵等。

&nbsp;&nbsp;&nbsp;&nbsp;3、什么叫稀疏矩阵?

    矩阵中非零元素的个数较少(一般小于5%),其他的都是零,这么多的零就不存储了
    只有非零元素把它存储上

&nbsp;&nbsp;&nbsp;&nbsp;4、对称矩阵

    特点: 在n*n的矩阵a中,满足如下性质:
        aij = aji(1<=i,j<=n)
    存储方法: 只存储下(或者上)三角(包括主对角线)的数据元素。共占用n(n+1)/2 个元素空间
![image](image/image-20200514144521.png)


&nbsp;&nbsp;&nbsp;&nbsp;5、对称矩阵的存储结构

    对称矩阵上线三角中的元素数均为: n(n+1)/2
    可以以行序为主序将元素存放在一个一维数组Sa[n(n+1)/2]中。
![image](image/image-20200514144853.png)

    从a1到an 的个数成一个等差数列, 从1,2,.....n-1。
    an1的存在的位置就是 (1+n-1) * (n-1)/2
    
    注意：n1是下标 i和j, 行和列
![image](image/image-20200514145626.png)



&nbsp;&nbsp;&nbsp;&nbsp;6、三角矩阵
    
    特点: 对角线以下(或者以上)的数据元素(不包括对角线)全部为长数c
    存储方法:重复元素c共享一个元素存储空间,共占用n(n+1)/2+1元素  
![image](image/image-20200514151208.png)


&nbsp;&nbsp;&nbsp;&nbsp;7、对角矩阵
    
    特点:在n*n的方阵中,所有非零元素都集中在以对角线为中心的带状区域中,区域为的值为0,
    则称为对角矩阵。常见的有三队矩阵、五对角矩阵、七对觉矩阵等
![image](image/image-20200514151900.png)

    存储方法: 使用二维数组存储,一条对角线 一条对角线的进行存储
    以主对角线为0,然后去存储主对角线上的元素, 主对角线上面的存在 -1上面
    主对角线下面的存在 1 面
![image](image/image-20200514152051.png)


6.2.1、稀疏矩阵存储 

  * 使用三元组来唯一缺的矩阵的一个非零元素
![image](image/image-20200514153241.png)

![image](image/image-20200514153353.png)
   *  三元组存储方式

    三元组存储方式
    M由 {(1,2,12),(1,3,9),(3,1,-3),(3,6,14),(4,3,24),(5,2,18),,
     (6,1,15),(6,4,-7)}
![image](image/image-20200514153423.png)
  * 压缩存储原则
    
    
    压缩存储原则:存各非零元的值、行列位置和矩阵的行列数
    三元组的不同表示方法可以决定稀疏矩阵不同的压缩存储方法。
![image](image/image-20200514153544.png)

   * 三元组顺序表

    三元组顺序表
    注意:为更可靠描述,通常再加一根"总体"信息:
      即 总行数、总列数、非零元素总个数
      
     这个是在下标为0的位置添加一个
![image](image/image-20200514154254.png)

   * 根据三元组还原稀疏矩阵

 ![image](image/image-20200514155028.png) 

   * 三元组顺序表存储的优缺点

    a.三元组顺序表又称有序的双下标法
    
    b.优点:非零元在表中按行序有序存储,因此便于进行依行顺序处理的矩阵运算。
    
    c.缺的:不能随机存取。若按行号存取某一行中的非零元,则需从头开始进行查找。


​    
6.2.2、稀疏矩阵存储的链式存储结构:十字链表 
```
 优点:它能够灵活地插入因运算而产生的新的非零元素,
      删除因运算而产生的新的零元素,实现矩阵的各种运算。

 a.在十字链表中,矩阵的每一个非零元素用一个结点表示,给结点除了(row,col,value)以外,
   还要有两个域:
       * right:用于链接同一行中的下一个非零元素
       * down:用以链接同一列中的下一个非零元素
```
  ![image](image/image-20200514160020.png) 

     有几行就有几个头指针,有几列就有几个列头指针
  ![image](image/image-20200514160858.png) 

     这些M.rhead和M.chead头指针 都指向第一个非零元素
  ![image](image/image-20200514161317.png) 


6.3、广义表
   * 广义表
     
     
       a.广义表通常记作: LS=(a1, a2, ...,an);
          其中:LS为表名,n为表的长度,每一个ai为表达的元素。
       * 习惯上,一般用大写字母表示是广义表,小写字母表示原子。
       
       b.表头:若LS非空(n>=1),则其第一个元素a1就是表头。
               记作head(Ls)=a1。 注:表头可以是原子,也可以是字表。
       c.表尾:除表头之外的其它元素组成的表。
             记作 tail(LS) = (a2,....,an)。
            注:表尾不是最后一个元素,而是一个子表。            

  ![image](image/image-20200514164954.png) 

   * 示例
```    
       
       例子:
       (1) A=()           空表,长度为0
       (2) B=(())         长度为1,表头、表尾均为()。
                           B共享A表
       (3) C=(a,(b,c))    长度为2,由原子a和子表(b,c)构成。
                          表头为a;表尾为((b,c))。
       (4) D=(x,y,z)      长度为3,每一项都是原子。
                                 表头为x;表尾为(y,z)。
       (5) E=(C,D)        长度为2,每一项都是字表。
                                 表头为C;表尾为(D)。
                                 有共同的定义 就叫做共享广义表 
       (6) F=(a,F)        长度为2,第一项为原子,第二项为它本身
                                表头为a;表尾为(F)。
                              F=(a,(a,(a,(....))))  递归或者嵌套的广义表 
```
   ![image](image/image-20200514165923.png)   

   * 广义表的性质
```
 (1)、广义表中的数据元素由相对次序;一个直接前驱和一个直接后继
      (2)、广义表的长度定义为最外层锁包含元素的个数;
            如: C=(a,(b,c)) 是长度为2的广义表。
      (3)、广义表的深度定义为该广义表展开后所含括号的重数;
            A=(b,c)的深度为1,B=(A,d)的深度为2,C=(f,B,h)的深度为3。
            注意: "原子"的深度为0; "空表"的深度为1。
      (4)、广义表可以为其他广义表共享;如:广义表B就共享表A。
       在B中不必列出A的值,而是通过名称来引用,B=(A)            
       
      (5)、广义表可以是一个递归的表。如:  F=(a,(a,(a,(....))))
            注意:递归表的深度是无穷值,长度是有限值
      
      (6)、广义表是多层次结构,广义表的元素可以是单元素,也可以是子表,
            而字表的元素还可以是子表
             可以用图形象地表示
             例如:D=(E,F) 其中:E=(a,(b,)) F=(d,(e))
```

  ![image](image/image-20200514170951.png) 


   * 广义表与线性表的区别?   
``` 
  广义表可以看成是线性表的推广,线性表示广义表的特例。
    广义表的结构相当灵活,在某种前提下,它可以兼容线性表、数组、树和有向图等
   各种常用的数据结构。
    当二维数组的每行(或每列)作为字表处理时,二维数组即为一个广义表。
    另外,树和有向图也可以用广义表来表示。
    由于广义表不仅集中了线性表、数组、树和有向图等常见数据结构的特点,
   而且可有效地利用存储空间,因此在计算机的许多应用领域都有成功使用广义表的实例。
```

  * 广义表的基本运算
    ![image](image/image-20200514164319.png) 


6.3、案例分析与实现
```
  案例:病毒感染检测
   病毒是环状 
```
![image](image/image-20200514172637.png) 


7、树和二叉树
 ```
  1、树和二叉树的定义
  2、案例引入
  3、树和二叉树的抽象数据类型定义
  4、二叉树的性质和存储结构
  5、遍历二叉树和线性二叉树
  6、树和森林
  7、哈夫曼树及其应用
  8、案例分析与实现 
 ```
 7.1 、树的定义
``` 
 树(Tree)是n(n>=0)个结点的有限集。
    若n=0,称为空树;
    若n>0,则它满足如下两个条件：
      (1)、有且仅有一个特定的称为根(Root)的结点;
      (2)、其余结点可分为m(m>=0)个互不相交的有限集T1,T2,T3,...,Tm,
          其中每一个集合本身又是一颗树,并称为根的子树(SubTree)。
```
![image](image/image-20200514214215.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;树的表示
![image](image/image-20200514213543.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;树的其它表示方式
```
  嵌套集合
  凹入表示(比如树的索引)
  广义表
```
![image](image/image-20200514214325.png) 

 7.2、树的基本术语
 ```
   根结点:非空树中无前驱结点的结点
   结点的度:结点拥有的子树树。 
   结点的度即使它用于子树的个数，又是它后继元素的个数, 又是它分支的个数

   没有子树个数那么它的度就是零。 
 
   树的度:树内各结点的度的最大值
 ```
![image](image/image-20200514215226.png) 

   * 度为零 就称为 "叶子结点" 也称为终端结点
![image](image/image-20200514215736.png)    

   * 结点的子树的根称为该结点的孩子,该结点称为孩子的双亲
 ```
  如果一些结点有共同的双亲那么 就称为兄弟结点
  
  结点的祖先:从根到该结点所经分支的所有结点。
  结点的子孙:以某结点为根的子树中的任一结点。
 ```
  ![image](image/image-20200514215938.png)  

   * 结点的层数表示
      ![image](image/image-20200514220610.png)  

   ![image](image/image-20200514220927.png)


   * 树的深度: 树中结点的最大层次, 树的深度有时候称为树的高度
      图中树的高度为4
      ![image](image/image-20200514221235.png)


``` 
   有序树:树中结点的各子树从左至有有次序(最左边的为第一个孩子)。
   无序树:树中结点的各子树无次序。
   森林:是m(m>=0)棵互不相交的树的集合。
         把根结点删除树就变成了森林。
         一棵树可以看成是一个特殊的森林。
         给森林中的各子树加上一个双亲结点,森林就变成了树。
```
![image](image/image-20200514221922.png)


&nbsp;&nbsp;&nbsp;&nbsp;(1)、树结构和线性结构的比较
``` 
 线性结构                        树结构
第一个数据元素   无前驱           根结点(只有一个) 无双亲
最后一个数据元素  无后继           叶子结点(可以有多个) 无孩子
其它数据元素                     其它结点--中间结点
   一个前驱,一个后继             一个双亲,多个孩子
   一对一                        一对多
```
![image](image/image-20200514222454.png)


 7.3 、二叉树的定义
   * 为何要重点研究每结点最多只有两个 "叉"的树? 
```  
   二叉树的结构最简单,规律性最强;
   可以证明,所以树都能转为唯一对应的二叉树,不失一般性。
  
   普通树(多叉树)若不转化为二叉树,则运算很难实现
         二叉树在树结构的应用中起着非常重要的作用,因为对二叉的许多操作算法简单，
          而任何树都可以与二叉树相互转换,这样就解决了树的存储结构及其运算中存在的复杂性。
```
![image](image/image-20200514223620.png)

&nbsp;&nbsp;&nbsp;&nbsp;(1)、二叉树的定义
```
   二叉树是n(n>=0)个结点的有限集,它或者是空集(n=0),或者由一个根结点及两颗互不相交的分别称作
这个根的左子树和右子树的二叉树组成。
  
   特点：
     1、每个结点最多两个孩子(二叉树中不存在度大于2的结点)。
     2、子树有左右之分,其次序不能颠倒。
     3、二叉树可以是空集合,根可以有空的左子树或空的右子树。

```
  * 注意：二叉树不是树的特殊情况,它们是两个概念。
```
 二叉树结点的子树要区分左子树和右子树,即使只有一颗子树也进行区分,说明它是左子树,还是右子树。
   树当结点只有一个孩子时,就无须区分它是左还是右的次序。因此二者是不同的。这时二叉树与树的最主要的差别。
 
  (也就是二叉树每个结点位置或者说次序都是固定的,可以是空,但是不可以说它没有位置,
  而树的结点位置是相对于别的结点来说的,没有别的结点时,它就无所谓左右了)
```
![image](image/image-20200514224537.png)

  * 思考
   
     具有3个结点的二叉树可能有几种不同形态?普通树呢?
      二叉树有五种形态

   树有两种形态: 树的结点是不分左右的，而二叉树不一样
   ![image](image/image-20200514225023.png)   

   * 二叉树的五种基本形态
``` 
 1、一个结点都没有: 空二叉树
 2、只有一个根结点和空的左右子树
 3、根和左子树
 4、根和右子树
 5、根和左右子树
```
  ![image](image/image-20200514225503.png)   


&nbsp;&nbsp;&nbsp;&nbsp;(2)、案例引入:数据压缩问题
```
 将数据文件转换成由0、1组成的二进制串,称之为编码。
```
 ![image](image/image-20200514225816.png)    


&nbsp;&nbsp;&nbsp;&nbsp;(3)、利用二叉树求解表达式的值   
 ![image](image/image-20200514230057.png)    

7.4 、树和二叉树的抽象数据类型定义
```
 ADT BinaryTree{
   数据对象D: D是具有相同特征的数据元素的集合。
   数据关系R: 若D=Ø,则R=Ø;
             若D不等于Ø,则R={H};H是如下二元关系:
               a、root唯一  //关于根的说明
               b、Dj ∩ Dk =Ø  // 关于子树不相交的说明
               c、.....       // 关于数据元素的说明  
               d、.....       // 关于左子树和右子树的说明        
   基本操作P:
 }ADT BinaryTree
```
![image](image/iamge-20200514230914.png)  


&nbsp;&nbsp;&nbsp;&nbsp;(1)、二叉树的相关操作
```
CreateBiTree(&T,definiton)
  初始条件: definiton给初始二叉树T的定义。
  操作结果: 按definiton构造二叉树T。

PreOrderTraverse(T)
  初始条件: 二叉树T存在。
  操作结果: 先序遍历T,对每个结点访问一次。 

InOrderTraverse(T)
  初始条件: 二叉树T存在。
  操作结果: 中序遍历T,对每个结点访问一次。 

PostOrderTraverse(T)
  初始条件: 二叉树T存在。
  操作结果: 后序遍历T,对每个结点访问一次。 
```
![image](image/image-20200515084445.png)  

7.5 、二叉树的性质和存储结构
  * 性质1: 在二叉树的第i层上至多有2<sup>(i-1)</sup>个结点(i>=1) 
   
  * 提问:第i层上至少有_个结点? 答:至少有一个结点。

   * 证:采用归纳法证明此性质。
   * 归纳基:当i=1时,只有一个根结点,2<sup>(i-1)</sup>=2<sup>0</sup>=1,命题成立。
  
   * 归纳假设:设对所有的j(1<=j<i),命题成立,即第j层上至多有2^(j-1)个结点。
      那么可以证明j=i时命题成立。
   
   * 归纳证明:由归纳假设可知,第i-1层上至多有2<sup>(i-2)</sup>个结点。由于二叉树每个结点的度最大为2，
        故在第i层上最大结点数为第i-1层上最大结点数的2倍,即2*2<sup>(i-2)</sup>=2<sup>(i-1)</sup>。

 ![image](image/image-20200515085110.png)  
 ![image](image/image-20200515085227.png)  

  * 性质2: 深度为k的二叉树至多有2<sup>k</sup> - 1个结点(k>=1)
   
    提问:深度为k时至少有_个结点? 答:至少k个结点。  
```
    证:由性质1可知,深度为k的二叉树的最大结点数为:
     
```
![image](image/image-20200515092120.png)  

 * 性质3: 对任何一棵二叉树T,如果其叶子数为n<sub>0</sub>,度为2的结点数为n<sub>2</sub>,则n<sub>0</sub>=n<sub>2</sub>+1。

```
  1、第一种计算方式: 从下往上看
    B = n-1 
 总边数为B, 如果结点数是n, 那么总边数是B=n-1 , 这里减去1 是表示
所以的结点都和它的双亲 有一个边,除了根结点没有双亲,所以没有边。 因此这里减去1.
  2、第二种方法:从上往下看
     B = n2 * 2 + n1 * 1

    n2表示度为2的结点数, n1表示度为1的结点数。如果度为0那么就不计算
    所以 这里的总边数B = 度为2的结点数 + 度为1的结点数

  3、因为上面两个都等于总边数所以
      B=n-1 = n2 * 2+n1 * 1 --->  n=n2 * 2+n1 * 1+1 
      又因为n = n2+n1+n0 
      所以 n2+n1+n0 = n2 * 2+n1 * 1+1 =====> 
      所以n0 = n2 + 1
   这样就证明了上面性质3的公式  
```
![image](image/image-20200515100202.png)  
![image](image/image-20200515100943.png)  


7.5.1 、两种特殊的二叉树

   &nbsp;&nbsp;&nbsp;&nbsp; 1 、满二叉树: 一颗深度为k且有2^k-1个结点的二叉树称为满二叉树
 ```
  特点
     1、每一层的结点数都是最大结点数,(即每层都是满)
     2、叶子结点全部在最低层。
  对满二叉树结点位置进行编号
   a. 编号规则:从根结点开始,自上而下,自左而右。
   b.每一结点位置都有元素
  
 ```
![image](image/image-20200515102221.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;思考: 下面图中的二叉树数满二叉树吗?
```
满二叉树在同样深度的二叉树中结点个数最多
满二叉树在同一深度的二叉树中叶子结点个数最多
```
![image](image/image-20200515102343.png) 


 &nbsp;&nbsp;&nbsp;&nbsp;2、完全二叉树: 深度为k的具有n个结点的二叉树,当且仅当其每一个结点都与深度为k的满二叉树中编号为
  1~n的结点 一一对应时,称之为完全二叉树。
```
  完全二叉树和满二叉树 编号一一对应, 也就是每一层的编号一一对应，
   如果每一层编号不对应那么就不是完全二叉树,  
```
![image](image/image-20200515102832.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;3、注意 在满二叉树中,从最后一个结点开始,连续去掉任意个结点,即是一颗完全二叉树。
    $\color{red}{一定是连续的去掉!!!}$

```
 特点: 
      1、叶子只可能分布在层次最大的两层上。
      2、对任一结点,如果其右子数的最大层次为i,则其左子树的最大层次必为i或i+1
      
      是完全二叉树,左右字数高度差必须为1。如果不是1那么就不是完全二叉树
```
![image](image/image-20200515103818.png)  

![image](image/image-20200515104353.png)  


7.5.2 、完全二叉树的性质

  * 性质4: 具有n个结点的完全二叉树的深度为[ log <sup>2</sup> n]
``` 
  注: [x]:称作x的底, 表示不大于x的最大整数
```
![image](image/iamge-20200515104714.png)  

   * 证明:假设具有n个结点的完全二叉树的深度为k,则根据性质2及完全二叉树的定义得到:
          2 <sup>(k-1)</sup> -1 < n <= 2 <sup>k</sup> -1
          或 2 <sup>(k-1)</sup> <= n < 2 <sup>k</sup>
        取对数得 k-1 <= log <sup>2</sup> < k
        因为k是整数,所以有: k= [log <sup>2</sup>n] + 1
   
   * 性质4表明了完全二叉树结点数n与完全二叉树深度k之间的关系

![image](image/image-20200515110227.png)  


 * 性质5: 如果对一颗有n个结点的完全二叉树(深度为[ log <sup>2</sup> n]+1)的结点按层序编号
    (从第1层到第[ log <sup>2</sup> n]+1 层,每层从左到右),则对任一结点i(1<=i<=n),有:
  
  * (1).如果i=1,则结点i是二叉树的根,无双亲;如果i>1,则其双亲是结点[i/2] 
  
  * (2).如果2i>n,则结点i为叶子结点,其左孩子是结点2i。
  
  * (3).如果2i+1>n,则结点i无右孩子;否则,其右孩子是结点2i+1。  

 ![image](image/image-20200515110552.png)  

![image](image/image-20200515111528.png)


7.5.3 、二叉树的顺序存储结构
   * 二叉树的顺序存储
``` 
   实现:按满二叉树的结点层次编号,依次存放二叉树中的数据元素。
```
![image](image/image-20200515112227.png)  

  * 二叉树顺序存储的表示
``` 
  # define MAXTSIZE 100
  Typedef TElemType SqBiTree[MAXTSIZE] 
   //这里类型的名字就是数组的名字
  SqBiTree bt;
```
 * 如果使用顺序存储 那么在一颗数不是满二叉树时,
    如果在顺序存储时不将空结点用0表示 那么在顺序存储还原成二叉树时就和原来的树不一样了
![image](image/image-20200515113148.png)  

  * 二叉树顺序存储的缺点
    
    最坏情况:深度为k的且只有k个结点的单支树需要长度为2<sup>k</sup> -1的一维数组。
    浪费很多空间  
 ![image](image/image-20200515141349.png)  

7.5.4 、二叉树的链式存储结构
  * 二叉树的链式存储: 结点三个成员, 每个元素由两个后继指针,一个指向左子树,一个指向右子树
![image](image/image-20200515141849.png)  
  
  * 二叉树链式存储结构的定义
 ``` 
   typedef struct BiNode{ 
   TElemType data; //方数据元素
   struct BiNode *lchild, *rchild; //左右孩子指针 
}BiNode,*BiTree; //BiNode 表示普通结点类型, 这种类型是指向这个结点类型 *BiTree  
 ```
  * 声明一个头结点指向根结点, 如果结点的左子树或右子数不存在 那么就表示为空
![image](image/image-20200515143200.png)  

  * 练习
``` 
 a、在n个结点的二叉链表中,有n+1个空指针域
   分析: 必有2n个链域。除根结点外,每个结点有且仅有一个双亲,所以只会有
     n-1个结点的链域存放指针,指向非空子女结点
   空指针数目=2n -(n-1) = n+1 
    其中2n表示: 如果存在n个结点 那么就有2n个链域 也就是边, 因为每个结点有两条边
    其中n-1表示: 每个结点至多有一个双亲, 又因为根结点没有双亲
      所以n个结点 就有n-1个双亲链。
    最后 n个结点有2n个链域 减去 (n-1) 双亲链, 那么剩下的就表示存在的空指针数目。
```

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、三叉链表

``` 
   typedef struct TriNode{ 
    TelemType data; //方数据元素
    struct TriNode *lchild, *parent,*rchild; //左右孩子指针,和一个双亲指针
}TriNode,*TriTree;   
```
![image](image/image-20200515150744.png)  

7.5.5 、遍历二叉树和线索二叉树

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、遍历定义---顺着某一条搜索路径巡防二叉树中的结点,使得每个结点均被访问一次,
    而且仅被访问一次(又称周游)。
```
   a、"访问"的含义很广,可以是对结点做各种处理,如:输出结点的信息、修改结点的数据值等,
      但要求这种访问不破坏原来的数据结构
```
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、遍历目的---得到树中所有结点的一个线性排列。

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、遍历用途---它是树结构插入、删除、修改、查找和排序运算的前提，
      是二叉树一切运算的基础和核心。  
  ![image](image/image-20200515151724.png) 


  &nbsp;&nbsp;&nbsp;&nbsp;(4)、遍历二叉树算法描述
    
  * 遍历方法 
```
  假设: L:遍历左子树  D:访问根结点  R:遍历右子树
 一共六种,但是我们重点研究 先序遍历(DLR)、中序遍历(LDR)、后序遍历(LRD)。
```

  * 若规定先左后右,则只有前三种情况:
``` 
   DLR---先(根)序遍历 -- 先访问根--在访问左子树---再访问右子树
   LDR---中(根)序遍历 -- 先访问左--在访问根结点---再访问右子树
   LRD---后(根)序遍历 -- 先访问左--在访问右子树---再访问根结点
```
![image](image/image-20200515153053.png) 

  * 三种遍历方式
    ![image](image/image-20200515153258.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(5) 先序遍历
``` 
  若二叉树为空,则空操作;否则
   (1) 访问根结点;
   (2) 先序遍历左子树;
   (3) 先序遍历右子树
 总结: 先访问根结点, 然后访问左子树, 最后再访问右子树
```
![image](image/image-20200515155548.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(6) 中序遍历
``` 
    若二叉树为空,则空操作;否则
     (1) 中序遍历左子树;
     (2) 访问根结点;
     (3) 中序遍历右子树
    总结: 先访问左子树, 然后访问根结点, 最后再访问右子树
```
  ![image](image/image-20200515155706.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(7) 后序遍历
 ``` 
    若二叉树为空,则空操作;否则
     (1) 后序遍历左子树;
     (2) 后序遍历右子树
     (3) 访问根结点;
    总结: 先访问左子树, 然后访问右子树, 最后再访问根结点
 ```
  ![image](image/image-20200515160017.png)
     
     
  &nbsp;&nbsp;&nbsp;&nbsp;(8)、例题----用二叉树表示算术表达式
``` 
    遍历结果:
     先序: - + a×b - cd/ef  (运算符在前的表示为   前缀表达式)
     中序: a + b×c -d - e/f (运算符在中间的表示为 中缀表达式)
     后序: abcd - × +  ef/- (运算符在后面的表示为 后缀表达式)
     
```
  ![image](image/image-20200515160439.png)   


  &nbsp;&nbsp;&nbsp;&nbsp;(9)、根据遍历序列确定二叉树
``` 
 a、若二叉树中各结点的值均不相同,则二叉树结点的先序序列、中序序列和后序序列都是唯一的。
 b、由二叉树的先序序列和中序序列,或由二叉树的后序序列和中序序列可以确定唯一一棵二叉树。
```

  * 例题---已知先序和中序序列求和二叉树
```
  例: 已知二叉树的先序和中序序列,构造出相应的二叉树
      先序: A B C D E F G H I J
      中序: C D B F E A I H G J
  分析: 由先序序列确定根; 由中序序列确定左右子树。 

  
```
    解: 
    1、由先序知根为A,则由中序知左子树为CDBFE, 右子树为IHGJ
    2、再分别在左、右子树的序列中找出根、左子树序列、右子树序列。

 ![image](image/image-20200515164040.png)  

    3、以此类推,直到得到二叉树
 ![image](image/image-20200515164434.png)  

   * 例题---已知中序和后序序列求和二叉树
 ![image](image/image-20200515164626.png)    


7.5.6 、遍历的算法实现

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、先序遍历
 ![image](image/image-20200515170000.png)    

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、先序遍历算法
``` 
Status PreOderTraverse(BiTree T){
 if(T==NULL){ return OK; //空二叉树}
 else{
   visit(T); //访问根结点
   PreOderTraverse(T->lchild); //递归遍历左子树;
   PreOderTraverse(T->rchild); //递归遍历右子树;
 }
}
```
 ![image](image/image-20200515172445.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、递归遍历过程
 ![image](image/image-20200515172613.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(4)、中序遍历
 ![image](image/image-20200515224112.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、中序遍历算法
``` 
 Status InOderTraverse(BiTree T){
  if(T==NULL){ return OK; //空二叉树}
  else{
    InOderTraverse(T->lchild); //递归遍历左子树;
    visit(T); //访问根结点
    InOderTraverse(T->rchild); //递归遍历右子树;
  }
 }
```


 &nbsp;&nbsp;&nbsp;&nbsp;(6)、后序遍历
![image](image/image-20200515224320.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、后序遍历算法
 ``` 
  Status PostOderTraverse(BiTree T){
   if(T==NULL){ return OK; //空二叉树}
   else{
     PostOderTraverse(T->lchild); //递归遍历左子树;
     PostOderTraverse(T->rchild); //递归遍历右子树;
     visit(T); //访问根结点
   }
  }
 ```


 &nbsp;&nbsp;&nbsp;&nbsp;(8)、遍历算法的分析
 ```
   先序遍历、中序遍历、后序遍历 这三中遍历算法 其实都是相同的,只是执行的时机不同。
   如果不看根结点的打印,那么就一样的。
   
   
 ```
 ![image](image/image-20200515224507.png) 

```
   如果去掉输出语句,从递归的角度看,三种算法是完全相同的，或者说这三种算法
   访问的路径是相同的,只是访问的时机不同。
   时机效率: O(n) //每个结点只访问一次
   空间效率: O(n) // 栈占用的最大辅助空间
```
 ![image](image/image-20200515224837.png) 


7.5.7 、遍历二叉树的非递归算法

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、中序遍历非递归算法
``` 
  二叉树中序遍历的非递归算法的关键:在中序遍历过某结点的整个左子树后,
   如何找到该结点的根以及右子树。
  基本思想:
    a.建立一个栈。
    b.根结点进栈,遍历左子树
    c.根结点出栈,输出根结点,遍历右子树。 
```
&nbsp;&nbsp;&nbsp;&nbsp;(2)、算法实现
``` 
  Status InOderTraverse(BiTree T){
   BiTree p; InitStack(S); p=T;
    // 当p为空, 或者栈不为空
   while(p || !StackEmpty(S)){
    if(p){ Push(S,p); p=p->lchild;}
    else{ Pop(S,q); printf("%c", q->data);
         p = q->rchild;
    }
  }// while
  return OK;
}
```
![image](image/image-20200516151801.png) 
    

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、二叉树的层次遍历
 ```
   对于一颗二叉树,从根结点开始,按照从上到下,从左到右的顺序访问每一个结点。 
   每一个结点仅仅访问一次。
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(4)、层次遍历的算法思路
  ```
    a.将根结点进队;
    b.对不为空时循环，从队列中出列一个结点*p,访问它;
        (1) 若它有左孩子结点,将左孩子结点进队;
        (2) 若它有右孩子结点,将右孩子结点进队。

    总结: 就是从根结点开始 入队, 然后队列不为空那么就输出队列中对队头元素。
        如果它有左右孩子,那么就将这左右孩子结点入队，同样再循环判断是否为空。
        若不为空则将队头元素出队, 并且查找这个结点是否有左右孩子依次去处理.......
  ```
  &nbsp;&nbsp;&nbsp;&nbsp;(5)、层次遍历的算法使用队列类型定义如下
``` 
   typedef struct{ 
    BTNode data[MaxSize]; //存放队列中元素
    int front, rear;  //队头和队尾指针
}SqQueue;  //顺序循环队列类型   
```

  &nbsp;&nbsp;&nbsp;&nbsp;(6)、层次遍历的算法实现
``` 
  Status LevelOder(BTNode *b){
   BTNode *p; SqQueue *qu;
   InitQueue(qu); //初始化队列
   enQueue(qu, b); //根结点指针进入队列
   while(!QueueEmpty(qu)){ //队列不为空,则循环
    deQueue(qu, p); //出队结点p
    print("%c", p->data); //访问结点p
    if(p->lchild!=NULL) enQueue(qu, p->lchild); //有左孩子时将其进队
    
    if(p->rchild!=NULL) enQueue(qu, p->rchild); //有右孩子时将其进队
  }
}
```
![image](image/image-20200516154139.png) 


7.5.8 、二叉树遍历算法的应用---二叉树的建立

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、按先序遍历序列建立二叉树的二叉链表
```
  例如: 已知先序序列为: ABCDEGF
  a、从键盘输入二叉树的结点信息,建立二叉树的存储结构;
  b、在建立二叉树的过程中按照二叉树先序方式建立 
```
 ![image](image/image-20200516161209.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、复制二叉树
```
  如果是空树,递归结束;
  否则,申请新结点空间,复制根结点
    *递归复制左子树
    *递归复制右子树
```
  &nbsp;&nbsp;&nbsp;&nbsp;(3)、算法实现
``` 
  int Copy(BiTree T, BiTree &NewT){
    if(T==NULL){//如果是空树返回0
     NewT=NULL; return 0;
    }else{
      //NewT-> 指针生成,就是在生成这个新结点的地址 就复制给了NewT了
      NewT=new BiNode; NewT->data=T->data;
      Copy(T->lChild, NewT->lchild);
      Copy(T->rChild, NewT->rchild);
   }
}
```
 ![image](image/image-20200516163525.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、计算二叉树深度  
 ```
   如果是空树,则深度为0;
   否则,递归计算左子树的深度记为m,递归计算右子树的深度记为n, 二叉树的深度则为m与n的较大者加1。
 ```
  * 算法实现
``` 
int Depth(BiTree T){
 if(T==NULL) return 0; //如果是空树返回0
 else{
   m = Depth(T->lChild);
   n = Depth(T->rChild);
   if(m>n) return (m+1);
   else return (n+1);
 }
}
```
![image](image/image-20200516164615.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(5)、计算二叉树结点总数   
```
   如果是空树,则结点个数为0;
   否则,结点个数为左子树的结点个数+右子树的结点个数再+1。  
    再加一表示 加上根结点
```
  * 算法实现
``` 
int NodeCode(BiTree T){
 if(T==NULL) return 0; //如果是空树返回0
 else{
   return NodeCode(T->lChild)+ NodeCode(T->rChild) + 1;
 }
}
```
![image](image/image-20200516165243.png) 


  &nbsp;&nbsp;&nbsp;&nbsp;(6)、计算二叉树叶子结点数
```
   如果是空树,则叶子结点个数为0;
   否则,为左子树的叶子结点个数 + 右子树的叶子结点个数。  
```
  * 算法实现   
``` 
int leadCode(BiTree T){
 // 判断树是否为空
 if(T==NULL) return 0; //如果是空树返回0
   //如果不为空, 则判断结点的 左右子树, 如果都为空 那么就说明 既没有左子树,也没有右子树
   // 那么就是叶子结点 , 就返回一个结点。
   // 如果 有一个不为空 ,那么说明不是叶子结点。所以进入下面else判断
  if(T->lChild == NULL && T->rChild==NULL){
   return 1; //如果是叶子结点返回1,  什么是叶子结点呢？就是左子树和右子树都为空 才是叶子结点
  }else{
      return leadCode(T->lChild)+ leadCode(T->rChild);
   }
 
}
```
![image](image/image-20200516172625.png) 


7.5.9 、线索二叉树
 * 问题:为什么要研究线索二叉树？
``` 
 当用二叉链表作为二叉树的存储结构时,可以很方便地找到某个结点的左右孩子;
但一般情况下,无法直接找到该结点在某种遍历序列中的前驱和后继结点。
```
&nbsp;&nbsp;&nbsp;&nbsp;(1) 提出的问题: 如何寻找特定遍历序列中二叉树结点的前驱和后继??
``` 
  解决的方法:
   1、通过遍历寻找-----浪费时间
   2、再增设前驱、后继指针域----增加了存储负担。
   3、利用二叉链表中的空指针域。
```
 * 回顾: 二叉树链表中空指针域的数量:
``` 
  具有n个结点的二叉链表中,一共有2n个指针域; 因为n个结点中有n-1个孩子,即2n个指针域中,
 有n-1个用来指示结点的左右孩子,其余n+1个指针域为空。
```
![image](image/image-20200516183122.png) 

&nbsp;&nbsp;&nbsp;&nbsp; (2)、利用二叉链表中的空指针域:
 ``` 
   如果某个结点的左孩子为空,则将空的左孩子指针域改为 "指向其前驱";
 如果某个结点的右孩子为空,则将空的右孩子指针域改为 "指向其后继"
  --------这种改变指向的指针称为"线索"
   加上了线索的二叉树称为 线索二叉树(Threaded Binary Tree)
  对二叉树按某种遍历次序使其变为线索二叉树的过程叫 线索化
 ```

&nbsp;&nbsp;&nbsp;&nbsp; (3) 增设标志域
  ``` 
   为区分lrchild 和 rchild指针到底是指向孩子的指针,孩子指向前驱或者后继的指针,
  对二叉链表中每个结点增设两个标志域 ltag和rtag, 并约定：
   ltag = 0 ; lchild指向该结点的左孩子
   ltag = 1 ; lchild指向该结点的前驱
   rtag = 0 ; rchild指向该结点的右孩子
   rtag = 1 ; rchild指向该结点的后继 
  ```
  * 这样,结点的结构
``` 
   typedef struct BiThrNode{
    int data; 
    int ltag, rtag; 
    struct BiThrNode *lchild, rchild;
}BiThrNode, *BiThrTree;
```
![image](image/image-20200516224520.png) 

  * 练习
```
  为了避免悬空状态,增设一个头结点
  ltag=0, lchild 指向根结点，
  rtag=1, rchild 指向遍历序列中最后一个结点，遍历序列中第一个结点的lc域和最后一个结点的rc域都指向头结点
```
 ![image](image/image-20200516224602.png)  

 ![image](image/image-20200516224841.png)  

 

7.6 、树和森林

  * 树和森林
```
 树是n(n>=0)个结点的有限集。若n=0,称为空树;
    若n>0  (1) 有且仅有一个特定的称为根(Root)的结点;
           (2) 其余结点可分为 m(m>=0)个互不相交的有限集T1,T2,T3,....,Tm

 森林: 是m(m>=0)颗互不相交的树的集合。
```
 ![image](image/image-20200517075955.png)  

  * 双亲表示法
 ```
  实现:定义结构数组, 存放树的结点,每个结点含有两个域:
      * 数据域:存放结点本身信息。
      * 双亲域: 指示本结点的双亲结点在数组中的位置。
   
  查找方式就是通过数组下标和 双亲域来判断,如果下标等于双亲域 则表示结点的双亲域是对应的下标值
  数组下标、以及数据域、和双亲域
  r=0表示根结点 存储在数组下标为0的位置
  n=10 表示结点个数
  
  该方法的特点:找双亲容易,找孩子难
 ```
 ![image](image/image-20200517080500.png)  

  * C 语言的类型描述:
``` 
   typedef struct PThrNode{
    TElemType data; 
    int parent; //双亲位置域
}PThrNode;
```
  * 树结构
``` 
#define MAX_TREE_SIZE 100
   typedef struct {
    PThrNode nodes[MAX_TREE_SIZE]; 
    int r,n; //根结点的位置和结点个数
}PTree;
```
 ![image](image/image-20200517081207.png) 


7.6.1 、树的存储结构---孩子链表
```
把每个结点的孩子结点排列起来,看成是一个线性表,用单链表存则n个结点有n个孩子链表(叶子的孩子链表为空表)。
 而n个头指针又组成一个线性表,用顺序表(含n个元素的结构数组)存储。
 
 指针域指向它的第一个孩子 firstchild
```
 ![image](image/image-20200517082947.png) 

  * C 语言的类型描述:
 ``` 
    //孩子结点
    typedef struct CTNode{
     int child; 
     struct CTNode *next; 
 }*ChildPtr;
 ```
   * 双亲结点结构
 ``` 
    typedef struct {
     TElemType data; 
     ChildPtr firstchild; //孩子链表头指针
 }CTBox;
 ```

  * 树结构
   ``` 
      typedef struct {
       CTBox nodes[MAX_TREE_SIZE]; 
       int n,r; //结点数和根结点的位置, 为了存储方便 存储两个整数 
         //一个是结点的个数,一个是根结点的下标
   }CTree;
   ```
![image](image/image-20200517084128.png) 


``` 
 在结构数组中再添加了一个成员,这个成员就是表示双亲结点的下标,这样查找方便些, 但是这种做法也是牺牲了空间
```
 ![image](image/image-20200517084714.png) 


7.6.2、树的存储结构---孩子兄弟表示法(二叉树表示法,二叉链表表示法)
  * 实现
 ```
   用二叉链表作树的存储结构,链表中每个结点的两个指针域分别指向其中第一个孩子结点
     和下一个兄弟结点
 ```
   * C 语言的类型描述
 ``` 
   typedef struct CSNode {
    ElemType data; 
    struct CSNode *firstchild, *nextsibling;   
   }CSNode,*CSTree;
 ```
 ![image](image/image-20200517085400.png) 

  * 孩子兄弟表示法
```
 如果 第一个孩子结点没有 那么就用空表示， 
 若结点的兄弟结点没有 也用空表示。
```
  ![image](image/image-20200517085645.png) 


7.6.3、树和森林---树与二叉树的转换

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、树与二叉树的转换
```
 * 将树转化为二叉树进行处理,利用二叉树的算法来实现对树的操作。
 * 由于树和二叉树都可以用二叉树链表作存储结构,则以二叉链表作媒介可以导出树与二叉树之间的一个对应关系。
```
 ![image](image/image-20200518093250.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、将树转换成二叉树
```
 a.加线: 在兄弟之间加一连线
 b.抹线: 对每个结点,除了其左孩子外, 去除其余其余孩子之间的关系
 c.旋转: 以树的根结点为轴心,将整树顺时针转45°

   树变二叉树:兄弟相连留长子
```
 ![image](image/image-20200518094035.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(3)、将二叉树转换成树
```
 a.加线: 若p结点时双亲结点的左孩子,则将p的右边孩子,右孩子的右孩子......沿
     分支找到的所有右孩子,都与p的双亲用线连起来
 b.抹线: 抹掉原二叉树中双亲与右孩子之间的连线
 c.调整: 将结点按层次排列,形成树结构

   二叉树变树:
          左孩右右连双亲,
          去掉原来右孩线。
```
 ![image](image/image-20200518094615.png)

7.6.4、森林与二叉树的转换 

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、森林转换成二叉树(二叉树与多棵树之间的关系)
``` 
 1、将各棵树分别转换成二叉树
 2、将每棵树的根结点用线相连
 3、以第一棵树根结点为二叉树的根,再以根结点为轴心,顺时针旋转,构成二叉树型结构

   森林变二叉树:
    树变二叉根相连。 
```
![image](image/image-20200518100338.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(2)、二叉树转换成森林
 ```
  
  a.抹线: 将二叉树中根结点与其右孩子连线,及沿右分支搜索到的所有右孩子间连线全部抹掉，
     使之变成孤立的二叉树。
  b.还原: 将孤立的二叉树还原成树。
 
    二叉树转换成森林:
     去掉全部右孩子,孤立二叉再还原。
 ```
![image](image/image-20200518101116.png)


7.6.5、树和森林的遍历

  &nbsp;&nbsp;&nbsp;&nbsp;1、树遍历(三种方式)   
``` 
 a、先根(次序)遍历
    若树不空,则先访问根结点,然后依次先根遍历各棵子树。
 b、后根遍历
    若树不空,则先依次后根遍历各棵子树,然后访问根结点。
 c、层次遍历
    若树不空,则自上而下自左至右访问树中每个结点。
 
 树的遍历 没有中序遍历,原因是他的根可以有多个结点(多个子树), 
   我们将那个结点放在中呢? 所以这里不能确定。因此没有中序遍历
```
  ![image](image/image-20200518102750.png)

 &nbsp;&nbsp;&nbsp;&nbsp;2、森林的遍历
  ``` 
    将森林看作由三部分构成:
     1、森林中第一棵树的根结点;
     2、森林中第一棵树的子树森林;
     3、森林中其它树构成的森林。
  ```
 ![image](image/image-20200518103134.png)

 &nbsp;&nbsp;&nbsp;&nbsp;3、森林的遍历方式
  * 先序遍历:
``` 
    若森林不空,则
  a.访问森林中第一棵树的根结点;
  b.先序遍历森林中第一棵的子树森林;
  c.先序遍历森林(除第一棵树之外) 其余树构成的森林。
  
  即:依次从左至右对森林中的每一棵树进行先根遍历。
```

  * 先序遍历:
   ``` 
      若森林不空,则
     a.中序遍历森林中第一棵的子树森林;
     b.访问森林中第一棵树的根结点;
     c.中序遍历森林(除第一棵树之外) 其余树构成的森林。
     
     即:依次从左至右对森林中的每一棵树进行后根遍历。
   ```
  * 例:树的遍历
    ![image](image/image-20200518104131.png)

7.7、哈夫曼树及其应用  

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、判断树:用于描述分类过程的二叉树 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、怎样找到一种效率最高的的判别树呢? 
    这个就是哈夫曼树(最优二叉树)需要研究的问题。


 &nbsp;&nbsp;&nbsp;&nbsp;(3)、哈夫曼树的基本概念
```
  路径:从树中一个结点到另一个结点之间的分支构成这两个结点间的路径。
  
  结点的路径长度:两结点间路径上的分支数。  
```


 &nbsp;&nbsp;&nbsp;&nbsp;(4) 树的路径长度: 从树根到每一个结点的路径长度之和。记作:TL
 ![image](image/image-20200518112122.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(5) 权:将树中结点赋给一个有着某种含义的数值,则这个数值称为该结点的权。
 ```
   结点的带权路径长度:从根结点到该结点之间的路径长度与该结点的权与乘积。
  
   树的带权路径长度: 树中所有叶子结点的带权路径长度之和。
 ```
   &nbsp;&nbsp;&nbsp;&nbsp;每个结点的权与每个结点的长度的乘积,然后每个叶子结点权值和叶子结点的长度, 
     然后累加起来的和 就是带权路径的长度。
 ![image](image/image-20200518111504.png)


 * 例题
    ![image](image/image-20200518121618.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(6)、哈夫曼树:最优树 (带权路径长度(WPL)最短的树)
```
 注: "带权路径长度最短" 是在 "度相同"的树中比较而得的结果,
  因此有最优二叉树、最优三叉树之称等等
```
  * 哈夫曼树:最优二叉树 (带权路径长度(WPL)最短的二叉树) 

```
  因为构造这种树的算法是由哈夫曼教授提出的,所以被称为哈夫曼树,
  相应的算法称为哈夫曼算法。

  Tip: 满二叉树不一定是哈夫曼树
      哈夫曼树中权越大的叶子离根越近
      具有相同带权结点的哈夫曼树不惟一
```
 ![image](image/image-20200518122739.png) 
 ![image](image/image-20200518132343.png) 


7.7.2、哈夫曼树及其应用  

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、哈夫曼树的构造算法
 ```
  哈夫曼树中权越大的叶子离根越近
 贪心算法:构造哈夫曼树时首先选择权值小的叶子结点
 ```
![image](image/image-20200518134818.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、哈夫曼算法(构造哈夫曼树的方法)
 ``` 
  (1)、根据n个给定的权值{W1, W2, W3} 构成n棵二叉树的森林F={T1,T2,...,T3},
   其中Ti只有一个带权为Wi的根结点。
   * 构造森林全是根  
 
  (2)、在F中选取两棵根结点的权值最小的树作为左右子树,构造一棵新的二叉树,且设置
   新的二叉树的根结点的权值为其左右子树根结点的权值之和。
   * 选用两小造新树

  (3)、在F中删除这两棵树,同时将新得到的二叉树加入森林中。
    * 删除两小添新人

  (4)、重复(2)和(3), 直到森林中只有一棵树为止,这棵树即为哈夫曼树。
    * 重复(2)和(3) 剩单根。
   
 
 ```
  ![image](image/image-20200518140411.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、 哈夫曼算法口诀
```
      1、构造森林全是根  
      2、选用两小造新树
      3、删除两小添新人
      4、重复(2)和(3) 剩单根
```
  ![image](image/image-20200518140709.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(4)、哈夫曼树的结点个数
``` 
  a、哈夫曼树的结点的度数为0或2,没有度为1的结点.
  b、包含n个叶子结点的哈夫曼树中共有2n-1个结点。
    
   包含n棵树的森林要经过n-1次合并才能形成哈夫曼树,共产生n-1个新结点。
   为什么是n-1次呢? 因为是在最后一次的时候生成哈夫曼树就不再继续 合并了生成新的树。
  
   n个结点,要进行n-1次(两个结点合成一个结点)合并, 每一次合并都产生一个新的结点
  总共有2n-1个结点
```
  ![image](image/image-20200518140816.png) 

  * 例题:有5个结点a,b,c,d,e,权值分别为7,5,5,2,4 构造哈夫曼树。
    ![image](image/image-20200518141519.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、总结
``` 
 1、在哈夫曼算法中,初始时有n棵二叉树,要经过n-1次合并最终形成哈夫曼树。
 2、经过n-1次合并产生n-1个新结点,且这n-1个新结点都是具有两个孩子的分支结点。
   
  可见:哈夫曼树中共有n+n-1 = 2n-1个结点,且其所有的分支结点的度均不为1 
```

7.7.3、哈夫曼树构造算法的实现

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、存储结构----采用顺序存储结构 一维结构数组
``` 
 结构类型定义
 typedef struct{
   int weight;
   int parent, lch, rch;
 }HTNode, *HuffmanTree;

  哈夫曼树中共有2n-1个结点不使用0下标,数组大小为2n
```

 ![image](image/image-20200518142925.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、例题
``` 
 有n=8,权值为W={7,19,2,6,32,3,21,10}构造哈夫曼树
 选择最小的权值 俩构造新的树, 曾两个合并后的权值 添加到n+1个位置。
 图中数组的大小为什么是15, 这是因为需要2n-1结点。
  
 这个例题可以知道 构造算法的思路
```
 ![image](image/image-20200518143933.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、算法的思路
``` 
 a.初始化HT [1......2n-1]:lch=rch=parent=0;
 b.输入初始n个叶子结点:置HT[1......n]的weight值;
 c.进行以下n-1次合并,依次产生n-1个结点HT[i], i=n+1......2n-1:
     1)、在HT[1..i-1]中选两个未被选过(从parent==0的结点中选)的weight最小的两个
    结点HT[s1]和HT[s2], s1、s2为两个最小结点下标;
     2)、修改HT[s1]和HT[s2]的parent值: HT[s1].parent=i; HT[s2].parent=i;
     3)、修改新产生的HT[i]:
        * HT[i].weight = HT[s1].weight + HT[s2].weight;
        * HT[i].lch =s1; HT[i].rch=s2;
```
 ![image](image/image-20200518150255.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(4)、算法的实现
``` 
 void CreatHuffmanTree(HuffmanTree HT,int n){ //构造哈夫曼树---哈夫曼算法
  if(n<=1)return;
  m=2*n-1; //数组共2n-1个元素
  HT = new HTNode[m+1];  //0号单元未用,HT[m]表示根结点
  for(i=1;i<=m;++i){ //将2n-1个元素的lch、rch、parent置为0 
   HT[i].lch=0; HT[i].rch=0; HT[i].parent=0;
 }
 
 for(i=1;i<=n;++i){ cin>>HT[i].weight; //输入前n个元素的weigth值 
    //初始化结束,下面开始建立哈夫曼树
  }

  for(i=n+1;i<=m;i++){  // 合并产生n-1个结点 ---- 构造Huffman树
   Select(HT,i-1, s1,s2); // 在HT[k](1<=k<i-1)中选择两个其双亲域为0,
                          //且权值最小的结点,并返回它们在HT中的序号s1和s2
     HT[s1].parent=i;  HT[s2].parent=i;  //表示从F中删除s1,s2
     HT[i].lch=s1; HT[i].rch=s2;      // s1,s2分别作为i的左右孩子
     HT[i].weight=HT[s1].weight + HT[s2].weight; // i的权值为左右孩子权值之和
  }
}
```
![image](image/image-20200518145715.png)


7.7.4、哈夫曼编码

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、在远程通讯中,要将待传字符转换成由二进制的字符串：
``` 
 1、 设要传送的字符为:
   若编码为: A---00
             B---01
             C---10
             D--11 
   ABACCDA 编码为:00010010101100  这种方式比较浪费空间, 比如使用ASCII码表示
   每个字符就需要占用8二进制位。 而且存储不仅仅是这种字符还有其他字符

 2、若将编码设计为长度不等的二进制编码,
 即让待传字符串中出现次数较多的字符采用尽可能短点的编码,则转换的二进制字符串便可能减少。
 这种可以节省存储空间,但是会造成重码
 
 关键:要设计长度不等的编码,则必须使任一字符的编码都不是另一个字符的编码的前缀。


```
  ![image](image/image-20200518155100.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(2)、问题:什么样的前缀码能使用电文总长最短?
     ----哈夫曼编码
``` 
 * 方法: 
     1、统计字符集中每个字符在电文中出现的平均概率(概率越大,要求编码越短)。
     2、利用哈夫曼树的特点:权越大的叶子离根越近;将每个字符的概率作为权值,构造哈夫曼树。
    则概率越大的结点,路径越短。
     3、在哈夫曼树的每个分支上标上0或1: 结点的左分支表0,右分支标1
          把从根到每个叶子的路径上的标号连接起来,作为该叶子代表的字符的编码。
         
```
![image](image/image-20200518155631.png)


  &nbsp;&nbsp;&nbsp;&nbsp;(3)、例题: 要传输的字符集 D={C,A,S,T, ;}
        字符出现频率 w={2,4,2,3,3}
```
首先根据频率来作为权值,作为五个叶子结点的权值, 然后来构造哈夫曼树, 构造好了之后再看哈夫曼编码
  
```
![image](image/image-20200518155907.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(4)、两个问题
``` 
 1、问什么哈夫曼编码能够保证是前缀编码?
    因为没有一片树叶是另一片树叶的祖先,所以每个叶结点的编码不可能是其它叶结点
 编码的前缀。
 2、为什么哈夫曼编码能够保证字符编码总长最短?
   因为哈夫曼树的带权路径长度最短,故字符编码的总长最短。
    
   a.性质1  哈夫曼编码的前缀码
   b.性质2  哈夫曼编码的最优前缀码
 
  
```
 ![image](image/image-20200518161152.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(5)、例
``` 
 设组成电文的字符集D及其概率分布W为:
   D={A,B,C,D,E,F,G}
   W={0.40, 0.30, 0.15, 0.05, 0.04, 0.03, 0.03}
设计哈夫曼编码.
   
  在构造好的哈夫曼树后,根据根结点从发 到每一个叶子结点路过的分支上面的0或者1的编码
放在一起 就是哈夫曼编码。
```
![image](image/image-20200518161439.png)

  

7.7.5、哈夫曼编码算法实现

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、使用数组来存放
``` 
  每一个字符都有若干个0, 1这样的字符组成的哈夫曼编码, 当有n个字符时 就需要有n个0,1
组成的字符串。所以需要又n个字符串构成的数组。就是二维的字符数组, HC[i]就是二维的字符数组
的名字构成的一个数组, 也就是指向每一个字符串的头指针 构成的数组。 HC[i]中每一个元素
都是由0,1构成的字符串。

   start      0  1  2  3  4  5  6
  cd[start]                     \0
  从叶子结点不断的回溯在这个过程中 我们会得到若干0或者1,那么我们需要将中间得到的0或者是1
找一个数组存放起来。 这个数组长度n-1就可以了,这里我们把它作为字符串来看，多一个位置
这个位置存放字符串结束标志 \0,  然后循环就从下标为1的开始, 而这个数组到这放在

```
 ![image](image/image-20200518163749.png)

&nbsp;&nbsp;&nbsp;&nbsp;(2)、算法
``` 
 void CreatHuffmanCode(HuffmanTree HT,HuffmanCode &HC,int n){ 
  //从叶子到根逆向求每个字符的哈夫曼编码,存储在编码表HC中
  HC = new char *[n+1];  //分配n个字符编码的头指针矢量
  cd = new char[n];      //分配临时存放编码的动态数组空间
  cd[n-1] = '\0';       //编码结束符
  for(i=1;i<=n;++i){
   start=n-1; c=i; f=HT[i].parent;
   while(f!=0){  //从叶子结点开始向上回溯,直到根结点
      --start;    //回溯一次start向前指一个位置
      if(HT[f].lchild == c) {
        cd[start] = '0';  //结点c是f的左孩子,则生成代码0
      }else{
        cd[start] = '1';   //结点c是f的右孩子,则生成代码1
      }
      c = f; f=HT[f].parent;  // 继续向上回溯
   }                           //求出第i个字符的编码
    HC[i] = new char[n-start];  //为第i个字符串编码分配空间
    strpy(HC[i], &cd[start]);   // 将求得的编码从临时空间cd复制到HC的当前行中
 }
  delete cd;
} // CreatHuffanCode
```
  ![image](image/image-20200518170415.png)

7.7.6、哈夫曼树应用----文件编码和解码

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、编码
```
  a.输入各字符及其取值
  b.构造哈夫曼树---HT[i]
  c.进行哈夫曼编码----HC[i]
  d.查HC[i],得到个字符的哈夫曼编码
```

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、解码
``` 
  a.构造哈夫曼树
  b.依次读入二进制码
  c.读入0,则走向左孩子; 读入1,则走右孩子
  d.一旦到达某叶子时,即可译出字符
  e.然后再次根出发继续译码,指到结束
```
 ![image](image/image-20200518172037.png)
 ![image](image/image-20200518172137.png)


8、图的基本概念和术语
``` 
  集合-----数据元素间除"同属于一个集合" 外无其它关系
  线性结构-----一个对一个,如线性表、栈、队列
  树形结构-----一个对多个,如树
  图形结构-----多个对多个,如图型结构
```

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、图的定义和术语
 ``` 
 图: G=(V,E)    Graph=(Vertex, Edge)
   V:顶点(数据元素)的有穷非空集合
   E:边的有穷集合 

  无向图: 每条边都是无方向的
  有向图: 每条边都是有方向的

 ```
  * 完全图:任意两个点都有一条边相连
    ![image](image/image-20200518173614.png)


  * 稀疏图:有很少边或弧的图(e< [ n log <sub>2</sub>n ])
  
  * 稀密图: 有较多边或弧的图
  * 网: 边/弧带权的图  
  * 邻接:有边/弧相连的两个顶点之间的关系。
``` 
   存在(Vi,Vj), 则称Vi和Vj互为领接点。
   存在(Vi,Vj), 则称Vi领接到Vj。
```
  * 关联(依附): 边/弧与定点之间的关系。
```
   存在(Vi,Vj)/<Vi,Vj>, 则称该边/弧关联于Vi和Vj。
```
  * 顶点的度: 与该顶点相关联的边的数目,记作TD(v)
``` 
   在有向图中,顶点的度等于该顶点的入度与出度之和。
   顶点v的入度是以v为 终点的有向边的条数,记作ID(v)
   顶点v的出度是以v为 始点的有向边的条数,记作OD(v)
```
  ![image](image/image-20200519084255.png) 

  * 路径:接续的边构成的顶点序列。
  * 路径长度:路径上边或弧的数目/权值之和。
  * 回路(环): 第一个顶点和最后一个顶点相同的路径。
  * 简单路径: 除去路径起点和终点可以相同外,其余顶点均不相同的路径。
  * 简单回路(简单环): 除路径起点和终点相同外,其余顶点均不相同的路径。   
    ![image](image/image-20200519085018.png) 


  * 连通图(强连通图)
``` 
 在无(有) 向图G=(V,{E})中, 若对任何两个顶点v,u都存在从v到u的路径,则称G是连通图(强连通图)
```
  ![image](image/image-20200519085346.png) 

  * 权与网
```
  图中边或弧所具有的相关树称为权。表明从一个顶点到另一个顶点的距离或耗费。 
```
  * 子图
``` 
  设有两个图G=(V,{E})、G1=(V1,{E1}), 若V1⊆V, E1⊆E,则称G1是G的子图
```
 ![image](image/image-20200519094300.png) 

  * 连通分量
``` 
   a.无向图G的极大连通子图称为G的连通分量。
     极大连通子图意思是:该子图是G连通子图,将G的任何不在该子图中的顶点加入,子图不再连通。
```
 ![image](image/image-20200519094637.png) 

  * 有向图G的极大强连通子图称为G的强连通分量
``` 
  极大强连通子图意思是:该子图是G强连通子图,将D的任何不在该子图中的顶点加入,
子图不再强连通的。
```
 ![image](image/image-20200519095207.png)

  * 极小连通子图:该子图是G的连通子图,在该子图中删除任何一条边子图不再连通。
  * 生成树: 包含无向图G所有顶点的极小连通子图。
  * 生成森林: 对非连通图,由各个连通分量的生成树的集合。
    ![image](image/image-20200519095619.png)


8.2、图的类型定义

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、图的抽象数据类型定义如下:
``` 
 ADT Graph{
    数据对象V:具有相同特性的数据元素的集合,称为集合.
    数据关系R:R={VR}
        VR = {<v,w>|<v,w>| v, w∈V ∧ p(v,w),
         <v,w>表示从v到w的弧,P(v,w)定义了弧<v,w>的信息
       }
 }
```
  ![image](image/image-20200519100108.png)
  ![image](image/image-20200519100152.png)

8.3、图的存储结构

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、图的逻辑结构:多对多
 ![image](image/image-20200519100444.png)

8.3.1、邻接矩阵

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、数组(邻接矩阵)表示法
``` 
  建立一个顶点表(记录各个顶点信息)和一个邻接矩阵(表示各个顶点之间的关系)
```
 ![image](image/image-20200519100804.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、无向图的邻接矩阵表示法
``` 
  分析1:无向图的邻接矩阵是对称的;
  分析2:顶点i的度=第i行(列)中1的个数;
  特别: 完全图的邻接矩阵中,对角元素为0,其余是1 
```
 ![image](image/image-20200519100850.png)

 &nbsp;&nbsp;&nbsp;&nbsp; (3)、有向图的邻接矩阵表示法
```
 注: 在有向图的邻接矩阵中, 
    第i行含义:以结点Vi为尾的弧(即出度边)
    第i行含义:以结点Vi为头的弧(即入度边)

   分析1:有向图的邻接矩阵可能是不对称的。
   分析2:顶点的出度=第i行元素之和
         顶点的入度=第i列元素之和
     顶点的度=第i行元素之和+第i列元素之和
```
  ![image](image/image-20200519102642.png)
  ![image](image/image-20200519103003.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、网(即有权图)的邻接矩阵表示法 
 ![image](image/image-20200519103650.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(5)、邻接矩阵
   邻接矩阵的存储表示:用两个数组分别存储顶点表和邻接矩阵
``` 
  #define MaxInt 32767   //表示极大值,即∞
  #define MVNum 100   //最大顶点数
  typedef char VerTexType;  // 设顶点的数据类型为字符型
  typedef int ArcType;  // 假设边的权值类型为整型
   
  typedef struct{
   VerTexType vexs[MVNum];   //顶点表 ,使用一维数组来存放顶点
   ArcType arcs[MVNum][MVNum];   //邻接矩阵
   int vexnum,arcnum;        // 图的当前顶点数和边数
}AMGraph; // Adjacency Matrix Graph
```
 ![image](image/image-20200519105257.png)  


  &nbsp;&nbsp;&nbsp;&nbsp;(6)、采用邻接矩阵表示法创建无向图

   * 算法思想
``` 
  (1)、输入总顶点数和总边数。
  (2)、依次输入点的信息存入顶点表中
  (3)、初始化邻接矩阵,使每个权值初始化为极大值。
```
 ![image](image/image-20200519105624.png)  


  &nbsp;&nbsp;&nbsp;&nbsp;(7)、算法--采用邻接矩阵表示法创建无向图
``` 
 Status CreateUDN(AMGraph &G){
    //采用邻接矩阵表示法,创建无向网G
  cin>>G.vexnum>>G.arcnum;  //输入总顶点数, 总边数
  for(i=0;i<G.vexnum;++i){  // G.vexnum 表示有多个顶点
   cin>>G.vexs[i];       // 依次输入点的信息
   for(i=0;i<G.vexnum;++i){ //初始化邻接矩阵, 给邻接矩中所有的元素都赋值一无穷大
     for(j=0; j<G.vexnum; ++j){
        G.arcs[i] = MaxInt;
        for(k=0;k<G.arcnum;++l){ // 构造邻接矩阵
        cin>>v1>>v2>>w;   // 输入一条边所依附的顶点及边的权值
        i = LocateVex(G, v1);   // 得到当前输入的顶点,在顶点表的位置
        j = LocateVex(G, v2);   //确定v1和v2在G中的位置
        G.arcs[i][j] = w;     // 边<v1,v2>的权值置为w
        G.arcs[j][i] = G.arcsp[i][j]  // 置<v1,v2>的对称边<v2,v1>的权值为w
     }
      return OK;
   }
  }
 }
}


int LocateVex(AMGraph G, VertexType u){
  // 图G中查找顶点u,存在则返回顶点表中的下标; 否则返回-1
  int i;
   for(i=0; i<G.vexnum; ++i)
    if(u==G.vexs[i]) return i;
   return -1;
} 
```
 ![image](image/image-20200519223426.png)  

  

(5.2)、邻接矩阵
  * 采用邻接矩阵表示法创建无向网
    ![image](image/image-20200519224103.png) 
  
  * 邻接矩阵----有什么好处？
    ![image](image/image-20200519224741.png) 


  * 邻接矩阵----有什么不好？
    ![image](image/image-20200519225242.png) 

8.3.2、邻接表

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、邻接表表示法(链式)
``` 
 顶点:按编号顺序将顶点数据存储在一维数组中;
 关联同一顶点的边(以顶点为尾的弧): 用线性链表存储
   
  adjvex: 邻接点域,存放与Vi邻接的顶点在表头数组中的位置
  nextarc: 链域,指示下一条边或弧
```
 ![image](image/image-20200519225954.png) 


 &nbsp;&nbsp;&nbsp;&nbsp;(2)、无向图 
``` 
特点: a、邻接表不唯一
      b、若无向图中有n个顶点、e条边, 则其邻接表需n个头结点和2e个表结点。适宜存储稀疏图
      c、无向图中顶点Vi的度为第i个单链表中的结点数。 
```
 ![image](image/image-20200519231134.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、有向图
 ![image](image/image-20200520214229.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、当邻接表的存储结构形成后,图便唯一确定。
 ![image](image/image-20200520214557.png) 

8.3.3、邻接表----图的邻接表存储表示

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、顶点的结点结构
 ``` 
typedef struct VNode{
   VerTexType data;   //订单信息
   ArcNode *firstarc;   //指向第一条依附该顶点的边的指针
}VNode,AdjList[MVNum]; // AdjLis表示邻接表类型

说明: 例如 AdjList v;    相当于: VNode v[MVNum];
 ```
![image](image/image-20200520215838.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、弧(边)的结点结构
  ``` 
# define MVNum 100  //最大顶点数
 typedef struct ArcNode{   //边结点
    int adjvex;        // 该边所指向的顶点的位置
    struct ArcNode * nextarc;   //指向下一条边的指针
    OtherInfo info;   //指向第一条依附该顶点的边的指针
 }ArcNode; // 和边相关的信息
 
  ```
![image](image/image-20200520215751.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、图的结构定义
 ```
typedef struct {
   AdjList vertices;   //vertices---vertex的复数
   int vexnum, arcnum;  // 图的当前顶点数和弧数
}ALGraph; 

 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(4)、邻接表举例说明
 ![image](image/image-20200520220459.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、采用邻接表表示法创建无向网
  * 算法思想
``` 
 1、输入总顶点数和总边数
 2、建立顶点表
      依次输入点的信息存入顶点表中 使每个表头结点的指针域初始化为NULL
 3、创建邻接表
      依次输入每条边依附的两个顶点
      确定两个顶点的序号i和j,建立边结点
      将此边结点分别插入到Vi和Vj对应的两个边链表的头部
```
 &nbsp;&nbsp;&nbsp;&nbsp;(6)、算法---采用邻接表表示法创建无向网
 ```
  Status CreateUDG(ALGraph &G){ //采用邻接表表示法,创建无向图G
    cin>>G.vexnum>>G.arcnum;   //输入总顶点数,总边数
    for(i=0;i<G.vexnum;++i){   // 输入各点, 构造表头结点表
       cin>>G.vertices[i].data;  // 输入顶点值
       G.vertices[i].firstrc=NULL;  // 初始化表头结点的指针域
    }
    for(k=0;k<G.vexnum;++k){     // 输入各边,构造邻接表
           cin>>v1>>v2;          // 输入一条边依附的两个顶点
           i = LocateVes(G, v1);  
           j = LocateVes(G, v2);
           //在有向图中 下面的4句代码就是 建立了出度边
           p1 = new ArcNode;     //生成一个新的边结点*p1
           p1->adjvex = j;       //邻接点序号为j
           p1->nextarc = G.vertices[i].fristarc;
           G.vertices[i].firstrc = p1;   //将新结点*p1插入到顶点vi的边表头部
           
            //在有向图中 下面的4句代码就是 建立了入度边
           // 如果不要上面的4句代码,只要下面的4句代码 就是建立有向网的逆邻接矩阵
           p2 = new ArcNode;             // 生成另一个对称的新的边结点*p2
           p2->adjvex = i;              //邻接点序号为i
           p2->nextarc = G.vertices[j].fristarc;
           G.vertices[j].firstrc = p2;   //将新结点*p2插入到顶点vj的边表头部 
                      
    }  
    return OK;
}

 ```
  ![image](image/image-20200520222713.png) 
  ![image](image/image-20200520223446.png) 


 &nbsp;&nbsp;&nbsp;&nbsp;(7)、邻接表特点
``` 
 1、方便找任一顶点的所有"邻接点"
 2、节约稀疏图的空间
     需要N个头指针 + 2E个结点(每个结点至少2个域)
 3、方便计算任一顶点的 "度" ?
    对无向图: 是方便计算的
    对有向图: 只能计算 "出度"; 需要构造 "逆邻接表" (存指向自己的边) 来方便计算 "入度"
 4、不方便检查任意一对顶点间是否存在边
```
![image](image/image-20200520225706.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;(8)、邻接矩阵与邻接表表示的关系
   * 联系:邻接表中每个链表对应于邻接矩阵中一行,链表中结点个数等于一行中非零元素的个数。
 ![image](image/image-20200520225903.png)
  
   * 区别
``` 
   1、对于任一确定的无向图,邻接矩阵的唯一的(行列号与顶点编号一致),但邻接表不唯一
     (链接次序与顶点编号无关)。
   2、邻接矩阵的空间复杂度为O(n^2),而邻接表的空间复杂度为O(n+e)。
```
   * 用途:邻接矩阵多用于稠密图;而邻接表多用于稀疏图。

    ![image](image/image-20200520230710.png) 


8.3.4、邻接表----图的其他存储结构 

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、十字链表----用于有向图
 ![image](image/image-20200520231022.png) 

 ```
  十字链表:
     下面图中有 弧结点有4个指针, 比如顶点a,那么弧结点的
     出度边是表示是从0,1 ;  0,2;
     入度边表示方式是:2,0
     所以这里可以知道,如果是出度的 就用tailvex表示 尾, headvex表示头
     tailvex:弧尾位置
     headvex:弧头位置
     hlink:弧头相同的下一条弧
     tlink:弧尾相同的下一条弧
 ```
 ![image](image/image-20200521150204.png) 

   &nbsp;&nbsp;&nbsp;&nbsp;(2)、邻接多重表
```
  回顾:
     邻接表优点: 容易求得顶点和边的信息
           缺点: 某些操作不方便(如:删除一条边需要找表示此边的两个结点)
```
 ![image](image/image-20200521152157.png) 

8.4、图的遍历 

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、遍历定义
```
  从已给的连通图中某一顶点出发,沿着一些边访问图中所有的顶点,且使每个顶点
仅被访问一次,就叫做图的遍历,它是图的基本运算
```
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、遍历实质:找每个顶点的邻接点的过程

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、图的特点
``` 
  图中可能存在回路,且图的任一顶点都可能与其它顶点相同,在访问完某个顶点之后可能会沿着
某些边又回到了曾经访问过的顶点。
  
  怎么避免重复访问?
  解决思路: 设置辅助数组visited[n],用来标记每个被访问过的顶点。
         初始状态visited[i]为0
         顶点i被访问,改visited[i]为1,防止被多次访问
```
  &nbsp;&nbsp;&nbsp;&nbsp;(4)、图常用的遍历
```
  1.深度优先搜索(Depth_First Search---DFS)
  2.广度优先搜索(Breadth_First Search---BFS)
```
  * 深度优先遍历(DFS)
``` 
  1、在访问图中某一起始顶点v后,由v出发,访问它的任一邻接顶点w1;
  2、再从w1出发,访问与w邻接但还未被访问过的顶点w2;
  3、然后再从w2出发,进行类似的访问,....
  4、如此进行下去,直至到达所有的邻接顶点都被访问过的顶点u为止。
  5、接着,退回一步,推倒前一次刚访问过的顶点,看是否还有其它没有被访问的邻接顶点。
  6、如果有,则访问此顶点,之后再次从顶点出发,进行与前述类似的访问;
  7、如果每一个,就在退回一步进行搜索。重复上述过程,直到连通图中所有顶点都被访问
    过为止。
```
  ![image](image/image-20200521155705.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、邻接矩阵表示的无向图深度遍历实现
  ![image](image/image-20200521161707.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(6)、算法--采用邻接矩阵表示图的深度优先搜索遍历
 ```
 void DFS(AMGraph G, int v){ //图G为领接矩阵类型
   cout<<v; visited[v] = ture; //访问第v个顶点
   for(w =0; w<G.vexnum; w++){
    if((G.arcs[v][w]!=0) && (!visited[w])) //依次检查邻接矩阵v所在的行
      DFS(G,w);     
    // w是v的邻接点,如果w未访问,则递归调用DFS
  } 
}
 ```
 ![image](image/image-20200521162216.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、DFS算法效率分析
``` 
  a.用邻接矩阵表示图,遍历图中每一个顶点都要从头扫描该顶点所在行,时间复杂度为O(n^2)
  b.用邻接表来表示图,虽然有2e个表结点,但只需要扫描e个结点即可完成遍历,加上访问n个
   头结点的时间,时间复杂度为O(n+e)。
  
  结论:
    稠密图适于在邻接矩阵上进行深度遍历;
    稀疏图适于在邻接表上进行深度遍历。
```

8.4.2、图的遍历 ---广度优先遍历

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、广度优先遍历--连通图
``` 
  方法: 从图的某一结点出发,首次依次访问该结点的所有邻接点Vi1,Vi2,...,Vin再按这些
顶点被访问的现货次序依次访问与她们相邻的所有未被访问的顶点。
   重复此过程,直至所有顶点均被访问为止。
```
  ![image](image/image-20200521171444.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(2)非连通图的广度遍历
 ![image](image/image-20200521171557.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、使用队列来实现对图的广度优先遍历
``` 
  使用队列来存储 邻接表的数组下标, 然后再用一个临时数组来表示邻接点是否被访问过。
  如果没有访问过就用0表示,如果访问过就用1访问过。
```
 ![image](image/image-20200521172101.png)
 ![image](image/image-20200521171703.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、算法实现
 ``` 
 void BFS(Graph G, int v){ //按广度优先非递归遍历连通图G
    cout<<v; visited[v] = ture; //访问第v个顶点
    initQueue(Q);           //辅助队列Q初始化,置空
    EnQueue(Q,v);           // v进队
    while(!QueueEmpty(Q)){  //队列非空
      DeQueue(Q,u);         //队头元素出队并置为u
     for(w=FirstAdjVex(G,u); w>=0; w=NextAdjVex(G,u,w)){
        if(!visited[w]){  //w为u的尚未访问的邻接顶点
         count<<w; visited[w]=true; 
         EnQueue(Q,w); //w进队
       }
     }
   } 
 }
 ```

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、BFS算法效率分析
 ``` 
   a.如果使用邻接矩阵,则BFS对于每一个被访问到的顶点,都要循环检测矩阵中的
     整整一行(n个元素), 总的时间代价为O(n^2);  因为有n个元素,每一行n个元素,所以O(n^2)

   b.用邻接表来表示图,虽然有2e个表结点,但只需要扫描e个结点即可完成遍历,加上访问n个
    头结点的时间,时间复杂度为O(n+e)。
   
   c.空间复杂度相同,都O(n)(借用了堆栈或队列)
    
   d.时间复杂度只与存储结构(邻接矩阵或邻接表)有关,而与搜索路径无关。
 ```

 

8.5、 图的应用

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、概念回顾---生成树

  * 生成树:所有顶点均由边连接在一起,但不存在回路的图。
 ```
      1).一个图可以有许多棵不同的生成树。
      2).所有生成树具有以下共同特点:
          a.生成树的顶点个数与图的顶点个数相;
          b.生成树是图的极小连通子图,去掉一条边则非连通;
          c.一个有n个顶点的连通图的生成树有n-1条边;
          d.在生成树中再加一条边必然形成回路。
          e.生成树中任意两个顶点间的路径是唯一的;
        
          f.一个图可以有多棵不同的生成树
          g.所有生成树具有以下共同特点
          h.含n个顶点n-1条边的图不一定是生成树。
 ```
 ![image](image/image-20200521225412.png)

 * 无向图的生成树
 ![image](image/image-20200521225754.png)


8.5.1、 图的应用----最小生成树

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、 最小生成树
``` 
    给定一个无向网络,在该网的所有生成树中,使得各边权值之和最小的那棵生成树称为该网的最小生成树,也叫最小代价生成树。
```
 ![image](image/image-20200521230816.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、最小生成树的典型用途
 ![image](image/image-20200521230912.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、构造最小生成树(Minimum Spanning Tree)
``` 
  构造最小生成树的算法很多,其中多数算法都利用了MST的性质。
  MST性质: 设N=(V,E)是一个连通图,U是顶点集V的一个非空子集。若边(u,v)是一条
具有最小权值的边,其中 u∈U, v∈V-U，则必存在一棵包含边(u,v)的最小生成树。

```
![image](image/image-20200522094011.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(4)、MST性质解释
 ``` 
 在生成树的构造过程中,图中n个顶点分属两个集合:
    * 已落在生成树上的顶点集: U
    * 尚未落在生成树上的顶点集: V-U
 接下来则应在所有连通U中顶点和V-U中顶点的边中选取权值最小的边。
 ```
 ![image](image/image-20200522094220.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(5)、构造最小生成树方法一: 普里姆(Prim)算法
  * 算法思想
``` 
  1)、设N=(V,E)是连通网,TE是N上最小生成树中边的集合
  2)、初始令U={u0},(u0∈V),TE={}
  3)、在所有u∈U, v∈V-U的边(u,v)∈E中,找一条代价最小的边(u0,v0)。
  4)、将(u0,v0)并入集合TE,同时v0并入U。
  5)、重复上述操作直至U=V为止,则T=(V,TE)为N的最小生成树。
```
 ![image](image/image-20200522101136.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(6)、构造最小生成树方法二: 克鲁斯卡尔(Kruskal)算法
 ``` 
  算法思想
   1)、设连通网N=(V,E),令最小生成树初始状态为只有n个顶点而无边的非连通图T=(V,{}),
  每个顶点自成一个连通分量。
   2)、在E中选取代价最小的边,若该边依附的顶点落在T中不同的连通分量上(即:不能形成环)，
   则将此边加入到T中;否则,舍去此边,选取下一条代价最小的边。
   3)、依此类推,直至T中所有顶点都在同一连通分量上为止。
 ```
  ![image](image/image-20200522103652.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(7)、两种算法比较
  ![image](image/image-20200522103151.png)


 8.5.2、 图的应用----最短路径

  &nbsp;&nbsp;&nbsp;&nbsp;(1)典型用途:交通网络的问题-----从甲地到乙地之间是否有公路连通?在有多条通路的情况下,
   那一天路最短?
 ``` 
  
  交通网络用有向网表示:
    顶点---表示地点,
    弧--表示两个地点有路连通,
    弧上的权值----表示两地点之间的距离、交通费或途中所花费的时间等
  如何能够使一个地点到另一个地点的运输时间最短或运费最省?这就是一个求两个地点间的
最短路径问题。
 ```
  &nbsp;&nbsp;&nbsp;&nbsp;(2) 问题抽象:在有向网中A点(源点)到达B点(终点)的多条路径中,
   寻找一条各边权值之和最小的路径,即最短路径。
```
   最短路径与最小生成树不同,路径上不一定包含n个顶点,也不一定包含n-1条边。 
```
  ![image](image/image-20200522105324.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(3) 第一类问题:两点之间最短路径
  ![image](image/image-20200522105844.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(4) 第二类问题:某源点到其他各店最短路径
  ![image](image/image-20200522105943.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(5)、两种行家最短路径问题
  ``` 
   1)、单源最短路径--用Dijkstra(迪杰斯特拉)算法
   2)、所有顶点间的最短路径----用Floyd(弗洛伊德)算法  
  ```

  &nbsp;&nbsp;&nbsp;&nbsp;(6)、Dijkstra算法
 ```
   1、初始化:先找出从源点v0到各终点vk的直达路径(v0,vk),
      即通过一条弧到达的路径
   2、选择:从这些路径中找出一条长度最短的路径(v0,u)。
   3、更新:然后对其余各条路径进行适当调整:
      若在图中存在弧(u,vk),且（v0,u）+(u,vk) < (v0,vk),
      则以路径(v0,u,vk)代替(v0,vk)。
   在调整后的各条路径中,再找长度最短的路径,依此类推。
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(7)、Dijkstra算法---按路径长度递增次序产生最短路径
 ```
  1、把V分叉两组:
     (1)S:已求出最短路径的顶点的集合。
     (2)T=V-S: 尚未确定最短路径的顶点集合。
  2、将T中顶点按最短路径递增的次序加入到S中,
    保证: (1)从源点v0到S中各顶点的最短路径长度都不大于从
           v0到T中任何顶点的最短路径长度。 
    (2) 每个顶点对应一个距离值:
        S中顶点: 从v0到此顶点的最短路径长度。
        T在顶点: 从v0到此顶点的只包括S中顶点作中间顶点的最短路径长度。
 ```
  ![image](image/image-20200522140608.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(8)、Dijkstra算法步骤
 ```
  初始时令 S={v0}, T={其余顶点}。
T中顶点对应的距离值用辅助数组D存放。
    D[i]初值: 若<v0,vi>存在,则为其权值;否则为∞。
 从T中选取一个其距离值最小的顶点vj,加入S。对T中顶点的距离值进行修改“
 若加进去vj作中间顶点,从v0到vi的距离值比 不加入vj的路径要短,则修改距离值。
  重复上述步骤,直到S=V为止。
  
   用数组D[i]来记录到其他顶点的最短路径, 若有些顶点到不了则为无穷大。

  第一步是i=1开始, 从v0到v1的最短路径长度是13
                  从v0到v2的最短路径长度是8
                  从v0到v3不能直达所以路径是∞
                  从v0到v4可以直达所以路径是30。
                  从v0到v5不能直达所以路径是∞ 
                  从v0到v6不能直达所以路径是32
      接下来从这里面找出最小的,这样就找到了最短路径的顶点,所以当前这顶点就可以加入
    到S中了。 那么这时T中就少了一个顶点。
      那么接下来看从v0到各个顶点的路径, 以及v0经过了v2后再到其他顶点的路径。然后
   看看这个路径有没有减少,如果没有减少就不修改值,如果路径比原来的短那么就修改这些值。

  第二步是i=2: 从顶点v2 到v1 ,到不了所以这个值还是13最小。v2已经找到了所以不用在看了。
   本来v0到v3是到不了的,但是现在由于v2的加入, 可以通过v2到达v3了 路径长度是8+5=13
    
 ```
  ![image](image/image-20200522142833.png)


 &nbsp;&nbsp;&nbsp;&nbsp;(9)、所有定的最短路径
  ``` 
  方法1:每次以一个顶点为源点,重复执行Dijkstra算法n次。
  方法2:弗洛伊德(Floyd)算法
   
   算法思想: 
      逐个顶点试探
      从vi到vj的所有可能存在的路径中
      选出一条长度最短的路径  
  ```

 &nbsp;&nbsp;&nbsp;&nbsp;(10)、采用Floyd算法步骤,求图中个各顶点之间的最短路径
  ![image](image/image-20200522150832.png)


8.5.2、 图的应用----有向无环图及其应用

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、有向无环图:无环的有向图,简称DAG(Directed Acycline Graph)
  ![image](image/image-20200522155450.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、AOV网: 拓扑排序; AOE网:关键路径
 ``` 
    AOV网: 用一个有向图表示一个工程的各子工程及其相互制约的关系,其中以顶点表示活动,
 弧表示活动之际的优先制约关系,称这种有向图为顶点表示活动的网,简称AOV网(Activity On Vertex network)

   AOE网: 用一个有向图表示一个工程的各子工程及其相互制约的关系,以弧表示活动,
 以顶点表示活动的开始或结束事件,称这种有向图为边表示活动的网,简称AOE网(Activity On Edge)
  
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(3)、 拓扑排序:排课表
   ![image](image/image-20200522160001.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、AOV网的特点
 ``` 
  1).若从i到j有一条有向路径,则i是j的前驱;j是i的后继。
  2).若<i,j>是网中有向边,则i是j的直接前驱;j是i的直接后继。
  3).AOC网不允许有回路,因为如果有回路存在,则表明某项活动以自己为先决条件,显然这是荒谬的
   
   问题:如果判别AOV网中是否存在回路? 
 ```
  ![image](image/image-20200522161405.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、拓扑排序
 ``` 
  在AOV网没有回路的前提下,我们将全部活动排列成一个线性序列,使得若AOV网中没有弧<i,j>
存在,则在这个序列中,i一定排在j的前面,具有这种性质的线性序列称为拓扑有序序列,相应的拓扑
有序排序的算法称为拓扑排序。
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(6)、拓扑排序的方法:
``` 
  1)、在有向图中选一个没有前驱的顶点且输出之。
  2)、从图中删除该顶点和所有以它为尾的弧。
  3)、重复上述两步,直至全部顶点均已输出;或者当图中不存在无前驱的顶点为止
```
 ![image](image/image-20200522161957.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、拓扑排序的一个重要应用
  * 检测AOV网中是否存在还方法:
 ``` 
   对有向图构造其顶点的拓扑有序序列,若网中所有顶点都在它的拓扑有序序列中,
则该AOV网必定不存在环。
   
   找到没有前驱的顶点然后将它删除,把以它为弧尾的弧(边)删除。依次操作...当
删除到顶点有前驱的时候不再删除,那么说明有环存在。
 ```

8.5.3、 图的应用----关键路径

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、关键路径
 ``` 
  把工程计划表示为边表示活动的网络,即AOE网,用顶点表示事件,弧表示活动,弧的权表示活动持续时间。
 实际表示在它之前的活动已经完成,在它之后的活动可以开始。
 ```
  ![image](image/image-20200522165315.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(2)、如何确定关键路径,需要定义4个描述量:
 ``` 
   ve(vj)---表示事件vj的最早发生时间。
     例如: ve(v1)=0  ve(v2)=20,   ve(v1)表示源点发生的时间,源点的最早发生是0.
   vl(vj)---表示时间vj的最迟发生时间
     例如:vl(v4)=165;  这个165从哪里来? 假如工程结束时间是180分钟, 所以是用180-a7=180-15=165得来的
   e(i)---表示活动ai的最早开始时间。
     例如: e(a3)=30, 这里表a1完成了它才能开始,所以它最早开始时间是30
   l(i)---表示活动ai的最迟开始时间。
        例如: l(a3)=120,  表示180-15-45=120。 是从后面往前算

   l(i)-e(i)-----表示完成活动ai的时间余量。 例l(3)-e(3)=120-20=90
   关键活动----关键路径上的活动,即l(i)==e(i)   (即l(i)-e(i)==0)的活动。
 ```
 ![image](image/image-20200522224140.png)
    
   (3)、如何找 l(i)==e(i)的关键活动?
    
   * 设活动ai用狐<j,k>表示,其持续时间记为: W<sub>j,k</sub>
     则有:  e(i)=ve(j)
            l(i)=vl(k)-W<sub>j,k</sub>

   (4)、如何求ve(j)和vl(j)?
    
   * 从ve(1)=0开始向前递推
     
     ve(j)=Max{ve(i)+W<sub>i,j</sub>},<i,j>∈T,2<=j<=n 其中T是所有以j为头的弧的集合
     
   * 从vl(n)=ve(n)开始向后递推
     
     vl(i)=Min{vl(j)-W<sub>i,j</sub>},<i,j>∈S,1<=j<=n-1 其中S是所有以i为尾的弧的集合 
     

 ![image](image/image-20200522230310.png)  

 ![image](image/image-20200522230554.png)    

  &nbsp;&nbsp;&nbsp;&nbsp;(5)、求关键路径步骤

    1.求ve(i)、vl(j)
    2.求e(i)、l(j)
    3.计算l(i)-e(i)

   ve(j)=Max{ve(i)+W<sub>i,j</sub>}, vl(i)=Min{vl(j)-W<sub>i,j</sub>}

   e(i)=ve(j);
   l(i)=vl(k)-W<sub>j,k</sub>


  ![image](image/image-20200522230743.png)    

   &nbsp;&nbsp;&nbsp;&nbsp;(6)、关键路径的讨论
 ```
  1)、若网中有几条关键路径、则需加快同时在几条关键路径上的的关键活动
   如:a11,a10,a8,a7
  2)、如果一个活动处于所有的关键路径上,那么提高这个活动的速度,就能缩短整个工程的完成时间。如:a1、a4。
  3)、处于所有的关键路径上的活动完成时间不能缩短太多,否则会使原来的关键路径变成不是关键路径。
     这时,必须重新寻找关键路径。如: a1由6天变成3天,就会改变关键路径。这时,必须重新寻找关键路径。
   如: a1由6天变成3天,就会改变关键路径。
 ```
  ![image](image/image-20200522231541.png)   


9、 查找  

  &nbsp;&nbsp;&nbsp;&nbsp;(1)查找的基本概念
 ``` 
  1)、问题:在哪里找?
     ---查找表
  查找表是由同一类型的数据元素(或记录)构成的集合。由于"集合"中的数据元素之间存在着松散的关系，
  因此查找表是一种应用灵便的结构。
  
  2)、问题:什么查找?
        根据给定的某个值,在查找表中确定一个其关键字等于给定值的数据元素或(记录)
    关键字: 用来标识一个数据元素(或记录)的某个数据项的值 
         主关键字 -> 可唯一地标识一个记录的关键字是主关键字;
         次关键字 -> 反之,用以识别若干记录的关键字是次关键字。

  3)、问题:查找成功否?
     查找----根据给定的某个值,在查找表中确定一个其关键字等于给定值的数据元素或(记录)
       若查找表中存在这样一个记录,则称"查找成功"。
           查找结果给出整个记录的信息,或指示该记录在查找表中的位置;
       否则成"查找不成功"
           查找结果给出"空记录"或 "空指针"。

  4)、如何评价查找算法?
     查找算法的评价指标:
        关键字的平均比较次数,也称平均查找长度
          ASL(Average Search Length)
        
      n:记录的个数
      pi:查找第i个记录的概率(通常认为pi=1/n)
      ci:找到第i个记录所需的比较次数  
 ```
  ![image](image/image-20200524085554.png)   


9.2、 线性表查找---顺序查找  


  &nbsp;&nbsp;&nbsp;&nbsp;(1)、应用范围
``` 
  1)、顺序表或线性链表表示的静态查找表
  2)、表内元素之间无序
  顺序表的表示

 typedef struct{
   KeyType key; //关键字域
   ...
} ElemType;


 typedef struct{ //顺序表结构类型定义
    ElemType *R; //表基址
    int length; //表长
}SSTale;  //Sequential Search Table
SSTale ST;  //定义顺序表ST
```
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、在顺序表ST中查找值为key的数据元素, 从最后一个元素开始比较
  ![image](image/image-20200524093231.png)   

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、算法的其他形式
  ![image](image/image-20200524093416.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(4)、改进:把待查关键字key存入表头( "哨兵"、"监视哨" ),从后往前逐个比较,
   可免去查找过程中每一步都要检测是否查找完毕,加快速度。
  ![image](image/image-20200524093843.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(5)、设置监视哨的顺序查找
``` 
  int Search_Seq(SSTable ST, KeyType key){
   ST.R[0].key=key;
   for(i=ST.length;ST.R[i].key!=key;--i)
   return i;
}

 当ST.length较大时,此改进能使进行一次查找所需的平均时间几乎减少一半？
```

 &nbsp;&nbsp;&nbsp;&nbsp;(6)、时间效率分析
``` 
  比较次数与key位置有关: 
   a.查找第i个元素,需要比较n+1-i次数。 i和比较次数的关系的和 刚好是n+1,那么比较次数就是n+1 减去它的下标
   b.查找失败,需比较n+1次
```
 ![image](image/image-20200524103016.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、性能分析
  * 时间复杂度:O(n)
      查找成功时的平均查找长度,设表中各记录查找概率相等
       ASL<sub>s</sub>(n)=(1+2+3+...+n)/n=(n+1)/2
  * 空间复杂度: 一个辅助空间---O(1);     

``` 
  1、记录的查找概率不相等时如何提高查找效率?
    查找表存储记录原则------按查找概率高低存储:
    1)、查找概率越高,比较次数越少;
    2)、查找概率越低,比较次数较多。
  2、记录的查找概率无法测定时如何提高查找效率?
    方法----按查找概率动态调整记录顺序;
    1)、在每个记录中设一个访问频度域;
    2)、始终保持记录按非递增有序的次序排列;
    3)、每次查找后均将刚查到的记录直接移至表头。
```
  &nbsp;&nbsp;&nbsp;&nbsp;(8)、顺序查找的特点
```
  优点:算法简单,逻辑次序无要求,且不同存储结构均使用。
  缺点:ASL太长,时间效率太低
```


9.2.2、 线性表查找---折半查找  

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、折半查找:每次将待查记录所在区间缩小一半。
  ![image](image/image-20200524105327.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、折半查找算法---非递归算法
 ``` 
  1)、设表长为n, low、high 和mid分别指向待查元素所在区间的上界、下界和中点,key为给定的要查找的:
  2)、初始时,令low=1, high=n, mid=(low+high)/2
  3)、让k与mid指向的记录比较
       -- 若key==R[mid].key,查找成功
       -- 若key<R[mid].key, 则high=mid-1
       -- 若key>R[mid].key, 则low=mid+1   
  4)、重复上述操作,直至low>high时,查找失败
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(3)、折半查找
``` 
  int Search_Big(SSTale ST, KeyType key){
   low = 1; high = ST.length;  //设置区间初值
   whil(low <= high){
     mid = (low+high)/2;
     if(ST.R[mid].key==key) return mid; //找到待查元素
     else if(key < ST.R[mid].key) //缩小查找区间
                high = mid-1;  //继续在前半区间进行查找
         else low = mid + 1;  // 继续在后半区间进行查找 
  }
  return 0;   // 顺序表中不存在待查元素
} // Search_Bin

```
 ![image](image/image-20200524111434.png) 


 &nbsp;&nbsp;&nbsp;&nbsp;(4)、折半查找----递归算法
 ``` 
  int Search_Big(SSTale ST, KeyType key, int low, int high){
    if(low>high) return 0; //查找不到时返回0
    mid = (low+high)/2;
    if(key==ST.R[mid].key) return mid; //找到待查元素
    else if(key < ST.R[mid].key) //缩小查找区间
         ....//递归,在前半区间进行查找
    else .... //递归,在后半区间进行查找
 }
 
 ```

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、折半查找的性能分析----判断树
``` 
  查找成功: 
      比较次数=路径上的结点数
      比较次数=结点的层数
  查找不成功:
      比较次数=路径上的内部结点数 
```
 ![image](image/image-20200524113955.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(6)、练习
``` 
  假定每个元素的查找概率相等,求查找成功时的平均查找长度。
  
  平均查找长度: 第一层一个元素 查找1次
               第二层两个元素 每个元素查找两次 所以是2*2
               第三层四个元素 每个元素查找三次 所以是 4*3
```
  ![image](image/image-20200524115025.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、折半查找的性能分析
   * 平均查找长度ASL(成功时):
      设表成 n=2<sup>h</sup>-1 , 则h=[log<sub>2</sub>(n+1)] (此时,判定树为深度=h的满二叉树),
      且表中每个记录的查找概率相等: p<sub>i</sub> = 1/n。

 ![image](image/image-20200524115544.png)     

  * 折半查找优点:效率比顺序查找高。
  * 折半查找缺点:只是用与有序表,且限于顺序存储结构(对线性表无效)。

9.2.3、线性表查找---分块查找   

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、分块查找(索引顺序查找)
``` 
   1)、将表分成几块,且表或者有序,或者分块有序; 若i<j, 则第j块中所有记录的关键字
      均大于第i块中的最大关键字。
   2)、建立"索引表" (每个结点含有最大关键字域和指向本块第一个结点的指针,且按关键字有序)

   查找过程: 先确定待查记录所在块(顺序或折半查找),再在块内查找(顺序查找)。
```
 ![image](image/image-20200524171806.png)   

  &nbsp;&nbsp;&nbsp;&nbsp;(2)、分块查找性能分析
   * 查找效率: ASL = L<sub>b</sub> +  L<sub>w</sub>;  

    L<sub>b</sub>: 表示对索引表查找的ASL;  L<sub>w</sub>: 表示对块内查找的ASL
  ![image](image/image-20200524173416.png)   

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、分块查找的优缺点
 ``` 
   优点:插入和删除比较容易,无需进行大量移动。
   缺点:要增加一个索引的存储空间并对初始索引进行排序运算。
   适用情况: 如果线性表既要快速查找又进程动态变化,则可采用分块查找。 
 ```
 ![image](image/image-20200524173706.png)   


9.3、树表的查找     

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、动态查找表
``` 
   当表插入、删除操作频繁时,为维护表的有序性,需要移动表中很多记录。
    改用动态查找表----几种特殊的树
    表结构字在查找过程中动态生成
    
    对于给定值key
    若表中存在,则成功返回;
    否则,插入关键字等于key的记录

    二叉排序树、平衡二叉树、红黑树、B-树、B+树、键树
```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、二叉排序树(Binary Sort Tree)---又称为二叉搜索树、二叉查找树
``` 
   定义: 二叉排序树或是空树,或是满足如下性质的二叉树:
       (1)若其左子树非空,则左子树上所有结点的值均小于根结点的值;
       (2)若其右子树非空,则右子树上所有结点的值均大于等于根结点的值;
       (3)其左右子树本身有各是一棵二叉排序树。
```
 &nbsp;&nbsp;&nbsp;&nbsp;(3)、思考
```
   中序遍历二叉排序树
   结果有什么规律
   
   二叉树排序树的性质: 中序遍历非空的二叉树排序树所得到的数据元素序列是一个按关键字排序的递增有序序列。 
```
  ![image](image/image-20200524204718.png)   


 &nbsp;&nbsp;&nbsp;&nbsp;(4)、二叉排序树的操作---查找
``` 
  1)、若查找的关键字等于根结点,成功
  2)、否则 
       -- 若小于根结点,查其左子树
       -- 若大于根结点,查其右子树
    在左右子树上的操作类似
```
 * 二叉排序树的存储结构
 ``` 
  typedef struct{
    KeyType key;    //关键字项
    InfoType otherInfo; //其它数据域
} 


 typedef struct BSTNode{
    ElemType data;    //数据域
    struct BSTNode *lchild, *rchild;  //左右孩子指针
}BSTNode, *BSTree;
 ```
 ![image](image/image-20200524211139.png)  

  * 算法思想
```
 1)、若二叉排序树为空,则查找失败,返回空指针。
 2)、若二叉排序树非空,将给定值key与根结点的关键字
     T->data.key进行比较:
       --若key等于T->data.key,则查找成功,返回根结点地址;
       --若key小于T->data.key,则进一步查找左子树;
       --若key大于T->data.key,则进一步查找右子树;
```
  * 算法描述
``` 
 BSTree SearchBST(BSTree T, KeyType key){
  if((!T) || key==T->data.key) return T;
  else if(key<T->data.key)
       return SearchBST(T->lchild, key); //在左子树中继续查找
  else  return SearchBST(T->rchild, key);//在右子树中继续查找
}//SearchBST
```
  &nbsp;&nbsp;&nbsp;&nbsp;(5)、二叉排序树的查找分析

    含有n个结点的二叉排序树的平均查找长度和树的形态有关

   * 最好情况:初始序列{45,24,53,12,37,93}
      ASL=Log<sub>2</sub>(n+1) -1; 树的深度为:[Log<sub>2</sub>(n) +1];
      与折半查找中的判断树相同(形态比较均衡): O(Log<sub>2</sub>n)
   * 最坏情况:初始序列{12,24,37,45,53,93}
        插入的n个元素从一开始就有序
        -----变成单支树的形态! 
        此时树的深度为n, ASL=(n+1)/2 查找效率与顺序查找情况相同:O(n)
![image](image/image-20200524212839.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;(6)、二叉排序树的操作--插入
 ```
  1)、若二叉排序树为空,则插入结点作为根结点插入到空树中
  2)、否则,继续在其左,右子树上查找
      - 树中已有,不再插入
      - 树中没有
         查找直至某个叶子结点的左子树或右子树为空为止,则插入
         结点应为该叶子结点的左孩子或右孩子
      插入的元素一定在叶结点上
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(7)、二叉排序树的操作--生成
``` 
  从空树出发,经过一系列的查找、插入操作之后, 可生成一棵二叉排序树。
   例: 设查找的关键字序列为 
     {45,24,53,45,12,24,90}
```
  ![image](image/image-20200524215200.png)  

``` 
 一个无序序列可通过构造二叉排序树而变成一个有序序列。
构造树的过程就是对无序序列进行排序的过程。
  插入的结点均为叶子结点,故无需移动其它结点。相当于在有序序列上插入记录而无需移动其它记录。

  不同插入次序的序列生成不同形态的二叉排序树。
```

 &nbsp;&nbsp;&nbsp;&nbsp;(8)、二叉排序树的操作--删除
``` 
 从二叉排序树中删除一个结点,不能把以该结点为根的子树都删去,只能删除该结点,并且
还应保证删除后所得的二叉树任然满足二叉排序树的性质不变。
 由于中序遍历二叉排序树可以得到一个递增有序的序列。那么,在二叉树中删去一个结点相当于
删去有序序列中的一个结点。
   - 将因删除结点而断开的二叉链表重新连接起来。
   - 防止重新链接后树的高度增加
```
  * 被删除的结点是叶子结点:直接删去该结点
    ![image](image/image-20200524221914.png)
  
  * 被删除的结点只有左子树或者只有右子树,用其左子树或者右子树替换它(结点替换)。
      其双亲结点的相应指针域的值改为 "指向被删除结点的左子树或右子树"。
    ![image](image/image-20200524222452.png)
  
  * 被删除的结点既有左子树,也有右子树
 ``` 
  1)、以其中序前趋值替换之(值替换),然后在删除该前趋结点。 前趋是左子树中最大的结点。
 
  2)、也可以用其后继替换之,然后再删除该后继结点。后继是右子树中最小的结点。 
 ```
  ![image](image/image-20200524222925.png)

9.3.2、树表的查找   

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、平衡二叉树的定义(balanced binary tree)
``` 
  - 又称AVL树(Adelson-Velskii and Landis)
  - 一棵平衡二叉树或者是空树,或者是具有下列性质的二叉排序树。
     左子树与右子树的高度之差的绝对值小于等于1;
     左子树与右子树也是平衡二叉排序树;
```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、平衡因子
``` 
  为了方便起见,给每个结点附加一个数字,给出该结点左子树与右子树的高度差。
 这个数字称为结点的平衡因子(BF)
    平衡因子 = 结点左子树的高度-结点右子树的高度
  根据平衡二叉树的定义,平衡二叉树上所有结点的平衡因子只能是-1、0、或1。

   若左子树和右子树高度一样就是0
   若右子树比左子树高那么差值就是-1
   若左子树比右子树高那么差值就是1
```
 ![image](image/image-20200525085005.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、失衡二叉排序树的分析与调整
 ![image](image/image-20200525091335.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、平衡调整的四种类型
 ```
  LL型、LR型、RL型、RR型  

  A:失衡结点 不止一个失衡结点时,为最小失衡子树的根结点
  B:A结点的孩子,C结点的双亲
  C:插入新结点的子树
 ```
  ![image](image/image-20200525091737.png)

  * 调整失衡二叉排序树的原则
 ```
   
  1)、降低高度
  2)、保持二叉排序树性质 
 ```
  ![image](image/image-20200525091946.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、平衡调整的四种类型---LL型调整
```
  - B结点带左子树α一起上升
  - A结点成为B的右孩子
  - 原来B结点右子树β 作为A的左子树
```
  ![image](image/image-20200525095756.png)

  * AVL树LL调整--例子:
    ![image](image/image-20200525100005.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(6)、平衡调整的四种类型---RR型调整
```
   - B结点带右子树β一起上升
   - A结点成为B的左孩子
   - 原来B结点左子树α 作为A的右子树
```
  ![image](image/image-20200525100543.png) 

   * AVL树RR调整--例子:

    ![image](image/image-20200525100648.png) 
      调整后
    ![image](image/image-20200525100809.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、平衡调整的四种类型---LR型调整
 ![image](image/image-20200525102834.png) 

 * LR型调整过程
```
    - C结点穿过A、B结点上升
    - B结点成为C的左孩子
    - A结点成为C的右孩子
    - 原来C结点左子树β 作为B的右子树
    - 原来C结点右子树y 作为A的左子树
```
  ![image](image/image-20200525103247.png) 

  * AVL树LR调整--例子:
    ![image](image/image-20200525103356.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(8)、平衡调整的四种类型---RL型调整
  ![image](image/image-20200525103448.png) 

  * AVL树RL调整--例子:
    ![image](image/image-20200525103625.png) 
    ![image](image/image-20200525104005.png)  

  &nbsp;&nbsp;&nbsp;&nbsp;(9)、例题
 ```
 输入关键字序列(16,3,7,11,9,26,18,14,15),给出构造一棵AVl树的步骤
 ```
  ![image](image/image-20200525105849.png)  
  ![image](image/image-20200525105934.png)
  ![image](image/image-20200525110019.png)
  ![image](image/image-20200525110101.png)

9.4、散列表基本概念    

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、基本思想:记录的存储位置与关键字之间存在对应关系
```
  对应关系---hash函数
  Loc(i) = H(keyi)  ; H(keyi)--->hash函数 
```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、散列表查找
 ```
  根据散列函数 H(key)=k
  查找key=9,则访问H(9)=9号地址,若内容为9则成功
  若查询不到,则返回一个特殊值,如空指针或空记录。
  
  优点:查询效率高
  缺点:空间效率低
 ```
  ![image](image/image-20200525112425.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、散列方法(杂凑法)
 ```
 选取某个函数,依该函数按关键字计算元素的存储位置,并按此存放;
 查找时,由同一个函数对给定值k计算地址,将k与地址单元元素关键码进行比,确定查找是否成功。

 ```
 * 散列函数(杂凑函数):散列方法中使用的转换函数

 ![image](image/image-20200525121345.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(4)、不同的关键码映射到同一个散列地址
     key1不等于key2,但是H(key1)=H(key2)
```  
例: 有6个元素的关键码分别为:{25,21,39,9,23,11}。
    选取关键码与元素位置间的函数为H(k)=k mod 7,
    地址编号从0-6。  
```
  ![image](image/image-20200525122232.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、使用散列表要解决好两个问题
``` 
 1)、构造好的散列函数
    a.所选函数尽可能简单,以便提高转换速度;
    b.所选函数对关键码计算出的地址,应在散列地址集中致均匀分布,以减少空间浪费。
 2)、制定一个好的解决冲突的方案
    查找时,如果从散列函数计算出的地址中查不到关键码,则应当依据解决冲突的规则,有
  规律地查询其它相关单元 
```
  * 构造散列函数考虑的因素
```
 1)、执行速度(即计算散列函数所需时间)
 2)、关键字的长度;
 3)、散列表的大小
 4)、关键字的分布情况
 5)、查找频率
```
  &nbsp;&nbsp;&nbsp;&nbsp;(6)、根据元素集合的特性构造
 ``` 
  要求一: n个数据原仅占用n个地址,虽然散列查找是以空间换时间,但
仍希望散列的地址空间尽量小。
  要求二: 无论用什么方法存储,目的都是尽量均匀地存放元素,以避免冲突
 ```
  ![image](image/image-20200525144314.png)

  * 直接地址法
```
  Hash(key) = a.key + b (a,b为常数)
  优点:以关键码key的某个线性函数值为散列地址,不会产生冲突 
  缺点: 要占用连续地址空间,空间效率低
```
 ![image](image/image-20200525144658.png)

  * 除留余数法
``` 
  Hash(key) = key mod p (p是一个整数) 
  关键:如何选取合适的p?
  技巧: 设表长为m,取p<=且为质数
    例:{15,23,27,38,53,61,70}, 散列函数Hash(key) = key mod 7
```
  ![image](image/image-20200525145215.png)

9.4.2、解决冲突问题---开放定地址法

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、处理冲突的方法
```
  1)、开放定址法(开地址法)
  2)、链地址法(拉链法)
  3)、再散列法(双散列函数法)
  4)、建立一个公共溢出区
```
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、开放定址法(开地址法)

  基本思想:有冲突时就去寻找下一个空的散列地址,只要散列表足够大,空的散列地址总能找到，
        并将数据元素存入。
        
  例如:除留余数法 H<sub>i</sub> = (Hash(key)+d<sub>i</sub>) mod m  ; d<sub>i</sub>
   为增量序列

  常用方法有下面几种:
    
   线性探测法: d<sub>i</sub> 为1,2,...m-1线性序列

   二次探测法: : d<sub>i</sub> 为1<sup>2</sup>, -1<sup>2</sup>, 2<sup>2</sup>,
         -2<sup>2</sup>...q<sup>2</sup>二次序列

   伪随机探测法: d<sub>i</sub> 为伪随机数序列
          

 ![image](image/image-20200525152216.png)

   &nbsp;&nbsp;&nbsp;&nbsp;(3)、线性探测法

   H<sub>i</sub> = (Hash(key)+d<sub>i</sub>) mod m(1<=i<m)
   其中: m为散列表长度, d<sub>i</sub>为增量序列1,2,...m-1,且d<sub>i</sub>=i
   一旦冲突,就找下一个地址,直到找到空地中存入。 
  ![image](image/image-20200525153150.png)

  &nbsp;&nbsp;&nbsp;&nbsp;(4)、示例
```
  关键码集为 {47,7,29,11,16,92,22,8,3},散列表长为m=11;散列函数为Hash(key)=key mod 11;
 用线性探测方式来解决冲突。建散列表如下:
   下标:     0    1   2   3    4    5    6    7   8    9  10
 存放元素    11   22      47   92   16   3    7   29   8
增长序列     1    2       1    1    1    4    2   2

   解释:
     1)、47、7均是由散列函数得到的没有冲突的散列地址;
     2)、Hash(29)=7,散列地址有冲突,需寻找下一个空的散列地址:
        由H1 = (Hash(29) + 1) mod 11 =8, 散列地址8为空,因此将29存入。
     3)、11、16 、92 均是由散列函数得到的没有冲突的散列地址;
     4)、另外,22,8,3同样在散列地址上有冲突,也是由H1找到空的散列地址的。
     
    平均查找长度ASL=(1+2+1+1+1+4+1+2+2)/9 = 1.67
```
 ![image](image/image-20200525153944.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、二次探测法

   关键码集为 {47,7,29,11,16,92,22,8,3},
 设:散列函数为Hash(key)=key mod 11;
    H<sub>i</sub> = (Hash(key) + d<sub>i</sub>) mod m
    其中:m为散列表长度,m要求是某个4k+3的质数; 
    d<sub>i</sub>为增量序列1<sup>2</sup>,-1<sup>2</sup>, 2<sup>2</sup>, -2<sup>2</sup>,... q<sup>2</sup>

  ![image](image/image-20200525160108.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;(6)、伪随机探测法
    H<sub>i</sub> = (Hash(key) + d<sub>i</sub>) mod m (1<=i<m)
     其中:m为散列表长度,d<sub>i</sub>为伪随机数
    
9.4.3、解决冲突问题---链地址法 

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、基本思想:
    
    相同散列地址的记录链成一单链表
    m个散列地址就设m个单链表,然后用一个数组将m个单链表的表头指针,存储起来 形成一个动态的结构。
      
    例如:一组关键字为{19,14,23,1,68,20,85,27,55,11,10,79}
    散列函数为Hash(key) = key mod 13   

 ![image](image/image-20200525162704.png)     

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、链地址法建立散列表步骤
 ``` 
  Step1: 取数据元素的关键字key,计算其散列函数值(地址)。若该地址对应的链表为空,
 则将该元素插入此链表; 否则执行Step2解决冲突
  Step2: 根据选择的冲突处理方法,计算关键字key的下一个存储地址。若该地址对应的链表为
  不为空,则利用链表的前插法或后插法将该元素插入此链表。 
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(3)、链地址法的优点
``` 
  1)、非同义词不会冲突,无"聚集"现象 。  
      在开放定地址法中线性探测 --不同的元素在计算出散列地址后,当前位置是冲突的不能存,那么去探测下一个位置,
      下一个位置发现也不能存储,那么就说和下一个词本来不是同义词也发生了冲突。
      它们应该存储在不同的位置。可是由于探测的问题发现下一个位置也存储了元素
       所以说非同义词也产生了冲突
  
  2)、链表上结点空间动态申请,更适合于表长不确定的情况。
```

 9.4.4、散列表的查找

  &nbsp;&nbsp;&nbsp;&nbsp;(1)、例题
```
  已知一组关键字为{19,14,23,1,68,20,85,27,55,11,10,79}, 
是散列函数为H(key) = key MOD 13,散列表长为m=16, 设每个记录的查找概率相等
 
 (1)用线性探测再散列处理冲突,即Hi=(H(key) + di) MOD m
```
  ![image](image/image-20200525170801.png)     

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、用链地址法处理冲突
 ```
  平均查找长度: 因为是链表所以有6个元素是查找一次, 分别是14,68,19,20,23,11;
   查找两次的元素是1,55,84,10;  
   查找三次的元素是27
   查找4次的元素是79
 ```
 ![image](image/image-20200525171053.png)   

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、散列表的查找效率分析
```
  使用平均查找长度ASL来衡量查找算法,ASL取决于
   - 散列函数
   - 处理冲突的方法
   - 散列表的装填因子α = 表中填入的记录数/哈希表的长度     
```
  ![image](image/image-20200525171816.png) 
  ![image](image/image-20200525171907.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(4)、几点结论
 ```
   1)、散列表技术具有很好的平均性能,优于一些传统的技术
   2)、链地址法优于开放地址法
   3)、除留余数法作散列函数优于其它类型函数
 ```

10、排序

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、什么是排序?
``` 
 排序:将一组杂乱无章的数据按一定规律顺序排列起来。即,将无序序列排成一个有序序列
  (由小到大或由大到小)的运算。
    a.如果参加排序的数据结点包含多个数据域,那么排序往往是针对其中某个域而言。
```
 &nbsp;&nbsp;&nbsp;&nbsp;(2)、排序方法的分类
 ``` 
  按数据存储介质: 内部排序和外部排序
  按比较器个数:   串行排序和并行排序
  按主要操作:     比较排序和基数排序
  按辅助克空间:   原地排序和非原地排序
  按稳定性:       稳定排序和非稳定排序
  按自然性:       自然排序和非自然排序
 ```
  * 按存储介质可分为:
``` 
    内部排序:数量不大、数据在内存,无需内外存交换数据
    外部排序:数据量大、数据在外存(文件排序)  
```
  * 按比较器个数可分为:
 ``` 
     串行排序:单处理机(同一时刻比较一对元素)
     并行排序:多处理机(同一时刻比较多对元素)  
 ```
   * 按主要操作可分为:
``` 
     比较排序:用比较的方法
           插入排序、交换排序、选择排序、归并排序
     基数排序:不比较元素的大小,仅仅根据元素本身的取值确定其有序位置。
```
   * 按辅助空间可分为:
``` 
   原地排序:辅助空间用量为O(1)的排序方法。
           (所占的辅助存储空间与参加排序的数据量大小无关)
   非原地排序:辅助空间用量超过O(1)的排序方法。
```
  * 按辅助空间可分为:
``` 
    稳定排序:能够使任何数值相等的元素,排序以后相对次序不变
    非稳定排序:不是稳定排序的方法。
```
  * 按排序依据原则:
``` 
    插入排序:直接插入排序、折半插入排序、希尔排序
    交换排序:冒泡排序、快速排序
    选择排序:简单选择排序、堆排序
    归并排序:2-路归并排序
    基数排序
```
  * 按排序所需工作量:
```
  简单的排序方法:T(n)=O(n^2)       基数排序:T(n)=O(d.n)
  先进的排序方法:T(n)=O(nlogn)
```
 &nbsp;&nbsp;&nbsp;&nbsp;(3)、存储结构---记录序列以顺序存储
```
 #define MAXSIZE 20 //设记录不超过20个
 typedef int KeyType; //设关键字为整型量(int 型)

 Typedef struct{ //定义每个记录(数据元素)的结构
   KeyType key;    //关键字
   InfoType otherinfo; //其它数据项
} RedType; //Record Type

 Typedef struct{ //定义顺序表的结构
   RedType r[MAXSIZE + 1];    //存储顺序表的向量
                              // r[0]一般作哨兵或缓冲区
   int length;    // 顺序表的长度
} SqList; 

```
![image](image/image-20200525222325.png) 
             
10.2、插入排序
 * 基本思想
``` 
 每步将一个待排序的对象,按其关键码大小,插入到前面已经排好序的一组
 对象的适当位置上,直到对象全部插入为止。
 
 即边插入边排序,保证子序列中随时都是排好序的
```
 * 基本操作:有序插入
``` 
 1)、在有序序列中插入一个元素,保持序列有序,有序长度不断增加
 2)、起初,a[0]是长度为1的子序列。然后,逐一将a[1]至a[n-1]插入
到有序子序列中。
 3)、在插入a[i]前,数组a的前半段(a[0]-a[i-1])是有序段,后半段
 (a[i]-a[n-1])是停留于输入次序的"无序段"。
 4)、插入a[i]使a[0]-a[i-1]有序段,也就是要为a[i]找到
  有序位置j(0<=j<=i),将a[i]插入在a[j]的位置上。
```
 &nbsp;&nbsp;&nbsp;&nbsp;(1)、直接插入排序---采用顺序查找法查找插入位置
 ```
  顺序查找每一次循环都要比较两次, 判断下标是否越界 
 ```
  ![image](image/image-20200526091640.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、直接插入排序---使用"哨兵"
 ``` 
 1)、使用下标为0的位置为哨兵,其它元素存在1~11这些下标位置上。
 2)、记录后移,查找插入位置, 插入位置是i,那么从i-1从后面往前查找
  所以j=i-1 开始,然后比较就比较一次。
   如果当前j位置上的元素比我们要插入的元素大,那么就需要将其后移。
 3)、插入到正确位置
   如果当前j位置上的元素 不比要插入的元素大,那么就找了
   然后将哨兵位置上的元素插入到 正确的位置上去

 ```
  ![image](image/image-20200526091937.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、直接插入排序算法
 ``` 
  void InsertSort(SqList &L){
   int i,j;  //i表示无序变量的第一个元素,也就是我们要插入位置的元素
             //j表示寻找插入位置过程中下标
   for(i=2;i<=L.length;++i){ //第2个元素开始
    if(L.r[i].key < L.r[i-1].key){ //若"<",需将L.r[i]插入有序子表
     L.r[0]=L.r[i]; //复制为哨兵
      for(j=i-1;L.r[0].key<l.r[j].key;--j){
        L.r[j+1]=L.r[j]; //记录后移
      }
      L.r[j+1]=L.r[0]; //插入到正确位置 
   }
 }
} 
 ```
 &nbsp;&nbsp;&nbsp;&nbsp;(4)、实现排序的基本操作由两个
``` 
  1)、"比较"序列中两个关键字的大小;
  2)、"移动" 记录。
```
  ![image](image/image-20200526094039.png)
  ![image](image/image-20200526094116.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(5)、时间复杂度结论
``` 
  - 原始数据越接近有序,排序速度越快
  - 最坏情况下(输入数据是逆有序的) Tw(n) = O(n^2)
  - 平均情况下,耗时差不多是最坏情况的一半 Te(n) = O(n^2)
  - 要提高查询速度
     - 减少元素的比较次数
     - 减少元素的移动次数
```

10.2.2、折半插入排序

 &nbsp;&nbsp;&nbsp;&nbsp;(1)、查找插入位置时采用折半查找法
 ![image](image/image-20200526100456.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、折半插入排序---算法描述
``` 
void BInsertSort(SqList &L){
   for(i=2;i<=L.length;++i){ //依次插入第2~第n个元素
     L.r[0]=L.r[i]; //当前插入元素到 "哨兵"位置
     low = 1; high=i-1; //采用二分查找法查找插入位置
     while(low<=high){
      mid = (low+high)/2;
      if(L.r[0].key < L.r[mid].key) high = mid - 1;
      else low = mid+1;
   } //循环结束,high+1则为插入位置
   for(j=i-1; j>=high+1; --j) L.r[j+1]=L.r[j];//移动元素
    L.r[high+1] = L.r[0]; //插入到正确位置
 }
} //BInsertSort

```
  ![image](image/image-20200526101117.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;(3)、折半插入排序---算法分析

  * 折半查找比顺序查找快,所以折半插入排序就平均性能来说比直接插入排序要快;

  * 它所需要的关键码比较次数与待排序对象序列的初始排序无关,
    仅依赖于对象个数。在插入第i个对象时,需要经过[log<sub>2</sub>i]+1次关键码比较,
    才能确定它应插入的位置;
``` 
  - 当n较大时,总关键码比较次数比直接插入排序的最坏情况要好得多,
   但比其好情况要差;
  - 在对象的初始排列已经按关键码排好序或接近有序时,直接插入排序比折半
  插入排序执行的关键码比较次数要少;
```
  * 折半插入排序的对象移动次数与直接插入排序相同,依赖于对象的初始排列
 ``` 
  - 减少了比较次数,但没有减少移动次数
  - 平均性能优于直接插入排序
 
  时间复杂度为O(n^2)
  空间复杂度为O(1)
  是一种稳定的排序方法
 ```

10.2.3、希尔排序
 * 思考
```
  在进行插入排序和折半排序是，移动的步幅不大,那么可以
增大移动的步幅吗?  增大移动的步幅是不是就可以提高效率等等。。。
```
 ![image](image/image-20200526104818.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;1、希尔排序基本思想
``` 
  现将整个待排记录序列分割成若干子序列,分别进行直接插入排序,
待整个序列中的记录"基本有序"时,再对全体记录进行一次直接插入排序。

  希尔排序算法特点:
    1)、缩小增量
    2)、多遍插入排序
```
 &nbsp;&nbsp;&nbsp;&nbsp;2、例如
``` 
1)、 在一组无序的数据中,那么在进行插入排序的时候 选择一个增量为5的(也就是间隔),
把这组数据间隔为5的, 分成若干个子序列。然后这将间隔为5的数据 分为一组
,然后这里对其分割后的数据进行比较排序。元素个数较少就可以快速的比较。
然后较大元素就离最终位置比较近了。
2)、在用5间隔方法进行选取数据 进行比较排序, 
3)、再一次使用3间隔方法进行元素比较。

4)、最后做一遍1间隔的元素进行比较,也就是插入排序操作, 在继续
插入排序时这些 数据已经基本有序了 那么在进行插入排序就非常快了 
```
 ![image](image/image-20200526111055.png) 

 &nbsp;&nbsp;&nbsp;&nbsp;3、希尔排序思路
  * 定义增量序列D<sub>k</sub>: D<sub>M</sub> > 
    D<sub>M-1</sub> >...D<sub>1</sub> =1
      刚才的例子中: D<sub>3</sub> = 5, D<sub>2</sub> = 3, D<sub>1</sub> =1
  * 对每个D<sub>k</sub>进行 "D<sub>k</sub>-间隔" (k=M, M-1, ...1)

&nbsp;&nbsp;&nbsp;&nbsp; 4、希尔排序特点
``` 
 1)、一次移动,移动位置较大,跳跃式接近排序后的最终位置
 2)、最后一次只需要少量移动
 3)、增量序列必须是递减的,最后一个必须是1
 4)、增量序列应该是互质的
```

 &nbsp;&nbsp;&nbsp;&nbsp;5、希尔排序算法
``` 
 void ShellSort(Sqlist &L, int dlta[], int t){ //dk值依次存在dlta[t]中
                          // 存放的就是增量序列 递减的
   //按增量序列dlta[0..t-1]对顺序表L作希尔排序。
   for(k = 0; k<t; ++k)
     ShellInsert(L, dlta[k]); //一趟增量为dlta[k]的插入排序
}


 void  ShellInsert(SqList &L, int dk){
      //对顺序表L进行一趟增量为dk的Shell排序,dk为步长因子
   for(i=dk+1; i<=L.length; ++i){
     if(r[i].key < r[i-dk].key){
       r[0]=r[i];
       for(j=i-dk;i>0 && (r[0].key < r[j].key); j=j-dk)
                //j=j-dk; 表示当前的位置减去间隔, 而不是减1
                //和减去间隔位置的元素比较
            r[j+dk] = r[j]; //插入排序所用的元素是按照这个间隔来的
      r[j+dk] = r[0];
   }
 }
}
```
 &nbsp;&nbsp;&nbsp;&nbsp;6、希尔排序算法分析
   * 希尔排序算法效率与增量序列的取值有关
   * Hibbard增量序列
      D<sub>k</sub>=2<sub>k-1</sub> -----相邻元素互质;
      最坏情况:T<sub>worst</sub> = O(n<sup>3/2</sup>),
      猜想:T<sub>avg</sub> = O(n<sup>5/4</sup>)
   
  * Sedgewick增量序列
     {1,5,19,41,109,...}
     ------9* 4<sup>i</sup>-9*2<sup>i</sup> +1
     或4<sup>i</sup>-3 *2<sup>i</sup> +1
     猜想:T<sub>avg</sub> = O(n<sup>7/6</sup>), T<sub>worst</sub> = O(n<sup>4/3</sup>)

  ![image](image/image-20200526122317.png)  

 * 希尔排序是一种不稳定的排序算法--排序后元素的相对位置发生了改变
    ![image](image/image-20200526122449.png)  

 * 时间复杂度是n和d的函数:
    O(n<sup>1.25</sup> ~ O(l.6n<sup>1.25</sup>))---经验公式
 * 空间复杂度为O(1)
 * 是一种不稳定的排序算法
``` 
  如何选择最佳d序列,目前尚未解决
   最后一个增量值必须为1,无除了1之外的公因子
   不宜在链式存储结构上实现
```
  ![image](image/image-20200526122530.png)  


10.3、交换排序 

 &nbsp;&nbsp;&nbsp;&nbsp;1、基本思想
``` 
 两两比较,如果发生逆序则交换,直到所有记录都排好序为止。
```
 常见的交换排序方法：
  -冒泡排序O(n<sup>2</sup>)
  -快速排序O(nlog<sub>2</sub>n) 

 &nbsp;&nbsp;&nbsp;&nbsp;2、冒泡排序
```
 基本思想:每趟不断将记录两两比较,并按"前小后大"规则交换
 例:6个记录   21, 25, 49,  25*, 16,  08
   第1趟结束: 21, 25, 25*, 16,  08,  49
   第2趟结束: 21, 25, 16,  08,  25*, 49
   第3趟结束: 21, 16, 08,  25,  25*, 49
   第4趟结束: 16, 08, 21,  25,  25*, 49
   第5趟结束: 08, 16, 21,  25,  25*, 49
```
 ![image](image/image-20200526135400.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;3、冒泡排序排序过程(升序)
```
 初始: 21, 25, 49,  25*, 16,  08   n=6
 第一趟
 位置0, 1进行比较 ---判断---不交换---结果: 21, 25, 49,  25*, 16, 08
 位置1, 2进行比较 ---判断---不交换---结果: 21, 25, 49,  25*, 16, 08
 位置2, 3进行比较 ---判断----交换---结果:  21, 25, 25*, 49,  16, 08
 位置3, 4进行比较 ---判断----交换---结果:  21, 25, 25*, 16,  49, 08
 位置4, 5进行比较 ---判断---不交换---结果: 21, 25, 25*, 16,  08, 49
 
 第一趟结束后的顺序: 21, 25, 25*, 16,  08, 49
 在第一趟排序结束后,最后一个元素我们就不用管了 只需要管前面的元素就行了, 所以
 只比较了5次,那么同样的第二趟比较4次,这样依次类推 到第五趟的时候就只 比较一次


第二趟
 位置0, 1进行比较 ---判断---不交换---结果: 21, 25, 25*, 16,   08, 49
 位置1, 2进行比较 ---判断---不交换---结果: 21, 25, 25*, 16,   08, 49
 位置2, 3进行比较 ---判断----交换---结果:  21, 25, 16,  25*,  08, 49
 位置3, 4进行比较 ---判断----交换---结果:  21, 25, 16,  08,  25*, 49

第二趟结束后的顺序: 21, 25, 16,  08,  25*, 49

 依次进行下一趟,每一趟增加一个有序元素
 第三趟结束后的顺序: 21, 16, 08,  25,  25*, 49
 
 第四趟结束后的顺序: 16, 08, 21,  25,  25*, 49

 第五趟结束后的顺序: 08, 16, 21,  25,  25*, 49

 最后一次因为前两个元素都已经是有序了,所以也就不用比较了

 总结: 对于有n个记录, 总共需要n-1趟
       第m趟需要比较n-m次

 在第一趟排序结束后,最后一个元素我们就不用管了 只需要管前面的元素就行了, 所以
 只比较了5次,那么同样的第二趟比较4次,这样依次类推 到第五趟的时候就只 比较一次

 那么比较次数和趟数有什么关系呢? 
 比如在m趟 时候: 第1趟时     比较5次  
                 第2趟时    比较4次
                 第3趟时    比较3次
                 .....
  而这里两个的和 = n 元素个, 所以 m趟+?(需要比较次数)=n 元素个数。
  那么每一趟 就需要比较 n-m  次数。
```
  ![image](image/image-20200526142501.png)    

  &nbsp;&nbsp;&nbsp;&nbsp;4、冒泡排序优缺点
``` 
  优点:每趟结束时,不仅仅能挤出一个最大值到最后面位置,还能同时部分理顺其它元素;
  
   如何提高效率? 
    一旦某一趟比较时不出现记录交换,说明已排好序了,就可以结束本算法
```
 &nbsp;&nbsp;&nbsp;&nbsp;5、算法
``` 
  void bubble_sort(SqList &L){ //改进的冒泡排序算法
   int m,i,j, flag=1; RedType x; //flag 作为是否有交换的标记
   for(m = 1; m <= n-1 && flag == 1; m++){
   flag = 0;
    for(j = 1; j<=m; j++){
      if(L.r[j].key > L.r[j+1].key){ //发生逆序
        flag = 1; //发生交换,flag 置为1,若本趟没发生交换,flag保存为0
        x = L.r[j];L.r[j]=L.r[j+1];L.r[j+1]=x; //交换
    }
  } 
 }
}
```

 ![image](image/image-20200526143116.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;6、冒泡排序算法分析
 ``` 
  时间复杂度
    - 最好情况(正序)
      比较次数:n-1
      移动次数:0
    - 最坏情况(逆序)
      比较次数:  1/2 (n^2 -n)
      移动次数:0       
 ```
  ![image](image/image-20200526144229.png)  

  &nbsp;&nbsp;&nbsp;&nbsp;7、冒泡排序算法评价
``` 
  -冒泡排序最好时间复杂度是O(n)
  -冒泡排序最坏时间复杂度是O(n^2)
  -冒泡排序平均时间复杂度是O(n^2)
  -冒泡排序算法中增加一个辅助空间temp, 辅助空间为S(n)=O(1)
  -冒泡排序是稳定的
```

  ![image](image/image-20200526144306.png)  


10.3.2、交换排序--快速排序    

  &nbsp;&nbsp;&nbsp;&nbsp;1、改进的交换排序
 ```
  基本思想:
   - 任取一个元素(如:第一个)为中心 (pivot:枢轴、中心点)
   - 所有比它小的元素一律前放,比它大的元素一律后放,形成左右两个子表;
   - 对各子表重新选择中心元素并依此规则调整,
   - 直到每个子表的元素只剩一个
 ```
  ![image](image/image-20200526153403.png)  

   &nbsp;&nbsp;&nbsp;&nbsp;2、快速排序
``` 
  基本思想:通过一趟排序,将待排序记录分割成独立的两部分,其中一部分记录的关键字
均比另一部分记录的关键字小,则可分别对这两部分记录进行排序,以达到整个序列有序
  具体实现: 选定一个中间数作为参考,所有元素与之比较,小的调到其左边,大的调到其右边。
  
  (枢轴)中间数: 可以是第一个数、最后一个树、最中间一个树、任选一个数等
  
  如果使用一个可以存放n个元素的空间来存放进行划分的元素。
 当元素很多的时候这种方式很浪费空间。
```
  ![image](image/image-20200526153846.png) 


  &nbsp;&nbsp;&nbsp;&nbsp;3、通常使用一个额外的位置来进行快速排序 
``` 
  1)、一个额外的位置
  2)、首先将中心点(分界点)放在0号位置,那么它原来的位置就空出来了。就可以使用这个位置了
  在前面放一个比较小的值,那么就从后面(比如位置是high)去找一个比较小的值 然后放到这里。
  3)、若不小于中心点值，就不搬动。然后从后面往前找一个元素(位置是high-1 这样往前找),
     若后面的值比中心点的值小那么就将后面小的值放到前面去。那么它本身的位置就空出来了
  4)、当后面的位置空出来了后,就从前面(前面位置从low开始)去找一个比 中心点大的元素 放到这个位置上,
      如果不大于中心点元素就不动, 那么就往下面一个元素(从前往后位置就是low++)找 。
  5)、这样依次的操作, 当这个位置 i和h重合后 就不用搬动元素了, 这时我们就知道
   了中心点的位置了。 然后将中心点的位置放到 这个重合点的位置 这样第一次划分就完成了。

  6)、第一次划分结束后就分成了两个子表, 第一个子表是从一开始的low到当前位置 减1
      第二个子表是从high到当前中心点位置加1。

  7)、得到两个子表后,再继续对这两个子表用同样的办法进行划分 , 当low和high重合后
   就确定了中心点位置。然后又划分了两个子表。当子表中元素只有一个元素时那么就不再
   进行划分了。
  
  8)、这样进行子表的划分,直到每个子表都只有一个元素时就可以了。    
```
  ![image](image/image-20200526161128.png) 

  &nbsp;&nbsp;&nbsp;&nbsp;4、这种快速排序的思路
``` 
 1)、每一趟的子表的形成是采用从两头向中间交替式逼近法;
 2)、由于每趟中对各子表的操作都相似,可采用递归算法。
```
 &nbsp;&nbsp;&nbsp;&nbsp;5、快速排序算法
``` 
 void main(){
  QSort(L, 1, L.length);
}

 void QSort(SqList &L, int low, int high){//对顺序表L快速排序
  if(low < high){ //长度大于1
    pivotloc = Partition(L, low, high);
       //将L.r[low...high]一分为二,pivotloc为枢轴元素排好序的位置
   QSort(L, low, pivotloc-1); //对低子表递归排序
   QSort(L, pivotloc+1 , high); //对高子表递归排序
 }
}

//查找中心点
int Partition(SqList &L, int low, int high){
  L.r[0] = L.r[low]; pivotkey = L.r[low].key;
  while(low < high){ //循环结束就是当前low和high重合后
    while(low < high && L.r[high].key >= pivotkey ) -- high;
      //如果大于就 一直找,循环体是 --high;
     //如果 high位置上的关键字的值比中心点的值来的小,循环就结束了 
     //那么当前high位置上的元素搬到前面 空出来的位置
     // 从后面搬了一个小的元素到前面,那么后面位置就空出来了
     //接下来下面的循环就从前找一个大的元素放到后面空出来的位置上去
    L.r[low] = L.r[high];
    while(low < high && L.r[low].key <= pivotkey )++low;
    //如果low的位置小于中心 那么就一直找,
    //若 low关键字的值 打印中心点的值,那么循环结束
    // 然后将low的值 搬到 high位置上去。
    L.r[high] = L.r[low];
 }
   L.r[low] = L.r[0];
   return low;
}
```
 ![image](image/image-20200526163631.png) 
 ![image](image/image-20200526163412.png) 


 &nbsp;&nbsp;&nbsp;&nbsp;(6)、快速排序算法分析
  * 时间复杂度
    
     平均计算时间是O(nlog<sub>2</sub>n),
     
     Qsort():O(nlog<sub>2</sub>n),
     
     Partition():O(n),

   实验结果表明:就平均计算时间而言,快速排序是我们所讨论的所有内排序方法中最好的一个。

  * 空间复杂度
 ``` 
  快速排序不是原地排序
  由于程序中使用了递归,需要递归调用栈的支持,而栈的长度取决于递归调用的深度。
   (即使不用递归,也需要用用户栈)
  
  在平均情况下:需要O(nlogn)的栈空间
  最坏情况下:栈空间可达O(n)。
 ```
  * 稳定性
``` 
  快速排序是一种不稳定的排序方法。 为什么说不稳定?
  是因为如果排序元素中有相同元素,在排序后相同元素的向后顺序就发生了变化。
  所以说不稳定。
```
 ![image](image/image-20200526165547.png) 


 ``` 
   1)、划分元素的选取 是影响时间性能的关键
   2)、 输入数据次序越乱,所选划分元素值的随机性越好,排序速度越快,快速排序不是自然排序方法。
   3)、改变划分元素的选取方法,至多只能改变算法平均情况下的算法性能,无法改变
   最后情况的时间性能。即最坏情况下,快速排序的时间复杂性总是O(n^2)
 ```

10.4、选择排序--简单选择排序    

  &nbsp;&nbsp;&nbsp;&nbsp;1、简单选择排序
 ``` 
  基本思想:在待排序的数据中选择最大(小)的元素放在其最终的位置。
  基本操作:
   1、首先通过n-1次关键字比较,从n个记录中找出关键字最小的记录,将它与第一个记录交换
   2、再通过n-2次比较,从剩余的n-1个记录中找出关键次小的记录,将它与第二个记录交换
   3、重复上述操作,共进行n-1趟排序后,排序结束
 ```
 ![image](image/image-20200526172418.png) 
 ![image](image/image-20200526172448.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;2、算法
``` 
 void SelectSort(SqLIist &K){
   for(i=1; i<L.length; ++i){
    k = i;
    for(j=i+1;j<=L.lenght;i++){
      if(L.r[j].key < L.r[k].key) k=j;//记录最小值位置

   if(k!=i) L.r[i]==L.r[k]; //交换
  }
 }
}
```
 ![image](image/image-20200526172735.png)  

 &nbsp;&nbsp;&nbsp;&nbsp;3、算法分析
``` 
 时间复杂度
   - 记录移动次数
   - 最坏情况: 3(n-1)  ,每一次交换都要执行三次,所以是3倍
 比较次数: 无论待排序列处于什么状态,选择排序所需进行的 "比较" 次数都相同
```
  ![image](image/image-20200526173030.png) 

10.4、选择排序--堆排序    

  (1)、堆的定义:
   若n个元素的序列{a<sub>1</sub>, a<sub>2</sub>, ... a<sub>n</sub>}满足
   a<sub>i</sub> <= a<sub>2i</sub> , a<sub>i</sub> <= a<sub>2i</sub>
   或
   a<sub>i</sub> >= a<sub>2i</sub> , a<sub>i</sub> >= a<sub>2i</sub>

   则分别称该序列{a<sub>1</sub>, a<sub>2</sub>, ... a<sub>n</sub>}为小根堆和大根堆。

   从堆的定义可以看出，堆实质是满足如下性质的完全二叉树,二叉树中任一非叶子结点均
   小于(大于)它的孩子结点
 ![image](image/image-20200526223259.png)   
    
  &nbsp;&nbsp;&nbsp;&nbsp;(2)、根据定义判断谁是大根堆,谁是小根堆
  ![image](image/image-20200526223619.png)   

  &nbsp;&nbsp;&nbsp;&nbsp;(3)、堆排序
  ``` 
  若在输出堆顶的最小值(最大值)后,使得剩下n-1元素的序列中又建成了一个堆,则得到n个元素的
次小值(次大值).....如此反复,便能得到一个有序序列,这个过程称之为堆排序。
  ```
  &nbsp;&nbsp;&nbsp;&nbsp;(4)、实现堆排序需要解决两个问题
  ```
  1、如何由一个无序序列建成一个堆?
  2、如何在输出堆顶元素后,调整剩余元素为一个新的堆?
  ```
  &nbsp;&nbsp;&nbsp;&nbsp;(5)、堆的调整
```
  解决上面的第二个问题:如何在输出堆顶元素后,调整剩余元素为一个新的堆?

   
  小根堆:
    1、输出堆顶元素之后,以堆中最后一个元素替代之; (从上到下,从左到右 选择最后一个元素)
    2、然后将根结点值与左、右子树的根结点值进行比较,并与其中小者进行交换;
    3、重复上述操作,直至叶子结点,将得到新的堆,称这个从堆顶至叶子的调整过程为"筛选"
  
   如果是大根堆的调整,那么就是输出栈顶元素,然后再选择最后一个元素 作为根结点
与左右子树进行比较,并与其中大者进行交换。。。
```
  ![image](image/image-20200526225826.png) 

  * 例
  ```
  1、输出根并以最后一个元素代替之;
  2、比较其左右孩子值的大小,并与其中较小者交换;
  
  这里有个前提,输出一个堆顶元素,剩下的元素还是符合堆的定义的
  ```
  ![image](image/image-20200526230154.png) 

  ![image](image/image-20200526230231.png) 

  ![image](image/image-20200526230301.png)

  ![image](image/image-20200526230339.png)


  &nbsp;&nbsp;&nbsp;&nbsp;(6)、筛选过程的算法描述为
 ```
  void HeadAdjust(elem R[], int s, int m){
    // 已知R[s...m]中记录的关键字除R[s]之外均满足堆的定义,本函数
    // 调整R[s]的关键字,使R[s...m]称为一个大根堆
   rc=R[s];
   for(j=2*s;j<=m;j*=2){  //沿key较大的孩子结点向下筛选
   if(j<m && R[j] < R[j+1]) ++j; //j为key较大的记录的下标
   if(rc >=R[j]) break;
   R[s] = R[j]; s=j;   //rc应插入在位置s上
  }
   R[s] = rc;  //插入
}
 ```
 ![image](image/image-20200527085410.png)

``` 
 堆的调整可以看出: 对一个无序序列反复"筛选"就可以得到一个堆;
即:从一个无序序列建堆的过程就是一个反复 "筛选"的过程
  
  那么:如何由一个无序序列建成一个堆?
```

 &nbsp;&nbsp;&nbsp;&nbsp;(7)、堆的建立
 ``` 
   单节点的二叉树是堆; 在完全二叉树中所有以叶子结点(序号i>n/2)为根的子树是堆。
   这样,我们只需依次将以序号为n/2,n/2 - 1, ....,1的结点为根的子树均调整为堆即可。  
 
   最后一个非叶子结点在哪里? 在完全二叉树中最后一个叶子结点如果是n, 那么它的双亲
 是n/2 
   
 ```
  &nbsp;&nbsp;&nbsp;&nbsp;(8)、例如
```
  由于堆实质上是一个线性表,那么我们可以顺序存储一个堆。
    下面以一个实例介绍建立一个小根堆的过程。
  例:有关键字为49,38,65,97,76,13,27,49的一组记录,将其安关键字调整为一个小根堆。 
```
  ![image](image/image-20200527094222.png)

``` 
 从最后一个非叶子结点开始,以此向前调整:
 1)、调整从第n/2个元素开始,将以该元素为根的二叉树调整为堆
```
  ![image](image/image-20200527094454.png) 
``` 
 2)、将以序号为n/2 -1 的结点为根的二叉树调整为堆;
```
  ![image](image/image-20200527094603.png) 
``` 
 3)、再将以序号为n/2 -2 的结点为根的二叉树调整为堆;
```
  ![image](image/image-20200527094828.png) 
``` 
 4)、再将以序号为n/2 -3 的结点为根的二叉树调整为堆;
```
  ![image](image/image-20200527094929.png) 
``` 
 5)、对于右边右子树还没有调整完,从根往下调整, 要将元素调整到叶子结点才算完
  如果知道当前的编码,那么就可以根据完全二叉树的性质5来确定。
  将49和叶子结点27进行调整。
```
  ![image](image/image-20200527095321.png)

 &nbsp;&nbsp;&nbsp;&nbsp;(9)、将初始无序的R[1]到R[n]建成一个小根堆,可用以下语句实现
``` 
  for(i=n/2; i>=1; i--)
    HeapAdjust(R,i,n);
```

 &nbsp;&nbsp;&nbsp;&nbsp;(10)、由上分析得知
``` 
 若对一个无序序列建堆,然后输出根;重复该过程就可以由一个无需序列输出有序序列。
 实质上,堆排序就是利用完全二叉树父结点与孩子结点之间的内在关系来排序的。
```
  * 堆排序算法如下
``` 
  void HeapSort(elem R[]){ //对R[1]到R[n]进行堆排序
   int i;
   for(i = n/2; i>=1; i--) //最后一个非叶子结点
     HeapAdjust(R,i,n);  //建初始堆
   for(i = n; i>1; i--){ //进行n-1趟排序
     Swap(R[1], R[i]);  //根与最后一个元素交换
     HeapAdjust(R,1,i-1);  //对R[1]到R[i-1]重新建堆
 } 
}
```

 * 算法性能分析
  
   初始堆化所需时间不超过O(n)
  
   排序阶段(不含初始堆化)
  
   1)、 一次重新堆化所需时间不超过O(logn)
   
   2)、 n-1次循环所需时间不超过O(nlogn)
          Tw(n) = O(n) + O(nlogn) = O(nlogn)

   3)、堆排序的时间主要耗费在建初堆和调整建新堆时进行的反复筛选上。
   堆排序在最坏情况下,其时间复杂度也为O(nlog<sub>2</sub>n),这是堆排序的最大
   优点。无论待排序列中的记录是正序还是逆序排列,都不会使堆排序处于
   "最好"或 "最坏"的状态。
 ``` 
   另外,堆排序仅需一个记录大小供交换用的辅助存储空间。
   然后堆排序是一种不稳定的排序方法,它不适用于待排序记录个数n较少的情况,
  但是对于n较大的文件还是很有效的。 
 ```

10.5、归并排序

 &nbsp;&nbsp;&nbsp;&nbsp; 1、基本思想:将两个或两个以上的有序子序列 "归并"为一个有序序列。
    
   在内部排序中,通常采用的是2-路归并排序。 

   即:将两个位置相邻的有序子序列R[1..m]和R[m+1...n]归并为一个有序序列R[1..n]

  &nbsp;&nbsp;&nbsp;&nbsp;2、归并排序示例
   ![image](image/image-20200527105138.png)

  &nbsp;&nbsp;&nbsp;&nbsp;3、关键问题:如果将两个有序序列合成一个有序序列?
 ``` 
  有一个算法在第二章学过,就用一个新的空间来放置元素。
  两个有序的顺序表,变成一个有序的顺序表。
  在两个有序序列中选择元素 然后进行比较,那个小就放在 一个新的空间里面。  
 ```
  &nbsp;&nbsp;&nbsp;&nbsp;4、将两个有序序列合并成一个有序序列
```
  设R[low]-R[mid] 和R[mid+1]-R[high]Wie相邻,
  归并成一个有序序列R1[low]-R1[high].

  第一块子序列是low 到m, 第二块子序列是m+1到 high
  然后在子序列中选择元素来进行比较。
  比如: 第一块子序列的下标是 i开始, 第二块子序列的小标是j开始, 那么比较方式
就是
    SR[i].key<=SR[j].key, 则TR[k] = RS[i]; k++; i++;
    TR表示一个新的空间,k表示下标, 如果大于那么i的下标就往后移动。
    如果不大于 那么就是 TR[k] = RS[j]; k++; j++;
    
```
  ![image](image/image-20200527110521.png)

  &nbsp;&nbsp;&nbsp;&nbsp;5、归并排序算法分析
  * 时间效率: O(nlog<sub>2</sub>n)
  * 空间效率: O(n)
 ```
   因为需要一个与原始序列同样大小的辅助序列(R1)。这正是此算法的缺点。 
 ```
  * 稳定性:稳定

  ![image](image/image-20200527110824.png )


10.6、基数排序

   &nbsp;&nbsp;&nbsp;&nbsp;1、基本思想:分配+收集
``` 
 也叫桶排序或箱排序:设置若干个箱子,将关键字为k的记录放入第k个箱子,
然后在按序号将非空的连接。
 基数排序:数字是有范围的,均由0-9这个十个数字组成,则只需设置十个箱子,
相继按个、十、百...进行排序。
```

  &nbsp;&nbsp;&nbsp;&nbsp;2、例子
 ```
  (614, 738, 921, 485, 637, 100, 215, 530, 790, 306)
  第一趟分配(按个位排), 将这些数放到0-9 标记的桶里去。
 分配好了之后, 然后依次从0-0收集起来
  第一趟收集的结果:
  530 790 921 101 614 485 215 306 637 738
 ```
  ![image](image/image-20200527135304.png)
  * 以第一趟收集的结果来进行第二趟分配
```
 第一趟收集的结果:
  530 790 921 101 614 485 215 306 637 738
 以第一趟收集的结果来进行第二趟分配,第二趟分配(按十位排)
 第二趟收集 
  101 306 614 215 921 530 637 738 485 790 
```
 ![image](image/image-20200527135620.png)

  * 以第二趟收集的结果来进行第三趟分配
```
 第二趟收集的结果:
  101 306 614 215 921 530 637 738 485 790 
 以第二趟收集的结果来进行第三趟分配,第三趟分配(按百位排)
 第三趟收集 
  101 215 306 485 530 614 637 738 790 921   
```
 ![image](image/image-20200527140153.png)  

 * 在进行第二趟分配和收集后 已经有序了 那么就不再进行分配了

 &nbsp;&nbsp;&nbsp;&nbsp;(2)、基数排序算法分析
 ``` 
  时间效率:O(k*(n+m))
        k:关键字个数, 这个表示分配的趟数,比如上面的三位数,进行了3趟分配
        m:关键字取值范围为m个值, 表示 桶的个数,有多少个桶那么收集的时候
         就要收集多少次。
        n:表示的是在分配的时候要往桶里面分配多少个元素

    因为每一次都需要分配n个元素,收集回来的时候需要收集m次, 总共需要多少遍
 需要看关键字k。 所以这里是k*(n+m)


   空间复杂度: O(n+m)
    首先要准备m个桶用来放置元素,然后收集回来后需要一个存放n个元素的空间
所以总共需要空间O(n+m)。
 ```
  ![image](image/image-20200527141605.png) 


  * 各种排序方法比较
    ![image](image/image-20200527141950.png) 


10.7、各种排序方法的综合比较

 一、时间性能
  * 按平均的时间性能来分,有三类排序方法:
 ```
  1)、时间复杂度为O(nlogn)的方法有:
      快速排序、堆排序和归并排序,其中以快速排序为最好;
  2)、时间复杂度为O(n^2)的有:
      直接插入排序、冒泡排序和简单选择排序,其中以直接擦好热为最好,
    特别是对那些 对关键字近似的记录序列尤为如此;
  3)、时间复杂度为O(n)的排序方法只有:基数排序。
 ```
 * 当待排记录序列按关键字顺序有序时,直接插入排序和冒泡排
 序能达到O(n)的时间复杂度;而对于快速排序而言,这是最不好的情况,
 此时的时间性能退化为O(n^2),因此是应该尽量避免的情况。

 * 简单选择排序、堆排序和归并排序的时间性能不随记录序列中关键字的分别而改变。

 二、空间性能
``` 
  指的是排序过程中所需的辅助空间大小
 1、所有的简单排序方法(包括:直接插入、冒泡和简单选择)和堆排序的空间复杂度
为O(1)
 2、快速排序为O(logn),为栈所需的辅助空间
 3、归并排序所需辅助空间最多,其空间复杂度为O(n)
 4、链式基数排序需附设队列首尾指针,则空间复杂度为O(rd)
```
 三、排序方法的稳定性能
 ``` 
  1、稳定的排序方法指的是,对于两个关键字相等的记录,它们在序列中的相对
位置,在排序之前和经过排序之后,没有改变。
  2、当对多关键字的记录序列进行LSD方法排序时,必须采用稳定的排序方法。
  3、对于不稳定的排序方法,只要能举出一个实例说明即可。
  4、快速排序和堆排序是不稳定的排序方法。
 ```

 四、关于 "排序方法的时间复杂度的下限"
  ``` 
   1、这里讨论的各种排序方法,除基数排序外,其它方法都是基于"比较关键字"
  进行排序的排序方法,可以证明,这类排序可能达到的最快的时间复杂度为O(nlogn)
    (基数排序不是基于"比较关键字"的排序方法,所以它不受这个限制)
   3、可以用一棵 判定树来描述这类基于"比较关键字" 进行排序的排序方法。
  ```