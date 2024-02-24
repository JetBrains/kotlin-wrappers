// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.fonts

import js.array.ReadonlyArray
import js.collections.MutableSetLike
import js.promise.Promise
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet)
 */
sealed external interface FontFaceSet :
    EventTarget,
    MutableSetLike<FontFace> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event)
     */
    var onloading: EventHandler<FontFaceSetLoadEvent<FontFaceSet>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event)
     */
    var onloadingdone: EventHandler<FontFaceSetLoadEvent<FontFaceSet>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event)
     */
    var onloadingerror: EventHandler<FontFaceSetLoadEvent<FontFaceSet>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/ready)
     */
    val ready: Promise<FontFaceSet>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status)
     */
    val status: FontFaceSetLoadStatus

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/check)
     */
    fun check(
        font: String,
        text: String = definedExternally,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/load)
     */
    fun load(
        font: String,
        text: String = definedExternally,
    ): Promise<ReadonlyArray<FontFace>>
}
