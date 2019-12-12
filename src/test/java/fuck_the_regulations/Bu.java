package fuck_the_regulations;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
/*
 * Decompiled with CFR 0.148.
 */

import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Bu {
    private static  String a;
    private static int b;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public static void main(String[] arrstring) {
        try {
            long va = Fj.a(-2610812565756978580L, 3921582561523452947L, MethodHandles.lookup().lookupClass()).a(49720897847312L);
            long l2 = va ^ 0x6C18225D2A5DL;
            long l3 = l2 ^ 0x77658171508BL;

            int v_n2 = (int)(l3 >>> 48);
            int v_n3 = (int)(l3 << 16 >>> 32);
            int v_n4 = (int)(l3 << 48 >>> 48);
            char var0 = (char)v_n2;
            char var3_3 = (char)v_n4;

            long v4 = ((long)var0 << 48 | (long)v_n3 << 32 >>> 16 | (long)var3_3 << 48 >>> 48) ^ c;

            StringBuilder var11_11 = new StringBuilder((String)Bu.a((int)2199, (long)(220013278431141811L ^ v4)));
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (BadPaddingException ex) {
            ex.printStackTrace();
        } catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
        }

    }

    public static void b(int n) {
        b = n;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int n = Bu.b();
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
/*    static {
        // MONITORENTER : fuck_the_regulations.Fj.g()
        // MONITOREXIT : fuck_the_regulations.Fj.g()



        long va = Fj.a(-2610812565756978580L, 3921582561523452947L, MethodHandles.lookup().lookupClass()).a(49720897847312L);
        long l2 = va ^ 0x6C18225D2A5DL;
        long l3 = l2 ^ 0x77658171508BL;
        int v_n2 = (int)(l3 >>> 48);
        int v_n3 = (int)(l3 << 16 >>> 32);
        int v_n4 = (int)(l3 << 48 >>> 48);
        char var0 = (char)v_n2;
        char var3_3 = (char)v_n4;

        c = Fj.a(5424174212620027770L, -8608536515974181773L, MethodHandles.lookup().lookupClass()).a(44246768017409L);
        f = new HashMap(13);
        long v4 = ((long)var0 << 48 | (long)v_n3 << 32 >>> 16 | (long)var3_3 << 48 >>> 48) ^ c;

        StringBuilder var11_11 = new StringBuilder((String)h.a((int)31866, (long)(216441805029419871L ^ v4)));



        Bu.b(77);
        long l = c ^ 0x1744BF6D3180L;
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (NoSuchPaddingException ex) {
            ex.printStackTrace();
        }
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            arrby2 = arrby2;
            arrby2[i] = (byte)(l << i * 8 >>> 56);
        }
        try {
            cipher.init(2, (Key)SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        String[] arrstring = new String[2];
        int n = 0;
        String string = "\u00ae\u00b9\f\u009b\u00f7\u00ab\u0015\u00e8\u000fG\u00877\u0081\u00c0n\u00f1Z}\u00f6\u0017;\u00d2j)\u00d1ns\u001e<\u00b0\u009c\u00cc4\u00a2\u0094\u001fx\u0006\b{f\u0017\u00d7\u001d\u00b5\u00da\u000e\u00c3\u00bd\u00fe\u00d0z\u007f>\u0097\u00a3\u00e9\u00a1\u00c2J[0l\u00abfO\u00e1a\u00b5\u00cf\u00b6\u0002z0p\u0087|\u009b\u0010\u00fa\u00ef\b\u0001\u001c\u00f4\f\u00ae?\u001c\u00bf\u009b\u009f[v\u00a9h\u0007\u00e4\u00ba\u008bh\u00ecb7MR\u00f6E\u0085l\u00d1\u00a0\u00ban\u00bf\u0001N'\u00d1F\u00b0\u00f1\u00ff\u00db\u00b0\u00dd\u00828\u008a\n\u0095+>\u00b4am\u00eb\u009d\u00d3\u00a4\u00fcn\u00adV\u001a\u00ae\u001a\u0099\u001f\u00bd\u00bd\u00b5f\u00bbm\u009d\u0014gWT\u000e\u0001\u0094\u0081\u008b+\u00c2\u00b5:\u0016 \r\u009aPZ\u007f\u00a1D\u0094\u00ccigX\u00de\u00b3}\b\u00e7\u00c1\u00d1,\u00ee\u00d9#^cj\u00c1c\u0086\u0002\u00fa_M\u0007\u0098P\u00bd=\u00f7\u00f5Zal\u00a9e\u00f9\u0005\u00fd\u00da\u00d0\u0081\u00c1\u0084X+\u00d0 \u00bc\u00f0\u00c9\u00ae2\u00f8H\u0099\u00a9`6@\u00b2\u0013\u001c\u00f9\u0010\u0015\u00ca\u00f7\u00bf\u00db\u00bc\n\u008a\u0097h\u009b\u00a7\u009ePrMs\u00f1-L\f\u00f2\u00ea\u001c\u0004\u001a\u00e5$\u0083\u00e4\u00d8\u00df\u009d/\u009e\u00c6\u00a3\u0014\u00bf\u00a4\u001f\u000f]\u00aeV\u00fd\u00d9(\u00ca4Lp\u0006\u008d\u00f4\u00ed\u00edW\u00ceR\u00f6\u00bb\u00f7\u00d9\u00addb\u00d2\f{v\u008f\u0000\u00efbe\u00a9\u00b5\u00fc\u0096C\u00fa*\u0011\u008e/\u009e\u00dd\u00e8\u00c0.\u007f\u00c6z\u0012\u00b8\u0016F\u00b1a\u00faa\u00eej_\u009c\u0096]\u0089[2%\u00caR\u00da\u00ad\u00fc\u00bcS\u0091\u00bd\u0082\u00dbv\u001eb\u00ab\u00ee\\L\u00cf\u00c59i@\u00c9\u00a9\u0081Znj`\u00b2\\?F,\u00f4\u00ed\u00b8y\u00c2\u00cb@[\u00d0\u0018\u00b2\u00b9\u00bd\u0018\u00db\u00e1\u000509\u0006\r\u00f1h\u00bd\rA\u00c9\u009cB28\u00c0\u0085I\u00a8Dh\u009a\u0096^\u0094\u0007\u00dc<|\u008fSu\u0015\u00f9\u00ba6\u00ad\u00f9\u0001'\u00b8\u009a\u00ae\u00ab\u00ac\u00bd\u00b0\u0081\u0000\u00cf\u00e5',\u00fb\u009b\u0015\u00b5\u00dd6F\u0080\r\u0092\u00af\n\u00f8\u000b8|\u008a.\u00ba\u00ce>\u000f\u00e8/V#\u00e2\u00c7\u0091O\u00cdk7\u00aa\u00192l\u00da\\c\u001aP\t\u00bd\u008b\u009c\u00cd\u00d3m\u0011c\u0200\u00f1\u00a9K7\u00ac \u00ef3@\u00a0\u000fa\u0083b\u00bf\u00ff\u00de*x\u0097?b\u00ce\u00be\u00d4\u00d0\u0015\u00a6JV5b\u0014%\u00df\u00b0\u0085F\u009f\u00d5+\u00f1[\u00fa<\u0019\u00e4\u000e\u00dd\u00d8?o\u00db\u00aa\u0094\u00ec\u0085\u008e\u00e3\u008e\u00ec\u00d8\u0005\u008d\u00c5\u00adg\u0018\u00f9{\u0098\u001a\u0013\u0016O\u00bc#\u00cfRBl\u00dbZ\r\u001b\u00a3\u00a1\u0002\u00ee\u00cd\u00a27\u0087\u00ed\u00fc\u00b6\u0014\u00c5=\u00bd``\u00d4\u009a\u00ae\u00ab\u0085\u00d1J8e&\u00cd\u00f3\u00db\u0012\u00f1\u00d4\u00f8mWG|\u00e0[B\u00d4\u0093M\u0099`W\u0082X\u00a8\u00e4\u00bf]nO\u0000\b\u00f68\u00f6\u0086q\u0098]\u00d9\u00bf(q\u0084.%C\u0005\u00e5\u0092\u00d9\u00bf\u00f5XI\u00fc\u00d9\u0018\u008ei \u00a3H3\u008ex\u00ad\n\u00f3\u009b\u0018\u00c5\u00d1*\u0092\u0003G\u00e9\u0007\u00bdh\u00caJ\u00abN\u00ce~\u00ee\u00b5\u00a1II\u00ac\u00eb`=\u00fb\u0080\u0003M\u009e\u00ae\u001c\u00f1\u00ef\u0089\u00f0U\u00ea\u00d4-\u00ba\u009cn\u0086\u00e7\u00c0\u00c3\u00ac\u0085\u0006\u009ay\u00d2\u00c79\u0097g\u00ad=\u0089p\u00aap\u00ae\u00c6\u00fb\u0089\u00e4\u0005L\u00a1a\\Bz\u00a4u\u00b7[\"\u00b1r\u00b0\u0094\u0083\u001d\u0087gU\u00f9:\u0081_YN\f\u00bd`l\u00bc\u001bZ\u00cf]\u00eb]\"6n\u00b9D\u0010+\u00b6\u001c\u00d3\u00efH`\u00e1\u00f3\u00e3\u0005\u0090\u00a3\u00d3\u0014\u00c56\u009cE\u0013T<\u0093j\u00911\u00e9\u0015\u00a0It\u00fa\t9\u001d\u00eb\u00b4o\u00fc\u00fd\u00ecgs\u009d\u000f\t\u00dc^\u00b0\u00c43\u00e7L\u0084\u00c5\u00d0\u00c5q\u0083V\u00ef\u00f3\u0016\u00f6s\u007f\u0005\u00db\u00bb^\u0093\u00e3\u001f\u00d0V\u00c6\u0006J\u0080\u00a0M\u00f5X\u009f\u00c5\u0018\u00ffA\u00d1\u00ddw\u00ad\r\u001d\u00c6\u00a7#w\u00d8\u0003\u001e\u00c7\u00dc\u008bnZ*-\u00816\u00fc\u008d}\u00bf0I\u007fKP\u0095\u00faD\u0094\u00b9\u00bcU\u00b4\u0096\u0007\u00fb7\u0089)\u00a7\u0092\u001a\u0099\u00d0\u0012\"B\u00c0\u00aa\u00e5\u00c8\u00da\u0092dl\u009a\u00b7\u00f8^\u00e3\u009c\u00dd\u0002\u009dy\u00f0\u00f0eEkZ\u00c7i\u0091+ol\u00dc\u00dc!\u00f4\u00ee\u00eb\u0094J\u00c7!)W\u009c\u0092\u00d8|\u00aa\u0002T\u00afI9\u00e4\u00b4\f\u00940\u00c7Vj\u00b5k\u001c\u00ed\u00e3\u008b\u00fc/\u00cb\u00eaE\u00f2]fF\u001d\u00ed\u00f3";
        int n2 = "\u00ae\u00b9\f\u009b\u00f7\u00ab\u0015\u00e8\u000fG\u00877\u0081\u00c0n\u00f1Z}\u00f6\u0017;\u00d2j)\u00d1ns\u001e<\u00b0\u009c\u00cc4\u00a2\u0094\u001fx\u0006\b{f\u0017\u00d7\u001d\u00b5\u00da\u000e\u00c3\u00bd\u00fe\u00d0z\u007f>\u0097\u00a3\u00e9\u00a1\u00c2J[0l\u00abfO\u00e1a\u00b5\u00cf\u00b6\u0002z0p\u0087|\u009b\u0010\u00fa\u00ef\b\u0001\u001c\u00f4\f\u00ae?\u001c\u00bf\u009b\u009f[v\u00a9h\u0007\u00e4\u00ba\u008bh\u00ecb7MR\u00f6E\u0085l\u00d1\u00a0\u00ban\u00bf\u0001N'\u00d1F\u00b0\u00f1\u00ff\u00db\u00b0\u00dd\u00828\u008a\n\u0095+>\u00b4am\u00eb\u009d\u00d3\u00a4\u00fcn\u00adV\u001a\u00ae\u001a\u0099\u001f\u00bd\u00bd\u00b5f\u00bbm\u009d\u0014gWT\u000e\u0001\u0094\u0081\u008b+\u00c2\u00b5:\u0016 \r\u009aPZ\u007f\u00a1D\u0094\u00ccigX\u00de\u00b3}\b\u00e7\u00c1\u00d1,\u00ee\u00d9#^cj\u00c1c\u0086\u0002\u00fa_M\u0007\u0098P\u00bd=\u00f7\u00f5Zal\u00a9e\u00f9\u0005\u00fd\u00da\u00d0\u0081\u00c1\u0084X+\u00d0 \u00bc\u00f0\u00c9\u00ae2\u00f8H\u0099\u00a9`6@\u00b2\u0013\u001c\u00f9\u0010\u0015\u00ca\u00f7\u00bf\u00db\u00bc\n\u008a\u0097h\u009b\u00a7\u009ePrMs\u00f1-L\f\u00f2\u00ea\u001c\u0004\u001a\u00e5$\u0083\u00e4\u00d8\u00df\u009d/\u009e\u00c6\u00a3\u0014\u00bf\u00a4\u001f\u000f]\u00aeV\u00fd\u00d9(\u00ca4Lp\u0006\u008d\u00f4\u00ed\u00edW\u00ceR\u00f6\u00bb\u00f7\u00d9\u00addb\u00d2\f{v\u008f\u0000\u00efbe\u00a9\u00b5\u00fc\u0096C\u00fa*\u0011\u008e/\u009e\u00dd\u00e8\u00c0.\u007f\u00c6z\u0012\u00b8\u0016F\u00b1a\u00faa\u00eej_\u009c\u0096]\u0089[2%\u00caR\u00da\u00ad\u00fc\u00bcS\u0091\u00bd\u0082\u00dbv\u001eb\u00ab\u00ee\\L\u00cf\u00c59i@\u00c9\u00a9\u0081Znj`\u00b2\\?F,\u00f4\u00ed\u00b8y\u00c2\u00cb@[\u00d0\u0018\u00b2\u00b9\u00bd\u0018\u00db\u00e1\u000509\u0006\r\u00f1h\u00bd\rA\u00c9\u009cB28\u00c0\u0085I\u00a8Dh\u009a\u0096^\u0094\u0007\u00dc<|\u008fSu\u0015\u00f9\u00ba6\u00ad\u00f9\u0001'\u00b8\u009a\u00ae\u00ab\u00ac\u00bd\u00b0\u0081\u0000\u00cf\u00e5',\u00fb\u009b\u0015\u00b5\u00dd6F\u0080\r\u0092\u00af\n\u00f8\u000b8|\u008a.\u00ba\u00ce>\u000f\u00e8/V#\u00e2\u00c7\u0091O\u00cdk7\u00aa\u00192l\u00da\\c\u001aP\t\u00bd\u008b\u009c\u00cd\u00d3m\u0011c\u0200\u00f1\u00a9K7\u00ac \u00ef3@\u00a0\u000fa\u0083b\u00bf\u00ff\u00de*x\u0097?b\u00ce\u00be\u00d4\u00d0\u0015\u00a6JV5b\u0014%\u00df\u00b0\u0085F\u009f\u00d5+\u00f1[\u00fa<\u0019\u00e4\u000e\u00dd\u00d8?o\u00db\u00aa\u0094\u00ec\u0085\u008e\u00e3\u008e\u00ec\u00d8\u0005\u008d\u00c5\u00adg\u0018\u00f9{\u0098\u001a\u0013\u0016O\u00bc#\u00cfRBl\u00dbZ\r\u001b\u00a3\u00a1\u0002\u00ee\u00cd\u00a27\u0087\u00ed\u00fc\u00b6\u0014\u00c5=\u00bd``\u00d4\u009a\u00ae\u00ab\u0085\u00d1J8e&\u00cd\u00f3\u00db\u0012\u00f1\u00d4\u00f8mWG|\u00e0[B\u00d4\u0093M\u0099`W\u0082X\u00a8\u00e4\u00bf]nO\u0000\b\u00f68\u00f6\u0086q\u0098]\u00d9\u00bf(q\u0084.%C\u0005\u00e5\u0092\u00d9\u00bf\u00f5XI\u00fc\u00d9\u0018\u008ei \u00a3H3\u008ex\u00ad\n\u00f3\u009b\u0018\u00c5\u00d1*\u0092\u0003G\u00e9\u0007\u00bdh\u00caJ\u00abN\u00ce~\u00ee\u00b5\u00a1II\u00ac\u00eb`=\u00fb\u0080\u0003M\u009e\u00ae\u001c\u00f1\u00ef\u0089\u00f0U\u00ea\u00d4-\u00ba\u009cn\u0086\u00e7\u00c0\u00c3\u00ac\u0085\u0006\u009ay\u00d2\u00c79\u0097g\u00ad=\u0089p\u00aap\u00ae\u00c6\u00fb\u0089\u00e4\u0005L\u00a1a\\Bz\u00a4u\u00b7[\"\u00b1r\u00b0\u0094\u0083\u001d\u0087gU\u00f9:\u0081_YN\f\u00bd`l\u00bc\u001bZ\u00cf]\u00eb]\"6n\u00b9D\u0010+\u00b6\u001c\u00d3\u00efH`\u00e1\u00f3\u00e3\u0005\u0090\u00a3\u00d3\u0014\u00c56\u009cE\u0013T<\u0093j\u00911\u00e9\u0015\u00a0It\u00fa\t9\u001d\u00eb\u00b4o\u00fc\u00fd\u00ecgs\u009d\u000f\t\u00dc^\u00b0\u00c43\u00e7L\u0084\u00c5\u00d0\u00c5q\u0083V\u00ef\u00f3\u0016\u00f6s\u007f\u0005\u00db\u00bb^\u0093\u00e3\u001f\u00d0V\u00c6\u0006J\u0080\u00a0M\u00f5X\u009f\u00c5\u0018\u00ffA\u00d1\u00ddw\u00ad\r\u001d\u00c6\u00a7#w\u00d8\u0003\u001e\u00c7\u00dc\u008bnZ*-\u00816\u00fc\u008d}\u00bf0I\u007fKP\u0095\u00faD\u0094\u00b9\u00bcU\u00b4\u0096\u0007\u00fb7\u0089)\u00a7\u0092\u001a\u0099\u00d0\u0012\"B\u00c0\u00aa\u00e5\u00c8\u00da\u0092dl\u009a\u00b7\u00f8^\u00e3\u009c\u00dd\u0002\u009dy\u00f0\u00f0eEkZ\u00c7i\u0091+ol\u00dc\u00dc!\u00f4\u00ee\u00eb\u0094J\u00c7!)W\u009c\u0092\u00d8|\u00aa\u0002T\u00afI9\u00e4\u00b4\f\u00940\u00c7Vj\u00b5k\u001c\u00ed\u00e3\u008b\u00fc/\u00cb\u00eaE\u00f2]fF\u001d\u00ed\u00f3".length();
        int n3 = 512;
        int n4 = -1;
        do {
            int n5 = ++n4;
            byte[] arrby3 = new byte[0];
            try {
                arrby3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            } catch (IllegalBlockSizeException ex) {
                ex.printStackTrace();
            } catch (BadPaddingException ex) {
                ex.printStackTrace();
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            arrstring[n++] = Bu.a(arrby3).intern();
            if ((n4 += n3) >= n2) {
                d = arrstring;
                e = new String[2];
                try {
                    a = Bu.a((int)25699, (long)(0x6B030D53893FE3B6L ^ l));
                } catch (InvalidKeyException ex) {
                    ex.printStackTrace();
                } catch (InvalidKeySpecException ex) {
                    ex.printStackTrace();
                } catch (InvalidAlgorithmParameterException ex) {
                    ex.printStackTrace();
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                } catch (BadPaddingException ex) {
                    ex.printStackTrace();
                } catch (IllegalBlockSizeException ex) {
                    ex.printStackTrace();
                }
                break;
            }
            n3 = string.charAt(n4);
        } while (true);
    }*/


    static {

        long va = Fj.a(-2610812565756978580L, 3921582561523452947L, MethodHandles.lookup().lookupClass()).a(49720897847312L);
        long l2 = va ^ 0x6C18225D2A5DL;
        long l3 = l2 ^ 0x77658171508BL;

        int v_n2 = (int)(l3 >>> 48);
        int v_n3 = (int)(l3 << 16 >>> 32);
        int v_n4 = (int)(l3 << 48 >>> 48);
        char var0 = (char)v_n2;
        char var3_3 = (char)v_n4;

        c = Fj.a(5424174212620027770L, -8608536515974181773L, MethodHandles.lookup().lookupClass()).a(44246768017409L);
        f = new HashMap(13);
        long v4 = ((long)var0 << 48 | (long)v_n3 << 32 >>> 16 | (long)var3_3 << 48 >>> 48) ^ c;

        Bu.b(77);
        long l = c ^ 30203694979157L;
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (NoSuchPaddingException ex) {
            ex.printStackTrace();
        }
        byte[] arrby = new byte[8];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            arrby2 = arrby2;
            arrby2[i] = (byte)(l << i * 8 >>> 56);
        }
        try {
            cipher.init(2, (Key)SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(arrby2)), new IvParameterSpec(new byte[8]));
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (InvalidAlgorithmParameterException ex) {
            ex.printStackTrace();
        } catch (InvalidKeySpecException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }


        final String[] c2 = new String[4];
        int n3 = 0;
        String s2;
        int n4 = (s2 = ",\u0002\u00fd\u00dc\u000b\u00c2¿¯\u0090\u00ee¢\u0001m\u0000n\u0095½K {º\u00d0it>\u001b\t\u000fA:\u0004v\u00f1\u00dckt£0U\u00dcb?\u00e1\u0011;\u00d7\u00f0\u009b(\u00d2\u009d\u00d1\u0006B\u00d2\u00db)\u008e\u00de\u00c9\u0084\u00db7|g\u0014\u0085\u00eaJs\"f»%\u00fe-\u001bcC\u0014f\u001a\u0018ms\u00d9\u00e2µk").length();
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
                        intern = a(cipher.doFinal(s4.getBytes("ISO-8859-1"))).intern();
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
                            if ((n6 += n5) < n4) {
                                n5 = s2.charAt(n6);
                                continue Label_0164;
                            }
                            n4 = (s2 = "j4\u00f5\u0093\u00d3\u00cf¢\u0092g\u0019·{\u001d·\u0085\u0097\u009f5\u001f!\u0098Q\u008f±\u00c6\u00e7\u0081h\u001c\u00f63\u00cc8\u009b\u00ff\u0015B\u00e9c\u00c4e\u0017\u00dd\u0089\u0017\u00f3\u001b.¶\u00c4\u0019\u00c6\u00f0\u00dc\u00e2ª\u009c\u00e7\u00eb\u008b\u001b\u00d1a\u00d8·L\u00e2\u00d6\u009e·\u00d6\u0002\u00ce\u009e\u0087\u00f3U\"Q)¬\u00de±°©\u00d9\u0085h\u00cd").length();
                            n5 = 32;
                            n6 = -1;
                            break;
                        }
                        case 0: {
                            c2[n3++] = intern;
                            if ((n6 += n5) < n4) {
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
          //  break;
        }
        d = c2;
        e = new String[4];
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

    private static String a(int n, long l)
            throws InvalidKeyException, InvalidKeySpecException, InvalidAlgorithmParameterException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException {
        int n2 =0;
        if (e[n2] == null) {
            Object[] arrobject;
            try {
                Long l2 = Thread.currentThread().getId();
                arrobject = (Object[])f.get(l2);
                if (arrobject == null) {
                    arrobject = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, arrobject);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("fuck_the_regulations/bU", exception);
            }
            byte[] arrby = new byte[8];
            arrby[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                arrby[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(arrby);
            SecretKey secretKey = ((SecretKeyFactory)arrobject[1]).generateSecret(dESKeySpec);
            ((Cipher)arrobject[0]).init(2, (Key)secretKey, (IvParameterSpec)arrobject[2]);
            byte[] arrby2 = d[n2].getBytes("ISO-8859-1");
            Bu.e[n2] = Bu.a(((Cipher)arrobject[0]).doFinal(arrby2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] arrobject)
            throws InvalidAlgorithmParameterException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        int n = (Integer)arrobject[0];
        long l = (Long)arrobject[1];
        String string2 = Bu.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Exception decompiling
     */
    private static CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Expecting a ConstantPoolEntryLiteral or ConstantPoolEntryDynamicInfo
        // org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackType(OperationFactoryLDC.java:37)
        // org.benf.cfr.reader.bytecode.opcode.OperationFactoryLDC.getStackDelta(OperationFactoryLDC.java:18)
        // org.benf.cfr.reader.bytecode.opcode.JVMInstr.getStackDelta(JVMInstr.java:315)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1539)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:364)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:238)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:183)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:964)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:855)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:242)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:125)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }
}

