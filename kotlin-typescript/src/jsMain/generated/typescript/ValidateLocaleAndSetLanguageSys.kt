// Automatically generated - do not modify!

package typescript

sealed external interface ValidateLocaleAndSetLanguageSys {
    fun getExecutingFilePath(): String
    fun resolvePath(path: String): String
    fun fileExists(fileName: String): Boolean
    fun readFile(fileName: String): String?
}
