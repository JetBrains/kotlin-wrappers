// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.locks

import js.internal.InternalApi
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorLocks {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/locks)
     */
    val locks: LockManager
        get() = definedExternally
}
