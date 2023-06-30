package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{TRANSACTIONS_UPDATED: 'transactions-updated'}/*union*/)""")
sealed external interface InAppPurchaseEvent : node.events.EventType {
    object TRANSACTIONS_UPDATED : InAppPurchaseEvent
}
