@file:JsModule("electron/main")

package electron.main

import electron.NativeImage


open external class Tray : electron.core.Tray {
    constructor (image: NativeImage, guid: String = definedExternally)

    constructor (image: String, guid: String = definedExternally)
}
