// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScriptElementKindModifier {
    companion object {
        @JsValue("")
        val none: ScriptElementKindModifier

        @JsValue("public")
        val publicMemberModifier: ScriptElementKindModifier

        @JsValue("private")
        val privateMemberModifier: ScriptElementKindModifier

        @JsValue("protected")
        val protectedMemberModifier: ScriptElementKindModifier

        @JsValue("export")
        val exportedModifier: ScriptElementKindModifier

        @JsValue("declare")
        val ambientModifier: ScriptElementKindModifier

        @JsValue("static")
        val staticModifier: ScriptElementKindModifier

        @JsValue("abstract")
        val abstractModifier: ScriptElementKindModifier

        @JsValue("optional")
        val optionalModifier: ScriptElementKindModifier

        @JsValue("deprecated")
        val deprecatedModifier: ScriptElementKindModifier

        @JsValue(".d.ts")
        val dtsModifier: ScriptElementKindModifier

        @JsValue(".ts")
        val tsModifier: ScriptElementKindModifier

        @JsValue(".tsx")
        val tsxModifier: ScriptElementKindModifier

        @JsValue(".js")
        val jsModifier: ScriptElementKindModifier

        @JsValue(".jsx")
        val jsxModifier: ScriptElementKindModifier

        @JsValue(".json")
        val jsonModifier: ScriptElementKindModifier

        @JsValue(".d.mts")
        val dmtsModifier: ScriptElementKindModifier

        @JsValue(".mts")
        val mtsModifier: ScriptElementKindModifier

        @JsValue(".mjs")
        val mjsModifier: ScriptElementKindModifier

        @JsValue(".d.cts")
        val dctsModifier: ScriptElementKindModifier

        @JsValue(".cts")
        val ctsModifier: ScriptElementKindModifier

        @JsValue(".cjs")
        val cjsModifier: ScriptElementKindModifier
    }
}
