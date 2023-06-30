package electron.core


external interface ProductSubscriptionPeriod {
// Docs: https://electronjs.org/docs/api/structures/product-subscription-period
    /**
     * The number of units per subscription period.
     */
    var numberOfUnits: Double

    /**
     * The increment of time that a subscription period is specified in. Can be `day`,
     * `week`, `month`, `year`.
     */
    var unit: (ProductSubscriptionPeriodUnit)
}
