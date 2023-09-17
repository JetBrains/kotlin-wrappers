@file:JsModule("node:crypto")
@file:JsQualifier("constants")

package node.crypto.constants


// https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
external val OPENSSL_VERSION_NUMBER: Double

/** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
external val SSL_OP_ALL: Double

/** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
external val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double

/** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
external val SSL_OP_CIPHER_SERVER_PREFERENCE: Double

/** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
external val SSL_OP_CISCO_ANYCONNECT: Double

/** Instructs OpenSSL to turn on cookie exchange. */
external val SSL_OP_COOKIE_EXCHANGE: Double

/** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
external val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double

/** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
external val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double

/** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
external val SSL_OP_EPHEMERAL_RSA: Double

/** Allows initial connection to servers that do not support RI. */
external val SSL_OP_LEGACY_SERVER_CONNECT: Double

external val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double

external val SSL_OP_MICROSOFT_SESS_ID_BUG: Double

/** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
external val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double

external val SSL_OP_NETSCAPE_CA_DN_BUG: Double

external val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double

external val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double

external val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double

/** Instructs OpenSSL to disable support for SSL/TLS compression. */
external val SSL_OP_NO_COMPRESSION: Double

external val SSL_OP_NO_QUERY_MTU: Double

/** Instructs OpenSSL to always start a new session when performing renegotiation. */
external val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double

external val SSL_OP_NO_SSLv2: Double

external val SSL_OP_NO_SSLv3: Double

external val SSL_OP_NO_TICKET: Double

external val SSL_OP_NO_TLSv1: Double

external val SSL_OP_NO_TLSv1_1: Double

external val SSL_OP_NO_TLSv1_2: Double

external val SSL_OP_PKCS1_CHECK_1: Double

external val SSL_OP_PKCS1_CHECK_2: Double

/** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
external val SSL_OP_SINGLE_DH_USE: Double

/** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
external val SSL_OP_SINGLE_ECDH_USE: Double

external val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double

external val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double

external val SSL_OP_TLS_BLOCK_PADDING_BUG: Double

external val SSL_OP_TLS_D5_BUG: Double

/** Instructs OpenSSL to disable version rollback attack detection. */
external val SSL_OP_TLS_ROLLBACK_BUG: Double

external val ENGINE_METHOD_RSA: Double

external val ENGINE_METHOD_DSA: Double

external val ENGINE_METHOD_DH: Double

external val ENGINE_METHOD_RAND: Double

external val ENGINE_METHOD_EC: Double

external val ENGINE_METHOD_CIPHERS: Double

external val ENGINE_METHOD_DIGESTS: Double

external val ENGINE_METHOD_PKEY_METHS: Double

external val ENGINE_METHOD_PKEY_ASN1_METHS: Double

external val ENGINE_METHOD_ALL: Double

external val ENGINE_METHOD_NONE: Double

external val DH_CHECK_P_NOT_SAFE_PRIME: Double

external val DH_CHECK_P_NOT_PRIME: Double

external val DH_UNABLE_TO_CHECK_GENERATOR: Double

external val DH_NOT_SUITABLE_GENERATOR: Double

external val ALPN_ENABLED: Double

external val RSA_PKCS1_PADDING: Double

external val RSA_SSLV23_PADDING: Double

external val RSA_NO_PADDING: Double

external val RSA_PKCS1_OAEP_PADDING: Double

external val RSA_X931_PADDING: Double

external val RSA_PKCS1_PSS_PADDING: Double

/** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
external val RSA_PSS_SALTLEN_DIGEST: Double

/** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
external val RSA_PSS_SALTLEN_MAX_SIGN: Double

/** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
external val RSA_PSS_SALTLEN_AUTO: Double

external val POINT_CONVERSION_COMPRESSED: Double

external val POINT_CONVERSION_UNCOMPRESSED: Double

external val POINT_CONVERSION_HYBRID: Double

/** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
external val defaultCoreCipherList: String

/** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
external val defaultCipherList: String
