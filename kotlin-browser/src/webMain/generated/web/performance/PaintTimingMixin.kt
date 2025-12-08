// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.performance

import web.time.DOMHighResTimeStamp
import kotlin.js.definedExternally

/* mixin */
sealed
external interface PaintTimingMixin {
    val paintTime: DOMHighResTimeStamp
        get() = definedExternally
    val presentationTime: DOMHighResTimeStamp?
        get() = definedExternally
}
