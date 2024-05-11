// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.promise.Promise

external suspend fun hashFiles(
    globber: Globber,
    currentWorkspace: String,
    verbose: Boolean = definedExternally,
): String

@JsName("hashFiles")
external fun hashFilesAsync(
    globber: Globber,
    currentWorkspace: String,
    verbose: Boolean = definedExternally,
): Promise<String>

external suspend fun hashFiles(
    patterns: String,
    currentWorkspace: String = definedExternally,
    options: HashFileOptions = definedExternally,
    verbose: Boolean = definedExternally,
): String

@JsName("hashFiles")
external fun hashFilesAsync(
    patterns: String,
    currentWorkspace: String = definedExternally,
    options: HashFileOptions = definedExternally,
    verbose: Boolean = definedExternally,
): Promise<String>
