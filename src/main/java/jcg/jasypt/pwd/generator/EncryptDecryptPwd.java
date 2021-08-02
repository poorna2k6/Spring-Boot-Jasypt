//package jcg.jasypt.pwd.generator;
//
//import com.springboot.jasypt.config.JasyptConfig;
//import lombok.extern.slf4j.Slf4j;
//import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
//import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
//
//@Slf4j
//public class EncryptDecryptPwd {
//
//	private static final String DB_USERNAME = "product";
//	private static final String DB_PWD = "password!234#";
//
//    public static void main(String[] args) {
//        encryptKey(DB_USERNAME);
//        encryptKey(DB_PWD);
//
//        decryptKey("9Y6SF/ht5/CaU7v8o1WyQQ==");
//        decryptKey("G8MWNiqA7QJc6AIcfOL0zvje17vMGaBN");
//    }
//
//    //encrypt the plan text
//    private static void encryptKey(final String plainKey) {
//        final SimpleStringPBEConfig pbeConfig = JasyptConfig.getSimpleStringPBEConfig();
//        final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
//        pbeStringEncryptor.setConfig(pbeConfig);
//
//        log.info("Encrypted key = {}", pbeStringEncryptor.encrypt(plainKey));
//    }
//
//    //decrypt the encrypted text
//	private static void decryptKey(final String encryptedKey) {
//    	final SimpleStringPBEConfig pbeConfig = JasyptConfig. getSimpleStringPBEConfig();
//        final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
//        pbeStringEncryptor.setConfig(pbeConfig);
//
//        log.info("Decrypted key = {}", pbeStringEncryptor.decrypt(encryptedKey));
//    }
//}
