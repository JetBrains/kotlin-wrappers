package web.events

external interface IEventTarget {
    fun addEventListener(
        type: String,
        callback: EventHandler<Event>?,
        options: EventHandlerOptions? = definedExternally,
    )

    fun removeEventListener(
        type: String,
        callback: EventHandler<Event>?,
        options: EventHandlerOptions? = definedExternally,
    )
}
