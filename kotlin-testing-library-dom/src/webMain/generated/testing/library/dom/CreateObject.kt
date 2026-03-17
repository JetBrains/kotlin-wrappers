// Automatically generated - do not modify!

package testing.library.dom

external interface CreateObject {
    operator fun <K : EventType> get(
        key: K,
    ): (
        (
        element: Any, /* Document | Element | Window | Node */
        options: (Any)?, // use undefined for default
    ) -> web.events.Event
    )?

    operator fun <K : EventType> set(
        key: K,
        value: (
            (
            element: Any, /* Document | Element | Window | Node */
            options: (Any)?, // use undefined for default
        ) -> web.events.Event
        )?,
    )
}
