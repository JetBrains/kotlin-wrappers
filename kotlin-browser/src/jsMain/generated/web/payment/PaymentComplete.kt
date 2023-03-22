// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.payment

// language=JavaScript
@JsName("""(/*union*/{fail: 'fail', success: 'success', unknown: 'unknown'}/*union*/)""")
sealed external interface PaymentComplete {
    companion object {
        val fail: PaymentComplete
        val success: PaymentComplete
        val unknown: PaymentComplete
    }
}
