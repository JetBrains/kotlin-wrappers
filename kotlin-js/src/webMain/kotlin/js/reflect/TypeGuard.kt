package js.reflect

import js.internal.InternalApi
import kotlin.contracts.contract

/**
 * [Online Documentation](https://www.typescriptlang.org/docs/handbook/2/narrowing.html#using-type-predicates)
 */
@SubclassOptInRequired(InternalApi::class)
external interface TypeGuard<V : JsAny?, T : JsAny>

@PublishedApi
internal external interface TypeGuardInternal<V : JsAny?> {
    operator fun invoke(value: V): Boolean
}

inline operator fun <V : JsAny?, T : JsAny> TypeGuard<V, T>.invoke(
    value: V,
): Boolean {
    contract {
        returns(true) implies (value is T)
    }

    return unsafeCast<TypeGuardInternal<V>>(this)
        .invoke(value)
}
