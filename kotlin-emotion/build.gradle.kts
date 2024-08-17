plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCsstype)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.emotion.cache))
    jsMainApi(npm(libs.npm.emotion.css))
    jsMainApi(npm(libs.npm.emotion.react))
    jsMainApi(npm(libs.npm.emotion.styled))
}
