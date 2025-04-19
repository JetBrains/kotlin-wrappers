package karakum.cesium

import karakum.common.TYPED_ARRAYS

internal const val JS_FUNCTION = "Function"

private const val HTML_ELEMENT = "HTMLElement"
private const val PROMISE = "Promise"

private val CLASS_REGEX = Regex("""[\w\d]+""")
private const val CALL_DELIMITER = "."

private val WHITE_LIST = setOf(
    "binarySearchComparator",
    "createElevationBandMaterialBand",
    "createElevationBandMaterialEntry",
    "exportKmlModelCallback",
    "mergeSortComparator",

    "GeoJsonDataSource.describe",
    "SingleTileImageryProvider.fromUrlOptions",
)

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any",
    "object" to "Any",

    "boolean" to "Boolean",
    "number" to "Double",
    "string" to "String",

    "void" to "Unit",
    "undefined" to "Void",

    JS_FUNCTION to "Function<*>",
    "Date" to "js.date.Date",
    "Int8Array[] | Uint8Array[] | Int16Array[] | Uint16Array[] | Int32Array[] | Uint32Array[] | Float32Array[] | Float64Array[]" to
            "ReadonlyArray<TypedArray<*, *, *, *>> /* Int8Array[] | Uint8Array[] | Int16Array[] | Uint16Array[] | Int32Array[] | Uint32Array[] | Float32Array[] | Float64Array[] */",

    "CameraEventType | any[] | undefined" to "CameraEventType?",
    "any[] | GeometryInstance" to "GeometryInstance",
    "GeometryInstance[] | GeometryInstance" to "ReadonlyArray<GeometryInstance>",

    "Promise<HTMLImageElement | HTMLCanvasElement> | undefined" to "$PROMISE<$HTML_ELEMENT>?",
    "Promise<ImageBitmap | HTMLImageElement> | undefined" to "$PROMISE<CanvasImageSource>?",
    "HTMLCanvasElement | Promise<HTMLCanvasElement>" to "PromiseResult<HTMLCanvasElement>",
    "HTMLImageElement | HTMLCanvasElement | Promise<HTMLImageElement | HTMLCanvasElement>" to "PromiseResult<$HTML_ELEMENT /* HTMLImageElement | HTMLCanvasElement */>",
    "ArcGISTiledElevationTerrainProvider | Promise<ArcGISTiledElevationTerrainProvider>" to "PromiseResult<ArcGISTiledElevationTerrainProvider>",
    "Promise<ImageryTypes | CompressedTextureBuffer> | undefined" to "$PROMISE<Any /* ImageryTypes | CompressedTextureBuffer */>?",
    "boolean | Promise<boolean>" to "PromiseResult<Boolean>",
    "Promise<void>" to "$PROMISE<Void>",
    "undefined | Promise<void>" to "$PROMISE<Void>?",
    "Cartesian2 | Cartesian3" to "Cartesian3",

    "Entity | Entity.ConstructorOptions" to "Entity",
    "HeadingPitchRollValues | DirectionUp" to CameraOrientation.name,

    "Resource | string" to "Resource",
    "string | Resource" to "Resource",
    "Credit | string" to "Credit",
    "string | number" to "String",

    "Element | string" to "Element",
    "string | HTMLCanvasElement" to "HTMLCanvasElement",

    "string | string[]" to "ReadonlyArray<String>",
    "number[] | Cartesian3[]" to "ReadonlyArray<Cartesian3 /* or number */>",

    "Event" to DefaultEvent.name,
    PACKABLE to "$PACKABLE<*>",
    "CzmlDataSource.UpdaterFunction" to "UpdaterFunction",

    "ModelAnimation.AnimationTimeCallback" to "AnimationTimeCallback",
    "ModelExperimentalAnimation.AnimationTimeCallback" to "AnimationTimeCallback",

    """"default" | "low-power" | "high-performance"""" to "WebGLPowerPreference"
)

internal fun kotlinType(
    type: String,
    name: String? = null,
): String {
    if (type in WHITE_LIST)
        return type

    if (type in TYPED_ARRAYS)
        return "$type<*>"

    if (type.startsWith("Event<"))
        return type
            .replace("arg0: this, ", "")
            .replace(" => void", " -> Unit")
            .replace(": boolean", ": Boolean")
            .replace("EntityCluster.", "")
            .replace("EntityCollection.", "")
            .replace("TerrainProvider.ErrorEvent", "* /* ErrorEvent */")

    if (type.startsWith("Record<"))
        return "Readonly$type"

    if (type == "number") {
        return if (isInteger(name)) "Int" else "Double"
    }

    if (type == JS_FUNCTION && name == "listener")
        return "() -> Unit"

    if (type == "any" && name == "orientation")
        return CameraOrientation.name

    if (STANDARD_TYPE_MAP.containsKey(type))
        return STANDARD_TYPE_MAP.getValue(type)

    if (type.isClassLike())
        return if (CALL_DELIMITER in type) {
            val (parent, alias) = type.split(CALL_DELIMITER)
            parent + CALL_DELIMITER + applyCallbackFix(alias)
        } else type

    if (type.endsWith(" | Function"))
        return kotlinType(type.removeSuffix(" | Function"), name) + " /* | Function */"

    if (type.endsWith(" | false"))
        return kotlinType(type.removeSuffix(" | false"), name) + " /* | false */"

    if (type.endsWith(" | undefined") && type.indexOf("|") == type.lastIndexOf("|"))
        return kotlinType(type.removeSuffix(" | undefined"), name) + "?"

    if (type.startsWith("undefined | "))
        return kotlinType(type.removePrefix("undefined | "), name) + "?"

    if (type.endsWith("[]") && "|" !in type)
        return "ReadonlyArray<${kotlinType(type.removeSuffix("[]"))}>"

    val promiseResult = type.removeSurrounding("Promise<", ">")
    if (promiseResult != type)
        return "$PROMISE<${kotlinType(promiseResult)}>"

    val placeholder = when (type) {
        "Uint16Array | Uint32Array",
        "Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array",
            -> "TypedArray<*, *, *, *>"

        "Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | number[] | Promise<Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | number[]> | undefined",
            -> "PromiseResult<TypedArray<*, *, *, *>>"

        "number[] | Cartesian3[] | Quaternion[]",
            -> "ReadonlyArray<Any>"

        "Cartesian3[] | Quaternion[]",
            -> "ReadonlyArray<Any>"

        "string[] | number[]",
            -> "ReadonlyArray<Comparable<*>>"

        else -> if (type.endsWith(" | undefined")) "Any?" else "Any"
    }

    return "$placeholder /* $type */"
}

private fun String.isClassLike(): Boolean =
    if (CALL_DELIMITER in this) {
        val types = split(CALL_DELIMITER)
        types.size == 2 && types[0].isClassLike() && applyCallbackFix(types[1]).isClassLike()
    } else {
        CLASS_REGEX.matches(this) && get(0) == get(0).uppercaseChar()
    }
