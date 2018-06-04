package com.rajabhargava.android.ciphernotes;

import android.util.Base64;

public class base64  {
    /**
     * Base64
     *
     * @param key the string to be decrypted
     * @return byte[] the data which is to decrypted
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception{

        return Base64.decode(key, Base64.DEFAULT);
    }
    /**
     * BASE64
     * @param key the string to be encrypted
     * @return byte[] the data which is to encrpted
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return Base64.encodeToString (key, Base64.DEFAULT);
    }


    }

