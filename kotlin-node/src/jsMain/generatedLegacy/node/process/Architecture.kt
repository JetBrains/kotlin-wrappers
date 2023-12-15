// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.process

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Architecture {
    companion object {
        @JsValue("arm")
        val arm: Architecture

        @JsValue("arm64")
        val arm64: Architecture

        @JsValue("ia32")
        val ia32: Architecture

        @JsValue("mips")
        val mips: Architecture

        @JsValue("mipsel")
        val mipsel: Architecture

        @JsValue("ppc")
        val ppc: Architecture

        @JsValue("ppc64")
        val ppc64: Architecture

        @JsValue("s390")
        val s390: Architecture

        @JsValue("s390x")
        val s390x: Architecture

        @JsValue("x64")
        val x64: Architecture
    }
}
