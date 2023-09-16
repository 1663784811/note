# JUC  java 并发编程

######################################
两份内容
    1.线程控制
    2.锁

#####################################
### 一、线程控制
    
    线程创建
        1.Thread 类
        2.Runable 接口
        3.Callable 接口
        
    线程睡眠、等待、唤醒
        Thread.sleep(100)
        wait()等待通知方法是Object类中的方法
        join()方法是Thread类直接提供的，无参，返回值void。
        notify()函数一个线程在调用共享对象的notify()方法后，会唤醒一个在共享变量上wait等待的线程，如果有多个线程在等待，具体唤醒哪一个则是随机的。
        notifyAll()函数唤醒共享变量上的所有wait挂起的线程。
        
    用户线程：
    守护线程：
    异步任务接口: Future
            FutureTask
            RunnableScheduledFuture -> ScheduledThreadPoolExecutor
            CompletableFuture
                4个重要的静态方法
                    runAsync(Runable  runable);
                    runAsync(Runable  runable, Excutor ex);
                    supplyAsync(Supplier<U> su);
                    supplyAsync(Supplier<U> su, Excutor ex);
    