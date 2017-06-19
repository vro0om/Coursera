/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED.
 *
 * SPPA-T3000  
 * 
 */

package algos.unionfind;

public class LazyUnionFind
{
    private int[] node;

    public LazyUnionFind(int n)
    {
        node = new int[n+1];
        for (int i = 0; i <= n; i++)
        {
            node[i]= i;
        }
    }
    
    
    public boolean isConnected(int start,int end)
    {
        return node[start] == node[end];
        
    }
    
    public void union(int start,int end)
    {
        int pid = node[start];
        int qid = node[end];
        for (int i = 0; i < node.length; i++)
        {
            if (node[i]== qid)
            {
                node[i] = pid;
            }
        }
    }
}


/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 *
 * SPPA-T3000
 */
