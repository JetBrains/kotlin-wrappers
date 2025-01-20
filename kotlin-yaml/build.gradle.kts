plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(npm(libs.npm.yaml))
}
