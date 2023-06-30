package electron


external interface Transaction {
// Docs: https://electronjs.org/docs/api/structures/transaction
    /**
     * The error code if an error occurred while processing the transaction.
     */
    var errorCode: Double

    /**
     * The error message if an error occurred while processing the transaction.
     */
    var errorMessage: String

    /**
     * The identifier of the restored transaction by the App Store.
     */
    var originalTransactionIdentifier: String
    var payment: Payment

    /**
     * The date the transaction was added to the App Store’s payment queue.
     */
    var transactionDate: String

    /**
     * A string that uniquely identifies a successful payment transaction.
     */
    var transactionIdentifier: String

    /**
     * The transaction state, can be `purchasing`, `purchased`, `failed`, `restored` or
     * `deferred`.
     */
    var transactionState: (TransactionTransactionState)
}
