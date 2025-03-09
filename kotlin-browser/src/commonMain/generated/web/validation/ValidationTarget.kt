// Automatically generated - do not modify!

package web.validation

external interface ValidationTarget {
    val validationMessage: String
    val validity: ValidityState
    val willValidate: Boolean
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean
}
