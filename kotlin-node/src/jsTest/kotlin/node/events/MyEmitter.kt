package node.events

import js.array.Tuple

class MyEmitter {
    private val emitter = EventEmitter()

    val dataEvent: EventInstance<Tuple>
        get() = EventInstance(emitter, EventType("data"))
}
