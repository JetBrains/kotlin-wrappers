rootProject.name = "build-logic"

dependencyResolutionManagement {
    repositories {
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
