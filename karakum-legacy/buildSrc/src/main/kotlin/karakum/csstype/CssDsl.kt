package karakum.csstype

import karakum.common.ConversionResult

internal const val CSS_DSL = "CssDsl"

private val CSS_DSL_BODY = """
import js.objects.JsoDsl

typealias $CSS_DSL = JsoDsl
""".trimIndent()

internal fun CssDsl(): ConversionResult =
    ConversionResult(CSS_DSL, CSS_DSL_BODY)
