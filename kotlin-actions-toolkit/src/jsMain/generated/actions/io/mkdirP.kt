// Automatically generated - do not modify!

@file:JsModule("@actions/io")

package actions.io

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun mkdirP(fsPath: String)

@JsName("mkdirP")
external fun mkdirPAsync(fsPath: String): Promise<Void>
