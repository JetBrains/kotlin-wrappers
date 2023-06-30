package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{home: 'home', appData: 'appData', userData: 'userData', sessionData: 'sessionData', temp: 'temp', exe: 'exe', module: 'module', desktop: 'desktop', documents: 'documents', downloads: 'downloads', music: 'music', pictures: 'pictures', videos: 'videos', recent: 'recent', logs: 'logs', crashDumps: 'crashDumps'}/*union*/)""")
sealed external interface AppGetPathName {
    companion object {
        val home: AppGetPathName
        val appData: AppGetPathName
        val userData: AppGetPathName
        val sessionData: AppGetPathName
        val temp: AppGetPathName
        val exe: AppGetPathName
        val module: AppGetPathName
        val desktop: AppGetPathName
        val documents: AppGetPathName
        val downloads: AppGetPathName
        val music: AppGetPathName
        val pictures: AppGetPathName
        val videos: AppGetPathName
        val recent: AppGetPathName
        val logs: AppGetPathName
        val crashDumps: AppGetPathName
    }
}
