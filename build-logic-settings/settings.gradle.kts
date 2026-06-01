rootProject.name = "build-logic-settings"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include("generatorbuild")
include("wrappersbuild")
