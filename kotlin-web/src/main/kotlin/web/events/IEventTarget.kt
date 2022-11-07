package web.events

external interface IEventTarget {
    fun addEventListener(
        type: String,
        callback: ((LegacyEvent) -> Unit)?,
        options: dynamic = definedExternally,
    )

    fun removeEventListener(
        type: String,
        callback: ((LegacyEvent) -> Unit)?,
        options: dynamic = definedExternally,
    )
}
