// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Calculates the final resolution mode for an import at some index within a file's imports list. This is generally the explicitly
 * defined mode of the import if provided, or, if not, the mode of the containing file (with some exceptions: import=require is always commonjs, dynamic import is always esm).
 * If you have an actual import node, prefer using getModeForUsageLocation on the reference string node.
 * @param file File to fetch the resolution mode within
 * @param index Index into the file's complete resolution list to get the resolution of - this is a concatenation of the file's imports and module augmentations
 */
external fun getModeForResolutionAtIndex(
    file: SourceFile,
    index: Int,
): ResolutionMode?
