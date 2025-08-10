@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.reflect.JsExternalInheritorsOnly
import web.gpu.GPU
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface NavigatorGPU {
    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/gpu)
     */
    val gpu: GPU
        get() = definedExternally
}
