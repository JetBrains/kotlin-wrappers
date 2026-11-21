// Automatically generated - do not modify!

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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InteractionContentfulPaint/presentationTime)
     */
    val presentationTime: DOMHighResTimeStamp?
}
