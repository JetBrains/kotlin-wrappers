// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import web.events.EventType

sealed external class FontFaceSetLoadEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.LOADING"),
    )
    @JsValue("loading")
    fun loading(): EventType<FontFaceSetLoadEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.LOADING_DONE"),
    )
    @JsValue("loadingdone")
    fun loadingDone(): EventType<FontFaceSetLoadEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.LOADING_ERROR"),
    )
    @JsValue("loadingerror")
    fun loadingError(): EventType<FontFaceSetLoadEvent>
}
