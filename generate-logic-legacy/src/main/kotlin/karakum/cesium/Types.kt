package karakum.cesium

private const val IMAGERY_LAYER_CONSTRUCTOR_OPTIONS = "ImageryLayer.ConstructorOptions"

internal fun isTypeAlias(
    source: String,
): Boolean {
    val body = source.split(" = ")[1]
    return body.startsWith("(")
}

internal fun typeDeclaration(
    source: String,
    top: Boolean,
): String {
    val (name, body) = source.split(" = ")
    return when {
        body.startsWith("(")
            -> "typealias ${applyCallbackFix(name)} = ${typeBody(body)}"

        body == "HTMLImageElement | HTMLCanvasElement | ImageBitmap"
            -> "typealias $name = CanvasImageSource /* $body */"

        body == "number | bigint | string | boolean | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | number[] | bigint[] | string[] | boolean[] | Cartesian2[] | Cartesian3[] | Cartesian4[] | Matrix2[] | Matrix3[] | Matrix4[]"
            -> "typealias $name = Any /* $body */"

        body == IMAGERY_LAYER_CONSTRUCTOR_OPTIONS
            -> {
            require(!top)
            """
            @JsPlainObject
            interface /* typealias */ $name : $body
            """.trimIndent()
        }

        else -> {
            val modifier = if (top) "external" else ""
            "@JsPlainObject\n$modifier interface $name {\n${optionsBody(body)}\n}"
        }
    }
}

internal fun applyCallbackFix(
    source: String,
): String =
    when (source) {
        "foveatedInterpolationCallback",
        "updateCallback",
            -> source.replaceFirstChar(Char::uppercase)

        else -> source
    }

private fun typeBody(body: String): String {
    val (params, returnType) = body
        .removePrefix("(")
        .removeSuffix(";")
        .split(") => ")

    val parameters = params.splitToSequence(", ")
        .filter { it.isNotEmpty() }
        .map(::Parameter)
        .onEach { it.supportDefault = false }
        .map { it.toCode() }
        .joinToString(", ")

    return "($parameters) -> ${kotlinType(returnType)}"
}

private fun optionsBody(
    body: String,
): String {
    val source = body.removePrefix("{\n")
        .substringBeforeLast("\n")
        .trimIndent()

    if ("[key: string]: UniformSpecifier;" in source)
        println(source)

    return source
        .splitToSequence(";")
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .map { Parameter(it) }
        .onEach { it.supportDefault = false }
        .map { "val ${it.toCode()}" }
        .joinToString("\n")
}
