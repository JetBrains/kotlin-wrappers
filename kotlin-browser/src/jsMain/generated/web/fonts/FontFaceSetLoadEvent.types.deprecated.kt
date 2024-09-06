// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import web.events.EventType

sealed external class FontFaceSetLoadEventTypes {

    @JsValue("loading")
    fun loading(): EventType<FontFaceSetLoadEvent>

    @JsValue("loadingdone")
    fun loadingDone(): EventType<FontFaceSetLoadEvent>

    @JsValue("loadingerror")
    fun loadingError(): EventType<FontFaceSetLoadEvent>
}
