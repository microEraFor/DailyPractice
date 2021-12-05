import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale l=new Locale("","CN");
        System.out.println(l.getDisplayName());

    }






























    
//    public static List<HashMap<String,String>> nodeList(List<HashMap<String,String>> nodeTree,int id){
//        List<HashMap<String,String>> ans=new ArrayList<>();
//        for(int i=0;i<14;i++){
//            HashMap<String,String> temp=nodeTree.get(i);
//            if(temp.get("pId").equals(id+"") && temp.get("leaf").equals("True")){
//                for(int j=i+1;j<14;j++){
//                    if(nodeTree.get(j).get("pId").equals(temp.get("id")) && nodeTree.get(j).get("leaf").equals("False")){
//                        temp=nodeTree.get(j);
//                        break;
//                    }
//                }
//                ans.add(temp);
//            }
//        }
//        return ans;
//    }
//    public static int maxValue (String s, int k) {
//        if(s.length()<=k) return 0;
//        //if(s.length()==k) return Integer.parseInt(s);
//        int max=0;
//        for(int i=0;i+k<=s.length();i++){
//            max=Math.max(max,Integer.parseInt(s.substring(i,i+k)));
//        }
//        return max;
//    }
//
//    public static boolean isValid(int n){
//        if(n==1 || n==3) return true;
//        for(int i=2;i<(int)Math.sqrt(n);i++){
//            if(n%i==0) return false;
//        }
//        return true;
//    }
//
//    public static boolean isFibo(int n){
//        if(n==0 || n==1) return true;
//        int lastFibo=-1;
//        List<Integer> l=new ArrayList<>();
//        l.add(0);l.add(1);
//        for(int i=2;lastFibo<n;i++){
//            l.add(l.get(i-1)+l.get(i-2));
//            lastFibo=l.get(i);
//        }
//        if(lastFibo==n) return true;
//        return false;
//    }




    //判断一个数是否为2的幂方
    public static boolean isPow(int n){
        if(n<=0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }



/*


int n=scan.nextInt(),b= scan.nextInt();
        List<List<Integer>> danGuChun=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> once=new ArrayList<>();
            for(int j=0;j<3;j++){
                once.add(scan.nextInt());
            }
            scan.nextLine();
            danGuChun.add(once);
        }
        int ans=0,down=0,up=0,index=0;
        while(index<n){
            List<Integer> l=danGuChun.get(index);
            down=Math.min(down,(l.get(1)-l.get(2)));
            up=Math.max(up,(l.get(1)+l.get(2)));
            if(down<=0 && up>=b){
                System.out.println(ans);
                return;
            }
            ans+=1;
            index+=1;
        }
        System.out.println(n);
        return;
 */


 /*
Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<T;i++){
            int n=scan.nextInt(),m=scan.nextInt();
            scan.nextLine();
            int[] row1=new int[m],row2=new int[m];
            for(int j=0;j<m;j++){
                row1[j]=scan.nextInt();
            }
            scan.nextLine();
            for(int j=0;j<m;j++){
                row2[j]=scan.nextInt();
            }
        }

        //找出double类型数最接近的分数，且分子分母皆<=30
        double d=scan.nextDouble();


    //学写一下优先队列
    public static void sort(){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                return o1-o2;
            }
        });
        pq.add(4);pq.add(3);pq.add(6);pq.add(2);pq.add(1);pq.add(7);pq.add(9);pq.add(8);
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }

    //判断输入字符是否为闰年
    public boolean isRunYear(String year){
        year=year.trim();
        if(year.length()==0 || year.length()>4) return false;
        for(char c:year.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }
        int y=Integer.parseInt(year);
        if(y%4==0 && y%100!=0 || y%400==0) return true;
        return false;
    }
    /*
    测试用例：2020(是),空,0,1,9999,10000,-200,a123,2001,((*&^%))
    数字测试用例过少：需拆分满足条件，比如能被4和100整除且不被400整除，被4整除且不被100整除（2008），被4整除同时被100 整除的年份且被400整除（2000）等
     */


}


