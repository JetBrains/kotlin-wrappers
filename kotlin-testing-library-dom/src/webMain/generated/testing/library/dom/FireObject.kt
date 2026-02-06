// Automatically generated - do not modify!

package testing.library.dom

external interface FireObject {
    operator fun <K : EventType> get(
        key: K,
    ): (
        (
        element: Any?, /* Document | Element | Window | Node */
        options: (Any)?, // use undefined for default
    ) -> Boolean
    )?

    operator fun <K : EventType> set(
        key: K,
        value: (
            (
            element: Any?, /* Document | Element | Window | Node */
            options: (Any)?, // use undefined for default
        ) -> Boolean
        )?,
    )
}
