// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Returns information about a given cipher.
 *
 * Some ciphers accept variable length keys and initialization vectors. By default,
 * the `crypto.getCipherInfo()` method will return the default values for these
 * ciphers. To test if a given key length or iv length is acceptable for given
 * cipher, use the `keyLength` and `ivLength` options. If the given values are
 * unacceptable, `undefined` will be returned.
 * @since v15.0.0
 * @param nameOrNid The name or nid of the cipher to query.
 */
external fun getCipherInfo(
    nameOrNid: Any, /* string | number */
    options: CipherInfoOptions = definedExternally,
): CipherInfo
