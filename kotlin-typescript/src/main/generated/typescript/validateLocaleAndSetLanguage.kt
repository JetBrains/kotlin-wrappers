// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Checks to see if the locale is in the appropriate format,
 * and if it is, attempts to set the appropriate language.
 */
external fun validateLocaleAndSetLanguage(
    locale: String,
    sys: dynamic, /* {
    getExecutingFilePath(): string;
    resolvePath(path: string): string;
    fileExists(fileName: string): boolean;
    readFile(fileName: string): string | undefined;
} */
    errors: Push<Diagnostic> = definedExternally,
)
