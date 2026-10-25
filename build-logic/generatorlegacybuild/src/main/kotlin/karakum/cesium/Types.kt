package karakum.cesium

import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.removeQuoteSurrounding

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
    val fixedName = applyCallbackFix(name)

    return when {
        body.startsWith("\"")
            -> {
            val values = body.splitToSequence(" | ")
                .map { it.removeQuoteSurrounding() }
                .toList()

            sealedUnionBody(
                name = name,
                values = values,
            )
        }

        fixedName.endsWith("EventPayload")
            -> "typealias $fixedName = ${eventPayloadBody(body)}"

        body.startsWith("(")
            -> "typealias $fixedName = ${typeBody(body)}"

        body == "HTMLImageElement | HTMLCanvasElement | ImageBitmap | OffscreenCanvas"
            -> "typealias $name = CanvasImageSource /* $body */"

        body == "GeoJsonGeometry | GeoJsonFeature | GeoJsonFeatureCollection"
            -> "typealias $name = Any /* $body */"

        body == "number[]"
            -> "typealias $name = ReadonlyArray<JsDouble>"

        body == "any"
            -> "typealias $name = JsAny /* really `any` */"

        body == "number | bigint | string | boolean | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | number[] | bigint[] | string[] | boolean[] | Cartesian2[] | Cartesian3[] | Cartesian4[] | Matrix2[] | Matrix3[] | Matrix4[]"
            -> "typealias $name = JsAny /* $body */"

        body == IMAGERY_LAYER_CONSTRUCTOR_OPTIONS
            -> "typealias $name = $body"

        else -> {
            val annotation = when (name) {
                "CameraLike",
                    -> null

                else -> "@JsPlainObject"
            }
            val modifier = if (top) "external" else ""
            listOfNotNull(
                annotation,
                "$modifier interface $name {\n${optionsBody(body)}\n}",
            ).joinToString("\n")
        }
    }
}

internal fun applyCallbackFix(
    source: String,
): String =
    when (source) {
        "CollectionChangedEventCallback",
        "ErrorEvent",
        "ErrorEventCallback",
        "newClusterCallback",
        "ReadyEventCallback",
            -> source
            .replaceFirstChar(Char::uppercase)
            .removeSuffix("Callback")
            .removeSuffix("Event")
            .plus("EventPayload")

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
        .joinToString(",\n")

    return "($parameters) -> ${kotlinType(returnType)}"
}

private fun eventPayloadBody(body: String): String {
    val (params, returnType) = body
        .removePrefix("(")
        .removeSuffix(";")
        .split(") => ")

    require(returnType == "void")

    val parameters = params.splitToSequence(", ")
        .filter { it.isNotEmpty() }
        .map(::Parameter)
        .onEach { it.supportDefault = false }
        .toList()

    return parameters.joinToString(",\n", "Tuple${parameters.size}<", ">") {
        "/* ${it.name}: */ ${it.type}"
    }
}

private fun optionsBody(
    body: String,
): String {
    // TEMP fix for:
    //  - `CubeMapPanorama`
    //  - `EquirectangularPanorama`
    //  https://github.com/CesiumGS/cesium/issues/13243
    if (body == "{}")
        return "/* EMPTY WITHOUT REASON */"

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
