package web.events

sealed external interface EventListenerOptions {
    var capture: Boolean?
}
