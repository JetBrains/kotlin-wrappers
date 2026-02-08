// Automatically generated - do not modify!

package electron.core

sealed external interface TransactionTransactionState {
    companion object
}

inline val TransactionTransactionState.Companion.purchasing: TransactionTransactionState
    get() = js.reflect.unsafeCast("purchasing")

inline val TransactionTransactionState.Companion.purchased: TransactionTransactionState
    get() = js.reflect.unsafeCast("purchased")

inline val TransactionTransactionState.Companion.failed: TransactionTransactionState
    get() = js.reflect.unsafeCast("failed")

inline val TransactionTransactionState.Companion.restored: TransactionTransactionState
    get() = js.reflect.unsafeCast("restored")

inline val TransactionTransactionState.Companion.deferred: TransactionTransactionState
    get() = js.reflect.unsafeCast("deferred")
