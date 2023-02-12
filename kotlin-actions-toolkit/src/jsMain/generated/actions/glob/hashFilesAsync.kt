// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import kotlin.js.Promise

@JsName("hashFiles")
external fun hashFilesAsync(
    globber: Globber,
    currentWorkspace: String,
    verbose: Boolean = definedExternally,
): Promise<String>

@JsName("hashFiles")
external fun hashFilesAsync(
    patterns: String,
    currentWorkspace: String = definedExternally,
    options: HashFileOptions = definedExternally,
    verbose: Boolean = definedExternally,
): Promise<String>
