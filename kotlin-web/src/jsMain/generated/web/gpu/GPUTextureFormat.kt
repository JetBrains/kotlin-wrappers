// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUTextureFormat {
    companion object {
        @JsValue("r8unorm")
        val r8unorm: GPUTextureFormat

        @JsValue("r8snorm")
        val r8snorm: GPUTextureFormat

        @JsValue("r8uint")
        val r8uint: GPUTextureFormat

        @JsValue("r8sint")
        val r8sint: GPUTextureFormat

        @JsValue("r16uint")
        val r16uint: GPUTextureFormat

        @JsValue("r16sint")
        val r16sint: GPUTextureFormat

        @JsValue("r16float")
        val r16float: GPUTextureFormat

        @JsValue("rg8unorm")
        val rg8unorm: GPUTextureFormat

        @JsValue("rg8snorm")
        val rg8snorm: GPUTextureFormat

        @JsValue("rg8uint")
        val rg8uint: GPUTextureFormat

        @JsValue("rg8sint")
        val rg8sint: GPUTextureFormat

        @JsValue("r32uint")
        val r32uint: GPUTextureFormat

        @JsValue("r32sint")
        val r32sint: GPUTextureFormat

        @JsValue("r32float")
        val r32float: GPUTextureFormat

        @JsValue("rg16uint")
        val rg16uint: GPUTextureFormat

        @JsValue("rg16sint")
        val rg16sint: GPUTextureFormat

        @JsValue("rg16float")
        val rg16float: GPUTextureFormat

        @JsValue("rgba8unorm")
        val rgba8unorm: GPUTextureFormat

        @JsValue("rgba8unorm-srgb")
        val rgba8unormSrgb: GPUTextureFormat

        @JsValue("rgba8snorm")
        val rgba8snorm: GPUTextureFormat

        @JsValue("rgba8uint")
        val rgba8uint: GPUTextureFormat

        @JsValue("rgba8sint")
        val rgba8sint: GPUTextureFormat

        @JsValue("bgra8unorm")
        val bgra8unorm: GPUTextureFormat

        @JsValue("bgra8unorm-srgb")
        val bgra8unormSrgb: GPUTextureFormat

        @JsValue("rgb9e5ufloat")
        val rgb9e5ufloat: GPUTextureFormat

        @JsValue("rgb10a2uint")
        val rgb10a2uint: GPUTextureFormat

        @JsValue("rgb10a2unorm")
        val rgb10a2unorm: GPUTextureFormat

        @JsValue("rg11b10ufloat")
        val rg11b10ufloat: GPUTextureFormat

        @JsValue("rg32uint")
        val rg32uint: GPUTextureFormat

        @JsValue("rg32sint")
        val rg32sint: GPUTextureFormat

        @JsValue("rg32float")
        val rg32float: GPUTextureFormat

        @JsValue("rgba16uint")
        val rgba16uint: GPUTextureFormat

        @JsValue("rgba16sint")
        val rgba16sint: GPUTextureFormat

        @JsValue("rgba16float")
        val rgba16float: GPUTextureFormat

        @JsValue("rgba32uint")
        val rgba32uint: GPUTextureFormat

        @JsValue("rgba32sint")
        val rgba32sint: GPUTextureFormat

        @JsValue("rgba32float")
        val rgba32float: GPUTextureFormat

        @JsValue("stencil8")
        val stencil8: GPUTextureFormat

        @JsValue("depth16unorm")
        val depth16unorm: GPUTextureFormat

        @JsValue("depth24plus")
        val depth24plus: GPUTextureFormat

        @JsValue("depth24plus-stencil8")
        val depth24plusStencil8: GPUTextureFormat

        @JsValue("depth32float")
        val depth32float: GPUTextureFormat

        @JsValue("depth32float-stencil8")
        val depth32floatStencil8: GPUTextureFormat

        @JsValue("bc1-rgba-unorm")
        val bc1RgbaUnorm: GPUTextureFormat

        @JsValue("bc1-rgba-unorm-srgb")
        val bc1RgbaUnormSrgb: GPUTextureFormat

        @JsValue("bc2-rgba-unorm")
        val bc2RgbaUnorm: GPUTextureFormat

        @JsValue("bc2-rgba-unorm-srgb")
        val bc2RgbaUnormSrgb: GPUTextureFormat

        @JsValue("bc3-rgba-unorm")
        val bc3RgbaUnorm: GPUTextureFormat

        @JsValue("bc3-rgba-unorm-srgb")
        val bc3RgbaUnormSrgb: GPUTextureFormat

        @JsValue("bc4-r-unorm")
        val bc4RUnorm: GPUTextureFormat

        @JsValue("bc4-r-snorm")
        val bc4RSnorm: GPUTextureFormat

        @JsValue("bc5-rg-unorm")
        val bc5RgUnorm: GPUTextureFormat

        @JsValue("bc5-rg-snorm")
        val bc5RgSnorm: GPUTextureFormat

        @JsValue("bc6h-rgb-ufloat")
        val bc6hRgbUfloat: GPUTextureFormat

        @JsValue("bc6h-rgb-float")
        val bc6hRgbFloat: GPUTextureFormat

        @JsValue("bc7-rgba-unorm")
        val bc7RgbaUnorm: GPUTextureFormat

        @JsValue("bc7-rgba-unorm-srgb")
        val bc7RgbaUnormSrgb: GPUTextureFormat

        @JsValue("etc2-rgb8unorm")
        val etc2Rgb8unorm: GPUTextureFormat

        @JsValue("etc2-rgb8unorm-srgb")
        val etc2Rgb8unormSrgb: GPUTextureFormat

        @JsValue("etc2-rgb8a1unorm")
        val etc2Rgb8a1unorm: GPUTextureFormat

        @JsValue("etc2-rgb8a1unorm-srgb")
        val etc2Rgb8a1unormSrgb: GPUTextureFormat

        @JsValue("etc2-rgba8unorm")
        val etc2Rgba8unorm: GPUTextureFormat

        @JsValue("etc2-rgba8unorm-srgb")
        val etc2Rgba8unormSrgb: GPUTextureFormat

        @JsValue("eac-r11unorm")
        val eacR11unorm: GPUTextureFormat

        @JsValue("eac-r11snorm")
        val eacR11snorm: GPUTextureFormat

        @JsValue("eac-rg11unorm")
        val eacRg11unorm: GPUTextureFormat

        @JsValue("eac-rg11snorm")
        val eacRg11snorm: GPUTextureFormat

        @JsValue("astc-4x4-unorm")
        val astc4x4Unorm: GPUTextureFormat

        @JsValue("astc-4x4-unorm-srgb")
        val astc4x4UnormSrgb: GPUTextureFormat

        @JsValue("astc-5x4-unorm")
        val astc5x4Unorm: GPUTextureFormat

        @JsValue("astc-5x4-unorm-srgb")
        val astc5x4UnormSrgb: GPUTextureFormat

        @JsValue("astc-5x5-unorm")
        val astc5x5Unorm: GPUTextureFormat

        @JsValue("astc-5x5-unorm-srgb")
        val astc5x5UnormSrgb: GPUTextureFormat

        @JsValue("astc-6x5-unorm")
        val astc6x5Unorm: GPUTextureFormat

        @JsValue("astc-6x5-unorm-srgb")
        val astc6x5UnormSrgb: GPUTextureFormat

        @JsValue("astc-6x6-unorm")
        val astc6x6Unorm: GPUTextureFormat

        @JsValue("astc-6x6-unorm-srgb")
        val astc6x6UnormSrgb: GPUTextureFormat

        @JsValue("astc-8x5-unorm")
        val astc8x5Unorm: GPUTextureFormat

        @JsValue("astc-8x5-unorm-srgb")
        val astc8x5UnormSrgb: GPUTextureFormat

        @JsValue("astc-8x6-unorm")
        val astc8x6Unorm: GPUTextureFormat

        @JsValue("astc-8x6-unorm-srgb")
        val astc8x6UnormSrgb: GPUTextureFormat

        @JsValue("astc-8x8-unorm")
        val astc8x8Unorm: GPUTextureFormat

        @JsValue("astc-8x8-unorm-srgb")
        val astc8x8UnormSrgb: GPUTextureFormat

        @JsValue("astc-10x5-unorm")
        val astc10x5Unorm: GPUTextureFormat

        @JsValue("astc-10x5-unorm-srgb")
        val astc10x5UnormSrgb: GPUTextureFormat

        @JsValue("astc-10x6-unorm")
        val astc10x6Unorm: GPUTextureFormat

        @JsValue("astc-10x6-unorm-srgb")
        val astc10x6UnormSrgb: GPUTextureFormat

        @JsValue("astc-10x8-unorm")
        val astc10x8Unorm: GPUTextureFormat

        @JsValue("astc-10x8-unorm-srgb")
        val astc10x8UnormSrgb: GPUTextureFormat

        @JsValue("astc-10x10-unorm")
        val astc10x10Unorm: GPUTextureFormat

        @JsValue("astc-10x10-unorm-srgb")
        val astc10x10UnormSrgb: GPUTextureFormat

        @JsValue("astc-12x10-unorm")
        val astc12x10Unorm: GPUTextureFormat

        @JsValue("astc-12x10-unorm-srgb")
        val astc12x10UnormSrgb: GPUTextureFormat

        @JsValue("astc-12x12-unorm")
        val astc12x12Unorm: GPUTextureFormat

        @JsValue("astc-12x12-unorm-srgb")
        val astc12x12UnormSrgb: GPUTextureFormat
    }
}
