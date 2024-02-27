// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class HashChangeEventTypes :
    HashChangeEventTypes_deprecated {

    @JsValue("hashchange")
    fun <C : EventTarget> hashChange(): EventType<HashChangeEvent<C>>
}
