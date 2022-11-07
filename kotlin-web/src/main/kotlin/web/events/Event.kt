package web.events

external interface EventInit {
    var bubbles: Boolean?
    var cancelable: Boolean?
    var composed: Boolean?
}

open external class Event(
    type: String,
    init: EventInit = definedExternally
) : LegacyEvent {
    companion object
}
