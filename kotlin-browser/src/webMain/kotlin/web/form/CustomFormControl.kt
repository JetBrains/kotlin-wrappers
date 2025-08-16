package web.form

import js.core.JsAny
import web.html.HTMLFormElement
import kotlin.js.definedExternally

external interface CustomFormControl :
    FormControl {

    val formAssociatedCallback: FormAssociatedCallback?
        get() = definedExternally

    val formDisabledCallback: FormDisabledCallback?
        get() = definedExternally

    val formResetCallback: FormResetCallback?
        get() = definedExternally

    val formStateRestoreCallback: FormStateRestoreCallback?
        get() = definedExternally
}

typealias FormAssociatedCallback = (form: HTMLFormElement?) -> Unit

typealias FormDisabledCallback = (disabled: Boolean) -> Unit

typealias FormResetCallback = () -> Unit

typealias FormStateRestoreCallback = (
    state: JsAny?, /* File | string | FormData */
    mode: FormStateRestoreMode,
) -> Unit
