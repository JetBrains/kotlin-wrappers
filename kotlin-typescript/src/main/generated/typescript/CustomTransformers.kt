// Automatically generated - do not modify!

package typescript

external interface CustomTransformers {
    /** Custom transformers to evaluate before built-in .js transformations. */
    var before: dynamic /* (TransformerFactory<SourceFile> | CustomTransformerFactory)[] */

    /** Custom transformers to evaluate after built-in .js transformations. */
    var after: dynamic /* (TransformerFactory<SourceFile> | CustomTransformerFactory)[] */

    /** Custom transformers to evaluate after built-in .d.ts transformations. */
    var afterDeclarations: dynamic /* (TransformerFactory<Bundle | SourceFile> | CustomTransformerFactory)[] */
}
