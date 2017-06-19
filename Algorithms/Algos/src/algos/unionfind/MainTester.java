/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

package algos.unionfind;

public class MainTester
{
    
    
    public static void main(String[] args)
    {
        QuickUnionFind uf = new QuickUnionFind(20);
        
        uf.union(1, 11);
        uf.union(2, 11);
        uf.union(5, 11);
        uf.union(1, 11);
        uf.union(20, 11);
        uf.union(16, 15);
        uf.union(8, 15);
        uf.union(4, 15);
       
        System.out.println(uf.isConnected(2,8));
        System.out.println(uf.isConnected(15,8));
        uf.union(2, 4);
        System.out.println(uf.isConnected(2,8));
    }
}

/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 * 
 * SPPA-T3000
 */
