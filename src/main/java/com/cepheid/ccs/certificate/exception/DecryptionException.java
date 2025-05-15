package com.cepheid.ccs.certificate.exception;

/**
 * Custom exception thrown when decryption fails.
 */
public class DecryptionException extends RuntimeException {

    public DecryptionException(String message) {
        super(message);
    }

    public DecryptionException(String message, Throwable cause) {
        super(message, cause);
    }
}
