// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Calculates the final resolution mode for a given module reference node. This is generally the explicitly provided resolution mode, if
 * one exists, or the mode of the containing source file. (Excepting import=require, which is always commonjs, and dynamic import, which is always esm).
 * Notably, this function always returns `undefined` if the containing file has an `undefined` `impliedNodeFormat` - this field is only set when
 * `moduleResolution` is `node16`+.
 * @param file The file the import or import-like reference is contained within
 * @param usage The module reference string
 * @returns The final resolution mode of the import
 */
external fun getModeForUsageLocation(
    file: dynamic,
    /* {
    impliedNodeFormat?: SourceFile["impliedNodeFormat"];
} */
    usage: StringLiteralLike,
): ResolutionMode?
