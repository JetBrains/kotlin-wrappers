// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScriptTarget {
    companion object {
        @JsIntValue(0)
        val ES3: ScriptTarget

        @JsIntValue(1)
        val ES5: ScriptTarget

        @JsIntValue(2)
        val ES2015: ScriptTarget

        @JsIntValue(3)
        val ES2016: ScriptTarget

        @JsIntValue(4)
        val ES2017: ScriptTarget

        @JsIntValue(5)
        val ES2018: ScriptTarget

        @JsIntValue(6)
        val ES2019: ScriptTarget

        @JsIntValue(7)
        val ES2020: ScriptTarget

        @JsIntValue(8)
        val ES2021: ScriptTarget

        @JsIntValue(9)
        val ES2022: ScriptTarget

        @JsIntValue(99)
        val ESNext: ScriptTarget

        @JsIntValue(100)
        val JSON: ScriptTarget

        @JsIntValue(99)
        val Latest: ScriptTarget
    }
}
