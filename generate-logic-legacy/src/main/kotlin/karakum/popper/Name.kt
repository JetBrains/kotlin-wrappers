package karakum.popper

import karakum.common.ConversionResult

internal fun nameTypes(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = "Name",
            body = """
            @JsExternalInheritorsOnly
            external interface Name
            """.trimIndent()
        ),
        ConversionResult(
            name = "ModifierName",
            body = """
            @JsExternalInheritorsOnly
            external interface ModifierName<Options : JsAny?>:
                Name    
            """.trimIndent()
        ),
        ConversionResult(
            name = "Popper",
            body = """
                @JsValue("popper")
                external val Popper: Name
            """.trimIndent()
        ),
    )
