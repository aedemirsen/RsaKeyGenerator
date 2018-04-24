/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsakeygenerator;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author aedemirsen
 */
public class RsaKeyGenerator {
    
    KeyPairGenerator keyGenerator;
    KeyPair keyPair;
    PrivateKey privateKey;
    PublicKey publicKey;

    public RsaKeyGenerator(int bit) throws NoSuchAlgorithmException {
        keyGenerator = KeyPairGenerator.getInstance("rsa");
        keyGenerator.initialize(bit);
        keyPair = keyGenerator.generateKeyPair();        
    }  
    
    public PublicKey getPublicKey(){
        return keyPair.getPublic();
    }
    
    public PrivateKey getPrivateKey(){
        return keyPair.getPrivate();
    }
    
}

