package tanstack.router.core

import js.objects.JsPlainObject

@JsPlainObject
external interface SearchMiddlewareContext {
    val search: Search
    val next: (newSearch: Search) -> Search
}
