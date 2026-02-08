// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.internal.InternalApi
import web.storage.StorageManager
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorStorage {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/storage)
     */
    val storage: StorageManager
        get() = definedExternally
}
