@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom


/**
 * Submits a HTML `<form>` to the server without reloading the page.
 */
typealias SubmitFunction = (
    /**
     * Specifies the `<form>` to be submitted to the server, a specific
     * `<button>` or `<input type="submit">` to use to submit the form, or some
     * arbitrary data to submit.
     *
     * Note: When using a `<button>` its `name` and `value` will also be
     * included in the form data that is submitted.
     */
    target: SubmitTarget,
    /**
     * Options that override the `<form>`'s own attributes. Required when
     * submitting arbitrary data without a backing `<form>`.
     */
    options: SubmitOptions? /* use undefined for default */
) -> Unit
