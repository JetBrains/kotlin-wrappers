rootProject.name = "build-logic-settings"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include("common")
include("generatorbuild")
include("wrappersbuild")
