// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

/**
 * Load and set the `engine` for some or all OpenSSL functions (selected by flags).
 *
 * `engine` could be either an id or a path to the engine's shared library.
 *
 * The optional `flags` argument uses `ENGINE_METHOD_ALL` by default.
 * The `flags` is a bit field taking one of or a mix of the following flags (defined in `crypto.constants`):
 *
 * - `crypto.constants.ENGINE_METHOD_RSA`
 * - `crypto.constants.ENGINE_METHOD_DSA`
 * - `crypto.constants.ENGINE_METHOD_DH`
 * - `crypto.constants.ENGINE_METHOD_RAND`
 * - `crypto.constants.ENGINE_METHOD_EC`
 * - `crypto.constants.ENGINE_METHOD_CIPHERS`
 * - `crypto.constants.ENGINE_METHOD_DIGESTS`
 * - `crypto.constants.ENGINE_METHOD_PKEY_METHS`
 * - `crypto.constants.ENGINE_METHOD_PKEY_ASN1_METHS`
 * - `crypto.constants.ENGINE_METHOD_ALL`
 * - `crypto.constants.ENGINE_METHOD_NONE`
 *
 * The flags below are deprecated in OpenSSL-1.1.0.
 *
 * - `crypto.constants.ENGINE_METHOD_ECDH`
 * - `crypto.constants.ENGINE_METHOD_ECDSA`
 * - `crypto.constants.ENGINE_METHOD_STORE`
 * @since v0.11.11
 * @param [flags=crypto.constants.ENGINE_METHOD_ALL]
 */
external fun setEngine(
    engine: String,
    flags: Number = definedExternally,
)
