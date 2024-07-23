// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.dom

import web.form.FormData

@JsExternalInheritorsOnly
sealed external interface FormAction

sealed external interface FormActionCallback
    : FormAction

inline fun FormAction(
    value: String,
): FormAction =
    value.unsafeCast<FormAction>()

inline fun FormAction(
    noinline value: () -> Unit,
): FormActionCallback =
    value.unsafeCast<FormActionCallback>()

inline fun FormAction(
    noinline value: (data: FormData) -> Unit,
): FormActionCallback =
    value.unsafeCast<FormActionCallback>()

inline fun FormAction.asStringOrNull(): String? =
    asDynamic() as? String

inline fun FormAction.asCallbackOrNull(): FormActionCallback? =
    if (asDynamic() is Function<*>) {
        unsafeCast<FormActionCallback>()
    } else null
