// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Use `program.getModeForUsageLocation`, which retrieves the correct `compilerOptions`, instead of this function whenever possible.
 * Calculates the final resolution mode for a given module reference node. This function only returns a result when module resolution
 * settings allow differing resolution between ESM imports and CJS requires, or when a mode is explicitly provided via import attributes,
 * which cause an `import` or `require` condition to be used during resolution regardless of module resolution settings. In absence of
 * overriding attributes, and in modes that support differing resolution, the result indicates the syntax the usage would emit to JavaScript.
 * Some examples:
 *
 * ```ts
 * // tsc foo.mts --module nodenext
 * import {} from "mod";
 * // Result: ESNext - the import emits as ESM due to `impliedNodeFormat` set by .mts file extension
 *
 * // tsc foo.cts --module nodenext
 * import {} from "mod";
 * // Result: CommonJS - the import emits as CJS due to `impliedNodeFormat` set by .cts file extension
 *
 * // tsc foo.ts --module preserve --moduleResolution bundler
 * import {} from "mod";
 * // Result: ESNext - the import emits as ESM due to `--module preserve` and `--moduleResolution bundler`
 * // supports conditional imports/exports
 *
 * // tsc foo.ts --module preserve --moduleResolution node10
 * import {} from "mod";
 * // Result: undefined - the import emits as ESM due to `--module preserve`, but `--moduleResolution node10`
 * // does not support conditional imports/exports
 *
 * // tsc foo.ts --module commonjs --moduleResolution node10
 * import type {} from "mod" with { "resolution-mode": "import" };
 * // Result: ESNext - conditional imports/exports always supported with "resolution-mode" attribute
 * ```
 *
 * @param file The file the import or import-like reference is contained within
 * @param usage The module reference string
 * @param compilerOptions The compiler options for the program that owns the file. If the file belongs to a referenced project, the compiler options
 * should be the options of the referenced project, not the referencing project.
 * @returns The final resolution mode of the import
 */
external fun getModeForUsageLocation(
    file: SourceFile,
    usage: StringLiteralLike,
    compilerOptions: CompilerOptions,
): ResolutionMode
