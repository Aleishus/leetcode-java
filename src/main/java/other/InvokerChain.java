package other;


/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class InvokerChain {

    Invoker invoker = null;

    public String doInvoke( String x ) {
        return invoker.invoke(x);
    }


    public void addFilter( IFilter f ) {
        if (invoker == null) {
            invoker = new Invoker(f);
        } else {
            Invoker next = invoker;
            while (next.getNext() != null) {
                next = next.getNext();
            }
            Invoker inv = new Invoker(f);
            next.setNext(inv);
        }

    }

    public static void main( String[] args ) {
        IFilter v1 = ( invoker, s ) -> {
            System.out.println("invoke 1->"+s);
            return invoker.invoke(s+"fuck");
        };
        IFilter v2 = ( invoker, s ) -> {
            System.out.println("invoke 2->"+s);
            return invoker.invoke(s);
        };

        IFilter def = ( invoker, s ) -> {
            System.out.println("done");
            return "done";
        };
        InvokerChain chain = new InvokerChain();
        chain.addFilter(v1);
        chain.addFilter(v2);
        chain.addFilter(def);
        chain.doInvoke("haha");
    }

}

class Invoker {

    private IFilter filter;
    private Invoker next;

    public Invoker( IFilter filter ) {
        this.filter = filter;
    }

    public void setNext( Invoker next ) {
        this.next = next;
    }

    public Invoker getNext() {
        return next;
    }

    String invoke( String s ) {
        return filter.invoke(next, s);
    }
}

interface IFilter {

    String invoke( Invoker invoker, String s );
}