/*

public static boolean check(int[] arr){
        int l= arr.length,t=0;
        for(t=0;t<l;t++){
            if((t+1)!=arr[t]){
                return false;
            }
        }
        return true;
    }

    public static int roll(int[] arr,int l,int r){
        int count=0,length=r-l+1;
        for(int i=l;i<length;i++){
            arr[(i-1)%length]=arr[i];
        }
        count+=1;
        if(check(arr) && count<arr.length){
            return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            for(int j=0;j<num;j++){
                int[] arr=new int[num];
                arr[j]=sc.nextInt();

                int l=0,r= arr.length;
                while(l<=r && arr[l]==l && arr[r]==r){
                    l+=1;r-=1;
                }
                if(r<l){
                    System.out.println(0);
                }else if(arr[l]!=l && arr[r]==r){
                    while(l<=r && arr[r]==r){
                        r-=1;
                    }
                    System.out.println(roll(arr,l,r));
                }else if(arr[l]==l && arr[r]!=r){
                    while(l<=r && arr[l]==l){
                        l+=1;
                    }
                    System.out.println(roll(arr,l,r));
                }else if(arr[l]!=l && arr[r]!=r){
                    System.out.println(roll(arr,l,r));
                }

            }
        }
    }

 */


/*
222222
StringBuilder sb=new StringBuilder(n);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int left=sc.nextInt(),right=sc.nextInt(),k=sc.nextInt();
            for(int begin=left-1;begin<right;begin++){
                if(((int)sb.charAt(begin)-k)<97){
                    char replace=(char)((int)sb.charAt(begin)-k+26);
                    sb.replace(begin,begin+1,replace+"");
                }else{
                    char replace=(char)((int)sb.charAt(begin)-k);
                    sb.replace(begin,begin+1,replace+"");
                }
            }
//            System.out.println(sb);
        }
        System.out.println(sb);
 */

/*
1111111111
if(n>0){
            for(int i=0;i<n;i++){
                int input=sc.nextInt();
                int remain=input%c,chushu=input/c;
                StringBuilder res=new StringBuilder();
                if(remain==0){
                    res.append((char)(chushu+64));
                    res.append(c);
                }else{
                    res.append((char)(chushu+65));
                    res.append(remain);
                }
                System.out.println(res);
            }
        }
 */


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char[][] map=new char[n][n];
//        boolean[][] check=new boolean[n][n];
//        StringBuilder ans=new StringBuilder();
//        sc.nextLine();
//        for(int i=0;i<n;i++){
//            String row=sc.nextLine().trim();
//            for(int j=0;j<n;j++){
//                map[i][j]=row.toCharArray()[j];
//                //check[i][j]=false;
//                System.out.println(check[i][j]);
//            }
//        }
//
//        int i=0,j=0;
//        while(true){
//            //右
//            while(j<n && !check[i][j]){
//                if(map[i][j]!='0'){
//                    ans.append(map[i][j]);
//                    check[i][j]=true;
//                    j+=1;
//                }else{
//                    System.out.println(ans);
//                    return;
//                }
//            }
//            j-=1;
//            //下
//            i+=1;
//            while(i<n && !check[i][j]){
//                if(map[i][j]!='0') {
//                    ans.append(map[i][j]);
//                    check[i][j] = true;
//                    i += 1;
//                }else{
//                    System.out.println(ans);
//                    return;
//                }
//            }
//            i-=1;
//            //左
//            j-=1;
//            while(j>=0 && !check[i][j]){
//                if(map[i][j]!='0') {
//                    ans.append(map[i][j]);
//                    check[i][j] = true;
//                    j -= 1;
//                }else{
//                    System.out.println(ans);
//                    return;
//                }
//            }
//            //j=-1所以
//            j+=1;
//            //上
//            i-=1;
//            while(i>=0 && !check[i][j]){
//                if(map[i][j]!='0') {
//                    ans.append(map[i][j]);
//                    check[i][j] = true;
//                    i -= 1;
//                }else{
//                    System.out.println(ans);
//                    return;
//                }
//            }
//            i+=1;
//            j+=1;
//        }
//
//    }
//
//}




