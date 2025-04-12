package karakum.cesium

private val TOP_REGEX = Regex("""(.+?\*/)\n\s*(.+)""", RegexOption.DOT_MATCHES_ALL)
private val FUN_START_REGEX = Regex("""^(static )?[\w\d]+\(""")

private val MULTI_TYPES = listOf(
    "Resource | string | Document | Blob",
    "Resource | string | ArrayBuffer",
    "Resource | string | any",
    "Resource | string",

    "Entity | Entity[] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud" +
            " | Promise<Entity | Entity[] | EntityCollection | DataSource | ImageryLayer | Cesium3DTileset | TimeDynamicPointCloud | VoxelPrimitive>",

    "HTMLImageElement | HTMLCanvasElement | string | Resource | Billboard.CreateImageCallback",
    "PostProcessStage | PostProcessStageComposite",
    "DataSource | Promise<DataSource>",

    "Cartesian3 | HeadingPitchRange",
    "Property | Color",
    "DataSource | CompositeEntityCollection",

    "KmlTourFlyTo | KmlTourWait",
    "KmlCamera | KmlLookAt",

    "ImageryProvider | TerrainProvider",
    "Promise<object> | any",

    "number | Packable",
    "string | number"
)

internal data class Definition(
    private val doc: String,
    val body: String,
) {
    var docBody: String? = null

    val abstract: Boolean
        get() = "* The interface for " in doc ||
                "be instantiated directly." in doc

    val hasPrivateConstructor: Boolean
        get() = "Do not call the constructor directly" in doc
                || "Do not construct this directly" in doc

    val defaultName: String
        get() = body
            .substringBefore(" ")
            .substringBefore("<")

    fun doc(
        link: DocLink? = null,
        hideParams: Boolean = false,
    ): String =
        if (docBody != null) {
            kdoc(docBody!!, null)
        } else {
            val source = kdocBody(doc, hideParams, true)
            kdoc(source, link)
        }

    fun optionsKdocBody(): String {
        val source = kdocBody(doc, false, false)
            .takeIf { it.isNotEmpty() }
            ?: ""

        return source
            .splitToSequence("@param ", "@return ")
            .filter { it.startsWith("[options.") }
            .map { it.removePrefix("[options.") }
            // TODO: move to concrete properties instead
            .map { "@property [$it".trimEnd() }
            .joinToString("\n")
    }
}

internal fun parseTopDefinition(
    data: String,
): Sequence<Definition> {
    val source = data.trim().removeSuffix(";")

    return if (source.startsWith("/**")) {
        TOP_REGEX.find(source)!!
            .groupValues
            .let { Definition(it[1], it[2]) }
    } else {
        Definition("", source)
    }.flatten()
}

private fun Definition.flatten(): Sequence<Definition> {
    if (!body.startsWith("export function ") && FUN_START_REGEX.find(body) == null) {
        return sequenceOf(this)
    }

    val multiType = MULTI_TYPES
        .firstOrNull { ": $it," in body || ": $it)" in body }
        ?: return sequenceOf(this)

    return newBodies(body, multiType)
        .mapIndexed { index, childBody ->
            if (index == 0) {
                copy(body = childBody)
            } else {
                Definition(
                    doc = "",
                    body = childBody
                )
            }
        }
}

private fun newBodies(
    body: String,
    multiType: String,
): Sequence<String> {
    val optionalMultiType = "?: $multiType"
    if (optionalMultiType !in body)
        return multiType.containedTypes()
            .map { type -> body.replace(multiType, type) }


    // require("$optionalMultiType)" in body)
    val primaryBody = body.substringBefore(optionalMultiType)
        .let { if ("," in it) it.substringBeforeLast(",") else it.substringBeforeLast("(") + "(" }
        .plus(body.substringAfter(optionalMultiType))

    return sequenceOf(primaryBody) +
            newBodies(
                body = body.replace(optionalMultiType, ": $multiType"),
                multiType = multiType
            )
}

private fun String.containedTypes(): Sequence<String> {
    val promiseTypes = substringAfter(" | Promise<").substringBefore(">")
    if (promiseTypes == this || " | " !in promiseTypes)
        return splitToSequence(" | ")

    return substringBefore(" | Promise<")
        .splitToSequence(" | ") +
            promiseTypes.splitToSequence(" | ")
                .map { "Promise<$it>" }
}
