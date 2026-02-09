package karakum.browser

private val TYPES = listOf(
    "GLboolean" to "Boolean",
    "GLclampf" to "Float",
    "GLfloat" to "Float",
    "GLint" to "Int",
    "GLint64" to "Int53",
    "GLintptr" to "Int",
    "GLsizei" to "Int",
    "GLsizeiptr" to "Int",
    "GLuint" to "JsUInt",
    "GLuint64" to "UInt53",
)

internal fun GLNumbers(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = "Aliases",
            body = TYPES.joinToString("\n") { (type, alias) ->
                "typealias $type = $alias"
            },
            pkg = "web.gl",
        ),
        ConversionResult(
            name = "GLenum",
            body = "sealed external interface GLenum",
            pkg = "web.gl",
        ),
        ConversionResult(
            name = "GLbitfield",
            body = "sealed external interface GLbitfield:\nBitmask<GLbitfield>",
            pkg = "web.gl",
        ),
    )
