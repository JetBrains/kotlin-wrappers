package react.dom

import seskar.js.JsValue

// Will be expanded to include all of https://github.com/tc39/proposal-import-attributes
sealed external interface PreinitModuleAs {
    companion object {
        @JsValue("script")
        val script: PreinitModuleAs
    }
}
