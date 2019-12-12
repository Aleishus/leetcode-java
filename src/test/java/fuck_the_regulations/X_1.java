/*
 * Decompiled with CFR 0.148.
 *//*

package fuck_the_regulations;

import fuck_the_regulations.Fj;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class X_1
extends RuntimeException {
    private Throwable a;
    private static final long b = Fj.a(8561468869559940279L, 2319437847506032364L, null).a(245678824598154L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public Throwable a() {
        return this.a;
    }

    public X_1(String string) {
        super(string);
        this.a = null;
    }

    public X_1(InvocationTargetException invocationTargetException, int n, int n2, short s) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        super(X_1.a(1605, 0x2BBA425169B1EF83L ^ l) + invocationTargetException.getTargetException().toString());
        this.a = null;
        this.a = invocationTargetException.getTargetException();
    }

    public X_1(long l, byte by, IllegalAccessException illegalAccessException) {
        long l2 = (l << 8 | (long)by << 56 >>> 56) ^ b;
        super(X_1.a(1605, 0x2BBA399048E23C98L ^ l2) + illegalAccessException.toString());
        this.a = null;
        this.a = illegalAccessException;
    }

    public X_1(int n, ClassNotFoundException classNotFoundException, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        super(X_1.a(11516, 0x591B625B7ECE63D0L ^ l) + classNotFoundException.toString());
        this.a = null;
        this.a = classNotFoundException;
    }

    */
/*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     *//*

    static {
        // MONITORENTER : fuck_the_regulations.Fj.g()
        // MONITOREXIT : fuck_the_regulations.Fj.g()
        e = new HashMap(13);
        long l = b ^ 0x2BD2095CBFCBL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            arrby2 = arrby2;
            arrby2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        String[] arrstring = new String[2];
        int n = 0;
        String string = "\u00ecc\u00ca-\u001c\u00b6\u00c2cK\u0006\u0080j\u00ceE\u00e0\u00bb\u0010\u00a7iv\u00c2+\u00a9\u00da\nC%\u00f3\u00e4\u00a2\u00e7\u0006\u00ea";
        int n2 = "\u00ecc\u00ca-\u001c\u00b6\u00c2cK\u0006\u0080j\u00ceE\u00e0\u00bb\u0010\u00a7iv\u00c2+\u00a9\u00da\nC%\u00f3\u00e4\u00a2\u00e7\u0006\u00ea".length();
        int n3 = 16;
        int n4 = -1;
        do {
            int n5 = ++n4;
            byte[] arrby3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            arrstring[n++] = X_1.a(arrby3).intern();
            if ((n4 += n3) >= n2) {
                c = arrstring;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        } while (true);
    }

    private static String a(byte[] arrby) {
        int n = 0;
        int n2 = arrby.length;
        char[] arrc = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & arrby[i];
            if (n3 < 192) {
                arrc[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = arrby[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                arrc[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = arrby[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = arrby[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            arrc[n++] = c;
        }
        return new String(arrc, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x347F;
        if (d[n2] == null) {
            Object[] arrobject;
            try {
                Long l2 = Thread.currentThread().getId();
                arrobject = (Object[])e.get(l2);
                if (arrobject == null) {
                    arrobject = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("fuck_the_regulations/x", exception);
            }
            byte[] arrby = new byte[8];
            arrby[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                arrby[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(arrby);
            SecretKey secretKey = ((SecretKeyFactory)arrobject[1]).generateSecret(dESKeySpec);
            ((Cipher)arrobject[0]).init(2, (Key)secretKey, (IvParameterSpec)arrobject[2]);
            byte[] arrby2 = c[n2].getBytes("ISO-8859-1");
            X_1.d[n2] = X_1.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return d[n2];
    }
}

*/
