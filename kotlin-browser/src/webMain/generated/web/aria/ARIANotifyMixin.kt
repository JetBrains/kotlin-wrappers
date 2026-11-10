// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.aria

import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface ARIANotifyMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/ariaNotify)
     */
    fun ariaNotify(
        announcement: String,
        options: AriaNotificationOptions = definedExternally,
    ): Unit = definedExternally
}
