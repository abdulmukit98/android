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

### call thread 

```
NThread nthread = new NThread();
nthread.start();
```

### Access main activity content throuth background thread

* call a handler with **Looper.getMainLooper()**
```
    new Handler(Looper.getMainLooper()).post(new Runnable() {
        @Override
        public void run() {
            btnWhat.setText("Hello p: " + p);
        }
    });
```
