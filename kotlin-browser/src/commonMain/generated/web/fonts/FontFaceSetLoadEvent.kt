// Automatically generated - do not modify!

package web.fonts

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`FontFaceSetLoadEvent`** interface of the CSS Font Loading API represents events fired at a FontFaceSet after it starts loading font faces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent)
 */
open external class FontFaceSetLoadEvent(
    override val type: EventType<FontFaceSetLoadEvent>,
    init: FontFaceSetLoadEventInit = definedExternally,
) : Event {
    /**
     * The **`fontfaces`** read-only property of the An array of FontFace instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSetLoadEvent/fontfaces)
     */
    val fontfaces: ReadonlyArray<FontFace>

    companion object
}

inline fun FontFaceSetLoadEvent.asInit(): FontFaceSetLoadEventInit =
    unsafeCast(this)

inline val FontFaceSetLoadEvent.Companion.LOADING: EventType<FontFaceSetLoadEvent>
    get() = EventType("loading")

inline val FontFaceSetLoadEvent.Companion.LOADING_DONE: EventType<FontFaceSetLoadEvent>
    get() = EventType("loadingdone")

inline val FontFaceSetLoadEvent.Companion.LOADING_ERROR: EventType<FontFaceSetLoadEvent>
    get() = EventType("loadingerror")
