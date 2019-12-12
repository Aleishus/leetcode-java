// 
// Decompiled by Procyon v0.5.36
// 

package fuck_the_regulations;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import java.lang.instrument.Instrumentation;
import java.util.Map;

public class Ca {

    private static String b;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public static void b( final char p0, final int p1, final Instrumentation p2, final char p3 ) {
        //
        // This method could not be decompiled.
        //
        // Original Bytecode:
        //
        //     1: i2l
        //     2: bipush          48
        //     4: lshl
        //     5: iload_1
        //     6: i2l
        //     7: bipush          32
        //     9: lshl
        //    10: bipush          16
        //    12: lushr
        //    13: lor
        //    14: iload_3
        //    15: i2l
        //    16: bipush          48
        //    18: lshl
        //    19: bipush          48
        //    21: lushr
        //    22: lor
        //    23: getstatic       fuck_the_regulations/h.a:J
        //    26: lxor
        //    27: lstore          4
        //    29: lload           4
        //    31: dup2
        //    32: ldc2_w          18089375849400
        //    35: lxor
        //    36: dup2
        //    37: bipush          48
        //    39: lushr
        //    40: l2i
        //    41: istore          6
        //    43: dup2
        //    44: bipush          16
        //    46: lshl
        //    47: bipush          16
        //    49: lushr
        //    50: lstore          7
        //    52: pop2
        //    53: pop2
        //    54: invokestatic    fuck_the_regulations/h.b:()Ljava/lang/String;
        //    57: astore          9
        //    59: iload           6
        //    61: i2s
        //    62: sipush          6673
        //    65: ldc2_w          502553027293531446
        //    68: lload           4
        //    70: lxor
        //    71: invokedynamic   BootstrapMethod #0, h:(IJ)Ljava/lang/String;
        //    76: sipush          22181
        //    79: ldc2_w          1425945706307387779
        //    82: lload           4
        //    84: lxor
        //    85: invokedynamic   BootstrapMethod #0, h:(IJ)Ljava/lang/String;
        //    90: invokestatic    java/net/InetAddress.getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
        //    93: invokevirtual   java/net/InetAddress.getHostAddress:()Ljava/lang/String;
        //    96: lload           7
        //    98: invokestatic    fuck_the_regulations/a.a:(SLjava/lang/String;Ljava/lang/String;J)V
        //   101: goto            106
        //   104: astore          10
        //   106: ldc             Lfuck_the_regulations/bU;.class
        //   108: invokevirtual   java/lang/Class.getProtectionDomain:()Ljava/security/ProtectionDomain;
        //   111: invokevirtual   java/security/ProtectionDomain.getCodeSource:()Ljava/security/CodeSource;
        //   114: invokevirtual   java/security/CodeSource.getLocation:()Ljava/net/URL;
        //   117: invokevirtual   java/net/URL.toURI:()Ljava/net/URI;
        //   120: invokevirtual   java/net/URI.getPath:()Ljava/lang/String;
        //   123: astore          10
        //   125: aload_2
        //   126: new             Ljava/util/jar/JarFile;
        //   129: dup
        //   130: aload           10
        //   132: invokespecial   java/util/jar/JarFile.<init>:(Ljava/lang/String;)V
        //   135: invokeinterface java/lang/instrument/Instrumentation.appendToBootstrapClassLoaderSearch:(Ljava/util/jar/JarFile;)V
        //   140: invokestatic    fuck_the_regulations/bx.d:()Lfuck_the_regulations/bx;
        //   143: aload           10
        //   145: invokevirtual   fuck_the_regulations/bx.l:(Ljava/lang/String;)Lfuck_the_regulations/aB;
        //   148: pop
        //   149: new             Ljava/lang/StringBuilder;
        //   152: dup
        //   153: sipush          31866
        //   156: ldc2_w          216441805029419871
        //   159: lload           4
        //   161: lxor
        //   162: invokedynamic   BootstrapMethod #0, h:(IJ)Ljava/lang/String;
        //   167: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   170: astore          11
        //   172: aload           11
        //   174: invokevirtual   java/lang/StringBuilder.reverse:()Ljava/lang/StringBuilder;
        //   177: pop
        //   178: aload_2
        //   179: aload           11
        //   181: invokevirtual   java/lang/StringBuilder.reverse:()Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokestatic    fuck_the_regulations/fp.a:(Ljava/lang/String;)Ljava/lang/String;
        //   190: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   193: iconst_0
        //   194: anewarray       Ljava/lang/Class;
        //   197: invokevirtual   java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   200: iconst_0
        //   201: anewarray       Ljava/lang/Object;
        //   204: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   207: checkcast       Ljava/lang/instrument/ClassFileTransformer;
        //   210: iconst_1
        //   211: invokeinterface java/lang/instrument/Instrumentation.addTransformer:(Ljava/lang/instrument/ClassFileTransformer;Z)V
        //   216: aload_2
        //   217: invokeinterface java/lang/instrument/Instrumentation.getAllLoadedClasses:()[Ljava/lang/Class;
        //   222: astore          12
        //   224: aload           12
        //   226: arraylength
        //   227: istore          13
        //   229: iconst_0
        //   230: istore          14
        //   232: iload           14
        //   234: iload           13
        //   236: if_icmpge       363
        //   239: aload           12
        //   241: iload           14
        //   243: aaload
        //   244: astore          15
        //   246: aload           9
        //   248: iload_3
        //   249: ifle            257
        //   252: ifnull          382
        //   255: aload           9
        //   257: iload_1
        //   258: iflt            360
        //   261: ifnull          358
        //   264: goto            271
        //   267: invokestatic    fuck_the_regulations/h.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   270: athrow
        //   271: aload           15
        //   273: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   276: sipush          2199
        //   279: ldc2_w          220013278431141811
        //   282: lload           4
        //   284: lxor
        //   285: invokedynamic   BootstrapMethod #0, h:(IJ)Ljava/lang/String;
        //   290: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   293: ifeq            355
        //   296: goto            303
        //   299: invokestatic    fuck_the_regulations/h.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   302: athrow
        //   303: aload_2
        //   304: iconst_1
        //   305: anewarray       Ljava/lang/Class;
        //   308: dup
        //   309: iconst_0
        //   310: aload           15
        //   312: aastore
        //   313: invokeinterface java/lang/instrument/Instrumentation.retransformClasses:([Ljava/lang/Class;)V
        //   318: aload           9
        //   320: ifnonnull       363
        //   323: goto            330
        //   326: invokestatic    fuck_the_regulations/h.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   329: athrow
        //   330: invokestatic    fuck_the_regulations/bj.b:()Z
        //   333: ifne            351
        //   336: goto            343
        //   339: invokestatic    fuck_the_regulations/h.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   342: athrow
        //   343: iconst_0
        //   344: goto            352
        //   347: invokestatic    fuck_the_regulations/h.a:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   350: athrow
        //   351: iconst_1
        //   352: invokestatic    fuck_the_regulations/bj.b:(Z)V
        //   355: iinc            14, 1
        //   358: aload           9
        //   360: ifnonnull       232
        //   363: iload_0
        //   364: iflt            382
        //   367: goto            382
        //   370: astore          10
        //   372: new             Ljava/lang/RuntimeException;
        //   375: dup
        //   376: aload           10
        //   378: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   381: athrow
        //   382: return
        //    StackMapTable: 00 15 FF 00 68 00 08 01 01 07 00 35 01 04 01 04 07 00 02 00 01 07 00 11 01 FF 00 7D 00 0D 01 01 07 00 35 01 04 01 04 07 00 02 07 00 02 07 00 1C 07 00 36 01 01 00 00 FF 00 18 00 0E 01 01 07 00 35 01 04 01 04 07 00 02 07 00 02 07 00 1C 07 00 36 01 01 07 00 21 00 01 07 00 02 49 07 00 11 03 5B 07 00 11 03 56 07 00 11 03 48 07 00 11 03 43 07 00 11 03 40 01 02 02 41 07 00 02 FA 00 02 FF 00 06 00 08 01 01 07 00 35 01 04 01 04 07 00 02 00 01 07 00 11 FF 00 0B 00 0D 01 01 07 00 35 01 04 01 04 07 00 02 07 00 02 07 00 1C 07 00 36 01 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ---------------------
        //  59     101    104    106    Ljava/lang/Exception;
        //  330    347    347    351    Ljava/lang/Exception;
        //  303    336    339    343    Ljava/lang/Exception;
        //  271    323    326    330    Ljava/lang/Exception;
        //  255    296    299    303    Ljava/lang/Exception;
        //  246    264    267    271    Ljava/lang/Exception;
        //  59     363    370    382    Ljava/lang/Exception;
        //
        // The error that occurred was:
        //
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0257:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        //
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }

