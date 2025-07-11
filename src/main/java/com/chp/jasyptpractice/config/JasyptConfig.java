package com.chp.jasyptpractice.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableEncryptableProperties
public class JasyptConfig {

    //실행 VM옵션에서 받아오도록 설정
    //-Djasypt.encryptor.password=likelion
    @Value("${jasypt.encryptor.password}")
    private String encryptKey;

    @Bean("jasyptStringEncryptor")
    @Primary
    public StringEncryptor stringEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(encryptKey); //암호화 키 설정
        config.setAlgorithm("PBEWithMD5AndDES"); //암호화 알고리즘 (Default:PBEWithMD5AndDES)
        config.setKeyObtentionIterations("1000"); //키 스트레칭 횟수 (Default:1000)
        config.setPoolSize("1"); //인스턴스 풀 크기 (Default:1000)
        config.setProviderName("SunJCE"); //암호화 제공자
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator"); //솔트 생성기 zmffotm
        config.setStringOutputType("base64"); //출력 형식 (Default:base64)

        encryptor.setConfig(config);
        return encryptor;
    }


}
