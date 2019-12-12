package other;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class InterceptorChain {

    public Executor wrap1( Executor target, Interceptor interceptor ) {

        return new ExecutorProxy(target, interceptor);
    }

    public Executor wrap2( Executor target, Interceptor interceptor ) {
        return new ExecutorProxyProxy(target, interceptor);
    }


    public static void main( String[] args ) {

        Interceptor v1 = pj -> {
            System.out.println("interceper 1->" + pj.getArgs());
            return pj.process();
        };
        Interceptor v2 = pj -> {
            System.out.println("interceper 2->" + pj.getArgs());
            return pj.process();
        };
        Executor e = new Executor();
        InterceptorChain chain = new InterceptorChain();
        e = chain.wrap1(e, v2);
        e = chain.wrap2(e, v1);
        e.execute("haha");
    }


}

class ExecutorProxy extends Executor {

    protected Interceptor interceptor;

    protected Executor target;

    public ExecutorProxy( Executor target, Interceptor interceptor ) {
        this.interceptor = interceptor;
        this.target = target;
    }

    private String executeX( String x ) {
        try {
            Method m = target.getClass().getDeclaredMethod("execute", String.class);
            return (String) m.invoke(target, x);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    String execute( String x ) {
        try {
            InvokerHandler invokerHandler = new InvokerHandler(this, x);
            return (String) interceptor.intercept(new Processor(invokerHandler));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class ExecutorProxyProxy extends ExecutorProxy {

    public ExecutorProxyProxy( Executor executor, Interceptor interceptor ) {
        super(executor, interceptor);
    }

    private String executeX( String x ) {
        try {
            Method m = target.getClass().getDeclaredMethod("execute", String.class);
            return (String) m.invoke(target, x);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    String execute( String x ) {
        try {
            InvokerHandler invokerHandler = new InvokerHandler(this, x);
            return (String) interceptor.intercept(new Processor(invokerHandler));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}

interface Interceptor {

    Object intercept( Processor pj );
}


class Executor {

    String execute( String x ) {
        System.out.println("done");
        return x;
    }
}


class InvokerHandler {

    private Method m;
    private Object args;
    private Object target;

    InvokerHandler( Object target, Object args ) throws NoSuchMethodException {
        m = target.getClass().getDeclaredMethod("executeX", String.class);
        m.setAccessible(true);
        this.args = args;
        this.target = target;

    }

    Object invoke() throws InvocationTargetException, IllegalAccessException {
        return m.invoke(target, args);
    }

    public Method getM() {
        return m;
    }

    public Object getArgs() {
        return args;
    }

    public Object getTarget() {
        return target;
    }
}


class Processor {

    private InvokerHandler handler;


    public Processor( InvokerHandler invokerHandler ) {
        this.handler = invokerHandler;
    }

    Object process() {
        try {
            return handler.invoke();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object getArgs() {
        return handler.getArgs();
    }


}
