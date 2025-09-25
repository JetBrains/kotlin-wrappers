package karakum.react

import karakum.common.withDefaultLineBreaks
import java.io.File

internal data class ConversionResult(
    val name: String,
    val body: String,
    val pkg: Package = Package.HTML,
)

internal fun convertDefinitions(
    definitionFile: File,
): Sequence<ConversionResult> {
    val content = definitionFile.readText()
        .removeDeprecatedMembers()
        .applyFocusEventPatch()
        .applyNormalizeUnionsPatch()
        .replace("HTMLTableHeaderCellElement", "HTMLTableCellElement")
        .replace("HTMLTableDataCellElement", "HTMLTableCellElement")
        .replace("HTMLWebViewElement", "HTMLElement")
        .replace(": HTMLAttributeAnchorTarget", ": WindowTarget")
        .replace(": HTMLAttributeReferrerPolicy", ": ReferrerPolicy")
        .replace(": HTMLInputTypeAttribute", ": InputType")
        .replace("    target?: string | undefined;", "    target?: WindowTarget | undefined;")
        .replace("    formTarget?: string | undefined;", "    formTarget?: WindowTarget | undefined;")
        .replace("    formMethod?: string | undefined;", "    formMethod?: FormMethod | undefined;")
        .replace("    formEncType?: string | undefined;", "    formEncType?: FormEncType | undefined;")
        .replace("    encType?: string | undefined;", "    encType?: FormEncType | undefined;")
        .replace("    autoComplete?: string | undefined;", "    autoComplete?: AutoFill | undefined;")
        .replace(""": boolean | "false"""", """: "false"""")
        .replace("""blocking?: "render" | (string & {}) | undefined;""", """blocking?: Blocking | undefined;""")
        .replace(
            Regex("""fetchPriority\?: "high" \| "low" \| "auto"( \| undefined)?;"""),
            """fetchPriority?: FetchPriority;"""
        )
        .replace(" |  undefined", " | undefined")
        .replace(" | (string & {})", "")
        .replace("((formData: FormData) => void | Promise<void>) |", "")
        .replace("""popover?: "" | "auto" | "manual" | undefined;""", "popover?: Popover;")
        .replace(
            """popoverTargetAction?: "toggle" | "show" | "hide" | undefined;""",
            "popoverTargetAction?: PopoverTargetAction;",
        )
        .replace("((formData: FormData) => void | Promise<void>) |", "")
        .withDefaultLineBreaks()

    val intrinsicsContent = content.substringAfter("    interface IntrinsicElements {\n")
        .substringBefore("\n        }")
        .replace("\n\n", "\n")
        .replace("            picture", "picture")
        .replace(", \n", ",")
        .replaceIndent("    ")

    val htmlIntrinsics = intrinsicsContent.substringAfter("// HTML\n")
        .substringBefore("// SVG\n")

    val svgIntrinsics = intrinsicsContent.substringAfter("// SVG\n")

    val reactContent = content
        .substringAfter("declare namespace React {\n")
        .substringBefore("\n}\n")
        .trimIndent()
        .plus(ADDITIONAL_TYPES)
        .plus("\ninterface ReactSVG {\n$svgIntrinsics\n}")
        .plus("\ninterface ReactHTML {\n$htmlIntrinsics\n}")
        .trimIndent()

    return convertInterfaces(reactContent)
        .plus(convertUnions(reactContent))
        .plus(convertNativeEvents(content))
        .plus(convertEventHandlers(reactContent))
        .plus(FormAction())
}

private val EXCLUDED_UNIONS = setOf(
    "HTMLAttributeAnchorTarget",
    "HTMLAttributeReferrerPolicy",
    "HTMLInputTypeAttribute",
    "ProfilerOnRenderCallback",
)

private fun convertUnions(
    content: String,
): Sequence<ConversionResult> =
    content.splitToSequence("\ntype ", "\nexport type ")
        .drop(1)
        .map { it.substringBefore(";") }
        .mapNotNull {
            convertUnion(
                name = it.substringBefore(" ="),
                source = it.substringAfter(" =")
            )
        }
        .filter { it.name !in EXCLUDED_UNIONS }

private fun convertInterfaces(
    content: String,
): Sequence<ConversionResult> =
    content.splitToSequence("\ninterface ")
        .drop(1)
        .map { it.substringBefore("\n}\n") }
        .flatMap {
            convertInterface(
                name = it.substringBefore(" ")
                    .substringBefore("<"),
                source = it,
            )
        }
