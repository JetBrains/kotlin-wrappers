package karakum.react

import karakum.common.GENERATOR_COMMENT
import karakum.common.writeCode
import java.io.File

private val ARIA_IMPORTS = """
import react.dom.aria.AriaAttributes
import react.dom.aria.AriaRole    
""".trimIndent()

private val DOM_TYPES = setOf(
    "DOMAttributes",
    "DangerouslySetInnerHTML",
)

private val DOM_IMPORTS = """
import react.ActionOrString
import react.dom.DOMAttributes
import react.dom.FormAction
import web.form.FormData
import web.form.FormEncType
import web.html.EnterKeyHint
import web.html.InputType
import web.html.Loading
import web.http.ReferrerPolicy
import web.window.WindowTarget
import web.window.WindowName
import web.html.ImageDecoding
import web.keyboard.KeyCode
import web.html.AutoCapitalize
import web.html.InputMode
import web.html.ButtonType
import web.autofill.AutoFill
import web.popover.Popover
import web.popover.PopoverTargetAction
""".trimIndent()

private val SESKAR_IMPORTS = """
import seskar.js.JsRawValue
import seskar.js.JsValue
""".trimIndent()

private val EXCLUDED_TYPES = setOf(
    "ButtonType",
    "ImgDecoding",
    "InputMode",
    "ModifierKey",
    "SVGTextElementAttributes",
    "SVGLineElementAttributes",
    "AutoFillNormalField",
    "AutoFillCredentialField",
    "AutoFillContactKind",
    "AutoFillContactField",
    "AutoFillBase",
    "AutoFillAddressKind",
    "HTMLElementType",
    "SVGElementType",
    "OldState",
    "NewState",
    "Popover",
    "PopoverTargetAction",
)

fun generateKotlinDeclarations(
    definitionsFile: File,
    sourceDir: File,
) {
    for ((name, body, pkg) in convertDefinitions(definitionsFile)) {
        if (name in EXCLUDED_TYPES) {
            continue
        }

        val finalPkg = when {
            name.startsWith("Aria") -> Package.ARIA
            name in DOM_TYPES -> Package.DOM
            "SVG" in name -> Package.SVG
            name == "PointerType" -> Package.EVENTS
            name == "ModifierKey" -> Package.EVENTS
            else -> pkg
        }

        val content = when (finalPkg) {
            Package.HTML,
            Package.SVG,
            Package.DOM,
                -> ARIA_IMPORTS + "\n" + DOM_IMPORTS + "\n" + SESKAR_IMPORTS + "\n" + body

            else -> SESKAR_IMPORTS + "\n" + body
        }

        val targetDir = sourceDir.resolve(finalPkg.path)
            .also { it.mkdirs() }

        targetDir.resolve("${name}.kt")
            .writeCode(fileContent(finalPkg, "", content))
    }
}

private fun fileContent(
    pkg: Package,
    annotations: String,
    body: String,
): String {
    return sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        pkg.pkg,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")
}
