/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

package algos.unionfind;

public class QuickUnionFind
{

    private int[] node;

    public QuickUnionFind(int n)
    {
        node = new int[n+1];
        for (int i = 0; i <= n; i++)
        {
            node[i]= i;
        }
    }
    
    private int findRoot(int n)
    {
        while (node[n]!=n)
        {
            n=node[n];
        }
        return n;
    }

    public void union(int start, int end)
    {
        node[findRoot(end)]=findRoot(start);
        
    }

    public boolean isConnected(int start, int end)
    {
        
        return findRoot(start) == findRoot(end);
    }
    
}


/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
