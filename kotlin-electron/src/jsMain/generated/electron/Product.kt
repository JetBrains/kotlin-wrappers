package electron


external interface Product {
// Docs: https://electronjs.org/docs/api/structures/product
    /**
     * The total size of the content, in bytes.
     */
    var contentLengths: js.core.ReadonlyArray<Double>

    /**
     * A string that identifies the version of the content.
     */
    var contentVersion: String

    /**
     * 3 character code presenting a product's currency based on the ISO 4217 standard.
     */
    var currencyCode: String

    /**
     * An array of discount offers
     */
    var discounts: js.core.ReadonlyArray<ProductDiscount>

    /**
     * The total size of the content, in bytes.
     */
    var downloadContentLengths: js.core.ReadonlyArray<Double>

    /**
     * A string that identifies the version of the content.
     */
    var downloadContentVersion: String

    /**
     * The locale formatted price of the product.
     */
    var formattedPrice: String

    /**
     * The object containing introductory price information for the product. available
     * for the product.
     */
    var introductoryPrice: ProductDiscount?

    /**
     * A boolean value that indicates whether the App Store has downloadable content
     * for this product. `true` if at least one file has been associated with the
     * product.
     */
    var isDownloadable: Boolean

    /**
     * A description of the product.
     */
    var localizedDescription: String

    /**
     * The name of the product.
     */
    var localizedTitle: String

    /**
     * The cost of the product in the local currency.
     */
    var price: Double

    /**
     * The string that identifies the product to the Apple App Store.
     */
    var productIdentifier: String

    /**
     * The identifier of the subscription group to which the subscription belongs.
     */
    var subscriptionGroupIdentifier: String

    /**
     * The period details for products that are subscriptions.
     */
    var subscriptionPeriod: ProductSubscriptionPeriod?
}
