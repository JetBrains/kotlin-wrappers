@file:JsModule("node:events")

package node.events

import js.array.Tuple
import web.events.JsEvent

@JsName("EventEmitter")
external class MyEmitter {
    @JsEvent("data")
    val dataEvent: EventInstance<Tuple>
}
