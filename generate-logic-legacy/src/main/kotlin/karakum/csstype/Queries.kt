package karakum.csstype

import karakum.common.ConversionResult

internal const val MEDIA_QUERY = "MediaQuery"
internal const val CONTAINER_QUERY = "ContainerQuery"
internal const val SIZE_QUERY = "SizeQuery"

internal const val CONTAINER_NAME = "ContainerName"

internal fun MediaQuery(): ConversionResult =
    ConversionResult(
        name = MEDIA_QUERY,
        body = queryBody(MEDIA_QUERY, sealed = false),
    )

internal fun ContainerQuery(): ConversionResult =
    ConversionResult(
        name = CONTAINER_QUERY,
        body = queryBody(CONTAINER_QUERY),
    )

internal fun SizeQuery(): ConversionResult =
    ConversionResult(
        name = SIZE_QUERY,
        body = queryBody(
            name = SIZE_QUERY,
            parentTypes = listOf(CONTAINER_QUERY, MEDIA_QUERY),
        ),
    )

private fun queryBody(
    name: String,
    sealed: Boolean = true,
    parentTypes: List<String>? = null,
): String {
    val modifier = if (sealed) "sealed" else ""
    val parents = if (parentTypes != null) {
        ":\n" + parentTypes.joinToString(",\n")
    } else ""

    return """
$modifier external interface $name $parents

inline fun $name(
    value: String,
): $name =
    unsafeCast(value)
    
infix fun $name.and(
    other: $name,
): $name =
    $name("${'$'}this and ${'$'}other")

infix fun $name.or(
    other: $name,
): $name =
    $name("${'$'}this or ${'$'}other")

inline fun not(
    query: $name,
): $name =
    $name("(not (${'$'}query))")
""".trimIndent()
}
