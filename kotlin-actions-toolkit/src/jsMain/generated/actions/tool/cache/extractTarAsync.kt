// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.core.ReadonlyArray
import kotlin.js.Promise

@JsName("extractTar")
external fun extractTarAsync(
    file: String,
    dest: String = definedExternally,
    flags: String = definedExternally,
): Promise<String>

external fun extractTar(
    file: String,
    dest: String = definedExternally,
    flags: ReadonlyArray<String> = definedExternally,
): Promise<String>
