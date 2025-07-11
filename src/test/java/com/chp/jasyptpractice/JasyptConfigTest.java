package com.chp.jasyptpractice;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JasyptConfigTest {

    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void testEncryptAndDecrypt() {
        String original = "멋쟁이사자처럼";
        String encrypted = stringEncryptor.encrypt(original);
        System.out.println("암호화: " + encrypted);

        String decrypted = stringEncryptor.decrypt(encrypted);
        System.out.println("복호화: " + decrypted);

        assertThat(decrypted).isEqualTo(original);
    }
}
