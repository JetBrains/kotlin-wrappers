package karakum.query

import karakum.common.GENERATOR_COMMENT

// language=kotlin
internal val QUERY_TYPE_BODY = """
// $GENERATOR_COMMENT

${Package.CORE.pkg}

import seskar.js.JsValue

sealed /* union */
external interface QueryType {
    companion object {
        @JsValue("infinite")
        val infinite: QueryType
    }
}
""".trimIndent()
