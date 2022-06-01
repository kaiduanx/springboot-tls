# Spring boot with BouncyCastle Java/TLS-1.3
### mvn clean package -Dmaven.test.skip=true
### java -Djavax.net.debug=ssl,handshake -jar target/demo-0.0.1-SNAPSHOT.jar
### curl -k -v --tlsv1.3 https://localhost:8080
### System default java.security in /usr/lib/jvm/java-11-openjdk-amd64/conf/security/java.security
security.provider.1=SUN

security.provider.2=SunRsaSign

security.provider.3=SunEC

security.provider.4=SunJSSE

security.provider.5=SunJCE

security.provider.6=SunJGSS

security.provider.7=SunSASL

security.provider.8=XMLDSig

security.provider.9=SunPCSC

security.provider.10=JdkLDAP

security.provider.11=JdkSASL

security.provider.12=SunPKCS11

https://codersathi.com/how-to-use-self-signed-ssl-certificate-in-spring-boot-application/

keytool -genkeypair -alias demo -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore demo.p12 -validity 3650
