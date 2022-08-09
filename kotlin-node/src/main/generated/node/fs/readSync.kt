// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Similar to the above `fs.readSync` function, this version takes an optional `options` object.
 * If no `options` object is specified, it will default with the above values.
 */
external fun readSync(
    fd: Number,
    buffer: org.khronos.webgl.ArrayBufferView,
    opts: ReadSyncOptions = definedExternally,
): Number
