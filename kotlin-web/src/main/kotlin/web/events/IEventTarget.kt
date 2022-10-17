package web.events

external interface IEventTarget {
    fun addEventListener(
        type: String,
        callback: ((Event) -> Unit)?,
        options: dynamic = definedExternally,
    )

    fun removeEventListener(
        type: String,
        callback: ((Event) -> Unit)?,
        options: dynamic = definedExternally,
    )

    fun dispatchEvent(event: Event): Boolean
}
