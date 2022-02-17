package org.w3c.dom

import kotlinx.js.ReadonlyArray
import kotlin.js.Promise

external interface FontFaceSet {
    fun check(font: String): Boolean
    fun load(font: String): Promise<ReadonlyArray<*>>
}
