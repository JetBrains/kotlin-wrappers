// Automatically generated - do not modify!

package testinglibrary.dom

import web.events.Event

external interface CreateObject {
    operator fun <K : EventType> get(
        key: K,
    ): (
        (
        element: Any?, /* Document | Element | Window | Node */
        options: (Any)?, // use undefined for default
    ) -> Event
    )?

    operator fun <K : EventType> set(
        key: K,
        value: (
            (
            element: Any?, /* Document | Element | Window | Node */
            options: (Any)?, // use undefined for default
        ) -> Event
        )?,
    )
}
