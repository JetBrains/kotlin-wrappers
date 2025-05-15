import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty

val DirectoryProperty.rootGeneratedDir: Directory
    get() = dir("generated").get()

val Directory.commonGeneratedDir: Directory
    get() = dir("src/commonMain/generated")
