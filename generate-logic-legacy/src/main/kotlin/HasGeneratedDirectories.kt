import org.gradle.api.file.Directory

internal interface HasGeneratedDirectories {
    val rootGeneratedDir: Directory

    val commonGeneratedDir: Directory
}
