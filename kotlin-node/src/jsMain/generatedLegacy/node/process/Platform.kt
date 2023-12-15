// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.process

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Platform {
    companion object {
        @JsValue("aix")
        val aix: Platform

        @JsValue("android")
        val android: Platform

        @JsValue("darwin")
        val darwin: Platform

        @JsValue("freebsd")
        val freebsd: Platform

        @JsValue("haiku")
        val haiku: Platform

        @JsValue("linux")
        val linux: Platform

        @JsValue("openbsd")
        val openbsd: Platform

        @JsValue("sunos")
        val sunos: Platform

        @JsValue("win32")
        val win32: Platform

        @JsValue("cygwin")
        val cygwin: Platform

        @JsValue("netbsd")
        val netbsd: Platform
    }
}
