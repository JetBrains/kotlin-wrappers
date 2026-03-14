rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))

            val kotlinVersion = extra.properties["kotlin.version"] as String?
            if (kotlinVersion != null) {
                version("kotlin", kotlinVersion)
            }
        }
    }
}

include("generatorbuild")
include("generatorlegacybuild")
include("wrappersbuild")
