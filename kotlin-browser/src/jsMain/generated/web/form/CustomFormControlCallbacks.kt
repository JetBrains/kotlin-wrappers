// Automatically generated - do not modify!

package web.form

import web.html.HTMLFormElement

external interface CustomFormControlCallbacks {
    fun formAssociatedCallback(form: HTMLFormElement?)
    fun formDisabledCallback(disabled: Boolean)
    fun formResetCallback()
    fun formStateRestoreCallback(
        state: Any?, /* File | string | FormData */
        mode: FormStateRestoreMode,
    )
}
