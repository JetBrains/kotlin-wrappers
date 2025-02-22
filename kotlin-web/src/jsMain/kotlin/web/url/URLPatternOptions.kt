package web.url

import js.objects.JsPlainObject

/**
 * Options for the {@linkcode URLPattern} constructor.
 */
@JsPlainObject
external interface URLPatternOptions {
    /**
     * Enables case-insensitive matching.
     *
     * @default {false}
     */
    val ignoreCase: Boolean
}
