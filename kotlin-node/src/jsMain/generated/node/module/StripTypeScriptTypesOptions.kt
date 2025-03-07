// Generated by Karakum - do not modify it manually!

package node.module

sealed external interface StripTypeScriptTypesOptions {
    /**
     * Possible values are:
     * * `'strip'` Only strip type annotations without performing the transformation of TypeScript features.
     * * `'transform'` Strip type annotations and transform TypeScript features to JavaScript.
     * @default 'strip'
     */
    var mode: StripTypeScriptTypesOptionsMode?

    /**
     * Only when `mode` is `'transform'`, if `true`, a source map
     * will be generated for the transformed code.
     * @default false
     */
    var sourceMap: Boolean?

    /**
     * Specifies the source url used in the source map.
     */
    var sourceUrl: String?
}
