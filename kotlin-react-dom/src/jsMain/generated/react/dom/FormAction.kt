// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.dom

import web.form.FormData

sealed external interface FormAction

inline fun FormAction(
    value: String,
): FormAction =
    value.unsafeCast<FormAction>()

inline fun FormAction(
    noinline value: (data: FormData) -> Unit,
): FormAction =
    value.unsafeCast<FormAction>()

inline fun FormAction.asStringOrNull(): String? =
    asDynamic() as? String
