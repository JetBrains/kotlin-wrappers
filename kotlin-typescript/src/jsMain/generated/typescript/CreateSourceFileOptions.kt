// Automatically generated - do not modify!

package typescript

sealed external interface CreateSourceFileOptions {
    var languageVersion: ScriptTarget

    /**
     * Controls the format the file is detected as - this can be derived from only the path
     * and files on disk, but needs to be done with a module resolution cache in scope to be performant.
     * This is usually `undefined` for compilations that do not have `moduleResolution` values of `node16` or `nodenext`.
     */
    var impliedNodeFormat: NodeFormat?

    /**
     * Controls how module-y-ness is set for the given file. Usually the result of calling
     * `getSetExternalModuleIndicator` on a valid `CompilerOptions` object. If not present, the default
     * check specified by `isFileProbablyExternalModule` will be used to set the field.
     */
    var setExternalModuleIndicator: ((file: SourceFile) -> Unit)?
}
