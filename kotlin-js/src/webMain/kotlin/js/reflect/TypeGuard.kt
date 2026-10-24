@file:Suppress(
    "INVISIBLE_REFERENCE",
)

package js.reflect

import js.internal.InternalApi
import kotlin.contracts.contract
import kotlin.internal.LowPriorityInOverloadResolution

/**
 * [Online Documentation](https://www.typescriptlang.org/docs/handbook/2/narrowing.html#using-type-predicates)
 */
@SubclassOptInRequired(InternalApi::class)
external interface TypeGuard<in V : JsAny?, out T : JsAny>

@PublishedApi
internal external interface TypeGuardInternal<in V : JsAny?> {
    operator fun invoke(value: V): Boolean
}

inline operator fun <V : JsAny?, T : JsAny> TypeGuard<V, T>.invoke(
    value: V,
): Boolean {
    contract {
        returns(true) implies (value is T)
    }

    return unsafeCast<TypeGuardInternal<V>>(this).invoke(value)
}

@LowPriorityInOverloadResolution
inline operator fun <V : JsAny, T : JsAny> TypeGuard<V, T>.invoke(
    value: V?,
): Boolean {
    contract {
        returns(true) implies (value is T)
    }

    return value != null
            && unsafeCast<TypeGuardInternal<V>>(this).invoke(value)
}