/*
static int res=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        int[] honey=new int[n];
        int honeySum=0;
        for(int i=0;i<n;i++){
            honey[i]=sc.nextInt();
            honeySum+=honey[i];
        }

        //全吃完
        if(k>=honeySum){
            System.out.println(0);
            return;
        }
        if(honey.length==2){
            System.out.println(honeySum-k);
            return;
        }

        eat(honey,k);
        System.out.println(res);

    }

    static void eat(int[] honey,int k){
        if(k<=0){
            for(int i=1;i< honey.length-1;i++){
                res=Math.min(res,Math.max(honey[i-1]+honey[i],honey[i]+honey[i+1]));
            }
        }
        for(int i=1;i< honey.length-1;i++){

        }
    }
 */



/*

public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testNum=sc.nextInt();
        if(testNum>0){
            for(int i=0;i<testNum;i++){
                int num=sc.nextInt();
                if(num%2!=0){
                    System.out.println("NO");
                }else{
                    int[] nums=new int[num];
                    for(int j=0;j<num;j++){
                        nums[j]=sc.nextInt();
                    }

                    Map<Integer,Integer> m=new HashMap<>();
                    for(int ii:nums){
                        if(m.containsKey(ii)){
                            m.put(ii,m.get(ii)+1);
                        }else{
                            m.put(ii,1);
                        }
                    }
                    boolean check=false;
                    if(m.size()!=2){
                        System.out.println("NO");
                        check=true;
                    }else{
                        Set<Integer> set=new HashSet<>();
                        for(int tmp:m.values()){
                            set.add(tmp);
                        }
                        if(set.size()!=1){
                            System.out.println("NO");
                            check=true;
                        }
                    }
                    if(!check){
                        System.out.println("YES");
                    }
                }

            }
        }

    }
 */



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a=sc.nextLine(),b=sc.nextLine();
//        if(a.trim().length()==0 && b.trim().length()==0) {
//            System.out.println("1");
//            return;
//        }
//        if(a.length()!=0 && b.length()==0){
//            System.out.println("1");
//            return;
//        }
//        if(a.length()<b.length()){
//            System.out.println("0");
//            return;
//        }
//        Map<Character,Integer> ma=new HashMap<>();
//        Map<Character,Integer> mb=new HashMap<>();
//        for(Character c:a.toCharArray()){
//            if(ma.containsKey(c)) ma.put(c,ma.get(c)+1);
//            else ma.put(c,1);
//        }
//        for(Character c:b.toCharArray()){
//            if(mb.containsKey(c)) mb.put(c,mb.get(c)+1);
//            else mb.put(c,1);
//        }
//        boolean check=false;
//        for(Character c:mb.keySet()){
//            if(!ma.containsKey(c)){
//                System.out.println("0");
//                check=true;
//                return;
//            }else if( ma.containsKey(c) && ma.get(c)<mb.get(c)){
//                System.out.println("0");
//                check=true;
//                return;
//            }
//        }
////        if(!check){
//            System.out.println("1");
////        }
//    }
//
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        List<String> buildings = new ArrayList<>();
//        List<String> place = new ArrayList<>();
//        for (int i = 0; i < num; i++) {
//            String in = sc.nextLine();
//            String[] info = in.split(" ");
//            for (int j = 0; j < info.length; j++) {
//                if (info[j].equals("Add")) {
//                    buildings.add(info[1]);
//                    place.add(info[2] + " " + info[3]);
//                } else if (info[j].equals("Query")) {
//                    if (buildings.contains(info[1])) {
//                        System.out.println("yes");
//                        int index = buildings.indexOf(info[1]);
//                        System.out.println(place.get(index).split(" ")[0] + place.get(index).split(" ")[1]);
//                    } else {
//                        System.out.println("no");
//                    }
//                } else if (info[j].equals("Delete")) {
//                    buildings.remove(info[1]);
//                }
//            }
//        }
//    }



