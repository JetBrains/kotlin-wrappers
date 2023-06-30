package electron


external interface ResourceUsage {
    var images: MemoryUsageDetails
    var scripts: MemoryUsageDetails
    var cssStyleSheets: MemoryUsageDetails
    var xslStyleSheets: MemoryUsageDetails
    var fonts: MemoryUsageDetails
    var other: MemoryUsageDetails
}
