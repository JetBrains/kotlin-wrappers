// Automatically generated - do not modify!

package typescript

sealed external interface CustomTransformers {
    /** Custom transformers to evaluate before built-in .js transformations. */
    var before: js.array.ReadonlyArray<(Any /* TransformerFactory<SourceFile> | CustomTransformerFactory */)>?

    /** Custom transformers to evaluate after built-in .js transformations. */
    var after: js.array.ReadonlyArray<(Any /* TransformerFactory<SourceFile> | CustomTransformerFactory */)>?

    /** Custom transformers to evaluate after built-in .d.ts transformations. */
    var afterDeclarations: js.array.ReadonlyArray<(Any /* TransformerFactory<Bundle | SourceFile> | CustomTransformerFactory */)>?
}