    public static void b( final String b ) {
        Ca.b = b;
    }

    public static String b() {
        return Ca.b;
    }


    public static void main( String[] args )
            throws InvalidAlgorithmParameterException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        long a = Fj.a(-2610812565756978580L, 3921582561523452947L,
                MethodHandles.lookup().lookupClass()).a(49720897847312L);
        long l2 = a ^ 0x6C18225D2A5DL;
        long l3 = l2 ^ 0x77658171508BL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);

        long var4_4 = ((long)(char)n2 << 48 | (long)n2 << 32 >>> 16 | (long)(char)n4 << 48 >>> 48) ^ Ca.a;
      String s =  Ca.a((int)2199, (long)(220013278431141811L ^ var4_4));
    }


    static {
        // monitorenter(fj.g())
        final long a2 = Fj.a(5424174212620027770L, -8608536515974181773L,
                MethodHandles.lookup().lookupClass()).a(44246768017409L);
        // monitorexit(fj.g())
        a = a2;
        e = new HashMap(13);
        final String s = "MhV4Mc";
        final long n = Ca.a ^ 0x1B7858829855L;
        b(s);
        Cipher instance = null;
        try {
            instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (NoSuchPaddingException ex) {
            ex.printStackTrace();
        }
        final int n2 = 2;
        SecretKeyFactory instance2 = null;
        try {
            instance2 = SecretKeyFactory.getInstance("DES");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        final byte[] array = new byte[8];
        array[0] = (byte) ( n >>> 56 );
        for (int i = 1; i < 8; ++i) {
            array[i] = (byte) ( n << i * 8 >>> 56 );
        }
        try {
            instance.init(n2, instance2.generateSecret(new DESKeySpec(array)),
                    new IvParameterSpec(new byte[8]));
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        }
        final String[] c2 = new String[4];
        int n3 = 0;
        String s2;
        int n4 = ( s2 = ",\u0002\u00fd\u00dc\u000b\u00c2¿¯\u0090\u00ee¢\u0001m\u0000n\u0095½K {º\u00d0it>\u001b\t\u000fA:\u0004v\u00f1\u00dckt£0U\u00dcb?\u00e1\u0011;\u00d7\u00f0\u009b(\u00d2\u009d\u00d1\u0006B\u00d2\u00db)\u008e\u00de\u00c9\u0084\u00db7|g\u0014\u0085\u00eaJs\"f»%\u00fe-\u001bcC\u0014f\u001a\u0018ms\u00d9\u00e2µk" )
                .length();
        int n5 = 48;
        int n6 = -1;
        Label_0164:
        while (true) {
            while (true) {
                ++n6;
                final String s3 = s2;
                final int n7 = n6;
                String s4 = s3.substring(n7, n7 + n5);
                int n8 = -1;
                while (true) {
                    String intern = null;
                    try {
                        intern = a(instance.doFinal(s4.getBytes("ISO-8859-1"))).intern();
                    } catch (IllegalBlockSizeException ex) {
                        ex.printStackTrace();
                    } catch (BadPaddingException ex) {
                        ex.printStackTrace();
                    } catch (UnsupportedEncodingException ex) {
                        ex.printStackTrace();
                    }
                    switch (n8) {
                        default: {
                            c2[n3++] = intern;
                            if (( n6 += n5 ) < n4) {
                                n5 = s2.charAt(n6);
                                continue Label_0164;
                            }
                            n4 = ( s2 = "j4\u00f5\u0093\u00d3\u00cf¢\u0092g\u0019·{\u001d·\u0085\u0097\u009f5\u001f!\u0098Q\u008f±\u00c6\u00e7\u0081h\u001c\u00f63\u00cc8\u009b\u00ff\u0015B\u00e9c\u00c4e\u0017\u00dd\u0089\u0017\u00f3\u001b.¶\u00c4\u0019\u00c6\u00f0\u00dc\u00e2ª\u009c\u00e7\u00eb\u008b\u001b\u00d1a\u00d8·L\u00e2\u00d6\u009e·\u00d6\u0002\u00ce\u009e\u0087\u00f3U\"Q)¬\u00de±°©\u00d9\u0085h\u00cd" )
                                    .length();
                            n5 = 32;
                            n6 = -1;
                            break;
                        }
                        case 0: {
                            c2[n3++] = intern;
                            if (( n6 += n5 ) < n4) {
                                n5 = s2.charAt(n6);
                                break;
                            }
                            break Label_0164;
                        }
                    }
                    ++n6;
                    final String s5 = s2;
                    final int n9 = n6;
                    s4 = s5.substring(n9, n9 + n5);
                    n8 = 0;
                }
            }
            // break;
        }
        c = c2;
        d = new String[4];
    }

    private static Exception a( final Exception ex ) {
        return ex;
    }

    private static String a( final byte[] array ) {
        int n = 0;
        final int length;
        final char[] array2 = new char[length = array.length];
        for (int i = 0; i < length; ++i) {
            final int n2;
            if (( n2 = ( 0xFF & array[i] ) ) < 192) {
                array2[n++] = (char) n2;
            } else if (n2 < 224) {
                array2[n++] = (char) ( (char) ( (char) ( n2 & 0x1F ) << 6 ) | (char) ( array[++i]
                        & 0x3F ) );
            } else if (i < length - 2) {
                array2[n++] = (char) ( (char) ( (char) ( (char) ( n2 & 0xF ) << 12 )
                        | (char) ( array[++i] & 0x3F ) << 6 ) | (char) ( array[++i] & 0x3F ) );
            }
        }
        return new String(array2, 0, n);
    }

    private static String a( final int n, final long n2 )
            throws InvalidKeyException, InvalidKeySpecException, UnsupportedEncodingException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException {
        final int n3 = n ^ (int) ( n2 & 0x7FFFL ) ^ 0x51F7;
        if (Ca.d[n3] == null) {
            Object[] array;
            try {
                final Long value = Thread.currentThread().getId();
                array = (Object[]) Ca.e.get(value);
                if (array == null) {
                    array = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"),
                            SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    Ca.e.put(value, array);
                }
            } catch (Exception ex) {
                throw new RuntimeException("fuck_the_regulations/h", ex);
            }
            final byte[] array2 = new byte[8];
            array2[0] = (byte) ( n2 >>> 56 );
            for (int i = 1; i < 8; ++i) {
                array2[i] = (byte) ( n2 << i * 8 >>> 56 );
            }
            ( (Cipher) array[0] )
                    .init(2, ( (SecretKeyFactory) array[1] ).generateSecret(new DESKeySpec(array2)),
                            (AlgorithmParameterSpec) array[2]);
            Ca.d[n3] = a(( (Cipher) array[0] ).doFinal(Ca.c[n3].getBytes("ISO-8859-1")));
        }
        return Ca.d[n3];
    }

}

