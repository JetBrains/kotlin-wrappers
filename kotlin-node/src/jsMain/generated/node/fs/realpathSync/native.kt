@file:JsModule("node:fs")
@file:JsQualifier("realpathSync")

package node.fs.realpathSync

import node.fs.BufferEncodingOption
import node.fs.EncodingOption
import node.fs.PathLike

external fun native(path: PathLike, options: EncodingOption = definedExternally): String

external fun native(path: PathLike, options: BufferEncodingOption): node.buffer.Buffer

external fun native(path: PathLike, options: EncodingOption = definedExternally): Any /* string | Buffer */
