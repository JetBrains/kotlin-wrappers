// Automatically generated - do not modify!

package web.crypto

import js.core.JsPrimitives.toKotlinString
import js.internal.InternalApi
import js.reflect.unsafeCast
import js.reflect.upcast
import kotlin.js.JsAny
import kotlin.js.JsString

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

inline fun AlgorithmIdentifier.asStringOrNull(): String? =
    (upcast<JsAny>() as? JsString)?.toKotlinString()
