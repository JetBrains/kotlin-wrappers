// Automatically generated - do not modify!

package react.dom

import js.promise.Promise
import web.form.FormData

sealed external interface FormActionCallback
    : FormAction

// Support `PromiseLike`?
suspend operator fun FormActionCallback.invoke(
    data: FormData,
) {
    val result = asDynamic()(data)
    if (result is Promise<*>) {
        result.await()
    }
}
