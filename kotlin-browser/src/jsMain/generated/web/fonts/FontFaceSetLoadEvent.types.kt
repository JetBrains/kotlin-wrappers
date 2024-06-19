// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class FontFaceSetLoadEventTypes {

    @JsValue("loading")
    fun <C : EventTarget> loading(): EventType<FontFaceSetLoadEvent, C>

    @JsValue("loadingdone")
    fun <C : EventTarget> loadingDone(): EventType<FontFaceSetLoadEvent, C>

    @JsValue("loadingerror")
    fun <C : EventTarget> loadingError(): EventType<FontFaceSetLoadEvent, C>
}
