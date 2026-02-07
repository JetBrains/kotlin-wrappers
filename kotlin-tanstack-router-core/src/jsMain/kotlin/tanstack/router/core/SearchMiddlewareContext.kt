package tanstack.router.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SearchMiddlewareContext {
    val search: Search
    val next: (newSearch: Search) -> Search
}
