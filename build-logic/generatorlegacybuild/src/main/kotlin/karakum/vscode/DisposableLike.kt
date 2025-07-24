package karakum.vscode

internal val DISPOSABLE_LIKE = "DisposableLike"

private val DISPOSABLE_LIKE_BODY = """
{
	/**
	 * Function to clean up resources.
	 */
	dispose(): void;
}
""".trimIndent()

internal val DISPOSABLE_LIKE_DECLARATION = "export interface $DISPOSABLE_LIKE $DISPOSABLE_LIKE_BODY"

internal fun String.addDisposableLikeSupport(): String =
    replace(DISPOSABLE_LIKE_BODY, DISPOSABLE_LIKE)
