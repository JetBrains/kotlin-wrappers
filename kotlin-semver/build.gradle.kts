plugins {
    `kotlin-library-conventions`
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(npm(libs.npm.semver))
    jsMainImplementation(npm(libs.npm.types.semver))
}
