@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{route: 'route', path: 'path'}/*union*/)""")
sealed external interface RelativeRoutingType {
    companion object {
        val route: RelativeRoutingType
        val path: RelativeRoutingType
    }
}
