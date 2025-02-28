@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.promise

import js.disposable.Disposable
import js.reflect.JsExternalInheritorsOnly

@JsExternalInheritorsOnly
external interface DisposablePromise<out T> :
    Promise<T>,
    Disposable
