package wrappers.example

import web.events.Event
import web.messaging.MessageEvent

fun main() {
    val event: Any = MessageEvent("data")
    println(event is Event)
}
