// Automatically generated - do not modify!

package web.validation

/**
 * The **`ValidityState`** interface represents the validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState)
 */
open external class ValidityState
private constructor() {
    /**
     * The read-only **`badInput`** property of the ValidityState interface indicates if the user has provided input that the browser is unable to convert. For example, if you have a number input element whose content is a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/badInput)
     */
    open val badInput: Boolean

    /**
     * The read-only **`customError`** property of the ValidityState interface returns true if an element doesn't meet the validation required in the custom validity set by the element's setCustomValidity() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/customError)
     */
    open val customError: Boolean

    /**
     * The read-only **`patternMismatch`** property of the ValidityState interface indicates if the value of an <input>, after having been edited by the user, does not conform to the constraints set by the element's pattern attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/patternMismatch)
     */
    open val patternMismatch: Boolean

    /**
     * The read-only **`rangeOverflow`** property of the ValidityState interface indicates if the value of an <input>, after having been edited by the user, does not conform to the constraints set by the element's max attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeOverflow)
     */
    open val rangeOverflow: Boolean

    /**
     * The read-only **`rangeUnderflow`** property of the ValidityState interface indicates if the value of an <input>, after having been edited by the user, does not conform to the constraints set by the element's min attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeUnderflow)
     */
    open val rangeUnderflow: Boolean

    /**
     * The read-only **`stepMismatch`** property of the ValidityState interface indicates if the value of an <input>, after having been edited by the user, does not conform to the constraints set by the element's step attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/stepMismatch)
     */
    open val stepMismatch: Boolean

    /**
     * The read-only **`tooLong`** property of the ValidityState interface indicates if the value of an <input> or <textarea>, after having been edited by the user, exceeds the maximum code-unit length established by the element's maxlength attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooLong)
     */
    open val tooLong: Boolean

    /**
     * The read-only **`tooShort`** property of the ValidityState interface indicates if the value of an <input>, <button>, <select>, <output>, <fieldset> or <textarea>, after having been edited by the user, is less than the minimum code-unit length established by the element's minlength attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooShort)
     */
    open val tooShort: Boolean

    /**
     * The read-only **`typeMismatch`** property of the ValidityState interface indicates if the value of an <input>, after having been edited by the user, does not conform to the constraints set by the element's type attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/typeMismatch)
     */
    open val typeMismatch: Boolean

    /**
     * The read-only **`valid`** property of the ValidityState interface indicates if the value of an <input> element meets all its validation constraints, and is therefore considered to be valid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valid)
     */
    open val valid: Boolean

    /**
     * The read-only **`valueMissing`** property of the ValidityState interface indicates if a required control, such as an <input>, <select>, or <textarea>, has an empty value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valueMissing)
     */
    open val valueMissing: Boolean
}
