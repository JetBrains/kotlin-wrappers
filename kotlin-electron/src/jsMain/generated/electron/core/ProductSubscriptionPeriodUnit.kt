package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{day: 'day', week: 'week', month: 'month', year: 'year'}/*union*/)""")
sealed external interface ProductSubscriptionPeriodUnit {
    companion object {
        val day: ProductSubscriptionPeriodUnit
        val week: ProductSubscriptionPeriodUnit
        val month: ProductSubscriptionPeriodUnit
        val year: ProductSubscriptionPeriodUnit
    }
}
