// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.process

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface UncaughtExceptionOrigin {
    companion object {
        @JsValue("uncaughtException")
        val uncaughtException: UncaughtExceptionOrigin

        @JsValue("unhandledRejection")
        val unhandledRejection: UncaughtExceptionOrigin
    }
}
