package electron

import kotlin.js.Date


external interface CrashReport {
    // Docs: https://electronjs.org/docs/api/structures/crash-report
    var date: Date
    var id: String
}