//    static int res=0;
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
////        int[][] map=new int[n][m];
////        for(int i=0;i<n;i++){
////            for(int j=0;j<m;j++){
////                map[i][j]=sc.nextInt();
////            }
////        }
//        int[][] map={{0,-1,1,2},{3,1,5,1},{1,-1,-1,-1},{1,1,-1,0}};
//        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};//上下左右
//        int tmp=0;
//        search(4,4,1,1,1,map,dir,tmp);
//        System.out.println(res);
//    }
//
//    public static void search(int n,int m,int k,int x,int y,int[][] map,int[][] dir,int tmp){
//        if(x<0 || y<0 || x>=n || y>=m){
//            return;
//        }
//        else if(map[x][y]<0){
//            return;
//        }
//        else{
//            tmp+=map[x][y];
//            if(k>0){
//                for(int i=0;i<4;i++){
//                    search(n,m,k-1,x+dir[i][0],y+dir[i][1],map,dir,tmp);
//                }
//            }else{
//                res=Math.max(res,tmp);
//                tmp=0;
//            }
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String in=sc.nextLine();
//        for(char c : in.trim().toCharArray()){
//            if(!Character.isDigit(c)){
//                return;
//            }
//        }
//        int n = Integer.parseInt(in);
////        System.out.print("n="+n);
//        if (n > 0) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                list.add(sc.nextInt());
//            }
//
//            for(int i=1;i<list.size();i++){
//                if(list.size()==1) break;
//                if(i<1) i=1;
//                while(i>=1 && i<list.size() && list.size()>1 && list.get(i-1)<list.get(i)){
//                    list.remove(i-1);
////                    int tmp=i-1;
////                    while(tmp>=0){
////                        list.remove(tmp);
////                        tmp-=1;
////                    }
////                    i=tmp;
//                }
//            }
//
////            int back=0,front=1;
////            while(back<front && front<list.size()){
////                if(list.get(back)<list.get(front)){
////                    list.remove(back);
////                }
////            }
//
////            for (int i = 0; i < list.size() - 1; i++) {
////                if (list.get(i) < list.get(i + 1)) {
////                    list.remove(i);
////                    i=0;
////                }
////            }
//            System.out.println(list.size());
//            for (int i=0;i<list.size();i++) {
//                if(i==list.size()-1){
//                    System.out.print(list.get(i) + "\n ");
//                }else{
//                    System.out.print(list.get(i) + " ");
//                }
//            }
//        }
//    }



//    public static int energy(int[] numbers, int begin, int end) {
//        int sum = 0;
//        boolean check = true;
//        for (int i = begin; i <= end; i++) {
//            if (check) {
//                sum += numbers[i];
//                check = false;
//            } else {
//                sum -= numbers[i];
//                check = true;
//            }
//        }
//        return sum;
//    }

