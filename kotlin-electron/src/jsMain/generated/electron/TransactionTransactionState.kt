package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{purchasing: 'purchasing', purchased: 'purchased', failed: 'failed', restored: 'restored', deferred: 'deferred'}/*union*/)""")
sealed external interface TransactionTransactionState {
    companion object {
        val purchasing: TransactionTransactionState
        val purchased: TransactionTransactionState
        val failed: TransactionTransactionState
        val restored: TransactionTransactionState
        val deferred: TransactionTransactionState
    }
}
