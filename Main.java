import java.io.*;
import java.util.*;

class Main 
{
  public static int a=3,b=3,c,d,f,g=0,t;
  
  public static int m[][] = new int[a][b];
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        m[i][j] = 0;
      }
    }
    
    m[1][1] = 2;
    
    disp();
    
    do
    {
      System.out.print("Choice : ");
      char ch = sc.next().charAt(0);
      move(ch);
      disp();
      f = check(m);
    } while(f!=0);
  }
   
  public static void disp()
  {
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.print("   "+m[i][j]+"   ");
      }
      System.out.println();
    }
  }
  
  public static void move(char ch)
  {
    switch(ch)
      {
        case 'w':
            for(int i=0;i<3;i++)
            {
              for(int j=0;j<3;j++)
              { 
                c = i;
                d = j;
                while((m[c][d]!=0)&&(c>=1))
                {
                  int e = m[c][d];
                  if(m[c-1][d]==m[c][d])
                  {
                    m[c-1][d] = 2*m[c][d];
                    m[c][d] = 0;
                  }
                  else
                  {
                    if(m[c-1][d]==0)
                    {
                      m[c-1][d] = e;
                      m[c][d] = 0;
                    }
                    else
                    {
                      m[c][d] = e;
                    }
                  }
                  c--;
                }
              }
            }
            insert(ch);
            break;
        
        case 's':
            for(int j=0;j<3;j++)
            {
              for(int i=0;i<3;i++)
              { 
                c = i;
                d = j;
                while((m[c][d]!=0)&&(c<=1))
                {
                  int e = m[c][d];
                  if(m[c+1][d]==m[c][d])
                  {
                    m[c+1][d] = 2*m[c][d];
                    m[c][d] = 0;
                  }
                  else
                  {
                    if(m[c+1][d]==0)
                    {
                      m[c+1][d] = e;
                      m[c][d] = 0;
                    }
                    else
                    {
                      m[c][d] = e;
                    }
                  }
                  c++;
                }
              }
            }
            insert(ch);
            break;
        
        case 'a':
            for(int i=0;i<3;i++)
            {
              for(int j=0;j<3;j++)
              { 
                c = i;
                d = j;
                while((m[c][d]!=0)&&(d>=1))
                {
                  int e = m[c][d];
                  if(m[c][d-1]==m[c][d])
                  {
                    m[c][d-1] = 2*m[c][d];
                    m[c][d] = 0;
                  }
                  else
                  {
                    if(m[c][d-1]==0)
                    {
                      m[c][d-1] = e;
                      m[c][d] = 0;
                    }
                    else
                    {
                      m[c][d] = e;
                    }
                  }
                  d--;
                }
              }
            }
            insert(ch);
            break;
        
        case 'd':
            for(int i=0;i<3;i++)
            {
              for(int j=0;j<3;j++)
              { 
                c = i;
                d = j;
                while((m[c][d]!=0)&&(d<=1))
                {
                  int e = m[c][d];
                  if(m[c][d+1]==m[c][d])
                  {
                    m[c][d+1] = 2*m[c][d];
                    m[c][d] = 0;
                  }
                  else
                  {
                    if(m[c][d+1]==0)
                    {
                      m[c][d+1] = e;
                      m[c][d] = 0;
                    }
                    else
                    {
                      m[c][d] = e;
                    }
                  }
                  d++;
                }
              }
            }
            insert(ch);
            break;
      }
  }
  
  public static void insert(char ch)
  {
    int f=0;
    switch(ch)
    {
      case 'w': 
        t = (g%3);
        for(int i=t;i<3;i++)
        {
          if(i==3)
          {
            i = 0;
          }
          if(m[2][i]==0)
          {
            m[2][i]=2;
            f=1;
          }
          if(f==1)
          {
            g++;
            break;
          }
        }  
        break;
      case 's': 
        t = (g%3);
        for(int i=t;i<3;i++)
        {
          if(i==3)
          {
            i = 0;
          }
          if(m[0][i]==0)
          {
            m[0][i]=2;
            f=1;
          }
          if(f==1)
          {
            g++;
            break;
          }
        }
        break;
      case 'a': 
        t = (g%3);
        for(int i=t;i<3;i++)
        {
          if(i==3)
          {
            i = 0;
          }
          if(m[i][2]==0)
          {
            m[i][2]=2;
            f=1;
          }
          if(f==1)
          {
            g++;
            break;
          }
        }
        break;
      case 'd': 
        t = (g%3);
        for(int i=t;i<3;i++)
        {
          if(i==3)
          {
            i = 0;
          }
          if(m[i][0]==0)
          {
            m[i][0]=2;
            f=1;
          }
          if(f==1)
          {
            g++;
            break;
          }
        }
        break;  
    }
  }
  public static int check(int m[][])
  {
    int f=0;
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        if(m[i][j]==0)
        {
          f=1;
        }
      }
    }
    return f;
  }
}