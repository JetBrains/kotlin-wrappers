// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

/**
 * @since v10.0.0
 * @return `1` if and only if a FIPS compliant crypto provider is currently in use, `0` otherwise. A future semver-major release may change the return type of this API to a {boolean}.
 */
external fun getFips(): GetFipsResult
