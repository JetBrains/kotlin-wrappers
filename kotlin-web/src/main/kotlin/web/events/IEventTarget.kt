package web.events

external interface IEventTarget {
    fun <T : Event> addEventListener(
        type: EventType<T>,
        callback: EventHandler<T>?,
        options: EventHandlerOptions? = definedExternally,
    )

    fun <T : Event> removeEventListener(
        type: EventType<T>,
        callback: EventHandler<T>?,
        options: EventHandlerOptions? = definedExternally,
    )
}
