// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

/**
 * Creates a predefined `DiffieHellmanGroup` key exchange object. The
 * supported groups are: `'modp1'`, `'modp2'`, `'modp5'` (defined in [RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt), but see `Caveats`) and `'modp14'`, `'modp15'`,`'modp16'`, `'modp17'`,
 * `'modp18'` (defined in [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt)). The
 * returned object mimics the interface of objects created by {@link createDiffieHellman}, but will not allow changing
 * the keys (with `diffieHellman.setPublicKey()`, for example). The
 * advantage of using this method is that the parties do not have to
 * generate nor exchange a group modulus beforehand, saving both processor
 * and communication time.
 *
 * Example (obtaining a shared secret):
 *
 * ```js
 * const {
 *   getDiffieHellman
 * } = await import('crypto');
 * const alice = getDiffieHellman('modp14');
 * const bob = getDiffieHellman('modp14');
 *
 * alice.generateKeys();
 * bob.generateKeys();
 *
 * const aliceSecret = alice.computeSecret(bob.getPublicKey(), null, 'hex');
 * const bobSecret = bob.computeSecret(alice.getPublicKey(), null, 'hex');
 *
 * // aliceSecret and bobSecret should be the same
 * console.log(aliceSecret === bobSecret);
 * ```
 * @since v0.7.5
 */
external fun getDiffieHellman(
    groupName: String,
): DiffieHellmanGroup
