# Jasypt
Java 어플리케이션에서 민감한 설정값 (비밀번호, API 키)를 암/복호화 할 수 있게 도와주는 라이브러리입니다.
application.yaml 과 application.properties에서 암호화된 값을 자동으로 복호화해줍니다.

## 특징
 * 복잡한 암호화 로직 없이 설정만으로 간편하게 암호화하여 관리할 수 있음
 * 협업 개발 환경에서 빠르게 바뀌는 .yml이나 .properties에서, 암호화된 값만 공유하므로 쉽게 공유하고 공유할 수 있음
 * 클라우드 보안 인프라가 없을때 사용하기 좋음

## 운영/배포서버에서는 권장하지 않음
 * AWS Secrets Manager, SSM Parameter Store, KMS를 활용하여 민감정보를 관리하는 인프라가 있으면 굳이 Jasypt를 사용할 이유가 없음

# 실행 구성
<img width="804" height="365" alt="image" src="https://github.com/user-attachments/assets/6f77b04a-a59c-41e1-a5fb-fcdfec88b431" />


# Imports
https://github.com/pyeonch/jasypt-example/blob/360a340162d530894141e7566274b66bc6c683c2/build.gradle#L35

# Config
https://github.com/pyeonch/jasypt-example/blob/38afcfab1e75c0eec2d42d4de65c93319857d933/src/main/java/com/chp/jasyptpractice/config/JasyptConfig.java#L12-L39

# 암호화 예
https://github.com/pyeonch/jasypt-example/blob/360a340162d530894141e7566274b66bc6c683c2/src/main/resources/application.properties#L3-L8

# 테스트코드(JUnit에 VM옵선 넣고 실행 필요)
https://github.com/pyeonch/jasypt-example/blob/38afcfab1e75c0eec2d42d4de65c93319857d933/src/test/java/com/chp/jasyptpractice/JasyptConfigTest.java#L10-L28
