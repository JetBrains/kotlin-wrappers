// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.fonts

import js.array.ReadonlyArray
import js.collections.MutableSetLike
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`FontFaceSet`** interface of the CSS Font Loading API manages the loading of font-faces and querying of their download status.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet)
 */
sealed external interface FontFaceSet :
    EventTarget,
    MutableSetLike<FontFace> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event)
     */
    var onloading: EventHandler<FontFaceSetLoadEvent, FontFaceSet, FontFaceSet>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event)
     */
    var onloadingdone: EventHandler<FontFaceSetLoadEvent, FontFaceSet, FontFaceSet>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event)
     */
    var onloadingerror: EventHandler<FontFaceSetLoadEvent, FontFaceSet, FontFaceSet>?

    /**
     * The `ready` read-only property of the FontFaceSet interface returns a Promise that resolves to the given FontFaceSet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/ready)
     */
    val ready: Promise<FontFaceSet>

    /**
     * The **`status`** read-only property of the FontFaceSet interface returns the loading state of the fonts in the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status)
     */
    val status: FontFaceSetLoadStatus

    /**
     * The `check()` method of the FontFaceSet returns `true` if you can render some text using the given font specification without attempting to use any fonts in this `FontFaceSet` that are not yet fully loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/check)
     */
    fun check(
        font: String,
        text: String = definedExternally,
    ): Boolean

    /**
     * The `load()` method of the FontFaceSet forces all the fonts given in parameters to be loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/load)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun load(
        font: String,
        text: String = definedExternally,
    ): ReadonlyArray<FontFace>

    @JsName("load")
    fun loadAsync(
        font: String,
        text: String = definedExternally,
    ): Promise<ReadonlyArray<FontFace>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event)
     */
    @JsEvent("loading")
    val loadingEvent: EventInstance<FontFaceSetLoadEvent, FontFaceSet /* this */, FontFaceSet /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event)
     */
    @JsEvent("loadingdone")
    val loadingDoneEvent: EventInstance<FontFaceSetLoadEvent, FontFaceSet /* this */, FontFaceSet /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event)
     */
    @JsEvent("loadingerror")
    val loadingErrorEvent: EventInstance<FontFaceSetLoadEvent, FontFaceSet /* this */, FontFaceSet /* this */>
}
