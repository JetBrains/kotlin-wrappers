// Automatically generated - do not modify!

package web.validation

/**
 * The **`ValidityState`** interface represents the _validity states_ that an element can be in, with respect to constraint validation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState)
 */
open external class ValidityState
private constructor() {
    /**
     * The read-only **`badInput`** property of the ValidityState interface indicates if the user has provided input that the browser is unable to convert.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/badInput)
     */
    val badInput: Boolean

    /**
     * The read-only **`customError`** property of the `ValidityState` interface returns `true` if an element doesn't meet the validation required in the custom validity set by the element's HTMLInputElement.setCustomValidity method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/customError)
     */
    val customError: Boolean

    /**
     * The read-only **`patternMismatch`** property of the `ValidityState` interface indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's `pattern` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/patternMismatch)
     */
    val patternMismatch: Boolean

    /**
     * The read-only **`rangeOverflow`** property of the `ValidityState` interface indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's `max` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeOverflow)
     */
    val rangeOverflow: Boolean

    /**
     * The read-only **`rangeUnderflow`** property of the `ValidityState` interface indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's `min` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeUnderflow)
     */
    val rangeUnderflow: Boolean

    /**
     * The read-only **`stepMismatch`** property of the `ValidityState` interface indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's `step` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/stepMismatch)
     */
    val stepMismatch: Boolean

    /**
     * The read-only **`tooLong`** property of the `ValidityState` interface indicates if the value of an input or textarea, after having been edited by the user, exceeds the maximum code-unit length established by the element's `maxlength` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooLong)
     */
    val tooLong: Boolean

    /**
     * The read-only **`tooShort`** property of the `ValidityState` interface indicates if the value of an input, button, select, output, fieldset or textarea, after having been edited by the user, is less than the minimum code-unit length established by the element's `minlength` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooShort)
     */
    val tooShort: Boolean

    /**
     * The read-only **`typeMismatch`** property of the `ValidityState` interface indicates if the value of an input, after having been edited by the user, does not conform to the constraints set by the element's `type` attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/typeMismatch)
     */
    val typeMismatch: Boolean

    /**
     * The read-only **`valid`** property of the `ValidityState` interface indicates if the value of an input element meets all its validation constraints, and is therefore considered to be valid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valid)
     */
    val valid: Boolean

    /**
     * The read-only **`valueMissing`** property of the `ValidityState` interface indicates if a `required` control, such as an input, select, or textarea, has an empty value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valueMissing)
     */
    val valueMissing: Boolean
}
