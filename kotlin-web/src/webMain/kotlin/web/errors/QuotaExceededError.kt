package web.errors

import js.serialization.Serializable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError)
 */
open external class QuotaExceededError(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/message)
     */
    override val message: String = definedExternally,
    options: QuotaExceededErrorOptions = definedExternally,
) : DOMException,
    Serializable {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/quota)
     */
    val quota: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/requested)
     */
    val requested: Double?
}
