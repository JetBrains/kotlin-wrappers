package jszip

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface JSZipLoadOptions {
    var base64: Boolean?
    var checkCRC32: Boolean?
    var optimizedBinaryString: Boolean?
    var createFolders: Boolean?
    var decodeFileName: ((bytes: JsAny /* string[] | Uint8Array | Buffer */) -> String)?
}
