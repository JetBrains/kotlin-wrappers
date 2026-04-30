// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.performance

import js.internal.InternalApi
import web.time.DOMHighResTimeStamp
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface PaintTimingMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/paintTime)
     */
    val paintTime: DOMHighResTimeStamp
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/presentationTime)
     */
    val presentationTime: DOMHighResTimeStamp?
        get() = definedExternally
}
