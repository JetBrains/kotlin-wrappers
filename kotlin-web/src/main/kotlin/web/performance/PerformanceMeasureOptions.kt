package web.performance

import js.core.HighResTimeStamp

interface PerformanceMeasureOptions {
    var detail: Any?
    var duration: HighResTimeStamp?
    var end: HighResTimeStamp?
    var start: HighResTimeStamp?
}
