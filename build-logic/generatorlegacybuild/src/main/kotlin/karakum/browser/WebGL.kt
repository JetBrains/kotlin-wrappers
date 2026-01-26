package karakum.browser

import karakum.common.CommonUnionConverter.objectUnionBody
import karakum.common.unionConstant

internal fun webglDeclarations(
    content: String,
): Sequence<ConversionResult> {
    val interfaces = Regex("""interface ((ANGLE_|EXT_|KHR_|OES_|OVR_|WEBGL_).+?) \{[\s\S]+?}""")
        .findAll(content)
        .map { it.value }
        .map { convertInterface(it) }
        .toList()

    val extension = convertExtension(content)

    return interfaces.asSequence()
        .plus(extension)
        .plus(Lists())
        .plus(GLNumbers())
}

private fun convertInterface(
    source: String,
): ConversionResult {
    val name = source
        .substringAfter(" ")
        .substringBefore(" ")

    val additionalParentTypes = MarkerRegistry.additionalParents(name)
        ?.joinToString("") { ",\n$it" }
        ?: ""

    val declaration = source.substringBefore(" {\n")
        .replace(" extends ", " :\n")
        .replace(", ", ",\n") +
            additionalParentTypes

    val memberSource = source
        .substringAfter(" {\n")
        .removeSuffix("}")
        .removeSuffix(";\n")
        .trimIndent()

    val members = if (memberSource.isNotEmpty()) {
        memberSource
            .splitToSequence(";\n")
            .joinToString("\n") { convertMember(it) }
    } else ""

    val idDeclaration = RenderingContextRegistry.getIdDeclaration(name) ?: ""

    val body = "sealed external $declaration {\n$members\n}\n$idDeclaration"

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertExtension(
    source: String,
): ConversionResult {
    val values = source.splitToSequence("\n")
        .filter { "WebGLExtension." in it }
        .map { it.substringAfter("WebGLExtension.") }
        .map { it.substringBefore(")") }
        .toList()

    return ConversionResult(
        name = "WebGLExtension",
        body = objectUnionBody(
            name = "WebGLExtension",
            constants = values.map(::unionConstant),
        ),
    )
}

private fun convertMember(
    source: String,
): String {
    if ("(" !in source.substringAfter("*/\n"))
        return convertProperty(source)

    return convertFunction(source.replace(" | null", "?"))
}

private fun convertProperty(
    source: String,
): String {
    if ("*/\n" in source) {
        val newSource = source.substringAfter("*/\n")
        return sequenceOf(
            formatComment(source.substringBefore("\n$newSource")),
            convertProperty(newSource),
        ).joinToString("\n")
    }

    val modifier = if (source.startsWith("readonly ")) "val" else "var"
    var (name, type) = source.removePrefix("readonly ").split(": ")
    type = when {
        type == "string" -> "String"
        type == "boolean" -> "Boolean"
        type == "HTMLCanvasElement | OffscreenCanvas" -> "EventTarget /* $type */"

        type.startsWith("0x") -> "GLenum"
        type.toIntOrNull() != null -> "GLenum"

        else -> type
    }

    if (name.endsWith("?")) {
        name = name.removeSuffix("?")
        type += "?"
    }

    return "$modifier $name: $type"
}

private fun convertFunction(
    source: String,
): String {
    if ("*/\n" in source) {
        val newSource = source.substringAfter("*/\n")
        return sequenceOf(
            formatComment(source.substringBefore("\n$newSource")),
            convertFunction(newSource),
        ).joinToString("\n")
    }

    val name = source.substringBefore("(")
    val parameters = source
        .substringAfter("(")
        .substringBefore(")")
        .splitToSequence(", ")
        .filter { it.isNotEmpty() }
        .map {
            var (pname, ptype) = it.split(": ")
            ptype = when {
                pname == "extensionName" && ptype.startsWith("\"")
                    -> "WebGLExtension." + ptype.removeSurrounding("\"")

                // WA for IDL problem
                pname == "internalformat" && ptype == "GLint"
                    -> "GLenum"

                ptype == "string"
                    -> "String"

                ptype == "number" && pname.removeSuffix("?").endsWith("Offset")
                    -> "Int /* GLuint */"

                ptype == "GLint | GLboolean"
                    -> "GLint /* | GLboolean */"

                ptype.startsWith("Int32Array<ArrayBufferLike> | ")
                    -> "Int32Array<ArrayBufferLike> /* ${ptype.removePrefix("Int32Array<ArrayBufferLike> ")} */"

                ptype.endsWith("[]") -> {
                    var atype = ptype.removeSuffix("[]")
                    if (atype == "string")
                        atype = "String"

                    "ReadonlyArray<$atype>"
                }

                else -> ptype
            }

            if (pname.endsWith("?")) {
                pname = pname.removeSuffix("?")
                ptype += "?"
            }

            "$pname: $ptype"
        }
        .toList()

    val params = if (parameters.size > 1) {
        parameters.joinToString(",\n", "\n", ",\n")
    } else parameters.joinToString("\n")

    val result = source.substringAfter(")")
        .removeSuffix(": void")
        .replace(": WebGLShader[]", ": ReadonlyArray<WebGLShader>")
        .replace(": GLuint[]", ": ReadonlyArray<GLuint>")
        .replace(": string[]", ": ReadonlyArray<String>")
        .replace(": string", ": String")
        .replace(": boolean", ": Boolean")
        .replace(": any", ": JsAny?")

    return "fun $name($params)$result"
}
