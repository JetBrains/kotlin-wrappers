// Automatically generated - do not modify!

package web.crypto

import js.internal.InternalApi
import js.reflect.unsafeCast

/**
 * Union of:
 * - [Algorithm]
 * - [String]
 */
@SubclassOptInRequired(InternalApi::class)
external interface AlgorithmIdentifier

inline fun AlgorithmIdentifier(
    value: String,
): AlgorithmIdentifier =
    unsafeCast(value)
