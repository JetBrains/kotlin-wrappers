// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Use `program.getModeForUsageLocation`, which retrieves the correct `compilerOptions`, instead of this function whenever possible.
 * Calculates the final resolution mode for a given module reference node. This is the resolution mode explicitly provided via import
 * attributes, if present, or the syntax the usage would have if emitted to JavaScript. In `--module node16` or `nodenext`, this may
 * depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the input syntax of the reference. In other
 * `module` modes, when overriding import attributes are not provided, this function returns `undefined`, as the result would have no
 * impact on module resolution, emit, or type checking.
 * @param file The file the import or import-like reference is contained within
 * @param usage The module reference string
 * @param compilerOptions The compiler options for the program that owns the file. If the file belongs to a referenced project, the compiler options
 * should be the options of the referenced project, not the referencing project.
 * @returns The final resolution mode of the import
 */
external fun getModeForUsageLocation(
    file: Any?, /* { impliedNodeFormat?: ResolutionMode; } */
    usage: StringLiteralLike,
    compilerOptions: CompilerOptions,
): Any? /* ModuleKind.CommonJS | ModuleKind.ESNext */
