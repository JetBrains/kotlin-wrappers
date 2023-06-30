package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{payAsYouGo: 'payAsYouGo', payUpFront: 'payUpFront', freeTrial: 'freeTrial'}/*union*/)""")
sealed external interface ProductDiscountPaymentMode {
    companion object {
        val payAsYouGo: ProductDiscountPaymentMode
        val payUpFront: ProductDiscountPaymentMode
        val freeTrial: ProductDiscountPaymentMode
    }
}
