plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.tanstack.react.query.devtools))
}
