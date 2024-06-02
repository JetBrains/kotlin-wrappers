// Automatically generated - do not modify!

package typescript

sealed external interface CustomTransformers {
    /** Custom transformers to evaluate before built-in .js transformations. */
    var before: Any? /* (TransformerFactory<SourceFile> | CustomTransformerFactory)[] */

    /** Custom transformers to evaluate after built-in .js transformations. */
    var after: Any? /* (TransformerFactory<SourceFile> | CustomTransformerFactory)[] */

    /** Custom transformers to evaluate after built-in .d.ts transformations. */
    var afterDeclarations: Any? /* (TransformerFactory<Bundle | SourceFile> | CustomTransformerFactory)[] */
}
