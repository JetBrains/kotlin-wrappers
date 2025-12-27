// Automatically generated - do not modify!

@file:JsModule("node:tls")

package node.tls

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
