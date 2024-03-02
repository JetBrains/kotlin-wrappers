// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUBlendFactor {
    companion object {
        @JsValue("zero")
        val zero: GPUBlendFactor

        @JsValue("one")
        val one: GPUBlendFactor

        @JsValue("src")
        val src: GPUBlendFactor

        @JsValue("one-minus-src")
        val oneMinusSrc: GPUBlendFactor

        @JsValue("src-alpha")
        val srcAlpha: GPUBlendFactor

        @JsValue("one-minus-src-alpha")
        val oneMinusSrcAlpha: GPUBlendFactor

        @JsValue("dst")
        val dst: GPUBlendFactor

        @JsValue("one-minus-dst")
        val oneMinusDst: GPUBlendFactor

        @JsValue("dst-alpha")
        val dstAlpha: GPUBlendFactor

        @JsValue("one-minus-dst-alpha")
        val oneMinusDstAlpha: GPUBlendFactor

        @JsValue("src-alpha-saturated")
        val srcAlphaSaturated: GPUBlendFactor

        @JsValue("constant")
        val constant: GPUBlendFactor

        @JsValue("one-minus-constant")
        val oneMinusConstant: GPUBlendFactor
    }
}
