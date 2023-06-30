package electron.core


external interface PurchaseProductOpts {
    /**
     * The number of items the user wants to purchase.
     */
    var quantity: Double?

    /**
     * The string that associates the transaction with a user account on your service
     * (applicationUsername).
     */
    var username: String?
}
