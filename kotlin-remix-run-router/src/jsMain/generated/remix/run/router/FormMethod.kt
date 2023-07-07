package remix.run.router


/**
 * Active navigation/fetcher form methods are exposed in lowercase on the
 * RouterState
 */

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{GET: 'GET', POST: 'POST', PUT: 'PUT', PATCH: 'PATCH', DELETE: 'DELETE'}/*union*/)""")
sealed external interface FormMethod {
    companion object {
        val GET: FormMethod
        val POST: FormMethod
        val PUT: FormMethod
        val PATCH: FormMethod
        val DELETE: FormMethod
    }
}
