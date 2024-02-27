// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class FontFaceSetLoadEventTypes :
    FontFaceSetLoadEventTypes_deprecated {

    @JsValue("loading")
    fun <C : EventTarget> loading(): EventType<FontFaceSetLoadEvent<C>>

    @JsValue("loadingdone")
    fun <C : EventTarget> loadingDone(): EventType<FontFaceSetLoadEvent<C>>

    @JsValue("loadingerror")
    fun <C : EventTarget> loadingError(): EventType<FontFaceSetLoadEvent<C>>
}
