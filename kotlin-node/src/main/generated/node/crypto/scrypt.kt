// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.buffer.Buffer

/**
 * Provides an asynchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
 * key derivation function that is designed to be expensive computationally and
 * memory-wise in order to make brute-force attacks unrewarding.
 *
 * The `salt` should be as unique as possible. It is recommended that a salt is
 * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
 *
 * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * The `callback` function is called with two arguments: `err` and `derivedKey`.`err` is an exception object when key derivation fails, otherwise `err` is`null`. `derivedKey` is passed to the
 * callback as a `Buffer`.
 *
 * An exception is thrown when any of the input arguments specify invalid values
 * or types.
 *
 * ```js
 * const {
 *   scrypt
 * } = await import('crypto');
 *
 * // Using the factory defaults.
 * scrypt('password', 'salt', 64, (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
 * });
 * // Using a custom N parameter. Must be a power of two.
 * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
 * });
 * ```
 * @since v10.5.0
 */
external fun scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Number,
    callback: (
        error: Error?,
        derivedKey: Buffer,
    ) -> Unit,
)


/**
 * Provides an asynchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
 * key derivation function that is designed to be expensive computationally and
 * memory-wise in order to make brute-force attacks unrewarding.
 *
 * The `salt` should be as unique as possible. It is recommended that a salt is
 * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
 *
 * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * The `callback` function is called with two arguments: `err` and `derivedKey`.`err` is an exception object when key derivation fails, otherwise `err` is`null`. `derivedKey` is passed to the
 * callback as a `Buffer`.
 *
 * An exception is thrown when any of the input arguments specify invalid values
 * or types.
 *
 * ```js
 * const {
 *   scrypt
 * } = await import('crypto');
 *
 * // Using the factory defaults.
 * scrypt('password', 'salt', 64, (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
 * });
 * // Using a custom N parameter. Must be a power of two.
 * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
 * });
 * ```
 * @since v10.5.0
 */
external fun scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Number,
    options: ScryptOptions,
    callback: (
        error: Error?,
        derivedKey: Buffer,
    ) -> Unit,
)
