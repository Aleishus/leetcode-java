import java.io.FileOutputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ClassDumperAgent implements ClassFileTransformer {

    // directory where we would write .class files
    private static String dumpDir;
    // classes with name matching this pattern
    // will be dumped
    private static Pattern classes;

    public static void premain( String agentArgs, Instrumentation inst ) {
        agentmain(agentArgs, inst);
    }

    public static void agentmain( String agentArgs, Instrumentation inst ) {
        // parseArgs(agentArgs);
        ClassDumperAgent agent = new ClassDumperAgent();
        inst.addTransformer(agent, true);
        // by the time we are attached, the classes to be
        // dumped may have been loaded already. So, check
        // for candidates in the loaded classes.
        Class[] classes = inst.getAllLoadedClasses();
        List<Class> candidates = new ArrayList<Class>();
        for (Class c : classes) {

            //  System.out.println(c.getName());
        /*    if (isCandidate(c.getName())) {
                System.out.println(c.getName());
                candidates.add(c);
            }*/
            if (c.getName().indexOf("fuck_the_regulations") == 0) {

                Field[] fields = c.getDeclaredFields();
                for (Field f : fields) {
                    if (Modifier.isStatic(f.getModifiers())) {
                        f.setAccessible(true);
                        try {
                            Object o = f.get(null);
                            if (o instanceof String[]) {

                                System.out
                                        .println("Field:[" + c.getName() + "#" + f.getName() + "]");
                                System.out
                                        .println("value:[ " + Arrays.toString((String[]) o) + " ]");
                                System.out.println("-------------------------------------");
                            }
                            if (o instanceof Map) {
                                System.out
                                        .println("Field:[" + c.getName() + "#" + f.getName() + "]");
                                for (Object k : ( (Map) o ).keySet()) {
                                    System.out.println("k---->" + k);
                                    Object v = ( (Map) o ).get(k);
                                    if (v instanceof String) {
                                        System.out.println("v---->" + v);
                                    } else if (v instanceof byte[]) {
                                        System.out.println("v---->" + new String((byte[]) v));
                                    } else {
                                        System.out.println("v---->"+v);
                                    }
                                }
                                System.out.println("-------------------------------------");
                            }

                            if (o instanceof String) {
                                System.out
                                        .println("Field:[" + c.getName() + "#" + f.getName() + "]");
                                System.out.println("value-->" + o);
                                System.out.println("-------------------------------------");
                            }

                            if (o instanceof byte[]) {
                                System.out
                                        .println("Field:[" + c.getName() + "#" + f.getName() + "]");
                                System.out.println("value-->" + new String((byte[])o));
                                System.out.println("-------------------------------------");
                            }

                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
        try {
            // if we have matching candidates, then
            // retransform those classes so that we
            // will get callback to transform.
            if (!candidates.isEmpty()) {
                inst.retransformClasses(candidates.toArray(new Class[0]));
            }
        } catch (UnmodifiableClassException uce) {
        }
        inst.removeTransformer(agent);
    }

    public byte[] transform( ClassLoader loader, String className,
            Class redefinedClass, ProtectionDomain protDomain,
            byte[] classBytes ) {
        // check and dump .class file
        if (isCandidate(className)) {
            dumpClass(className, classBytes);
        }
        // we don't mess with .class file, just
        // return null
        return null;
    }

    private static boolean isCandidate( String className ) {
        // ignore array classes

        className = className.replace('/', '.');
        return className
                .equals("com.alibaba.dubbo.remoting.zookeeper.ZookeeperTransporter$Adaptive");
        // if (className.charAt(0) == '[') {
        //   return false;
        // }
        // convert the class name to external name
        // className = className.replace('/', '.');
        // check for name pattern match
        // return classes.matcher(className).matches();
    }

    private static void dumpClass( String className, byte[] classBuf ) {
        try {
            FileOutputStream fos = new FileOutputStream("/tmp/TT.class");
            System.out.println("ssss=====================");
            fos.write(classBuf);
            fos.close();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}
