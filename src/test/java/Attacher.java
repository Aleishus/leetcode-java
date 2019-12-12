import com.sun.tools.attach.VirtualMachine;

public class Attacher {

    public static void main( String[] args ) throws Exception {
        if (args.length < 2) {
            System.out.println("usage: java Attach <pid> <agent-jar-full-path> [<agent-args>]");
            System.exit(1);
        }
        // JVM is identified by process id (pid).
        VirtualMachine vm = VirtualMachine.attach(args[1]);
        String agentArgs = ( args.length > 2 ) ? args[2] : null;
        // load a specified agent onto the JVM
        vm.loadAgent(args[0], agentArgs);
    }
}
