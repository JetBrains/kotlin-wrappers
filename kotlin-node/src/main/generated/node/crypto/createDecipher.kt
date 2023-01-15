// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.stream.TransformOptions

/**
 * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createDecipher(
    algorithm: CipherCCMTypes,
    password: BinaryLike,
    options: CipherCCMOptions,
): DecipherCCM


/**
 * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createDecipher(
    algorithm: CipherGCMTypes,
    password: BinaryLike,
    options: CipherGCMOptions = definedExternally,
): DecipherGCM


/**
 * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
 *
 * The `options` argument controls stream behavior and is optional except when a
 * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
 * authentication tag in bytes, see `CCM mode`.
 * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
 *
 * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
 * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
 * iteration, and no salt. The lack of salt allows dictionary attacks as the same
 * password always creates the same key. The low iteration count and
 * non-cryptographically secure hash algorithm allow passwords to be tested very
 * rapidly.
 *
 * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
 * developers derive a key and IV on
 * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
 * @since v0.1.94
 * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
 * @param options `stream.transform` options
 */
external fun createDecipher(
    algorithm: String,
    password: BinaryLike,
    options: TransformOptions = definedExternally,
): Decipher
