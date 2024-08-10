// Generated by Karakum - do not modify it manually!

@file:JsModule("node:tls")

package node.tls

import js.array.ReadonlyArray


external val CLIENT_RENEG_LIMIT: Double

external val CLIENT_RENEG_WINDOW: Double

/**
 * The default curve name to use for ECDH key agreement in a tls server.
 * The default value is `'auto'`. See `{@link createSecureContext()}` for further
 * information.
 * @since v0.11.13
 */
external var DEFAULT_ECDH_CURVE: String

/**
 * The default value of the `maxVersion` option of `{@link createSecureContext()}`.
 * It can be assigned any of the supported TLS protocol versions,
 * `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. **Default:** `'TLSv1.3'`, unless
 * changed using CLI options. Using `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using
 * `--tls-max-v1.3` sets the default to `'TLSv1.3'`. If multiple of the options
 * are provided, the highest maximum is used.
 * @since v11.4.0
 */
external var DEFAULT_MAX_VERSION: SecureVersion

/**
 * The default value of the `minVersion` option of `{@link createSecureContext()}`.
 * It can be assigned any of the supported TLS protocol versions,
 * `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. **Default:** `'TLSv1.2'`, unless
 * changed using CLI options. Using `--tls-min-v1.0` sets the default to
 * `'TLSv1'`. Using `--tls-min-v1.1` sets the default to `'TLSv1.1'`. Using
 * `--tls-min-v1.3` sets the default to `'TLSv1.3'`. If multiple of the options
 * are provided, the lowest minimum is used.
 * @since v11.4.0
 */
external var DEFAULT_MIN_VERSION: SecureVersion

/**
 * The default value of the `ciphers` option of `{@link createSecureContext()}`.
 * It can be assigned any of the supported OpenSSL ciphers.
 * Defaults to the content of `crypto.constants.defaultCoreCipherList`, unless
 * changed using CLI options using `--tls-default-ciphers`.
 * @since v19.8.0
 */
external var DEFAULT_CIPHERS: String

/**
 * An immutable array of strings representing the root certificates (in PEM format)
 * from the bundled Mozilla CA store as supplied by the current Node.js version.
 *
 * The bundled CA store, as supplied by Node.js, is a snapshot of Mozilla CA store
 * that is fixed at release time. It is identical on all supported platforms.
 * @since v12.3.0
 */
external val rootCertificates: ReadonlyArray<String>
