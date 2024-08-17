plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinCsstype)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv(libs.npm.emotion.cache))
    jsMainApi(npmv(libs.npm.emotion.css))
    jsMainApi(npmv(libs.npm.emotion.react))
    jsMainApi(npmv(libs.npm.emotion.styled))
}
