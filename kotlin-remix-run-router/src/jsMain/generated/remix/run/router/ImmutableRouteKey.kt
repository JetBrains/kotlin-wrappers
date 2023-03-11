@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Keys we cannot change from within a lazy() function. We spread all other keys
 * onto the route. Either they're meaningful to the router, or they'll get
 * ignored.
 */

@Suppress("NAME_CONTAINS_ILLEGAL_CHARS")
@JsName("""(/*union*/{lazy: 'lazy', caseSensitive: 'caseSensitive', path: 'path', id: 'id', index: 'index', children: 'children'}/*union*/)""")
external enum class ImmutableRouteKey {
    lazy,
    caseSensitive,
    path,
    id,
    index,
    children,

    ;
}
