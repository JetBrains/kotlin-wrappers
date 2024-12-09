package js.import

import js.objects.JsPlainObject

/**
 * The type for the optional second argument to `import()`.
 *
 * If your host environment supports additional options, this type may be
 * augmented via interface merging.
 */
@JsPlainObject
external interface ImportCallOptions {
    val with: ImportAttributes?
}