//    public static void main(String[] args) {
////        long[][] t= [[1610000031138, 1610000035950], [1610000069951, 1610000070481], [1610000057673, 1610000060035], [1610000054054, 1610000055910], [1610000051550, 1610000055824], [1610000007030, 1610000015860], [1610000034848, 1610000035743], [1610000071848, 1610000076082], [1610000033080, 1610000040814], [1610000098830, 1610000107163], [1610000072408, 1610000077206], [1610000080095, 1610000082948], [1610000010690, 1610000019809], [1610000095191, 1610000102590], [1610000086055, 1610000091841], [1610000006655, 1610000009243], [1610000079056, 1610000088091], [1610000050499, 1610000053698], [1610000079235, 1610000086235], [1610000091063, 1610000095948], [1610000053071, 1610000060289], [1610000042965, 1610000044302], [1610000030261, 1610000035735], [1610000063273, 1610000068484], [1610000018526, 1610000018620], [1610000012080, 1610000014595], [1610000054147, 1610000061607], [1610000006016, 1610000013090], [1610000079415, 1610000086677], [1610000043195, 1610000046577], [1610000011567, 1610000021464], [1610000063727, 1610000072752], [1610000092433, 1610000098792], [1610000077639, 1610000087292], [1610000007171, 1610000009316], [1610000099965, 1610000105769], [1610000051982, 1610000052324], [1610000077968, 1610000087109], [1610000004921, 1610000010201], [1610000073512, 1610000077570], [1610000067079, 1610000071651], [1610000063038, 1610000063040], [1610000040500, 1610000042890], [1610000033535, 1610000040964], [1610000094686, 1610000097926], [1610000007951, 1610000016340]],[1610000085863, 1610000063923]
//////                {{1610000000000L,1620000000000L}, {1610000000000L,1610000001000L}, {1615000000000L,1620000000000L}};
////        long[] test={1610000002000L,1616000000000L,1630000000000L};
////        int[][] res=search_log(t,test);
////        for(int i=0;i<res.length;i++){
////            for(int j=0;j<res[i].length;j++){
////                System.out.print(res[i][j]+",");
////            }
////            System.out.println();
////        }
//
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        int res = numbers[0];
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int tmp=energy(numbers, i, j);
//                res = Math.max(res, tmp);
//            }
//        }
//        if (res < 0) {
//            System.out.println(0);
//        } else {
//            System.out.println(res);
//        }
//    }
//
//    public static int[][] search_log(long[][] logs, long[] tss) {
//        if (logs.length == 0 || tss.length == 0) return new int[0][0];
//        int[][] ans = new int[tss.length][];
//        List<Integer> l = new ArrayList<>();
//
//        for (int i = 0; i < tss.length; i++) {
//            for (int j = 0; j < logs.length; j++) {
//                if (tss[i] >= logs[j][0] && tss[i] <= logs[j][1]) {
//                    l.add(j);
//                }
//            }
//            int[] tmp=new int[l.size()];
//            for(int k=0;k<l.size();k++){
//                tmp[k]=l.get(k);
//            }
//            ans[i]=tmp;
//            l.clear();
//        }
//        return ans;
//    }

//    public static void main(String[] args){

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        HashMap<String,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){
//            String tmp=sc.nextLine();
//            if(map.containsKey(tmp)){
//                map.put(tmp,map.get(tmp)+1);
//            }else{
//                map.put(tmp,1);
//            }
//        }
//        int ans=0;
//        for(int i:map.values()){
//            if(100*i>=n){
//                ans+=1;
//            }
//        }
//        System.out.println(ans);
//    }

//        public int[] reOrderArray ( int[] array){
//            if (array.length == 0) return array;
//            List<Integer> l1 = new ArrayList<>();
//            for (int i : array) {
//                if (i % 2 != 0) {
//                    l1.add(i);
//                }
//            }
//            for (int ii : array) {
//                if (ii % 2 == 0) {
//                    l1.add(ii);
//                }
//            }
//            int k;
//            for (k = 0; k < array.length; k++) {
//                array[k] = l1.get(k);
//            }
//            return array;
//        }



//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNextLine()) {
//            String in=scan.nextLine().trim();
//            int check=0;
//            for(char c:in.toCharArray()){
//                if(check!=0) break;
//                if(!Character.isDigit(c)){
//                    System.out.println("Impossible");
//                    check=1;
//                }
//            }
//            if(check==0){
//                int n=Integer.parseInt(in);
//                if(n<=0 || n>50){
//                    System.out.println("Impossible");
//                }else{
//                    Object[] arr=new Object[100];
//                    arr[0]=1;arr[1]=1;
//                    for(int i=2;i<50;i++){
//                        if(i<=45){
//                            arr[i]=(int)arr[i-1]+(int)arr[i-2];
//                        }else{
//                            arr[i]=superBigNum(arr[i-1]+"",arr[i-2]+"");
//                        }
//                    }
//                    System.out.println(arr[n-1]);
//                }
//            }
//        }
//    }



