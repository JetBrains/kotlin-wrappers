// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.stream.TransformOptions

/**
 * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
 * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
 * recent OpenSSL releases, `openssl list -cipher-algorithms` will
 * display the available cipher algorithms.
 *
 * The `password` is used to derive the cipher key and initialization vector (IV).
 * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
 *
 * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
 * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
 * they are used in order to avoid the risk of IV reuse that causes
 * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createCipher(
    algorithm: CipherCCMTypes,
    password: BinaryLike,
    options: CipherCCMOptions,
): CipherCCM


/**
 * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
 * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
 * recent OpenSSL releases, `openssl list -cipher-algorithms` will
 * display the available cipher algorithms.
 *
 * The `password` is used to derive the cipher key and initialization vector (IV).
 * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
 *
 * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
 * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
 * they are used in order to avoid the risk of IV reuse that causes
 * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createCipher(
    algorithm: CipherGCMTypes,
    password: BinaryLike,
    options: CipherGCMOptions = definedExternally,
): CipherGCM


/**
 * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
 * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
 * recent OpenSSL releases, `openssl list -cipher-algorithms` will
 * display the available cipher algorithms.
 *
 * The `password` is used to derive the cipher key and initialization vector (IV).
 * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
 *
 * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
 * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
 * they are used in order to avoid the risk of IV reuse that causes
 * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createCipher(
    algorithm: String,
    password: BinaryLike,
    options: TransformOptions = definedExternally,
): Cipher
