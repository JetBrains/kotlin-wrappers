// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Calculates the resulting resolution mode for some reference in some file - this is generally the explicitly
 * provided resolution mode in the reference, unless one is not present, in which case it is the mode of the containing file.
 */
external fun getModeForFileReference(
    ref: dynamic, /* FileReference | string */
    containingFileMode: NodeFormat,
): ResolutionMode?
