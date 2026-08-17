package karakum.query

import karakum.common.GENERATOR_COMMENT

// language=kotlin
internal val QUERY_TYPE_BODY = """
// $GENERATOR_COMMENT

${Package.CORE.pkg}

import seskar.js.JsValue

sealed external interface QueryType {
    companion object {
        @JsValue("infinite")
        val infinite: QueryType
    }
}
""".trimIndent()

// language=kotlin
internal val OPTIMISTIC_RESULTS_BODY = """
// $GENERATOR_COMMENT

${Package.CORE.pkg}

import seskar.js.JsValue

sealed external interface OptimisticResults {
    companion object {
        @JsValue("optimistic")
        val optimistic: OptimisticResults

        @JsValue("isRestoring")
        val isRestoring: OptimisticResults
    }
}
""".trimIndent()
