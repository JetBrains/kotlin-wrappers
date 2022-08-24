// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.stream.TransformOptions

/**
 * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
 * initialization vector (`iv`).
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
 * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
 * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
 * a `KeyObject` of type `secret`. If the cipher does not need
 * an initialization vector, `iv` may be `null`.
 *
 * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * Initialization vectors should be unpredictable and unique; ideally, they will be
 * cryptographically random. They do not have to be secret: IVs are typically just
 * added to ciphertext messages unencrypted. It may sound contradictory that
 * something has to be unpredictable and unique, but does not have to be secret;
 * remember that an attacker must not be able to predict ahead of time what a
 * given IV will be.
 * @since v0.1.94
 * @param options `stream.transform` options
 */
external fun createCipheriv(
    algorithm: CipherCCMTypes,
    key: CipherKey,
    iv: BinaryLike,
    options: CipherCCMOptions,
): CipherCCM


/**
 * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
 * initialization vector (`iv`).
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
 * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
 * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
 * a `KeyObject` of type `secret`. If the cipher does not need
 * an initialization vector, `iv` may be `null`.
 *
 * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * Initialization vectors should be unpredictable and unique; ideally, they will be
 * cryptographically random. They do not have to be secret: IVs are typically just
 * added to ciphertext messages unencrypted. It may sound contradictory that
 * something has to be unpredictable and unique, but does not have to be secret;
 * remember that an attacker must not be able to predict ahead of time what a
 * given IV will be.
 * @since v0.1.94
 * @param options `stream.transform` options
 */
external fun createCipheriv(
    algorithm: CipherOCBTypes,
    key: CipherKey,
    iv: BinaryLike,
    options: CipherOCBOptions,
): CipherOCB


/**
 * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
 * initialization vector (`iv`).
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
 * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
 * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
 * a `KeyObject` of type `secret`. If the cipher does not need
 * an initialization vector, `iv` may be `null`.
 *
 * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * Initialization vectors should be unpredictable and unique; ideally, they will be
 * cryptographically random. They do not have to be secret: IVs are typically just
 * added to ciphertext messages unencrypted. It may sound contradictory that
 * something has to be unpredictable and unique, but does not have to be secret;
 * remember that an attacker must not be able to predict ahead of time what a
 * given IV will be.
 * @since v0.1.94
 * @param options `stream.transform` options
 */
external fun createCipheriv(
    algorithm: CipherGCMTypes,
    key: CipherKey,
    iv: BinaryLike,
    options: CipherGCMOptions = definedExternally,
): CipherGCM


/**
 * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
 * initialization vector (`iv`).
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
 * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
 * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
 * a `KeyObject` of type `secret`. If the cipher does not need
 * an initialization vector, `iv` may be `null`.
 *
 * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * Initialization vectors should be unpredictable and unique; ideally, they will be
 * cryptographically random. They do not have to be secret: IVs are typically just
 * added to ciphertext messages unencrypted. It may sound contradictory that
 * something has to be unpredictable and unique, but does not have to be secret;
 * remember that an attacker must not be able to predict ahead of time what a
 * given IV will be.
 * @since v0.1.94
 * @param options `stream.transform` options
 */
external fun createCipheriv(
    algorithm: String,
    key: CipherKey,
    iv: BinaryLike?,
    options: TransformOptions = definedExternally,
): Cipher
