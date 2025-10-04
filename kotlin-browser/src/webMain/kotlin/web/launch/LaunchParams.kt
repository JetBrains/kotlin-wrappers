package web.launch

import js.array.ReadonlyArray
import web.experimental.ExperimentalWebApi
import web.fs.FileSystemHandle

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchParams)
 */
@ExperimentalWebApi
open external class LaunchParams
private constructor() {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchParams/files)
     */
    val files: ReadonlyArray<FileSystemHandle>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/LaunchParams/targetURL)
     */
    val targetURL: String
}
