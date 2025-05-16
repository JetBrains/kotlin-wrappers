import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Provider

val DirectoryProperty.rootGeneratedDir: Provider<Directory>
    get() = dir("generated")

val Provider<Directory>.commonGeneratedDir: Provider<Directory>
    get() = map { it.dir("src/commonMain/generated") }
