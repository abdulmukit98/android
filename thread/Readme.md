* Create class that extend thread

```
class NThread extends Thread
{
    NThread()
    {
    }
    
    public void run()
    {
        try {
          sleep(1000);  ...
        } 
        catch(Exception e) {
        
        }
    
    }

}
```

* call thread 

```
NThread nthread = new NThread();
nthread.start();
```
