// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.performance

import js.internal.InternalApi
import web.time.DOMHighResTimeStamp

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface PaintTimingMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InteractionContentfulPaint/paintTime)
     */
    val paintTime: DOMHighResTimeStamp
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InteractionContentfulPaint/presentationTime)
     */
    val presentationTime: DOMHighResTimeStamp?
        get() = definedExternally
}
