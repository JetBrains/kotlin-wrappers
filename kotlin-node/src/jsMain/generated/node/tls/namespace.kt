@file:JsModule("node:tls")

package node.tls

import js.core.ReadonlyArray

/* import { X509Certificate } from 'node:crypto'; */

/* import * as net from 'node:net'; */

/* import * as stream from 'stream'; */

external val CLIENT_RENEG_LIMIT: Double

external val CLIENT_RENEG_WINDOW: Double

/**
 * The default curve name to use for ECDH key agreement in a tls server.
 * The default value is 'auto'. See tls.createSecureContext() for further
 * information.
 */
external var DEFAULT_ECDH_CURVE: String

/**
 * The default value of the maxVersion option of
 * tls.createSecureContext(). It can be assigned any of the supported TLS
 * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
 * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
 * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
 * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
 * is used.
 */
external var DEFAULT_MAX_VERSION: SecureVersion

/**
 * The default value of the minVersion option of tls.createSecureContext().
 * It can be assigned any of the supported TLS protocol versions,
 * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
 * changed using CLI options. Using --tls-min-v1.0 sets the default to
 * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
 * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
 * are provided, the lowest minimum is used.
 */
external var DEFAULT_MIN_VERSION: SecureVersion

/**
 * The default value of the ciphers option of tls.createSecureContext().
 * It can be assigned any of the supported OpenSSL ciphers.
 * Defaults to the content of crypto.constants.defaultCoreCipherList, unless
 * changed using CLI options using --tls-default-ciphers.
 */
external var DEFAULT_CIPHERS: String

/**
 * An immutable array of strings representing the root certificates (in PEM
 * format) used for verifying peer certificates. This is the default value
 * of the ca option to tls.createSecureContext().
 */
external val rootCertificates: ReadonlyArray<String>
