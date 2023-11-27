// Automatically generated - do not modify!

package web.reporting

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report) */
sealed external class Report {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/body) */
    val body: ReportBody?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/type) */
    val type: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/url) */
    val url: String
    fun toJSON(): Any
}
