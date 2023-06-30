package electron.core


external interface ProductDiscount {
// Docs: https://electronjs.org/docs/api/structures/product-discount
    /**
     * A string used to uniquely identify a discount offer for a product.
     */
    var identifier: String

    /**
     * An integer that indicates the number of periods the product discount is
     * available.
     */
    var numberOfPeriods: Double

    /**
     * The payment mode for this product discount. Can be `payAsYouGo`, `payUpFront`,
     * or `freeTrial`.
     */
    var paymentMode: (ProductDiscountPaymentMode)

    /**
     * The discount price of the product in the local currency.
     */
    var price: Double

    /**
     * The locale used to format the discount price of the product.
     */
    var priceLocale: String

    /**
     * An object that defines the period for the product discount.
     */
    var subscriptionPeriod: ProductSubscriptionPeriod?

    /**
     * The type of discount offer.
     */
    var type: Double
}
