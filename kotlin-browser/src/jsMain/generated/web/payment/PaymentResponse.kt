// Automatically generated - do not modify!

package web.payment

import js.core.Void
import web.events.EventTarget
import kotlin.js.Promise

sealed external class PaymentResponse :
    EventTarget {
    val details: Any?
    val methodName: String
    val requestId: String
    fun complete(result: PaymentComplete = definedExternally): Promise<Void>
    fun retry(errorFields: PaymentValidationErrors = definedExternally): Promise<Void>
    fun toJSON(): Any
}
