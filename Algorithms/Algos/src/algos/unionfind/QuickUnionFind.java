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
    private int[] size;
    
    public QuickUnionFind(int n)
    {
        node = new int[n + 1];
        size = new int[n + 1];
        for (int i = 0; i <= n; i++)
        {
            node[i] = i;
        }
    }
    
    private int findRoot(int n)
    {
        while (node[n] != n)
        {
            node[n]=node[node[n]];
            n = node[n];
        }
        return n;
    }
    
    public void union(int start, int end)
    {
        
        int i = findRoot(start);
        int j = findRoot(end);
        if (size[i] > size[j])
        {
            node[j] = i;
            size[i] += size[j];
        }
        else
        {
            node[i] = j;
            size[j] += size[i];
        }
        
    }
    
    public boolean isConnected(int start, int end)
    {
        
        return findRoot(start) == findRoot(end);
    }
    
    public int find(int i)
    {
        int largest = i;
        for (int j = node.length - 1; j > i; j++)
        {
            if (node[i] == node[j])
            {
                largest = j;
            }
        }
        return largest;
    }
}

/*
 * Copyright (c) Siemens AG 2017 ALL RIGHTS RESERVED
 * 
 * SPPA-T3000
 */
