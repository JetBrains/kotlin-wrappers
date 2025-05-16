import org.gradle.api.file.Directory
import org.gradle.api.provider.Provider

internal interface HasGeneratedDirectories {
    val rootGeneratedDir: Provider<Directory>

    val commonGeneratedDir: Provider<Directory>
}
