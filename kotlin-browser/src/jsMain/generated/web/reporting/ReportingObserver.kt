// Automatically generated - do not modify!

package web.reporting

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver) */
external class ReportingObserver(
    callback: ReportingObserverCallback,
    options: ReportingObserverOptions = definedExternally,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/disconnect) */
    fun disconnect()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/observe) */
    fun observe()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/takeRecords) */
    fun takeRecords(): ReportList
}
