// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MediaQueryListEventTypes :
    MediaQueryListEventTypes_deprecated {

    @JsValue("change")
    fun <C : EventTarget> change(): EventType<MediaQueryListEvent<C>>
}
