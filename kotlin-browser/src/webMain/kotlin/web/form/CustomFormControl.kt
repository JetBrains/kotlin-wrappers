package web.form

import js.core.JsAny
import web.html.HTMLFormElement

external interface CustomFormControl :
    FormControl {

    interface WithFormCallbacks :
        WithFormAssociatedCallback,
        WithFormDisabledCallback,
        WithFormResetCallback,
        WithFormStateRestoreCallback

    interface WithFormAssociatedCallback {
        fun formAssociatedCallback(form: HTMLFormElement?)
    }

    interface WithFormDisabledCallback {
        fun formDisabledCallback(disabled: Boolean)
    }

    interface WithFormResetCallback {
        fun formResetCallback()
    }

    interface WithFormStateRestoreCallback {
        fun formStateRestoreCallback(
            state: JsAny?, /* File | string | FormData */
            mode: FormStateRestoreMode,
        )
    }
}
