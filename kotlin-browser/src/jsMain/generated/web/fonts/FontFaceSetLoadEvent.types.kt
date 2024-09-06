// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import web.events.EventType

sealed external class FontFaceSetLoadEventTypes :
    FontFaceSetLoadEventTypes_deprecated {

    @JsValue("loading")
    val LOADING: EventType<FontFaceSetLoadEvent>

    @JsValue("loadingdone")
    val LOADING_DONE: EventType<FontFaceSetLoadEvent>

    @JsValue("loadingerror")
    val LOADING_ERROR: EventType<FontFaceSetLoadEvent>
}
