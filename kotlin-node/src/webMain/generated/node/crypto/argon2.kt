// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import node.buffer.NonSharedBuffer

/**
 * Provides an asynchronous [Argon2](https://www.rfc-editor.org/rfc/rfc9106.html) implementation. Argon2 is a password-based
 * key derivation function that is designed to be expensive computationally and
 * memory-wise in order to make brute-force attacks unrewarding.
 *
 * The `nonce` should be as unique as possible. It is recommended that a nonce is
 * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
 *
 * When passing strings for `message`, `nonce`, `secret` or `associatedData`, please
 * consider [caveats when using strings as inputs to cryptographic APIs](https://nodejs.org/docs/latest-v24.x/api/crypto.html#using-strings-as-inputs-to-cryptographic-apis).
 *
 * The `callback` function is called with two arguments: `err` and `derivedKey`.
 * `err` is an exception object when key derivation fails, otherwise `err` is
 * `null`. `derivedKey` is passed to the callback as a `Buffer`.
 *
 * An exception is thrown when any of the input arguments specify invalid values
 * or types.
 *
 * ```js
 * const { argon2, randomBytes } = await import('node:crypto');
 *
 * const parameters = {
 *   message: 'password',
 *   nonce: randomBytes(16),
 *   parallelism: 4,
 *   tagLength: 64,
 *   memory: 65536,
 *   passes: 3,
 * };
 *
 * argon2('argon2id', parameters, (err, derivedKey) => {
 *   if (err) throw err;
 *   console.log(derivedKey.toString('hex'));  // 'af91dad...9520f15'
 * });
 * ```
 * @since v24.7.0
 * @param algorithm Variant of Argon2, one of `"argon2d"`, `"argon2i"` or `"argon2id"`.
 * @experimental
 */
external fun argon2(
    algorithm: Argon2Algorithm,
    parameters: Argon2Parameters,
    callback: (err: js.errors.JsError?, derivedKey: NonSharedBuffer) -> Unit,
)
