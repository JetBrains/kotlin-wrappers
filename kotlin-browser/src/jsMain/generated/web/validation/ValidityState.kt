// Automatically generated - do not modify!

package web.validation

/**
 * The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState)
 */
sealed external class ValidityState {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/badInput)
     */
    val badInput: Boolean
    val customError: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/patternMismatch)
     */
    val patternMismatch: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeOverflow)
     */
    val rangeOverflow: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeUnderflow)
     */
    val rangeUnderflow: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/stepMismatch)
     */
    val stepMismatch: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooLong)
     */
    val tooLong: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooShort)
     */
    val tooShort: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/typeMismatch)
     */
    val typeMismatch: Boolean
    val valid: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valueMissing)
     */
    val valueMissing: Boolean
}
