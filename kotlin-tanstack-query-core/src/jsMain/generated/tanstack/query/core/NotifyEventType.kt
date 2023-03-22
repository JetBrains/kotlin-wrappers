// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

// language=JavaScript
@JsName("""(/*union*/{added: 'added', removed: 'removed', updated: 'updated', observerAdded: 'observerAdded', observerRemoved: 'observerRemoved', observerResultsUpdated: 'observerResultsUpdated', observerOptionsUpdated: 'observerOptionsUpdated'}/*union*/)""")
sealed external interface NotifyEventType {
    companion object {
        val added: NotifyEventType
        val removed: NotifyEventType
        val updated: NotifyEventType
        val observerAdded: NotifyEventType
        val observerRemoved: NotifyEventType
        val observerResultsUpdated: NotifyEventType
        val observerOptionsUpdated: NotifyEventType
    }
}
