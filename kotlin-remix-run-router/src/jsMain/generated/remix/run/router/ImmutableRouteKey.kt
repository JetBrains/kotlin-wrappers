package remix.run.router


/**
 * Keys we cannot change from within a lazy() function. We spread all other keys
 * onto the route. Either they're meaningful to the router, or they'll get
 * ignored.
 */

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{lazy: 'lazy', caseSensitive: 'caseSensitive', path: 'path', id: 'id', index: 'index', children: 'children'}/*union*/)""")
sealed external interface ImmutableRouteKey {
    companion object {
        val lazy: ImmutableRouteKey
        val caseSensitive: ImmutableRouteKey
        val path: ImmutableRouteKey
        val id: ImmutableRouteKey
        val index: ImmutableRouteKey
        val children: ImmutableRouteKey
    }
}
