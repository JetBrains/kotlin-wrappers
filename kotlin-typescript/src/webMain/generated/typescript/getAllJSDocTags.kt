// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/** Gets all JSDoc tags that match a specified predicate */
external fun <T : JSDocTag> getAllJSDocTags(
    node: Node,
    predicate: (tag: JSDocTag) -> Boolean, /* tag is T */
): js.array.ReadonlyArray<T>
