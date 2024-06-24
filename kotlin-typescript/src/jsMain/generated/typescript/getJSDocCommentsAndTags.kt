// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * This function checks multiple locations for JSDoc comments that apply to a host node.
 * At each location, the whole comment may apply to the node, or only a specific tag in
 * the comment. In the first case, location adds the entire {@link JSDoc} object. In the
 * second case, it adds the applicable {@link JSDocTag}.
 *
 * For example, a JSDoc comment before a parameter adds the entire {@link JSDoc}. But a
 * `@param` tag on the parent function only adds the {@link JSDocTag} for the `@param`.
 *
 * ```ts
 * &#47;** JSDoc will be returned for `a` *\/
 * const a = 0
 * &#47;**
 *  * Entire JSDoc will be returned for `b`
 *  * @param c JSDocTag will be returned for `c`
 *  *\/
 * function b(&#47;** JSDoc will be returned for `c` *\/ c) {}
 * ```
 */
external fun getJSDocCommentsAndTags(hostNode: Node): js.array.ReadonlyArray<(GetJSDocCommentsAndTagsResultItem)>
