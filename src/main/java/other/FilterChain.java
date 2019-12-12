package other;

import java.util.ArrayList;
import java.util.List;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private int pos = -1;

    public void doFilter() {
        if (( ++pos ) < filters.size()) {
            Filter filter = filters.get(pos);
            filter.dofilter(this);
            ;
        } else {
            System.out.println("done");
        }


    }

    public void addFilter( Filter f ) {
        this.filters.add(f);
    }

    public static void main( String[] args ) {
        Filter f1 = chain -> {
            System.out.println("do filter 1 before");
            chain.doFilter();
            System.out.println("do filter 1 after");
        };
        Filter f2 = chain -> {
            System.out.println("do filter 2 before");
            chain.doFilter();
            System.out.println("do filter 2 after");
        };

        FilterChain chain = new FilterChain();
        chain.addFilter(f1);
        chain.addFilter(f2);
        chain.doFilter();
    }

}


interface Filter {

    void dofilter( FilterChain chain );
}
